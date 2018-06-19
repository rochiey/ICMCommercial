package report.SalesReport;

import com.DatabaseLinker;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import com.DB:

public class ReportPnl_1stLayer extends javax.swing.JPanel {

    
    public ReportPnl_1stLayer() {
        initComponents();
        //lbl_SalesReportDate.setText("Today");
        DatabaseLinker.updateTable(tbl_ReportSales, "SELECT idinvoice AS 'SO No.',DATE_FORMAT(date_of_transaction, '%b. %d, %Y') AS 'Transaction Date',(SELECT CONCAT(dealer.first_name,' ',dealer.last_name) FROM dealer WHERE dealer.iddealer=invoice.customerDealer) AS 'Customer Name',total_net AS 'Total Net', amount_paid AS 'Amount Paid',payment_type.payment_type_name AS 'Payment Type',total_refund AS 'Return/Refund Amount' FROM payment_type,invoice WHERE payment_type=payment_type.idpayment_type ORDER BY date_of_transaction DESC");
        setJTable();
        getAllTotal();
    }
    public static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (int) tbl_data.getValueAt(row, 0);
            DatabaseLinker.updateTable(tbl_ReportSalesDetails, "SELECT idproduct AS 'Code' ,item_name as 'Article Name'"
            + ", product_color.color_code AS 'Color',REPLACE(product.product_size, 'NULL', '-') AS 'Size'"
            + ",purchase_order_list.quantity AS 'Quantity', unit_price AS 'Retail Price'"
            + ",discount_percent AS '%' ,discounted_price AS '% Price',purchase_order_list.total_price AS 'Net Price' FROM purchase_order_list,product_color,product "
            + "WHERE product.product_color=product_color.idproduct_color "
            + "AND product.idproduct = purchase_order_list.item_code AND idinvoice="+clickedID_onTable);
        }
        DecimalFormat df = new DecimalFormat("#,###.00");
        lbl_SalesReportTotal.setText("₱"+df.format(tbl_ReportSales.getValueAt(tbl_data.getSelectedRow(), 3)));
        setJTable();
    }
    public static void getAllTotal()
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        DB.createDB();
        float totalNet=0,amountPaid=0,refundAmount=0;
        try {
            DB.rs=DB.stmt.executeQuery("SELECT SUM(total_net) AS 'totalnet',SUM(amount_paid) AS 'amountpaid',SUM(total_refund) AS 'totalrefund' FROM invoice");
            while(DB.rs.next())
            {
                totalNet = DB.rs.getFloat("totalnet");
                amountPaid = DB.rs.getFloat("amountpaid");
                refundAmount = DB.rs.getFloat("totalrefund");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportPnl_1stLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbl_TNet.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", totalNet))));
        lbl_CPaid.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", amountPaid))));
        lbl_RefundAmount.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", refundAmount))));
    }
    public static Float getTotalAmount()
    {
        int row = tbl_ReportSales.getRowCount();
        float total = 0; float totalNet=0;
        for(int i=0;i<row;i++)
        {
            totalNet = Float.parseFloat(tbl_ReportSales.getValueAt(i, 3).toString());
            total+=totalNet;
        }
        return total;
    }
    
    public static void setJTable()
    {
        setJTableColumnsWidth(tbl_ReportSales, 1331, 7, 11, 24, 13, 13, 9, 13);
        setJTableColumnsWidth(tbl_ReportSalesDetails, 1331, 7, 17, 7, 7, 7, 11, 4, 11, 11);
        JTableFixer.setSalesReportTableField(tbl_ReportSales);
        JTableFixer.setSalesReportDetailsTableField(tbl_ReportSalesDetails);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_ReportSales = new javax.swing.JTable();
        lbl_NewDealerMName1 = new javax.swing.JLabel();
        lbl_SalesReportTotal = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_ReportSalesDetails = new javax.swing.JTable();
        lbl_NewDealerMName2 = new javax.swing.JLabel();
        lbl_RefundAmount = new javax.swing.JLabel();
        lbl_CPaid = new javax.swing.JLabel();
        lbl_TNet = new javax.swing.JLabel();
        lbl_NewDealerMName3 = new javax.swing.JLabel();
        txt_SONo = new javax.swing.JTextField();
        lbl_DealerCode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_ReportSales = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_ReportSales.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_ReportSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SO No.", "Transaction Date", "Customer Name", "Total Net", "Cash Paid", "Payment Type", "Refund Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ReportSales.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ReportSales.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_ReportSales.getTableHeader().setReorderingAllowed(false);
        tbl_ReportSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_ReportSalesMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_ReportSales);
        if (tbl_ReportSales.getColumnModel().getColumnCount() > 0) {
            tbl_ReportSales.getColumnModel().getColumn(0).setResizable(false);
            tbl_ReportSales.getColumnModel().getColumn(1).setResizable(false);
            tbl_ReportSales.getColumnModel().getColumn(2).setResizable(false);
            tbl_ReportSales.getColumnModel().getColumn(3).setResizable(false);
            tbl_ReportSales.getColumnModel().getColumn(4).setResizable(false);
            tbl_ReportSales.getColumnModel().getColumn(5).setResizable(false);
            tbl_ReportSales.getColumnModel().getColumn(6).setResizable(false);
        }
        tbl_ReportSales.setBackground(Color.WHITE);
        tbl_ReportSales.setRowHeight(27);
        tbl_ReportSales.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_ReportSales.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_ReportSales.setShowGrid(true);
        tbl_ReportSales.getTableHeader().setResizingAllowed(false);

        lbl_NewDealerMName1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_NewDealerMName1.setText("Total Sales:");

        lbl_SalesReportTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_SalesReportTotal.setForeground(new java.awt.Color(0, 0, 255));
        lbl_SalesReportTotal.setText("₱0.00");

        tbl_ReportSalesDetails = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_ReportSalesDetails.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_ReportSalesDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Article Name", "Color", "Size", "Quantity", "Retail Price", "%", "% Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ReportSalesDetails.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ReportSalesDetails.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_ReportSalesDetails.getTableHeader().setReorderingAllowed(false);
        tbl_ReportSalesDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_ReportSalesDetailsMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_ReportSalesDetails);
        if (tbl_ReportSalesDetails.getColumnModel().getColumnCount() > 0) {
            tbl_ReportSalesDetails.getColumnModel().getColumn(0).setResizable(false);
            tbl_ReportSalesDetails.getColumnModel().getColumn(1).setResizable(false);
            tbl_ReportSalesDetails.getColumnModel().getColumn(2).setResizable(false);
            tbl_ReportSalesDetails.getColumnModel().getColumn(3).setResizable(false);
            tbl_ReportSalesDetails.getColumnModel().getColumn(4).setResizable(false);
            tbl_ReportSalesDetails.getColumnModel().getColumn(5).setResizable(false);
            tbl_ReportSalesDetails.getColumnModel().getColumn(6).setResizable(false);
            tbl_ReportSalesDetails.getColumnModel().getColumn(7).setResizable(false);
            tbl_ReportSalesDetails.getColumnModel().getColumn(8).setResizable(false);
        }
        tbl_ReportSalesDetails.setBackground(Color.WHITE);
        tbl_ReportSalesDetails.setRowHeight(27);
        tbl_ReportSalesDetails.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_ReportSalesDetails.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_ReportSalesDetails.setShowGrid(true);
        tbl_ReportSalesDetails.getTableHeader().setResizingAllowed(false);

        lbl_NewDealerMName2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_NewDealerMName2.setForeground(new java.awt.Color(0, 0, 204));
        lbl_NewDealerMName2.setText("Sales Report Details");

        lbl_RefundAmount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_RefundAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_RefundAmount.setText("₱0.00");

        lbl_CPaid.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_CPaid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CPaid.setText("₱0.00");

        lbl_TNet.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_TNet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_TNet.setText("₱0.00");

        lbl_NewDealerMName3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_NewDealerMName3.setText("Totals:");

        txt_SONo.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_SONo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_SONo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SONoActionPerformed(evt);
            }
        });
        txt_SONo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SONoKeyReleased(evt);
            }
        });

        lbl_DealerCode.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_DealerCode.setText("SO No.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_NewDealerMName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_SalesReportTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(908, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_DealerCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_SONo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_NewDealerMName2))
                        .addGap(0, 1187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_NewDealerMName3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_TNet, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_CPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(lbl_RefundAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DealerCode)
                    .addComponent(txt_SONo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NewDealerMName3)
                    .addComponent(lbl_TNet)
                    .addComponent(lbl_RefundAmount)
                    .addComponent(lbl_CPaid))
                .addGap(25, 25, 25)
                .addComponent(lbl_NewDealerMName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NewDealerMName1)
                    .addComponent(lbl_SalesReportTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_ReportSalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ReportSalesMousePressed
        tableclicked(evt, tbl_ReportSales);
    }//GEN-LAST:event_tbl_ReportSalesMousePressed

    private void tbl_ReportSalesDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ReportSalesDetailsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_ReportSalesDetailsMousePressed

    private void txt_SONoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SONoKeyReleased
        if(!txt_SONo.getText().equals("")){
            DatabaseLinker.updateTable(tbl_ReportSales,"SELECT idinvoice AS 'SO No.',DATE_FORMAT(date_of_transaction, '%b. %d, %Y') AS 'Transaction Date',(SELECT CONCAT(dealer.first_name,' ',dealer.last_name) FROM dealer WHERE dealer.iddealer=invoice.customerDealer) AS 'Customer Name',total_net AS 'Total Net', amount_paid AS 'Amount Paid',payment_type.payment_type_name AS 'Payment Type',total_refund AS 'Refund Amount' FROM payment_type,invoice WHERE payment_type=payment_type.idpayment_type AND idinvoice="+txt_SONo.getText());
            setJTable();
        }
        else {
            DatabaseLinker.updateTable(tbl_ReportSales,"SELECT idinvoice AS 'SO No.',DATE_FORMAT(date_of_transaction, '%b. %d, %Y') AS 'Transaction Date',(SELECT CONCAT(dealer.first_name,' ',dealer.last_name) FROM dealer WHERE dealer.iddealer=invoice.customerDealer) AS 'Customer Name',total_net AS 'Total Net', amount_paid AS 'Amount Paid',payment_type.payment_type_name AS 'Payment Type',total_refund AS 'Refund Amount' FROM payment_type,invoice WHERE payment_type=payment_type.idpayment_type");
            setJTable();
        }
    }//GEN-LAST:event_txt_SONoKeyReleased

    private void txt_SONoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SONoActionPerformed
        setJTable();
    }//GEN-LAST:event_txt_SONoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    protected static javax.swing.JLabel lbl_CPaid;
    protected static javax.swing.JLabel lbl_DealerCode;
    protected static javax.swing.JLabel lbl_NewDealerMName1;
    protected static javax.swing.JLabel lbl_NewDealerMName2;
    protected static javax.swing.JLabel lbl_NewDealerMName3;
    protected static javax.swing.JLabel lbl_RefundAmount;
    protected static javax.swing.JLabel lbl_SalesReportTotal;
    protected static javax.swing.JLabel lbl_TNet;
    protected static javax.swing.JTable tbl_ReportSales;
    protected static javax.swing.JTable tbl_ReportSalesDetails;
    protected static javax.swing.JTextField txt_SONo;
    // End of variables declaration//GEN-END:variables
}
