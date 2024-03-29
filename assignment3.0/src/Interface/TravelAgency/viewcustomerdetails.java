/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.Customer;
import Interface.Airliners.AirlinerTableDetails;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sharw
 */
public class viewcustomerdetails extends javax.swing.JPanel {

    /**
     * Creates new form viewcustomerdetails
     */
    private JPanel rightpane;
    private Customer c;
    public viewcustomerdetails(JPanel rightpane, Customer c) {
        initComponents();
        this.rightpane=rightpane;
        this.c=c;
        
        nametxt.setText(c.getName());
        phonetxt.setText(c.getPhoneno());
        passporttxt.setText(c.getPassportno());
        //custflighttxt.setText(c.getCustflight());
        notxt.setText(c.getFlightnumber());
        sourcetxt.setText(c.getSource());
        desttxt.setText(c.getDestination());
        pricetxt.setText(String.valueOf(c.getPrice()));
        //datetxt.setText(c.getDate());
        
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelbl = new javax.swing.JLabel();
        phonelbl = new javax.swing.JLabel();
        passportlbl = new javax.swing.JLabel();
        passporttxt = new javax.swing.JTextField();
        phonetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        fnolabel = new javax.swing.JLabel();
        sourcelabel = new javax.swing.JLabel();
        destlabel = new javax.swing.JLabel();
        pricelabel = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        desttxt = new javax.swing.JTextField();
        sourcetxt = new javax.swing.JTextField();
        notxt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();

        namelbl.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        namelbl.setText("Name:");

        phonelbl.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        phonelbl.setText("Phone No.:");

        passportlbl.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        passportlbl.setText("Passport No.:");

        passporttxt.setEditable(false);
        passporttxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        passporttxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        phonetxt.setEditable(false);
        phonetxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        phonetxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        nametxt.setEditable(false);
        nametxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        nametxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        updatebtn.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        savebtn.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        savebtn.setText("Save");
        savebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        fnolabel.setBackground(new java.awt.Color(255, 255, 255));
        fnolabel.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        fnolabel.setText("Flight Number:");

        sourcelabel.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        sourcelabel.setText("Source:");

        destlabel.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        destlabel.setText("Destination:");

        pricelabel.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        pricelabel.setText("Price:");

        pricetxt.setEditable(false);
        pricetxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        pricetxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        desttxt.setEditable(false);
        desttxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        desttxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        sourcetxt.setEditable(false);
        sourcetxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        sourcetxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        notxt.setEditable(false);
        notxt.setFont(new java.awt.Font("SansSerif", 0, 34)); // NOI18N
        notxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        backbtn.setFont(new java.awt.Font("SansSerif", 1, 34)); // NOI18N
        backbtn.setText("<<Back");
        backbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 255, 255)));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(468, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passportlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passporttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sourcelabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(destlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pricelabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fnolabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desttxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sourcetxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(notxt, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(424, 424, 424))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nametxt)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phonetxt)
                    .addComponent(phonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passportlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passporttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourcetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourcelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        nametxt.setEditable(true);
        phonetxt.setEditable(true);
        passporttxt.setEditable(true);
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        String name= nametxt.getText().trim();
        String phone=phonetxt.getText().trim();
        String passport=passporttxt.getText().trim();
        
        
        c.setName(name);
        c.setPhoneno(phone);
        c.setPassportno(passport);
        
        JOptionPane.showMessageDialog(null, "updated successfully");
        
        nametxt.setEditable(false);
        phonetxt.setEditable(false);
        passporttxt.setEditable(false);
        
    }//GEN-LAST:event_savebtnActionPerformed

    private void backAction() {
        rightpane.remove(this);
        Component[] componentArray = rightpane.getComponents();
        Component component = componentArray[componentArray.length - 1];
        customerdetailsJPanel cdj = (customerdetailsJPanel) component;
        cdj.populate11();
        CardLayout layout = (CardLayout) rightpane.getLayout();
        layout.previous(rightpane);
    }
    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        backAction();
            
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel destlabel;
    private javax.swing.JTextField desttxt;
    private javax.swing.JLabel fnolabel;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField notxt;
    private javax.swing.JLabel passportlbl;
    private javax.swing.JTextField passporttxt;
    private javax.swing.JLabel phonelbl;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel sourcelabel;
    private javax.swing.JTextField sourcetxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
