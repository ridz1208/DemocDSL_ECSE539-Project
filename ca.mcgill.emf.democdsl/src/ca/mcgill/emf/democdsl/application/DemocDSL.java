package ca.mcgill.emf.democdsl.application;

import java.awt.Dimension;

import javax.swing.JApplet;
import javax.swing.JFrame;

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
        final ca.mcgill.emf.democdsl.DemocDSL model = DemocdslFactory.eINSTANCE.createDemocDSL();
        model.setName("Model");
        
        final JApplet applet = new ModelView();
        
        final Controller c = new Controller(model, (ModelView)applet);
            
		
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame f = new JFrame("Model View");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                f.getContentPane().add("Center", applet);
                applet.init();
                f.pack();
                f.setSize(new Dimension(800,600));
                f.setVisible(true);
                

                EditorView edit = new EditorView(c,model);
                edit.setLocation(f.getWidth(), 0);
                edit.setVisible(true);
                
            }
        });
        
	}
}
