package ca.mcgill.emf.democdsl.persistence;

import java.util.Iterator;

import ca.mcgill.emf.democdsl.*;
import ca.mcgill.emf.democdsl.controller.Controller;

public class PersistenceDemocDSL {

	
	public static void saveModel(String filename, DemocDSL model){
		PersistenceDemocDSL.initializeXStream(filename);
		if (!PersistenceXStream.saveToXMLwithXStream(model))
			System.err.println("Could not save file.");
	}
	
	public static void initializeXStream(String filename) {
		PersistenceXStream.setFilename(filename);
		//save model
		PersistenceXStream.setAlias("democdsl", DemocDSL.class);
		PersistenceXStream.setAlias("constituent", Constituent.class);
		PersistenceXStream.setAlias("ideology", Ideology.class);
		PersistenceXStream.setAlias("belief", Belief.class);
		PersistenceXStream.setAlias("influence", Influence.class);
	}

	public static void loadModel(String filename, Controller c) {
	    
		PersistenceDemocDSL.initializeXStream(filename);
		DemocDSL model2 = (DemocDSL) PersistenceXStream.loadFromXMLwithXStream();
		if (model2 != null) {
            //reference beliefs
            Iterator<Belief> dpIt = model2.getBeliefs().iterator();
            while (dpIt.hasNext()) {
                Belief b = dpIt.next();
                c.createBelief(b.getName());
                //model.getBeliefs().add(dpIt.next());
            }
			Iterator<Constituent> pIt = model2.getConstituents().iterator();
			while (pIt.hasNext()) {
			    Constituent con = pIt.next();
				c.createConstituent(con.getName(), con.getIndependence());
				
			    //model.getConstituents().add(pIt.next());
			}
			
			for (Constituent con : model2.getConstituents()) {
                //add beliefs to constituents
                Constituent source = null;
                for (Constituent cons : c.democ.getConstituents()) {
                    if (cons.getName().equals(con.getName())
                            && cons.getIndependence() == con.getIndependence()) {
                        source = cons;
                        break;
                    }
                }
                for (Belief b : con.getBeliefs()) {
                    Belief target = null;
                    for (Belief b2 : c.democ.getBeliefs()) {
                        if (b2.getName().equals(b.getName()))
                            target = b2;
                    }
                    c.linkBeliefToConstituent(target, source, b.getValue());
                } 
            }
			
            Iterator<Ideology> ppIt = model2.getIdeologies().iterator();
			while (ppIt.hasNext()) {
			    Ideology i = ppIt.next();
			    c.createIdeology(i.getName());
			    for (Belief b : i.getBeliefs()) {
                    c.linkBeliefToIdeology(b, i, b.getValue());
                }
				//model.getIdeologies().add(ppIt.next());
			}
			for (Ideology ideo : model2.getIdeologies()) {
                //add beliefs to ideologies
                Ideology source = null;
                for (Ideology id : c.democ.getIdeologies()) {
                    if (id.getName().equals(ideo.getName())) {
                        source = id;
                        break;
                    }
                }
                for (Belief b : ideo.getBeliefs()) {
                    Belief target = null;
                    for (Belief b2 : c.democ.getBeliefs()) {
                        if (b2.getName().equals(b.getName()))
                            target = b2;
                    }
                    c.linkBeliefToIdeology(target, source, b.getValue());
                } 
            }
			
			Iterator<Influence> hpIt = model2.getInfluences().iterator();
			while (hpIt.hasNext()) {
				Influence i = hpIt.next();
				Constituent source = null;
				for (Constituent con : c.democ.getConstituents()) {
                    if(con.getName().equals(i.getInfluencer().getName())
                            && con.getIndependence() == i.getInfluencer().getIndependence())
                    {
                        source = con;
                        break;
                    }
                }
				Constituent target = null;
				for (Constituent con : c.democ.getConstituents()) {
                    if(con.getName().equals(i.getInfluenced().getName())
                            && con.getIndependence() == i.getInfluenced().getIndependence())
                    {
                        target = con;
                        break;
                    }
                }
				c.createInfluence(source, target, i.getWeight());
			}
		} else {
		    System.err.println("Could not load model");
		}
	}

}
