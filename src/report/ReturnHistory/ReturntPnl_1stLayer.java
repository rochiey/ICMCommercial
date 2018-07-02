package report.ReturnHistory;

import com.DatabaseLinker;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import java.awt.Color;
import com.DB;
import java.awt.Font;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ReturntPnl_1stLayer extends javax.swing.JPanel {

    DatabaseLinker returnHistory,invoiceDetails;
    static String returnQuery="SELECT idreturn_history AS 'RF No.',DATE_FORMAT(return_date, '%b. %d, %Y') AS 'Return Date', customer_name AS 'Customer Name',return_reason AS 'Reason',invoice.total_net AS 'Original Amount',refund AS 'Refund', invoiceID AS 'For SO No.' FROM return_history,invoice WHERE invoiceID=idinvoice ORDER BY return_date DESC";
    public ReturntPnl_1stLayer() {
        initComponents();
       returnHistory = new DatabaseLinker(tbl_ReturnReport, returnQuery);
       getTotals();
       getTotalReturn();
       setJTable();
    }
    public static void generateUpdate()
    {
        DatabaseLinker.updateTable(tbl_ReturnReport, returnQuery);
        getTotals();
        setJTable();
    }
    public static void getTotalReturn()
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        float totalNet = 0;
        int row = tbl_ReturnReportDetails.getRowCount();
        for(int i=0;i<row;i++)
        {
            totalNet+=Float.parseFloat(tbl_ReturnReportDetails.getValueAt(i, 8).toString());
        }
        lbl_TotalPendingRForm.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", totalNet))));
    }
    public static void getTotals()
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        float originalAmount=0,refund=0;
        DB.createDB();
        try {
            DB.rs=DB.stmt.executeQuery("SELECT IFNULL(SUM(invoice.total_net),0) AS 'orig', IFNULL(SUM(refund),0) AS 'refund' FROM return_history,invoice WHERE invoiceID=idinvoice");
            while(DB.rs.next())
            {
                originalAmount = Float.parseFloat(DB.rs.getObject("orig").toString());
                refund = Float.parseFloat(DB.rs.getObject("refund").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReturntPnl_1stLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbl_OriginalAmount.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", originalAmount))));
        lbl_DeductedAmount.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", refund))));
    }
    
    public static void setJTable(){
        setJTableColumnsWidth(tbl_ReturnReport, 1331, 7, 11, 30, 12, 14, 14, 8);
        JTableFixer.setReturnReportTableField(tbl_ReturnReport);
        
        setJTableColumnsWidth(tbl_ReturnReportDetails, 1331, 7, 7, 26, 8, 8, 8, 12, 12, 12);
        JTableFixer.setReturnReportDetailsTableField(tbl_ReturnReportDetails);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_ReturnReport = new javax.swing.JTable();
        lbl_NewDealerMName2 = new javax.swing.JLabel();
        lbl_OriginalAmount = new javax.swing.JLabel();
        lbl_NewDealerMName1 = new javax.swing.JLabel();
        lbl_TotalPendingRForm = new javax.swing.JLabel();
        lbl_DeductedAmount = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_ReturnReportDetails = new javax.swing.JTable();
        lbl_NewDealerMName3 = new javax.swing.JLabel();
        txt_RFNo = new javax.swing.JTextField();
        lbl_DealerCode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_ReturnReport = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_ReturnReport.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_ReturnReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RF No.", "Date", "Customer Name", "Reason", "Original Amount", "Refund Amount", "For SO No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ReturnReport.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ReturnReport.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_ReturnReport.getTableHeader().setReorderingAllowed(false);
        tbl_ReturnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_ReturnReportMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_ReturnReport);
        if (tbl_ReturnReport.getColumnModel().getColumnCount() > 0) {
            tbl_ReturnReport.getColumnModel().getColumn(0).setResizable(false);
            tbl_ReturnReport.getColumnModel().getColumn(1).setResizable(false);
            tbl_ReturnReport.getColumnModel().getColumn(2).setResizable(false);
            tbl_ReturnReport.getColumnModel().getColumn(3).setResizable(false);
            tbl_ReturnReport.getColumnModel().getColumn(4).setResizable(false);
            tbl_ReturnReport.getColumnModel().getColumn(5).setResizable(false);
            tbl_ReturnReport.getColumnModel().getColumn(6).setResizable(false);
        }
        tbl_ReturnReport.setBackground(Color.WHITE);
        tbl_ReturnReport.setRowHeight(27);
        tbl_ReturnReport.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_ReturnReport.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_ReturnReport.setShowGrid(true);
        tbl_ReturnReport.getTableHeader().setResizingAllowed(false);

        lbl_NewDealerMName2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_NewDealerMName2.setText("Totals:");

        lbl_OriginalAmount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_OriginalAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_OriginalAmount.setText("₱0.00");

        lbl_NewDealerMName1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_NewDealerMName1.setText("Total Net:");

        lbl_TotalPendingRForm.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_TotalPendingRForm.setForeground(new java.awt.Color(0, 0, 255));
        lbl_TotalPendingRForm.setText("₱0.00");

        lbl_DeductedAmount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_DeductedAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeductedAmount.setText("₱0.00");

        tbl_ReturnReportDetails = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_ReturnReportDetails.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_ReturnReportDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SO No.", "Article ID", "Article Name", "Color", "Size", "Qty", "SRP Price", "% Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ReturnReportDetails.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ReturnReportDetails.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_ReturnReportDetails.getTableHeader().setReorderingAllowed(false);
        tbl_ReturnReportDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_ReturnReportDetailsMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_ReturnReportDetails);
        if (tbl_ReturnReportDetails.getColumnModel().getColumnCount() > 0) {
            tbl_ReturnReportDetails.getColumnModel().getColumn(0).setResizable(false);
            tbl_ReturnReportDetails.getColumnModel().getColumn(1).setResizable(false);
            tbl_ReturnReportDetails.getColumnModel().getColumn(2).setResizable(false);
            tbl_ReturnReportDetails.getColumnModel().getColumn(3).setResizable(false);
            tbl_ReturnReportDetails.getColumnModel().getColumn(4).setResizable(false);
            tbl_ReturnReportDetails.getColumnModel().getColumn(5).setResizable(false);
            tbl_ReturnReportDetails.getColumnModel().getColumn(6).setResizable(false);
            tbl_ReturnReportDetails.getColumnModel().getColumn(7).setResizable(false);
            tbl_ReturnReportDetails.getColumnModel().getColumn(8).setResizable(false);
        }
        tbl_ReturnReportDetails.setBackground(Color.WHITE);
        tbl_ReturnReportDetails.setRowHeight(27);
        tbl_ReturnReportDetails.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_ReturnReportDetails.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_ReturnReportDetails.setShowGrid(true);
        tbl_ReturnReportDetails.getTableHeader().setResizingAllowed(false);

        lbl_NewDealerMName3.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_NewDealerMName3.setForeground(new java.awt.Color(0, 0, 204));
        lbl_NewDealerMName3.setText("Return Form Details");

        txt_RFNo.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_RFNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_RFNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RFNoActionPerformed(evt);
            }
        });
        txt_RFNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_RFNoKeyReleased(evt);
            }
        });

        lbl_DealerCode.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_DealerCode.setText("RF No.:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_NewDealerMName3)
                        .addContainerGap(1188, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_DealerCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_RFNo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_NewDealerMName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_TotalPendingRForm, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_NewDealerMName2)
                .addGap(35, 35, 35)
                .addComponent(lbl_OriginalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lbl_DeductedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DealerCode)
                    .addComponent(txt_RFNo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NewDealerMName2)
                    .addComponent(lbl_OriginalAmount)
                    .addComponent(lbl_DeductedAmount))
                .addGap(25, 25, 25)
                .addComponent(lbl_NewDealerMName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NewDealerMName1)
                    .addComponent(lbl_TotalPendingRForm))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (int) tbl_data.getValueAt(row, 0);
            DatabaseLinker.updateTable(tbl_ReturnReportDetails, "SELECT transactNo AS 'Transaction No.'"
            + ", product.product_name AS 'Article Name'"
            + ", total_net AS 'Total Net'"
            + ", returned_quantity AS 'Returned Quantity' FROM return_list,product"
            + " WHERE return_list.idproduct=product.idproduct AND return_list.transactNo="+clickedID_onTable);
        }
        getTotalReturn();
        setJTable();
    }
    private void tbl_ReturnReportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ReturnReportMousePressed
        tableclicked(evt, tbl_ReturnReport);
    }//GEN-LAST:event_tbl_ReturnReportMousePressed

    private void tbl_ReturnReportDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ReturnReportDetailsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_ReturnReportDetailsMousePressed

    private void txt_RFNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RFNoKeyReleased
        if(!txt_RFNo.getText().equals(""))DatabaseLinker.updateTable(tbl_ReturnReport, "SELECT idreturn_history AS 'RF No.',return_date AS 'Return Date', customer_name AS 'Customer Name',return_reason AS 'Reason',invoice.total_net AS 'Original Amount',refund AS 'Refund', invoiceID AS 'For SO No.' FROM return_history,invoice WHERE invoiceID=idinvoice AND idreturn_history="+txt_RFNo.getText());
        else DatabaseLinker.updateTable(tbl_ReturnReport, "SELECT idreturn_history AS 'RF No.',return_date AS 'Return Date', customer_name AS 'Customer Name',return_reason AS 'Reason',invoice.total_net AS 'Original Amount',refund AS 'Refund', invoiceID AS 'For SO No.' FROM return_history,invoice WHERE invoiceID=idinvoice");
        setJTable();
    }//GEN-LAST:event_txt_RFNoKeyReleased

    private void txt_RFNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RFNoActionPerformed
        setJTable();
    }//GEN-LAST:event_txt_RFNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    protected static javax.swing.JLabel lbl_DealerCode;
    protected static javax.swing.JLabel lbl_DeductedAmount;
    protected static javax.swing.JLabel lbl_NewDealerMName1;
    protected static javax.swing.JLabel lbl_NewDealerMName2;
    protected static javax.swing.JLabel lbl_NewDealerMName3;
    protected static javax.swing.JLabel lbl_OriginalAmount;
    protected static javax.swing.JLabel lbl_TotalPendingRForm;
    public static javax.swing.JTable tbl_ReturnReport;
    public static javax.swing.JTable tbl_ReturnReportDetails;
    protected static javax.swing.JTextField txt_RFNo;
    // End of variables declaration//GEN-END:variables
}
