package ca.mcgill.emf.democdsl.test;


import ca.mcgill.emf.democdsl.Belief;
import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocDSL;
import ca.mcgill.emf.democdsl.DemocdslFactory;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.Influence;
import ca.mcgill.emf.democdsl.Party;

public class DemocDSLExample {

    public static void main(String[] args) {
        
        //Initialize democdls package.
        DemocdslPackage.eINSTANCE.eClass();
        
        //Create a DemocDSL instance.
        DemocDSL elections = DemocdslFactory.eINSTANCE.createDemocDSL();
        elections.setName("2015 Canadian Federal Elections");
        
        //Create example parties.
        Party liberals = DemocdslFactory.eINSTANCE.createParty();
        liberals.setName("Liberal Party of Canada");
        
        Party conservatives = DemocdslFactory.eINSTANCE.createParty();
        conservatives.setName("Conservative Party of Canada");
        
        Party ndp = DemocdslFactory.eINSTANCE.createParty();
        ndp.setName("New Democratic Party of Canada");
        
        
        //create example constituents and their influences
        Constituent urbanPop = DemocdslFactory.eINSTANCE.createConstituent();
        urbanPop.setName("Urban Population");
        urbanPop.setIndependence(8);
        Influence urbanInfluence = DemocdslFactory.eINSTANCE.createInfluence();
        urbanInfluence.setWeight(8);
        urbanPop.getInfluences().add(urbanInfluence);
        
        Constituent ruralPop = DemocdslFactory.eINSTANCE.createConstituent();
        ruralPop.setName("Rural Population");
        ruralPop.setIndependence(8);
        Influence ruralInfluence = DemocdslFactory.eINSTANCE.createInfluence();
        ruralInfluence.setWeight(8);
        ruralPop.getInfluences().add(ruralInfluence);
        
        //create some beliefs
        Belief leftIdeology = DemocdslFactory.eINSTANCE.createBelief();
        leftIdeology.setValue(2);
        
        liberals.getBeliefs().add(leftIdeology);
        ndp.getBeliefs().add(leftIdeology);
        
        Belief rightIdeology = DemocdslFactory.eINSTANCE.createBelief();
        rightIdeology.setValue(4);
        
        conservatives.getBeliefs().add(rightIdeology);
        
        /*
         * Yaya now we have the primitives for an election!!
         */

    }

}
