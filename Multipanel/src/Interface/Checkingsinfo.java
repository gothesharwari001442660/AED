/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Checkings;
import javax.swing.JOptionPane;
/**
 *
 * @author sharw
 */
public class Checkingsinfo extends javax.swing.JPanel {

    /**
     * Creates new form Checkings
     */
    private Checkings checking;
    public Checkingsinfo(Checkings checking) {
        initComponents();
        this.checking=checking;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckingHeading = new javax.swing.JLabel();
        bankname = new javax.swing.JLabel();
        routingno = new javax.swing.JLabel();
        accountno = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        accounttype = new javax.swing.JLabel();
        AccountType = new javax.swing.JTextField();
        Balance = new javax.swing.JTextField();
        AccountNo = new javax.swing.JTextField();
        RoutingNo = new javax.swing.JTextField();
        BankName = new javax.swing.JTextField();
        insertchecking = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        CheckingHeading.setFont(new java.awt.Font("SansSerif", 1, 45)); // NOI18N
        CheckingHeading.setForeground(new java.awt.Color(0, 51, 153));
        CheckingHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckingHeading.setText("Insert  Checking Account Information");

        bankname.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        bankname.setForeground(new java.awt.Color(0, 51, 153));
        bankname.setText("Bank Name :");

        routingno.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        routingno.setForeground(new java.awt.Color(0, 51, 153));
        routingno.setText("Routing Number :");

        accountno.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        accountno.setForeground(new java.awt.Color(0, 51, 153));
        accountno.setText("Account Number :");

        balance.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        balance.setForeground(new java.awt.Color(0, 51, 153));
        balance.setText("Account Balance :");

        accounttype.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        accounttype.setForeground(new java.awt.Color(0, 51, 153));
        accounttype.setText("Account Type :");

        AccountType.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        AccountType.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));
        AccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountTypeActionPerformed(evt);
            }
        });

        Balance.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Balance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));
        Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceActionPerformed(evt);
            }
        });

        AccountNo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        AccountNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        RoutingNo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        RoutingNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        BankName.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        BankName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(153, 255, 255)));

        insertchecking.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        insertchecking.setForeground(new java.awt.Color(0, 51, 153));
        insertchecking.setText("Insert");
        insertchecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertcheckingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(routingno, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankname, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountno, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accounttype, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AccountType)
                    .addComponent(AccountNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                    .addComponent(RoutingNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BankName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balance))
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CheckingHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(482, 482, 482))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(insertchecking, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(749, 749, 749))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(CheckingHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bankname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RoutingNo)
                    .addComponent(routingno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accountno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accounttype, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(insertchecking, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountTypeActionPerformed

    private void BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceActionPerformed

    private void insertcheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertcheckingActionPerformed
        // TODO add your handling code here:
        checking.setCBankName(BankName.getText());
        checking.setCRoutingNo(RoutingNo.getText());
        checking.setCAccNo(AccountNo.getText());
        checking.setCBal(Balance.getText());
        checking.setCAccType(AccountType.getText());
if(BankName.getText().isEmpty() || RoutingNo.getText().isEmpty() || AccountNo.getText().isEmpty() || Balance.getText().isEmpty() || AccountType.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"Please enter data into all the required fields");
        }
else{
        JOptionPane.showMessageDialog(null,"Successfully Inserted");
    }//GEN-LAST:event_insertcheckingActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountNo;
    private javax.swing.JTextField AccountType;
    private javax.swing.JTextField Balance;
    private javax.swing.JTextField BankName;
    private javax.swing.JLabel CheckingHeading;
    private javax.swing.JTextField RoutingNo;
    private javax.swing.JLabel accountno;
    private javax.swing.JLabel accounttype;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel bankname;
    private javax.swing.JButton insertchecking;
    private javax.swing.JLabel routingno;
    // End of variables declaration//GEN-END:variables
}
