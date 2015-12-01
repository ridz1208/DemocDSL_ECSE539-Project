/**
 * 
 */
package ca.mcgill.emf.democdsl.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFileChooser;

import ca.mcgill.emf.democdsl.*;
import ca.mcgill.emf.democdsl.analysis.VotingAnalysis;
import ca.mcgill.emf.democdsl.persistence.PersistenceDemocDSL;
import ca.mcgill.emf.democdsl.view.ModelView;
import ca.mcgill.emf.democdsl.view.ModelView.DemocIcon;

/**
 * Controller for the EMF generated model DemocDSL
 * @author Yanis
 *
 */
public class Controller {
    
    public DemocDSL democ;
    public ModelView view;
    private String filename = "model.xml";
    //public ca.mcgill.emf.democdsl.application.DemocDSL app;
    
    public Controller(DemocDSL d, ModelView v) {
        democ = d;
        view = v;
        //app =a;
    }
    
    public boolean createConstituent(String name, int independence){
        for (Constituent c : democ.getConstituents()) {
            if(c.getName().toLowerCase().equals(name.toLowerCase()))
                return false;
        }
        
        Constituent newConst = DemocdslFactory.eINSTANCE.createConstituent();
        newConst.setName(name);
        newConst.setIndependence(independence);
        democ.getConstituents().add(newConst);
        
        view.createConstituent(newConst.getName(), newConst.getIndependence());
        
        return true;
        
    }
    
    public boolean createInfluence(Constituent source, Constituent target, int weight) {
        if(!democ.getConstituents().contains(source))
            return false;

        if(!democ.getConstituents().contains(target))
            return false;
        
        //check for duplicate influences
        for (Influence i : source.getInfluencesOut())
        {
            if(i.getInfluenced().getName().toLowerCase().equals(target.getName().toLowerCase()))
                return false;
        }
        
        if(source.getName().toLowerCase().equals(target.getName().toLowerCase()))
            //refuse reference to itself
            return false;
        
        Influence newInfluence = DemocdslFactory.eINSTANCE.createInfluence();
        newInfluence.setWeight(weight);
        newInfluence.setInfluencer(source);
        newInfluence.setInfluenced(target);
        democ.getInfluences().add(newInfluence);
        //TODO add to influencesOut and influencesIn??
        
        view.createInfluence(source.getName(), target.getName(), newInfluence.getWeight());
        
        return true;
    }
    
    public boolean createBelief(String name) {
        for (Belief b : democ.getBeliefs()) {
            if(b.getName().toLowerCase().equals(name.toLowerCase()))
                return false;
        }
        
        Belief newBelief = DemocdslFactory.eINSTANCE.createBelief();
        newBelief.setName(name);
        //newBelief.setValue(value);
        democ.getBeliefs().add(newBelief);
        
        return true;
    }
    
    public boolean createIdeology(String name) {
        for (Ideology i : democ.getIdeologies()) {
            if(i.getName().toLowerCase().equals(name.toLowerCase()))
                return false;
        }
        
        Ideology newIdeo = DemocdslFactory.eINSTANCE.createIdeology();
        newIdeo.setName(name);
        democ.getIdeologies().add(newIdeo);
        
        view.createIdeology(newIdeo.getName());
        
        return true;
    }
    
    public boolean linkBeliefToConstituent(Belief b, Constituent c, int value) {
        if(!democ.getConstituents().contains(c))
            return false;
        
        if(!democ.getBeliefs().contains(b))
            return false;
        
        //check for duplicates
        for (Belief bel : c.getBeliefs()){
            if (bel.getName().toLowerCase().equals(b.getName().toLowerCase())){
                return false;
            }
        }
        
        Belief newBelief = DemocdslFactory.eINSTANCE.createBelief();
        newBelief.setName(b.getName());
        newBelief.setValue(value);
        
        c.getBeliefs().add(newBelief);

        
        view.createBelief(newBelief.getName(), newBelief.getValue());
        view.linkBelief(c.getName(), b.getName());
        
        return true;
    }
    
    public boolean linkBeliefToIdeology(Belief b, Ideology i, int value) {
        if(!democ.getIdeologies().contains(i))
            return false;
        
        if(!democ.getBeliefs().contains(b))
            return false;
        
        //check for duplicates
        for (Belief bel : i.getBeliefs()){
            if (bel.getName().toLowerCase().equals(b.getName().toLowerCase())){
                return false;
            }
        }
        
        Belief newBelief = DemocdslFactory.eINSTANCE.createBelief();
        newBelief.setName(b.getName());
        newBelief.setValue(value);
        
        i.getBeliefs().add(newBelief);

        
        view.createBelief(newBelief.getName(), newBelief.getValue());
        view.linkBelief(i.getName(), b.getName());

        return true;
    }
    
    public String computeVotes() {
        String returnedResults = "";
        VotingAnalysis va = new VotingAnalysis(democ);
        
        HashMap<String, Integer> results = va.compute();
        int maxYet = Integer.MIN_VALUE;
        String winningIdeology = "";
        for (Entry<String, Integer> e : results.entrySet()) {
            //write results to a string
            if(e.getValue() > maxYet) {
                maxYet = e.getValue();
                winningIdeology = e.getKey();
            }
            returnedResults += (e.getKey()+" : "+e.getValue()+"\n");
        }
        
        view.setAnalysisView(winningIdeology);
        
        return returnedResults;
    }
    
    
    /**
     * Saving the model, interacts with DemocDSL (application
     * @return
     */
    public boolean saveModel(){
        //saving model
        String fn = ca.mcgill.emf.democdsl.application.DemocDSL.askSaveLocation();
        
        try {
            PersistenceDemocDSL.saveModel(fn, democ);
            ca.mcgill.emf.democdsl.application.DemocDSL.saveLayout(view, fn);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
