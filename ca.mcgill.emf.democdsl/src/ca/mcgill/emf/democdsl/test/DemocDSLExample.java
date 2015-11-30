package ca.mcgill.emf.democdsl.test;


import ca.mcgill.emf.democdsl.Belief;
import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocDSL;
import ca.mcgill.emf.democdsl.DemocdslFactory;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.Ideology;
import ca.mcgill.emf.democdsl.Influence;

public class DemocDSLExample {

    public static void main(String[] args) {
        
        //Initialize democdls package.
        DemocdslPackage.eINSTANCE.eClass();
        
        //Create a DemocDSL instance.
        DemocDSL elections = DemocdslFactory.eINSTANCE.createDemocDSL();
        elections.setName("2015 Canadian Federal Elections");
        
        //Create example parties.
        Ideology liberal = DemocdslFactory.eINSTANCE.createIdeology();
        liberal.setName("Liberal Party of Canada");
        
        Ideology conservative = DemocdslFactory.eINSTANCE.createIdeology();
        conservative.setName("Conservative Party of Canada");
        
        Ideology progressive = DemocdslFactory.eINSTANCE.createIdeology();
        progressive.setName("New Democratic Party of Canada");
        
        
        //create example constituents and their influences
        Constituent urbanPop = DemocdslFactory.eINSTANCE.createConstituent();
        urbanPop.setName("Urban Population");
        urbanPop.setIndependence(8);
        
        Constituent ruralPop = DemocdslFactory.eINSTANCE.createConstituent();
        ruralPop.setName("Rural Population");
        ruralPop.setIndependence(8);
        Influence urbanToRuralInfluence = DemocdslFactory.eINSTANCE.createInfluence();
        urbanToRuralInfluence.setWeight(8);
        urbanPop.getInfluencesOut().add(urbanToRuralInfluence);
        urbanToRuralInfluence.setInfluenced(ruralPop);
        //urbanToRuralInfluence.getWeight();
        
        //create some beliefs
        Belief lowMiddleclassTax = DemocdslFactory.eINSTANCE.createBelief();
        //Initial belief has to be added to the democsl instance initially
        lowMiddleclassTax.setName("Low Middle Class Tax");
        elections.getBeliefs().add(lowMiddleclassTax);
        
        //adding a belief to  constituent or an ideology must be copied from 
        //the democdsl beliefs and have its value set accordingly
        Belief b1 = DemocdslFactory.eINSTANCE.createBelief();
        b1.setName(lowMiddleclassTax.getName());
        b1.setValue(20);
        liberal.getBeliefs().add(b1);
        
        Belief b2 = DemocdslFactory.eINSTANCE.createBelief();
        b2.setName(lowMiddleclassTax.getName());
        b2.setValue(50);
        progressive.getBeliefs().add(b2);
        
        Belief lessGovernment = DemocdslFactory.eINSTANCE.createBelief();
        lessGovernment.setName("Less Government");
        
        Belief b3 = DemocdslFactory.eINSTANCE.createBelief();
        b3.setName(lessGovernment.getName());
        b3.setValue(80);
        conservative.getBeliefs().add(b3);
        
        /*
         * Yay now we have the primitives for an election!!
         */
        
        //elections.run();

    }

}
