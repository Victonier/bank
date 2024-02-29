package fancybank.gui;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import fancybank.loan.Loan;
import fancybank.user.Customer;
import fancybank.user.Manager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author xiekangxian Di Wang
 */
public class LoanDetailPage extends javax.swing.JFrame {

    /**
     * Creates new form LoanRequestPage
     */
	private Customer customer;
	private Loan loan;
	private Manager manager;
    public LoanDetailPage(Customer c,Loan l,Manager m ) {
        initComponents();
        this.customer = c;
        this.loan = l;
        this.manager = m;
        this.collateral_text.setText("Item name:"+loan.getCollateral().getItemName()+" Worth value:"+ String.valueOf(loan.getCollateral().getValue()) );
        this.proof_text.setText(loan.getCollateral().getProof());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        javax.swing.JLabel loan_approve_noti = new javax.swing.JLabel();
        javax.swing.JLabel collateral_noti = new javax.swing.JLabel();
        javax.swing.JLabel proof_noti = new javax.swing.JLabel();
        collateral_text = new javax.swing.JTextField();
        cancel_button = new javax.swing.JButton();
        approve_button = new javax.swing.JButton();
        deny_button = new javax.swing.JButton();
        proof_text = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Request Loan");

        loan_approve_noti.setFont(new java.awt.Font("Helvetica Neue", 1, 28)); // NOI18N
        loan_approve_noti.setText("Loan Approve:");

        collateral_noti.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        collateral_noti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collateral_noti.setText("Collateral :");

        proof_noti.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        proof_noti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proof_noti.setText("Proof :");

        collateral_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collateral_textActionPerformed(evt);
            }
        });

        cancel_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        approve_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        approve_button.setText("Approve");
        approve_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approve_buttonActionPerformed(evt);
            }
        });

        deny_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        deny_button.setText("Deny");
        deny_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deny_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(proof_noti, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(proof_text))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(collateral_noti, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(collateral_text, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(loan_approve_noti)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(approve_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(deny_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(loan_approve_noti, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collateral_noti, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(collateral_text, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proof_noti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proof_text, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(approve_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(deny_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
        
        Manager m = this.manager;
        this.setVisible(false);
        dispose();
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveLoanPage(m).setVisible(true);
            }
        });
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void collateral_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collateral_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collateral_textActionPerformed

    private void approve_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approve_buttonActionPerformed
        // TODO add your handling code here:
    	Manager m = this.manager;
    	this.customer.getOneCheckAccount().deposit(this.loan.getAmount());
    	this.loan.approve();
    	this.setVisible(false);
        dispose();
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveLoanPage(m).setVisible(true);
            }
        });
    }//GEN-LAST:event_approve_buttonActionPerformed

    private void deny_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deny_buttonActionPerformed
        // TODO add your handling code here:
    	Manager m = this.manager;
    	this.loan.decline();
    	this.setVisible(false);
        dispose();
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveLoanPage(m).setVisible(true);
            }
        });
    }//GEN-LAST:event_deny_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(LoanRequestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanRequestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanRequestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanRequestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoanRequestPage().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve_button;
    private javax.swing.JButton cancel_button;
    private javax.swing.JTextField collateral_text;
    private javax.swing.JButton deny_button;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JTextField proof_text;
    // End of variables declaration//GEN-END:variables
}