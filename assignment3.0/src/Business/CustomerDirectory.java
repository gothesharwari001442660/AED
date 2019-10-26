/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.Flightdetails;
/**
 *
 * @author sharw
 */

public class CustomerDirectory {
    
    private ArrayList<Customer> custDict;
    
    private Flightdetails fd;
    public CustomerDirectory()
    {
        custDict= new ArrayList<Customer>();
        this.fd = fd;
    }

    public ArrayList<Customer> getCustDict() {
        return custDict;
    }

    public void setCustDict(ArrayList<Customer> custDict) {
        this.custDict = custDict;
    }
    
    public Customer addCustomer()
    {
    Customer c=new Customer();
    custDict.add(c);
    return c;
    }
    
    public void removeCustomer(Customer c) {
        custDict.remove(c);
    }
    
    
}
