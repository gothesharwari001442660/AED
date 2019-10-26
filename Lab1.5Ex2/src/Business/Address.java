package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sharw
 */
public class Address {
    
    String Streetline1;
    String Streetline2;
    String City;
    String State;
    String Zipcode;
    String Country;

    public String getStreetline1() {
        return Streetline1;
    }

    public void setStreetline1(String Streetline1) {
        this.Streetline1 = Streetline1;
    }

    public String getStreetline2() {
        return Streetline2;
    }

    public void setStreetline2(String Streetline2) {
        this.Streetline2 = Streetline2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
}
