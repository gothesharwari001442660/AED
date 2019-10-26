/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Address;
import Business.Person;



/**
 *
 * @author sharw
 */
public class PersonView extends javax.swing.JFrame {

    /**
     * Creates new form PersonView
     */
    private Person person;
    public PersonView() {
        initComponents();
        person = new Person();
       
        // set the values
        person.setFname("Joe");
        person.setLname("Smith");
        person.setDOB("22/12/1996");
        person.setSSN("12345");
        
        //set the text fields
        
        
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
       
        FirstName.setText(person.getFname());
        LastName.setText(person.getLname());
        DateOfBirth.setText(person.getDOB());
        SSN.setText(person.getSSN());
        WorkAdd1.setText(address.getStreetline1());
        WorkAdd2.setText(address.getStreetline2());
        WorkCIty.setText(address.getCity());
        WorkZipCode.setText(address.getZipcode());
        WorkState.setText(address.getState());
        WorkCountry.setText(address.getCountry());
        LocalAdd1.setText(address.getStreetline1());
        LocalAdd2.setText(address.getStreetline2());
        LocalCity.setText(address.getCity());
        LocalZipCode.setText(address.getZipcode());
        LoclaState.setText(address.getState());
        LocalCountry.setText(address.getCountry());
        HomeAdd1.setText(address.getStreetline1());
        HomeAdd2.setText(address.getStreetline2());
        HomeCity.setText(address.getCity());
        HomeZipCode.setText(address.getZipcode());
        HomeState.setText(address.getState());
        HomeCountry.setText(address.getCountry());
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        personheading = new javax.swing.JLabel();
        workadd2 = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        workcountry = new javax.swing.JLabel();
        workstate = new javax.swing.JLabel();
        workzipcode = new javax.swing.JLabel();
        DateOfBirth = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        WorkCIty = new javax.swing.JTextField();
        SSN = new javax.swing.JTextField();
        WorkState = new javax.swing.JTextField();
        dob = new javax.swing.JLabel();
        ssn = new javax.swing.JLabel();
        worklabel = new javax.swing.JLabel();
        WorkCountry = new javax.swing.JTextField();
        WorkZipCode = new javax.swing.JTextField();
        workcity = new javax.swing.JLabel();
        workadd1 = new javax.swing.JLabel();
        WorkAdd2 = new javax.swing.JTextField();
        WorkAdd1 = new javax.swing.JTextField();
        LocalAdd1 = new javax.swing.JTextField();
        LocalAdd2 = new javax.swing.JTextField();
        LocalCity = new javax.swing.JTextField();
        LocalZipCode = new javax.swing.JTextField();
        LoclaState = new javax.swing.JTextField();
        LocalCountry = new javax.swing.JTextField();
        localcountry = new javax.swing.JLabel();
        localstate = new javax.swing.JLabel();
        localzipcode = new javax.swing.JLabel();
        localcity = new javax.swing.JLabel();
        localadd2 = new javax.swing.JLabel();
        localadd1 = new javax.swing.JLabel();
        homeadd1 = new javax.swing.JLabel();
        homeadd2 = new javax.swing.JLabel();
        homecity = new javax.swing.JLabel();
        homezipcode = new javax.swing.JLabel();
        homestate = new javax.swing.JLabel();
        homecountry = new javax.swing.JLabel();
        HomeAdd1 = new javax.swing.JTextField();
        HomeAdd2 = new javax.swing.JTextField();
        HomeCity = new javax.swing.JTextField();
        HomeZipCode = new javax.swing.JTextField();
        HomeState = new javax.swing.JTextField();
        HomeCountry = new javax.swing.JTextField();
        locallabel = new javax.swing.JLabel();
        homeaddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personheading.setFont(new java.awt.Font("SansSerif", 1, 35)); // NOI18N
        personheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personheading.setText("Person Profile");

        workadd2.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        workadd2.setText("Street Line 2 :");

        lname.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        lname.setText("Last Name :");

        fname.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        fname.setText("First Name :");

        workcountry.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        workcountry.setText("Country :");

        workstate.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        workstate.setText("State :");

        workzipcode.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        workzipcode.setText("Zipcode :");

        DateOfBirth.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        LastName.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        FirstName.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        WorkCIty.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        SSN.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N
        SSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNActionPerformed(evt);
            }
        });

        WorkState.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        dob.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        dob.setText("Date Of Birth :");

        ssn.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        ssn.setText("SSN :");

        worklabel.setFont(new java.awt.Font("SansSerif", 3, 30)); // NOI18N
        worklabel.setText("Work Address :");

        WorkCountry.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        WorkZipCode.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        workcity.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        workcity.setText("City :");

        workadd1.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        workadd1.setText("Street Line 1 :");

        WorkAdd2.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        WorkAdd1.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        LocalAdd1.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        LocalAdd2.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        LocalCity.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        LocalZipCode.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        LoclaState.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        LocalCountry.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        localcountry.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        localcountry.setText("Country :");

        localstate.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        localstate.setText("State :");

        localzipcode.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        localzipcode.setText("Zipcode :");

        localcity.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        localcity.setText("City :");

        localadd2.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        localadd2.setText("Street Line 2 :");

        localadd1.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        localadd1.setText("Street Line 1 :");

        homeadd1.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        homeadd1.setText("Street Line 1 :");

        homeadd2.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        homeadd2.setText("Street Line 2 :");

        homecity.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        homecity.setText("City :");

        homezipcode.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        homezipcode.setText("Zipcode :");

        homestate.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        homestate.setText("State :");

        homecountry.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        homecountry.setText("Country :");

        HomeAdd1.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        HomeAdd2.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        HomeCity.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        HomeZipCode.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        HomeState.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        HomeCountry.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N

        locallabel.setFont(new java.awt.Font("SansSerif", 3, 30)); // NOI18N
        locallabel.setText("Local Address :");

        homeaddress.setFont(new java.awt.Font("SansSerif", 3, 30)); // NOI18N
        homeaddress.setText("Home Address :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(workzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WorkZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(workstate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WorkState, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(workadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WorkAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(workcity, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WorkCIty, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(workadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(worklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WorkAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(localcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LocalCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(localzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LocalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(localstate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoclaState, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(localadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LocalAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(localcity, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LocalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(localadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(locallabel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LocalAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(workcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(WorkCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homecountry, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HomeCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homezipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HomeZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homestate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HomeState, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homeadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HomeAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homecity, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HomeCity, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homeadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(172, 172, 172))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personheading, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(896, 896, 896))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(personheading, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(worklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locallabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(workadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WorkAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WorkAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(WorkCIty, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workcity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(workzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WorkZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(workstate, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WorkState, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(WorkCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(localadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LocalAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(localadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LocalAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LocalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(localcity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(localzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LocalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(localstate, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoclaState, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LocalCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(localcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(homeaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homeadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homeadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HomeCity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homecity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homezipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homestate, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeState, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HomeCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homecountry, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(431, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateOfBirth;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField HomeAdd1;
    private javax.swing.JTextField HomeAdd2;
    private javax.swing.JTextField HomeCity;
    private javax.swing.JTextField HomeCountry;
    private javax.swing.JTextField HomeState;
    private javax.swing.JTextField HomeZipCode;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField LocalAdd1;
    private javax.swing.JTextField LocalAdd2;
    private javax.swing.JTextField LocalCity;
    private javax.swing.JTextField LocalCountry;
    private javax.swing.JTextField LocalZipCode;
    private javax.swing.JTextField LoclaState;
    private javax.swing.JTextField SSN;
    private javax.swing.JTextField WorkAdd1;
    private javax.swing.JTextField WorkAdd2;
    private javax.swing.JTextField WorkCIty;
    private javax.swing.JTextField WorkCountry;
    private javax.swing.JTextField WorkState;
    private javax.swing.JTextField WorkZipCode;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel homeadd1;
    private javax.swing.JLabel homeadd2;
    private javax.swing.JLabel homeaddress;
    private javax.swing.JLabel homecity;
    private javax.swing.JLabel homecountry;
    private javax.swing.JLabel homestate;
    private javax.swing.JLabel homezipcode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel localadd1;
    private javax.swing.JLabel localadd2;
    private javax.swing.JLabel localcity;
    private javax.swing.JLabel localcountry;
    private javax.swing.JLabel locallabel;
    private javax.swing.JLabel localstate;
    private javax.swing.JLabel localzipcode;
    private javax.swing.JLabel personheading;
    private javax.swing.JLabel ssn;
    private javax.swing.JLabel workadd1;
    private javax.swing.JLabel workadd2;
    private javax.swing.JLabel workcity;
    private javax.swing.JLabel workcountry;
    private javax.swing.JLabel worklabel;
    private javax.swing.JLabel workstate;
    private javax.swing.JLabel workzipcode;
    // End of variables declaration//GEN-END:variables
}
