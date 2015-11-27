package ca.mcgill.emf.democdsl.application;

import ca.mcgill.emf.democdsl.DemocdslFactory;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.controller.Controller;
//import amsd.persistence.PersistenceAMSD;
import ca.mcgill.emf.democdsl.view.*;

public class DemocDSL {
	public static void main(String[] args) {
		// load model
		//PersistenceAMSD.loadAMSDModel();
	    
	    //Initialize democdsl package.
        DemocdslPackage.eINSTANCE.eClass();
        
        //Create a DemocDSL instance.
        ca.mcgill.emf.democdsl.DemocDSL model = DemocdslFactory.eINSTANCE.createDemocDSL();
        model.setName("Model");
        
        final Controller c = new Controller(model);
            
		
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorView(c).setVisible(true);
                
                //TODO initialize model view
            }
        });
        
	}
}
