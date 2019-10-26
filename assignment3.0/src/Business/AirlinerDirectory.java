/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author sharw
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airDict;
    
    public AirlinerDirectory() {
        airDict = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirDict() {
        return airDict;
    }

    public void setAirDict(ArrayList<Airliner> airDict) {
        this.airDict = airDict;
    }
    
    public Airliner addAirliner() {
        Airliner a = new Airliner();
        airDict.add(a);
        return a;
    }
    
    public void removeAirliner(Airliner a) {
        airDict.remove(a);
    }
}
