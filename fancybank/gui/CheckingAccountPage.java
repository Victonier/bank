package fancybank.gui;

import fancybank.account.CheckAccount;
import fancybank.account.Money;
import fancybank.currency.Currency;
import fancybank.data.Data;
import fancybank.transaction.CashTransaction;
import fancybank.transaction.Transaction;
import fancybank.user.Customer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author xiekangxian Di Wang
 */
public class CheckingAccountPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
	private CheckAccount account;
	private Customer c;
	private int checkInd;
    public CheckingAccountPage(Customer c,int checkingInd) {
        initComponents();
        this.c = c;
        this.checkInd = checkingInd;
        this.account = this.c.getCheckAccount().get(checkingInd);
        this.acc_number_text.setText(String.valueOf(this.account.getAccountNumber()));
        this.acc_balance_text.setText(String.valueOf(this.account.getBalance().get()));
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

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        deposit_button = new javax.swing.JButton();
        withdraw_button = new javax.swing.JButton();
        acc_number_text = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        acc_balance_text = new javax.swing.JTextField();
        loan_button = new javax.swing.JButton();
        currency_exchange_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Checking Account");
        setSize(new java.awt.Dimension(800, 450));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account Number:");

        deposit_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        deposit_button.setText("Deposit");
        deposit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_buttonActionPerformed(evt);
            }
        });

        withdraw_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        withdraw_button.setText("Withdraw");
        withdraw_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_buttonActionPerformed(evt);
            }
        });

        acc_number_text.setEditable(false);
        acc_number_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acc_number_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_number_textActionPerformed(evt);
            }
        });

        back_button.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Account Balance:");

        acc_balance_text.setEditable(false);
        acc_balance_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acc_balance_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_balance_textActionPerformed(evt);
            }
        });

        loan_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        loan_button.setText("Loan");
        loan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_buttonActionPerformed(evt);
            }
        });

        currency_exchange_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        currency_exchange_button.setText("Exchange");
        currency_exchange_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currency_exchange_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(deposit_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(loan_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(33, 33, 33)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(acc_balance_text, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(77, 77, 77)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(currency_exchange_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(withdraw_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(acc_number_text, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(100, 100, 100))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(acc_number_text, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(acc_balance_text, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(withdraw_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deposit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loan_button, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(currency_exchange_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loan_button, withdraw_button});

        pack();
    }// </editor-fold>

    private void deposit_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deposit_buttonActionPerformed
        // TODO add your handling code here:
    	CheckAccount acc = this.account;
    	Customer c = this.c;
    	int ind = this.checkInd;
    	this.setVisible(false);
    	dispose();
    	
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyOperationPage(c,acc,0, 0,ind).setVisible(true);
            }
        });
    }// GEN-LAST:event_deposit_buttonActionPerformed

    private void acc_number_textActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_acc_number_textActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_acc_number_textActionPerformed

    private void acc_balance_textActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_acc_balance_textActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_acc_balance_textActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Customer c = this.c;
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMainPage(c).setVisible(true);
            }
        });
        
    }// GEN-LAST:event_back_buttonActionPerformed

    private void withdraw_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_withdraw_buttonActionPerformed
        CheckAccount acc = this.account;
        Customer c = this.c;
        int ind = this.checkInd;
        this.setVisible(false);
    	dispose();
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyOperationPage(c,acc,0, 1,ind).setVisible(true);
            }
        });
    }// GEN-LAST:event_withdraw_buttonActionPerformed

    private void loan_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loan_buttonActionPerformed
    	CheckAccount acc = this.account;
    	Customer c = this.c;
    	int ind = this.checkInd;
    	this.setVisible(false);
    	dispose();
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyOperationPage(c,acc,0, 2,ind).setVisible(true);
            }
        });
    }// GEN-LAST:event_loan_buttonActionPerformed

    private void currency_exchange_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_currency_exchange_buttonActionPerformed
        // TODO add your handling code here:
    	int ind = this.checkInd;
    	this.setVisible(false);
    	dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExchangePage(c,account,checkInd).setVisible(true);
            }
        });
    }// GEN-LAST:event_currency_exchange_buttonActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckingAccountPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckingAccountPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckingAccountPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckingAccountPage.class.getName()).log(java.util.logging.Level.SEVERE,
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
    private javax.swing.JTextField acc_balance_text;
    private javax.swing.JTextField acc_number_text;
    private javax.swing.JButton back_button;
    private javax.swing.JButton currency_exchange_button;
    private javax.swing.JButton deposit_button;
    private javax.swing.JButton loan_button;
    private javax.swing.JButton withdraw_button;
    // End of variables declaration//GEN-END:variables
}