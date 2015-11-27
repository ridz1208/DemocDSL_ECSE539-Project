package ca.mcgill.emf.democdsl.application;

//import amsd.persistence.PersistenceAMSD;
import ca.mcgill.emf.democdsl.view.*;

public class DemocDSL {
	public static void main(String[] args) {
		// load model
		//PersistenceAMSD.loadAMSDModel();
		
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorView().setVisible(true);
            }
        });
        
	}
}
