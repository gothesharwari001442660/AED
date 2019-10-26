/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.Flightdetails;
import Interface.Airliners.AirlinerTableDetails;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sharw
 */
public class CustomerSpecification extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSpecification
     */
   private JPanel rightpane;
    private AirlinerDirectory airDict;
    private ArrayList<Flightdetails> customerSearch;
    private CustomerDirectory custDict;
    public CustomerSpecification(JPanel rightpane, AirlinerDirectory airDict,CustomerDirectory custDict) {
        initComponents();
        this.rightpane=rightpane;
        this.airDict=airDict;
        customerSearch= new ArrayList<Flightdetails>();
        this.custDict=custDict;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromlbl = new javax.swing.JLabel();
        tolbl = new javax.swing.JLabel();
        fromtxt = new javax.swing.JTextField();
        totxt = new javax.swing.JTextField();
        gobtn = new javax.swing.JButton();
        locationlabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        fromlbl.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        fromlbl.setText("From:");

        tolbl.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        tolbl.setText("To:");

        fromtxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        fromtxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        totxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        totxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        gobtn.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        gobtn.setText("Go");
        gobtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));
        gobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobtnActionPerformed(evt);
            }
        });

        locationlabel.setFont(new java.awt.Font("SansSerif", 1, 39)); // NOI18N
        locationlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        locationlabel.setText("Customer Specifications");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(674, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fromlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tolbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fromtxt)
                                    .addComponent(totxt, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(locationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(472, 472, 472))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(gobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(602, 602, 602))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(locationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(gobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobtnActionPerformed
        // TODO add your handling code here:
        String src = fromtxt.getText();
        String destination= totxt.getText();
        for(Airliner airliner : airDict.getAirDict()){
        ArrayList<Flightdetails> s= airliner.getFlightDetailsDict().getFlightDetailsDict();
        for(Flightdetails f:s){
        if(f.getSource().equalsIgnoreCase(src) && f.getDestination().equalsIgnoreCase(destination)){
        customerSearch.add(f);
                    }
                }
        }
        if(customerSearch.isEmpty()){
            JOptionPane.showMessageDialog(null,"Flight not found");
            
        }
        else{
        flightfilterdata ffd = new flightfilterdata(rightpane, customerSearch,custDict);
        rightpane.add("flightfilterdata",ffd);
        CardLayout layout = (CardLayout)rightpane.getLayout();
        layout.next(rightpane);
        }
        
    }//GEN-LAST:event_gobtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fromlbl;
    private javax.swing.JTextField fromtxt;
    private javax.swing.JButton gobtn;
    private javax.swing.JLabel locationlabel;
    private javax.swing.JLabel tolbl;
    private javax.swing.JTextField totxt;
    // End of variables declaration//GEN-END:variables
}
