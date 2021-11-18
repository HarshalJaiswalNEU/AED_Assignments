/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Orders.Orders;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshaljaiswal
 */
public class OrdersPage extends javax.swing.JPanel {

    /**
     * Creates new form OrdersPage
     */
    EcoSystem e;
    DB4OUtil dB4OUtil;
    Customer customer;

    public OrdersPage(EcoSystem system, DB4OUtil dB4OUtil, Customer c) {
        initComponents();
        this.e = system;
        this.dB4OUtil = dB4OUtil;
        this.customer = c;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        txtComment = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Orders page");

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Restaurant", "item", "price", "user", "deliveryMan", "status", "Comment"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jButton1.setText("Add Comments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(txtComment)))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(338, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a order");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        System.out.println("column count " + selectedRow);
        int columnCount = selectedRow;
        int i = 0;
        for (Orders c : e.getOrderDirectory().getOrderList()) {
            if (c.getUserName().equals(customer.getUsername())) {
                if (i == columnCount) {
                    c.setComment(txtComment.getText());
                    break;
                }
                i++;
            }

        }

        dB4OUtil.storeSystem(e);
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txtComment;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);

        for (Orders c : e.getOrderDirectory().getOrderList()) {
            if (c.getUserName().equals(customer.getUsername())) {
                
                Object[] row = new Object[7];
                row[0] = c.getRestaurantName();
                row[1] = c.getItem();
                row[2] = c.getPrice();
                row[3] = c.getUserName();
                row[4] = c.getDeliveryMan();
                row[5] = c.getStatus();
                row[6] = c.getComment();

                model.addRow(row);
            }

        }
    }
}
