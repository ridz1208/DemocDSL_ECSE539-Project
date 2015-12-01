package ca.mcgill.emf.democdsl.analysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import ca.mcgill.emf.democdsl.Belief;
import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocDSL;
import ca.mcgill.emf.democdsl.Ideology;

/**
 * Simple analysis example where we compute the preferred ideology of the 
 * constituents based on who they value shared beliefs
 * @author Yanis
 *
 */
public class VotingAnalysis {

    private DemocDSL model;
    
    public VotingAnalysis(DemocDSL m) {
        model = m;
    }
    
    public HashMap<String, Integer> compute() {
        int nbIdeologies = model.getIdeologies().size();
        int[] votes = new int[nbIdeologies];
        HashMap<String, Integer> results = new HashMap<String, Integer>();
        
        for (Constituent c : model.getConstituents()) {
            ArrayList<Float> preferences = new ArrayList<Float>();
            for (int i = 0; i < model.getIdeologies().size(); i++) {
                Ideology ideo = model.getIdeologies().get(i);
                //check if they have same set of beliefs and get value
                float val;
                if((val = computeBeliefsValue(c.getBeliefs(), ideo.getBeliefs())) >= 0f) {
                    preferences.add(val);
                } else {
                    preferences.add(0f);
                }
            }
            //choose ideology voted for by finding max value
            
            int maxIndex = preferences.indexOf(Collections.max(preferences));
            votes[maxIndex] = votes[maxIndex]+1;
        }
        
        //compute total votes
        for (int i = 0; i < votes.length; i++) {
            Integer v = votes[i];
            results.put(model.getIdeologies().get(i).getName(), v);
        }
        
        return results;
    }
    
    private float computeBeliefsValue(EList<Belief> cBeliefs, EList<Belief> iBeliefs) {
        //check that constituent holds all of the ideology beliefs
        //then adds up all values of beliefs
        float totalValues = 0;
        for(Belief ib : iBeliefs) {
            boolean found = false;
            for(Belief cb : cBeliefs) {
                if(cb.getName().equals(ib.getName())) {
                    totalValues += cb.getValue();
                    found = true;
                    break;
                }
            }
            if(!found)
                //not same beliefs
                return -1;
        }
        
        //return proportional value
        return totalValues/iBeliefs.size();
    }

}
