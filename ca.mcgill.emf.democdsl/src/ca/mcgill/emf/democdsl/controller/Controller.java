/**
 * 
 */
package ca.mcgill.emf.democdsl.controller;

import ca.mcgill.emf.democdsl.*;

/**
 * Controller for the EMF generated model DemocDSL
 * @author Yanis
 *
 */
public class Controller {
    
    private DemocDSL democ;
    
    public Controller(DemocDSL d) {
        democ = d;
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
        
        return true;
    }

}
