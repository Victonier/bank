package fancybank.gui;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import fancybank.account.Balance;
import fancybank.account.CheckAccount;
import fancybank.user.Customer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Di Wang
 */
public class ExchangePage extends javax.swing.JFrame {

        /**
         * Creates new form NewJFrame
         */
		private Customer c;
		private CheckAccount acc;
		private int check_ind;
		private ArrayList<CheckAccount> selection;
        public ExchangePage(Customer c, CheckAccount acc, int checking_index) {
                initComponents();
                this.c = c;
                this.acc = acc;
                this.check_ind = checking_index;
                this.from_acc_box.addItem(acc.getAccountNumber()+": "+acc.getBalance().getCurrency().getName());
                ArrayList<CheckAccount> checks = c.getCheckAccount();
                ArrayList<CheckAccount> selection = new ArrayList<CheckAccount>();
                for(int i=0;i<checks.size();i++) {
                	CheckAccount curr = checks.get(i);
                	if(this.acc.getBalance().getCurrency().getSymbol().equals(curr.getBalance().getCurrency().getSymbol())) {
                		continue;
                	} 
                	selection.add(curr);
                	this.to_acc_box.addItem(curr.getAccountNumber()+": "+curr.getBalance().getCurrency().getName());
                }
                this.selection=selection;
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                javax.swing.JLabel from_niti = new javax.swing.JLabel();
                exchange_cancel_button = new javax.swing.JButton();
                javax.swing.JLabel to_noti = new javax.swing.JLabel();
                exchange_submit_button = new javax.swing.JButton();
                javax.swing.JLabel amount_noti = new javax.swing.JLabel();
                amount_text = new javax.swing.JTextField();
                currency_exchange_noti = new javax.swing.JLabel();
                from_acc_box = new javax.swing.JComboBox<>();
                to_acc_box = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Currency Exchange");
                setSize(new java.awt.Dimension(800, 450));

                from_niti.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
                from_niti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                from_niti.setText("From :");

                exchange_cancel_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
                exchange_cancel_button.setText("Cancel");
                exchange_cancel_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                exchange_cancel_buttonActionPerformed(evt);
                        }
                });

                to_noti.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
                to_noti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                to_noti.setText("To :");

                exchange_submit_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
                exchange_submit_button.setText("Submit");
                exchange_submit_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                exchange_submit_buttonActionPerformed(evt);
                        }
                });

                amount_noti.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
                amount_noti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                amount_noti.setText("Amount :");

                amount_text.setEditable(true);
                amount_text.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
                amount_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                amount_text.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                amount_textActionPerformed(evt);
                        }
                });

                currency_exchange_noti.setFont(new java.awt.Font("Helvetica Neue", 1, 34)); // NOI18N
                currency_exchange_noti.setText("Currency Exchange");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(100, 100, 100)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(from_niti,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(to_noti,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(amount_noti,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                143,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(18, 44, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(amount_text,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                278,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(from_acc_box,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                278,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(to_acc_box,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                278,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(145, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(201, 201, 201)
                                                                .addComponent(exchange_submit_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                120,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(68, 68, 68)
                                                                .addComponent(exchange_cancel_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                120,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(currency_exchange_noti)
                                                                .addGap(195, 195, 195)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addComponent(currency_exchange_noti)
                                                                .addGap(51, 51, 51)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(from_niti)
                                                                                .addComponent(from_acc_box,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(to_noti)
                                                                                .addComponent(to_acc_box,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(amount_text,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(amount_noti))
                                                                .addGap(55, 55, 55)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(exchange_submit_button,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(exchange_cancel_button,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(70, 70, 70)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void exchange_cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exchange_cancel_buttonActionPerformed
                setVisible(false);
                dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                            new CheckingAccountPage(c,check_ind).setVisible(true);
                    }
                });
        }// GEN-LAST:event_exchange_cancel_buttonActionPerformed

        private void exchange_submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exchange_submit_buttonActionPerformed
                // TODO add your handling code here:
        		setVisible(false);
        		dispose();
        		double am = Double.parseDouble(amount_text.getText());
        		int ind = this.to_acc_box.getSelectedIndex();
        		CheckAccount to = this.selection.get(ind);
        		Balance ex_bal = new Balance(am,this.acc.getBalance().getCurrency());
        		this.acc.exchangeTo(to, ex_bal);
        		this.c.save();
        		java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                            new CheckingAccountPage(c,check_ind).setVisible(true);
                    }
                });
        }// GEN-LAST:event_exchange_submit_buttonActionPerformed

        private void amount_textActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_amount_textActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_amount_textActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(CheckingAccountPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(CheckingAccountPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(CheckingAccountPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(CheckingAccountPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form 
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new CheckingAccountPage().setVisible(true);
                        }
                });
                */
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField amount_text;
        private javax.swing.JLabel currency_exchange_noti;
        private javax.swing.JButton exchange_cancel_button;
        private javax.swing.JButton exchange_submit_button;
        private javax.swing.JComboBox<String> from_acc_box;
        private javax.swing.JComboBox<String> to_acc_box;
        // End of variables declaration//GEN-END:variables
}