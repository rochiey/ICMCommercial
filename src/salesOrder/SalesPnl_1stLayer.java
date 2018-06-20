package salesOrder;

import java.awt.Color;
import javax.swing.*;

public class SalesPnl_1stLayer extends javax.swing.JPanel {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    public SalesPnl_1stLayer() {
        initComponents();
        SalesOrder_ButtonFunctions.cleanCustomerInfo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane16 = new javax.swing.JScrollPane();
        tbl_SalesCustomerDetails = new javax.swing.JTable();
        lbl_SalesProductCode = new javax.swing.JLabel();
        txt_SalesInput = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_SalesCustomerDetails.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_SalesCustomerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Customer Type:", "Dealer"},
                {"Customer Name:", "Manuel Cagatin"},
                {"Credit Limit:", "₱1500.00"},
                {"Available Credits:", "₱1000.00"},
                {"Balance:", "₱500.00"}
            },
            new String [] {
                "", ""
            }
        ));
        tbl_SalesCustomerDetails.setEnabled(false);
        tbl_SalesCustomerDetails.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_SalesCustomerDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane16.setViewportView(tbl_SalesCustomerDetails);
        tbl_SalesCustomerDetails.setBackground(Color.WHITE);
        tbl_SalesCustomerDetails.setShowGrid(true);
        tbl_SalesCustomerDetails.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbl_SalesCustomerDetails.getColumnModel().getColumn(0).setPreferredWidth(140);
        tbl_SalesCustomerDetails.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_SalesCustomerDetails.setRowHeight(27);
        tbl_SalesCustomerDetails.setTableHeader(null);

        lbl_SalesProductCode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_SalesProductCode.setText("Article Code:");

        txt_SalesInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_SalesInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SalesInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SalesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SalesProductCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 666, Short.MAX_VALUE)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_SalesProductCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SalesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_SalesInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SalesInputActionPerformed
        button.salesBarcode = txt_SalesInput.getText();
        button.addSalesCart();
        txt_SalesInput.setText("");
    }//GEN-LAST:event_txt_SalesInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane16;
    public static javax.swing.JLabel lbl_SalesProductCode;
    public static javax.swing.JTable tbl_SalesCustomerDetails;
    public static javax.swing.JTextField txt_SalesInput;
    // End of variables declaration//GEN-END:variables
}
