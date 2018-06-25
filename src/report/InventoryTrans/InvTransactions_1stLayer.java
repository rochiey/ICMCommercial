package report.InventoryTrans;

import com.DatabaseLinker;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class InvTransactions_1stLayer extends javax.swing.JPanel {

    DatabaseLinker invTransaction;
    public static String query = "SELECT transact_date AS 'Transaction Date', transact_type AS 'Transaction Type', POid AS 'Transaction ID', remarks AS 'Remarks' FROM inventory_transactions ORDER BY transact_date DESC";
    public InvTransactions_1stLayer() {
        initComponents();
        invTransaction = new DatabaseLinker(tbl_InvTransactions, query);
    }
    public static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 2);
            if(tbl_InvTransactions.getValueAt(tbl_InvTransactions.getSelectedRow(), 1).equals("Inventory IN"))
            {
                DatabaseLinker.updateTable(tbl_InvTransactionsDetails, "SELECT salesOrderNo AS 'SO No.',idproduct AS 'Product ID',productName as 'Name'" +
                ", product_color.color_code AS 'Color',product.product_size AS 'Size'" +
                ",purchase_order_supplier.quantity AS 'Quantity'" +
                " FROM purchase_order_supplier,product_color,product " +
                "WHERE product.product_color=product_color.idproduct_color " +
                "AND product.idproduct = purchase_order_supplier.productID AND salesOrderNo="+clickedID_onTable);
            }
            else if(tbl_InvTransactions.getValueAt(tbl_InvTransactions.getSelectedRow(), 1).equals("Inventory OUT"))
            {
                DatabaseLinker.updateTable(tbl_InvTransactionsDetails, "SELECT transactNo AS 'Transaction No.'"
                        + ", inventory_out_list.barcode AS 'Barcode'"
                        + ", product.product_name AS 'Article Name'"
                        + ", inventory_out_list.quantity AS 'Removed Quantity'"
                        + " FROM inventory_out_list,product WHERE product.barcode=inventory_out_list.barcode AND transactNo="+clickedID_onTable);
                
            }
            else if(tbl_InvTransactions.getValueAt(tbl_InvTransactions.getSelectedRow(), 1).equals("RETURN"))
            {
                DatabaseLinker.updateTable(tbl_InvTransactionsDetails, "SELECT transactNo AS 'Transaction No.'"
                        + ", product.product_name AS 'Article Name'"
                        + ", totalNet AS 'Total Net'"
                        + ", returned_quantity AS 'Returned Quantity' FROM return_list,product"
                        + " WHERE return_list.idproduct=product.idproduct AND return_list.transactNo="+clickedID_onTable);
            }
            else //sales order
            {
                DatabaseLinker.updateTable(tbl_InvTransactionsDetails,"SELECT idinvoice AS 'SO No.',idproduct AS 'Product ID',item_name as 'Name'"
                + ", product_color.color_code AS 'Color',product.product_size AS 'Size'"
                + ",purchase_order_list.quantity AS 'Quantity', unit_price AS 'Price'"
                + ", discounted_price AS '% Price',purchase_order_list.total_price AS 'net' FROM purchase_order_list,product_color,product "
                + "WHERE product.product_color=product_color.idproduct_color "
                + "AND product.idproduct = purchase_order_list.item_code AND idinvoice="+clickedID_onTable);
            }
        }
    }
    public static void generateUpdate()
    {
        DatabaseLinker.updateTable(tbl_InvTransactions, query);
    }
    
    public static void setJTable(){
        /*setJTableColumnsWidth(tbl_InvTransactionsDetails, 1331, 5, 19, 15, 14, 7, 7, 7, 8, 10, 8);
        JTableFixer.setInvStatusTableField(tbl_InvTransactionsDetails);*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_InvTransactions = new javax.swing.JTable();
        lbl_NewDealerMName2 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_InvTransactionsDetails = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_InvTransactions = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_InvTransactions.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_InvTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Transaction Date", "Transaction Type", "Invoice ID", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_InvTransactions.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_InvTransactions.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_InvTransactions.getTableHeader().setReorderingAllowed(false);
        tbl_InvTransactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_InvTransactionsMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_InvTransactions);
        tbl_InvTransactions.setBackground(Color.WHITE);
        tbl_InvTransactions.setRowHeight(27);
        tbl_InvTransactions.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_InvTransactions.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_InvTransactions.setShowGrid(true);
        tbl_InvTransactions.getTableHeader().setResizingAllowed(false);

        lbl_NewDealerMName2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_NewDealerMName2.setForeground(new java.awt.Color(0, 0, 204));
        lbl_NewDealerMName2.setText("Inventory Transaction Details");

        tbl_InvTransactionsDetails = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_InvTransactionsDetails.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_InvTransactionsDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_InvTransactionsDetails.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_InvTransactionsDetails.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_InvTransactionsDetails.getTableHeader().setReorderingAllowed(false);
        tbl_InvTransactionsDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_InvTransactionsDetailsMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_InvTransactionsDetails);
        tbl_InvTransactionsDetails.setBackground(Color.WHITE);
        tbl_InvTransactionsDetails.setRowHeight(27);
        tbl_InvTransactionsDetails.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_InvTransactionsDetails.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_InvTransactionsDetails.setShowGrid(true);
        tbl_InvTransactionsDetails.getTableHeader().setResizingAllowed(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_NewDealerMName2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbl_NewDealerMName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_InvTransactionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_InvTransactionsMousePressed
        tableclicked(evt, tbl_InvTransactions);
    }//GEN-LAST:event_tbl_InvTransactionsMousePressed

    private void tbl_InvTransactionsDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_InvTransactionsDetailsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_InvTransactionsDetailsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    protected static javax.swing.JLabel lbl_NewDealerMName2;
    public static javax.swing.JTable tbl_InvTransactions;
    protected static javax.swing.JTable tbl_InvTransactionsDetails;
    // End of variables declaration//GEN-END:variables
}
