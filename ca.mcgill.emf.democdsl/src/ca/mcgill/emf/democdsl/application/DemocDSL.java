package ca.mcgill.emf.democdsl.application;


import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JApplet;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import ca.mcgill.emf.democdsl.DemocdslFactory;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.controller.Controller;
import ca.mcgill.emf.democdsl.persistence.*;
import ca.mcgill.emf.democdsl.view.*;
import ca.mcgill.emf.democdsl.view.ModelView.DemocIcon;

/**
 * Main Application to create models
 * @author Rida, Yanis
 *
 */
public class DemocDSL {

    //default filename of saved model
    final static String filename = "model.xml";
    final static JFileChooser fc = new JFileChooser();
    static JFrame f;
    
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
                f = new JFrame("Model View");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                f.getContentPane().add("Center", applet);
                applet.init();
                f.pack();
                f.setSize(new Dimension(800,600));
                f.setVisible(true);
                
                String fn = null;
                int returned = fc.showDialog(f, "Load Model");
                if (returned == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    fn = file.getAbsolutePath();
                    System.out.println("Loading "+fn);
                } else {
                    fn = filename;
                    System.out.println("No model to load selected");
                }
                
                PersistenceDemocDSL.loadModel(fn, c);
                loadLayout((ModelView)applet, fn);

                EditorView edit = new EditorView(c,model);
                edit.setLocation(f.getWidth(), 0);
                edit.setVisible(true);
                
                
            }
        });
	}
	
	public static void saveLayout(ModelView v, String fileName) throws Exception{
	    try (PrintWriter out = new PrintWriter(
                            new FileWriter(fileName+".csv")))
	    {
            for (DemocIcon d : v.elements) {
                out.println(d.shape.getX()+","+d.shape.getY());
            }
        } catch (Exception e) {
            System.err.println("Failed to save layout");
            throw e;
        }
	}
	
	private static void loadLayout(ModelView v, String fileName) {
        try (BufferedReader in = new BufferedReader(
                            new FileReader(fileName+".csv")))
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

    public static String askSaveLocation() {
        String fn = null;
        int returned = fc.showSaveDialog(f);
        if (returned == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            fn = file.getAbsolutePath();
            System.out.println("Saving "+fn);
        } else {
            fn = filename;
            System.out.println("Saving defaulted to "+fn);
        }
        return fn;
    }
}
