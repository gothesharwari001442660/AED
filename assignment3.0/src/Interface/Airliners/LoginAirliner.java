/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Airliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sharw
 */
public class LoginAirliner extends javax.swing.JPanel {

    /**
     * Creates new form LoginAirliner
     */
    
    JPanel rightpane;
    AirlinerDirectory airDuct;
    
    public LoginAirliner(JPanel rp, AirlinerDirectory ad) {
        initComponents();
        rightpane=rp;
        airDuct=ad;
        
        airlinercombobox.removeAllItems();
       for(Airliner a : airDuct.getAirDict()) {
           airlinercombobox.addItem(a);
       }
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlinernamelabel = new javax.swing.JLabel();
        airlinercombobox = new javax.swing.JComboBox();
        gobtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        airlinernamelabel.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        airlinernamelabel.setText("Airliner Name:");

        airlinercombobox.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N
        airlinercombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airlinercombobox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));
        airlinercombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinercomboboxActionPerformed(evt);
            }
        });

        gobtn.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        gobtn.setText("GO");
        gobtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));
        gobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(airlinernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(airlinercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(gobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlinernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(759, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobtnActionPerformed
        // TODO add your handling code here:
        Airliner a = (Airliner)airlinercombobox.getSelectedItem();
       AirlinerTableDetails atd = new AirlinerTableDetails(rightpane, a);
        rightpane.add("AirlinerTableDetails",atd);
        CardLayout layout = (CardLayout)rightpane.getLayout();
        layout.next(rightpane);
    }//GEN-LAST:event_gobtnActionPerformed

    private void airlinercomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinercomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinercomboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinercombobox;
    private javax.swing.JLabel airlinernamelabel;
    private javax.swing.JButton gobtn;
    // End of variables declaration//GEN-END:variables
}
