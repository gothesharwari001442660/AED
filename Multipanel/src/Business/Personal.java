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

//Demographic demo=new Demographic();

public class Personal {
    
    private Savings saving;
    private AddressInfo address;
    private Checkings checking;
    private License license;
    private Medical medical;
    private String fname;
    private String lname;
    private String phoneno;
    private String DOB;
    private String age;
    private String height;
    private String weight;
    private String SSN; 
    
    
    
    
    
    

    public Personal(){
        address = new AddressInfo();
        saving = new Savings();
        checking= new Checkings();
        license=new License();
        medical=new Medical();
    }
    
   public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    public Savings getSaving() {
        return saving;
    }

    public void setSaving(Savings saving) {
        this.saving = saving;
    }

    public Checkings getChecking() {
        return checking;
    }

    public void setChecking(Checkings checking) {
        this.checking = checking;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }
    
    
    
}
    //public class Demographic{
        
        
    //}
