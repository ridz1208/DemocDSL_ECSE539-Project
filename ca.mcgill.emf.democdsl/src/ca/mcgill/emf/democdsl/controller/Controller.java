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
        
        Constituent unewConst = DemocdslFactory.eINSTANCE.createConstituent();
        unewConst.setName(name);
        unewConst.setIndependence(independence);
        
        return true;
        
    }
    
    public boolean createInfluence(Constituent c, Ideology i, int weight) {
        if(!democ.getConstituents().contains(c))
            return false;
        
        if(!democ.getIdeologies().contains(i))
            return false;
        
        Influence newInfluence = DemocdslFactory.eINSTANCE.createInfluence();
        newInfluence.setWeight(weight);
        newInfluence.setInfluencer(i);
        newInfluence.setInfluenced(c);
        
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
        
        return true;
    }
    
    public boolean createIdeology(String name) {
        for (Ideology i : democ.getIdeologies()) {
            if(i.getName().equals(name))
                return false;
        }
        
        Ideology newIdeo = DemocdslFactory.eINSTANCE.createIdeology();
        newIdeo.setName(name);
        
        return true;
    }
    
    public boolean linkBeliefToConstituent(Belief b, Constituent c) {
        if(!democ.getConstituents().contains(c))
            return false;
        
        if(!democ.getBeliefs().contains(b))
            return false;
        
        c.getBeliefs().add(b);
        
        return true;
    }
    
    public boolean linkBeliefToIdeology(Belief b, Ideology i) {
        if(!democ.getIdeologies().contains(i))
            return false;
        
        if(!democ.getBeliefs().contains(b))
            return false;
        
        i.getBeliefs().add(b);
        
        return true;
    }

}
