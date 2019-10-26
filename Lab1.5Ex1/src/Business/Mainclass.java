package Business;


import Business.Person;
import Business.Address;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sharw
 */
public class Mainclass {
    
    public static void main(String[] args){
        
   // Mainclass demoClass = new Mainclass();
    //demoClass.person.setFname(null);
        
        Person person= new Person();
    
    
    
        person.setFname("Joe");
        person.setLname("Smith");
        person.setDOB("22/12/1996");
        person.setSSN("12345");
        
        Address address=new Address();
        address.setStreetline1("235 Park Drive");
        address.setStreetline2("Boston Massechussetts");
        address.setCity("Boston");
        address.setZipcode("02215");
        address.setState("Massechusetts");
        address.setCountry("USA");
        person.setWorkaddress(address);
        
        Address add1=new Address();
        add1.setStreetline1("360 Hungtington Avenue");
        add1.setStreetline2("100 Main Street");
        add1.setCity("Boston");
        add1.setZipcode("02216");
        add1.setState("Massechusetts");
        add1.setCountry("USA");
        person.setLocaladdress(address);
        
        Address add2=new Address();
        add2.setStreetline1("280 Prathamesh Chhaya");
        add2.setStreetline2("Kansai Section");
        add2.setCity("Ambarnath");
        add2.setZipcode("421501");
        add2.setState("Maharashtra");
        add2.setCountry("India");
        person.setHomeaddress(address);
        
        
        System.out.println("Firstname is :" +person.getFname());
        System.out.println("Lastname is :" +person.getLname());
        System.out.println("DOB is :" +person.getDOB());
        System.out.println("SSN is :" +person.getSSN());
        
        System.out.println("\nWork Address\n");
        System.out.println("Street Line 1 :" +person.getWorkaddress().getStreetline1());
        System.out.println("Street Line 2 :" +person.getWorkaddress().getStreetline2());
        System.out.println("City :" +person.getWorkaddress().getCity());
        System.out.println("Zipcode :" +person.getWorkaddress().getZipcode());
        System.out.println("Street Line 1 :" +person.getWorkaddress().getState());
        System.out.println("Country :" +person.getWorkaddress().getCountry());
        
        System.out.println("\nHome Address\n");
        System.out.println("Street Line 1 :" +person.getHomeaddress().getStreetline1());
        System.out.println("Street Line 2 :" +person.getHomeaddress().getStreetline2());
        System.out.println("City :" +person.getHomeaddress().getCity());
        System.out.println("Zipcode :" +person.getHomeaddress().getZipcode());
        System.out.println("State :" +person.getHomeaddress().getState());
        System.out.println("Country :" +person.getHomeaddress().getCountry());
        
        System.out.println("\nLocal Address\n");
        System.out.println("Street Line 1 :" +person.getLocaladdress().getStreetline1());
        System.out.println("Street Line 2 :" +person.getLocaladdress().getStreetline2());
        System.out.println("City :" +person.getLocaladdress().getCity());
        System.out.println("Zipcode :" +person.getLocaladdress().getZipcode());
        System.out.println("State :" +person.getLocaladdress().getState());
        System.out.println("Country :" +person.getLocaladdress().getCountry());
        
    }
}
