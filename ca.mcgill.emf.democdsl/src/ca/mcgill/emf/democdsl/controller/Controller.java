/**
 * 
 */
package ca.mcgill.emf.democdsl.controller;

import ca.mcgill.emf.democdsl.*;
import ca.mcgill.emf.democdsl.view.ModelView;

/**
 * Controller for the EMF generated model DemocDSL
 * @author Yanis
 *
 */
public class Controller {
    
    private DemocDSL democ;
    private ModelView view;
    
    public Controller(DemocDSL d, ModelView v) {
        democ = d;
        view = v;
    }
    
    public boolean createConstituent(String name, int independence){
        for (Constituent c : democ.getConstituents()) {
            if(c.getName().equals(name))
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
            if(i.getInfluenced().getName().equals(target.getName()))
                return false;
        }
        
        if(source.getName().equals(target.getName()))
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
            if(b.getName().equals(name))
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
            if(i.getName().equals(name))
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
            if (bel.getName().equals(b.getName())){
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
            if (bel.getName().equals(b.getName())){
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
    

}
