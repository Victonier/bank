package fancybank.gui;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import fancybank.loan.Loan;
import fancybank.stock.Stock;
import fancybank.user.Customer;
import fancybank.user.Manager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Di Wang
 */
public class CustomerListPage extends javax.swing.JFrame {

    /**
     * Creates new form StockMarketPage
     */
	private Manager m;
    public CustomerListPage(Manager m ) {
        initComponents();
        this.m=m;
        DefaultTableModel model = (DefaultTableModel) this.customer_list_table.getModel();
    	ArrayList<Customer>all_cus = this.m.getAllCustomers();
    	System.out.println(all_cus.get(0).getName().toString());
        for(int i =0;i<all_cus.size();i++) {
        	Customer c = all_cus.get(i);
        	double total_loan = 0;
        	ArrayList<Loan> loans = c.getLoans();
        	for(int j =0;j<loans.size();j++) {
        		total_loan+=loans.get(j).getUnpaidAmount();
        	}
        	String name = c.getName().toString();
        	int d = c.getAccounts().size();
        	model.addRow(new Object[]{name, d, total_loan});
        }
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

        javax.swing.JScrollPane customer_list = new javax.swing.JScrollPane();
        customer_list_table = new javax.swing.JTable();
        back_button = new javax.swing.JButton();
        Edit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer information list");

        customer_list_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        customer_list_table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "Account", "Loan"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customer_list_table.setRowSelectionAllowed(false);
        customer_list_table.setShowGrid(true);
        customer_list.setViewportView(customer_list_table);
        if (customer_list_table.getColumnModel().getColumnCount() > 0) {
            customer_list_table.getColumnModel().getColumn(0).setResizable(false);
            customer_list_table.getColumnModel().getColumn(1).setResizable(false);
            customer_list_table.getColumnModel().getColumn(2).setResizable(false);
        }

        back_button.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        Edit_button.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Edit_button.setText("Edit");
        Edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(customer_list, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(customer_list, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }// GEN-LAST:event_back_buttonActionPerformed

    private void Edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	int row = this.customer_list_table.getSelectedRow();
    	ArrayList<Customer> all_cus =  this.m.getAllCustomers();

    	String selected_name = customer_list_table.getModel().getValueAt(row, 0).toString();
    	for(int i=0;i<all_cus.size();i++) {
    		if(all_cus.get(i).getName().toString().equals(selected_name)) {
    			Customer selected_c = all_cus.get(i);
    			java.awt.EventQueue.invokeLater(new Runnable() {
    	            public void run() {
    	                new CustomerEditPage(selected_c).setVisible(true);
    	            }
    	        });
    		}
    	}
        
    }

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
            java.util.logging.Logger.getLogger(StockMarketPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockMarketPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockMarketPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockMarketPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockMarketPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit_button;
    private javax.swing.JButton back_button;
    private javax.swing.JTable customer_list_table;
    // End of variables declaration//GEN-END:variables
}