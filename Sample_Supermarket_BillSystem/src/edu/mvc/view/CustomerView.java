/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.mvc.view;

import edu.mvc.controller.CustomerController;
import edu.mvc.dto.CustomerDto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tharidu dilshan
 */
public class CustomerView extends javax.swing.JFrame {

    private CustomerController customerController;

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        this.customerController = new CustomerController();
        initComponents();
        loadCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCustomer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LabelCustID = new javax.swing.JLabel();
        TextCustId = new javax.swing.JTextField();
        LabelTitle = new javax.swing.JLabel();
        TextTitle = new javax.swing.JTextField();
        LabelDOB = new javax.swing.JLabel();
        TextDOB = new javax.swing.JTextField();
        LabelSalary = new javax.swing.JLabel();
        TextSalary = new javax.swing.JTextField();
        LabelAddress = new javax.swing.JLabel();
        TextAddress = new javax.swing.JTextField();
        LabelCity = new javax.swing.JLabel();
        TextCity = new javax.swing.JTextField();
        LabelProvince = new javax.swing.JLabel();
        TextProvince = new javax.swing.JTextField();
        LabelZip = new javax.swing.JLabel();
        TextZip = new javax.swing.JTextField();
        LabelName = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        ButtonDelete = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCustomer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelCustomer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCustomer.setText("Customer Controller");

        LabelCustID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelCustID.setText("Cust ID");

        TextCustId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelTitle.setText("Title");

        TextTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelDOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelDOB.setText("DOB");

        TextDOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelSalary.setText("Salary");

        TextSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelAddress.setText("Address");

        TextAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelCity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelCity.setText("City");

        TextCity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelProvince.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelProvince.setText("Province");

        TextProvince.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelZip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelZip.setText("Zip Code");

        TextZip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelName.setText("Name");

        TextName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ButtonDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ButtonDelete.setText("Delete");

        ButtonUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ButtonUpdate.setText("Update");

        ButtonSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ButtonSave.setText("Save");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        TableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextCity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelZip, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextZip, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabelCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelZip, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextZip, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        saveCustomer();
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void TableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCustomerMouseClicked
        searchCustomer();        // TODO add your handling code here:
    }//GEN-LAST:event_TableCustomerMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JLabel LabelAddress;
    private javax.swing.JLabel LabelCity;
    private javax.swing.JLabel LabelCustID;
    private javax.swing.JLabel LabelCustomer;
    private javax.swing.JLabel LabelDOB;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelProvince;
    private javax.swing.JLabel LabelSalary;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LabelZip;
    private javax.swing.JTable TableCustomer;
    private javax.swing.JTextField TextAddress;
    private javax.swing.JTextField TextCity;
    private javax.swing.JTextField TextCustId;
    private javax.swing.JTextField TextDOB;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextProvince;
    private javax.swing.JTextField TextSalary;
    private javax.swing.JTextField TextTitle;
    private javax.swing.JTextField TextZip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void saveCustomer() {
        CustomerDto dto = new CustomerDto();
        dto.setCustId(TextCustId.getText());
        dto.setTitle(TextTitle.getText());
        dto.setName(TextName.getText());
        dto.setAddress(TextAddress.getText());
        dto.setDob(TextDOB.getText());
        dto.setSalary(Double.parseDouble(TextSalary.getText()));
        dto.setCity(TextCity.getText());
        dto.setProvince(TextProvince.getText());
        dto.setZip(TextZip.getText());

        try {
            String result = customerController.saveCustomer(dto);
            System.out.println(result);
            JOptionPane.showMessageDialog(this, result);
            loadCustomers();
            clear();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void loadCustomers() {
        try {
            String columns[] = {"ID", "Name", "Address", "Salary", "Zip Code"};

            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };

            TableCustomer.setModel(dtm);

            ArrayList<CustomerDto> customerDtos = customerController.loadCustomer();

            for (CustomerDto customerDto : customerDtos) {
                Object rowData[] = {customerDto.getCustId(), customerDto.getTitle() + " " + customerDto.getName(), customerDto.getAddress() + " " + customerDto.getCity(), customerDto.getSalary(), customerDto.getZip()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clear() {
        TextCustId.setText("");
        TextTitle.setText("");
        TextName.setText("");
        TextDOB.setText("");
        TextSalary.setText("");
        TextAddress.setText("");
        TextCity.setText("");
        TextProvince.setText("");
        TextZip.setText("");
    }

    private void searchCustomer() {
        String CustId = TableCustomer.getValueAt(TableCustomer.getSelectedRow(), 0).toString();
        try {
            
            CustomerDto dto = customerController.searchCustomer(CustId);

            if (dto != null) {
                TextCustId.setText(dto.getCustId());
                TextTitle.setText(dto.getTitle());
                TextName.setText(dto.getName());
                TextDOB.setText(dto.getDob());
                TextSalary.setText(dto.getSalary().toString());
                TextAddress.setText(dto.getAddress());
                TextCity.setText(dto.getCity());
                TextProvince.setText(dto.getProvince());
                TextZip.setText(dto.getZip());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
