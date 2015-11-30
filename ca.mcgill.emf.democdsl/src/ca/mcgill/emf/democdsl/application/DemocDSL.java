package ca.mcgill.emf.democdsl.application;


import java.awt.Dimension;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JFrame;

import ca.mcgill.emf.democdsl.DemocdslFactory;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.controller.Controller;
import ca.mcgill.emf.democdsl.persistence.*;
//import amsd.persistence.PersistenceAMSD;
import ca.mcgill.emf.democdsl.view.*;
import ca.mcgill.emf.democdsl.view.ModelView.DemocIcon;

public class DemocDSL {
    /*
     * Hard coded file name of the model
     */
    final public static String filename = "model.xml";
    
	public static void main(String[] args) {
		// load model
    
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
                
                PersistenceDemocDSL.loadModel(filename, c);
                loadLayout((ModelView)applet);
                
                /*
                //Auto save on exit
                Runtime.getRuntime().addShutdownHook(new Thread(){
                    
                    public void run(){
                        PersistenceDemocDSL.saveModel(filename, model);
                        saveLayout((ModelView)applet);
                    }
                    
                });
                */

                EditorView edit = new EditorView(c,model);
                edit.setLocation(f.getWidth(), 0);
                edit.setVisible(true);
                
                
            }
        });
	}
	
	public static void saveLayout(ModelView v) throws Exception{
	    try (PrintWriter out = new PrintWriter(
                            new FileWriter("layout.csv")))
	    {
            for (DemocIcon d : v.elements) {
                out.println(d.shape.getX()+","+d.shape.getY());
            }
        } catch (Exception e) {
            System.err.println("Failed to save layout");
            throw e;
        }
	}
	
	private static void loadLayout(ModelView v) {
        try (BufferedReader in = new BufferedReader(
                            new FileReader("layout.csv")))
        {
            String line = null;
            int i = 0;
            while ((line = in.readLine()) != null) {
                try {
                    String[] tokens = line.split(",");
                    double x = Double.parseDouble(tokens[0]);
                    double y = Double.parseDouble(tokens[1]);
                    v.elements.get(i).move(x, y);
                    i++;
                } catch (NumberFormatException|IndexOutOfBoundsException  n) {
                    throw n;
                }
            }
        } catch (Exception e) {
            System.err.println("Failed to load layout");
        }
    }
}
