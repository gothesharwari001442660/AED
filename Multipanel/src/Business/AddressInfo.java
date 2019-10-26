/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
//import Business.Personal;
/**
 *
 * @author sharw
 */
public class AddressInfo {
    
    private String streetadd;
    private String city;
    private String state;
    private String zipcode;
    
    public String getStreetadd() {
        return streetadd;
    }

    public void setStreetadd(String streetadd) {
        this.streetadd = streetadd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
