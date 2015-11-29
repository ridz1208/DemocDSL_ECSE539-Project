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
    
    public boolean createInfluence(Constituent c, Ideology i, int weight) {
        if(!democ.getConstituents().contains(c))
            return false;

        if(!democ.getIdeologies().contains(i))
            return false;
        
        //check for duplicate influence
        for (Constituent cons : i.getConstituents())
        {
            if(cons.getName().equals(c.getName()))
                return false;
        }
        for (Belief b : democ.getBeliefs()) {
            if(b.getName().equals(i.getName()))
                return false;
        }
        

        
        
        Influence newInfluence = DemocdslFactory.eINSTANCE.createInfluence();
        newInfluence.setWeight(weight);
        newInfluence.setInfluencer(i);
        newInfluence.setInfluenced(c);
        democ.getInfluences().add(newInfluence);
        //i.getConstituents().add(c);
        
        view.createInfluence(i.getName(), c.getName(), newInfluence.getWeight());
        
        return true;
    }
    
    public boolean createBelief(String name, int value) {
        for (Belief b : democ.getBeliefs()) {
            if(b.getName().equals(name))
                return false;
        }
        
        Belief newBelief = DemocdslFactory.eINSTANCE.createBelief();
        newBelief.setName(name);
        newBelief.setValue(value);
        democ.getBeliefs().add(newBelief);
        
        view.createBelief(newBelief.getName(), newBelief.getValue());
        
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
    
    public boolean linkBeliefToConstituent(Belief b, Constituent c) {
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
        
        c.getBeliefs().add(b);
        
        view.linkBelief(c.getName(), b.getName());
        
        return true;
    }
    
    public boolean linkBeliefToIdeology(Belief b, Ideology i) {
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
        
        i.getBeliefs().add(b);
        
        view.linkBelief(i.getName(), b.getName());
        
        return true;
    }
    
    public boolean addConstituentToIdeology(Constituent c, Ideology i) {
        if(!democ.getIdeologies().contains(i))
            return false;
        
        if(!democ.getConstituents().contains(c))
            return false;
        
        //check for duplicates
        for (Constituent con : i.getConstituents()){
            if (con.getName().equals(c.getName())){
                return false;
            }
        }
        
        i.getConstituents().add(c);
        
        //TODO show in GUI
        
        return true;
    }

}
