/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author sharw
 */
public class Airliner {
     private String aName;
     private FlightdetailsDirectory flightDetailsDict;
     
     public Airliner()
     {
     flightDetailsDict=new FlightdetailsDirectory();
     }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public FlightdetailsDirectory getFlightDetailsDict() {
        return flightDetailsDict;
    }

    public void setFlightDetailsDict(FlightdetailsDirectory flightDetailsDict) {
        this.flightDetailsDict = flightDetailsDict;
    }

    @Override
    public String toString(){
        return this.aName;
    }
}
