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
public class FlightdetailsDirectory {
    
     private ArrayList<Flightdetails> flightDetailsDict;
     
     public FlightdetailsDirectory() {
        flightDetailsDict = new ArrayList<Flightdetails>();
    }

    public ArrayList<Flightdetails> getFlightDetailsDict() {
        return flightDetailsDict;
    }
    
    public Flightdetails addFlight() {
        Flightdetails fd = new Flightdetails();
        flightDetailsDict.add(fd);
        return fd;
    }
    
    public void removeFlight(Flightdetails fd) {
        flightDetailsDict.remove(fd);
    }
}
