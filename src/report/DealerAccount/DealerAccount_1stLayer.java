package report.DealerAccount;

import com.DatabaseLinker;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class DealerAccount_1stLayer extends javax.swing.JPanel {
    DatabaseLinker dealerReport,credit_pulloutDetails;
    static String query2 = "SELECT invoice_ID AS 'SO No.',IFNULL(DATE_FORMAT(transaction_date, '%b. %d, %Y'),'-') AS 'Transaction Date',dealer_ID AS 'Dealer ID', total_net AS 'Total Net',amount AS 'Cash Paid',payment_type.payment_type_name AS 'Payment Type', IFNULL(DATE_FORMAT(due_date, '%b. %d, %Y'),'-') AS 'Due Date',DATEDIFF(due_date,CURDATE()) AS 'Remain. Days',penalty AS 'Penalty' FROM credit_transaction,payment_type WHERE paymentTypeID = payment_type.idpayment_type AND paymentTypeID = 243 AND due_date BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 14 DAY)";
    static String query="SELECT iddealer AS 'ID',CONCAT(first_name,' ',last_name) AS 'Dealer Name',sponsor AS 'Sponsor/Recruiter Name',"
            + "DATE_FORMAT(registration_date, '%b. %d, %Y') AS 'Registration Date',credit_limit AS 'Credit Line',available_credit AS 'Available Credit',"
            + "balance AS 'Balance', total_penalty AS 'Total Penalty' FROM dealer";
    DealerAccount_ButtonFunctions button = new DealerAccount_ButtonFunctions();
    
    public DealerAccount_1stLayer() {
        initComponents();
        dealerReport = new DatabaseLinker(tbl_Outstanding, query);
        credit_pulloutDetails = new DatabaseLinker(tbl_OutstandingDetails, "");
        getTotals();
        generateDueAndPenalty();
        setJTable();
    }
    public static void generateDueAndPenalty()
    {
        lbl_IncomingDDate.setText(tbl_OutstandingDetails.getRowCount()+"");
        int count=0;
        for(int i=0;i<tbl_OutstandingDetails.getRowCount();i++)
        {
            if(tbl_OutstandingDetails.getValueAt(i, 8) != "") count++;
        }
        lbl_Penalty.setText(count+"");
    }
    public static void getTotals()
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        float sumBalance=0;
        float sumACredit=0;
        int row = tbl_Outstanding.getRowCount();
        for(int i=0;i<row;i++)
        {
            sumBalance+=Float.parseFloat(tbl_Outstanding.getValueAt(i, 6).toString());
            sumACredit+=Float.parseFloat(tbl_Outstanding.getValueAt(i, 5).toString());
        }
        lbl_TBalance.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", sumBalance))));
        lbl_ACLine.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", sumACredit))));
    }
    public static void generateUpdate()
    {
        DatabaseLinker.updateTable(tbl_Outstanding, query);
        setJTable();
    }
    public static void generateIncomingDue()
    {
        DatabaseLinker.updateTable(tbl_OutstandingDetails, query2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_Outstanding = new javax.swing.JTable();
        cbo_OutstandingSort = new javax.swing.JComboBox<>();
        lbl_InventorySortBy = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_OutstandingDetails = new javax.swing.JTable();
        lbl_status1 = new javax.swing.JLabel();
        lbl_NewDealerMName3 = new javax.swing.JLabel();
        lbl_ACLine = new javax.swing.JLabel();
        lbl_TBalance = new javax.swing.JLabel();
        lbl_InvStatTotal = new javax.swing.JLabel();
        lbl_IncomingDDate = new javax.swing.JLabel();
        lbl_InvStatTotal1 = new javax.swing.JLabel();
        lbl_Penalty = new javax.swing.JLabel();
        txt_dealerID = new javax.swing.JTextField();
        lbl_DealerCode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_Outstanding = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_Outstanding.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_Outstanding.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Dealer ID", "Dealer Full Name", "Contact No.", "Credit Line", "Available Credit Line", "Total Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Outstanding.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_Outstanding.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_Outstanding.getTableHeader().setReorderingAllowed(false);
        tbl_Outstanding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_OutstandingMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_Outstanding);
        if (tbl_Outstanding.getColumnModel().getColumnCount() > 0) {
            tbl_Outstanding.getColumnModel().getColumn(0).setResizable(false);
            tbl_Outstanding.getColumnModel().getColumn(1).setResizable(false);
            tbl_Outstanding.getColumnModel().getColumn(2).setResizable(false);
            tbl_Outstanding.getColumnModel().getColumn(3).setResizable(false);
            tbl_Outstanding.getColumnModel().getColumn(4).setResizable(false);
            tbl_Outstanding.getColumnModel().getColumn(5).setResizable(false);
        }
        tbl_Outstanding.setBackground(Color.WHITE);
        tbl_Outstanding.setRowHeight(27);
        tbl_Outstanding.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_Outstanding.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_Outstanding.setShowGrid(true);
        tbl_Outstanding.getTableHeader().setResizingAllowed(false);

        cbo_OutstandingSort.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_OutstandingSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Balance Amount" }));
        cbo_OutstandingSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_OutstandingSortActionPerformed(evt);
            }
        });

        lbl_InventorySortBy.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_InventorySortBy.setText("Sort by:");

        tbl_OutstandingDetails = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_OutstandingDetails.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_OutstandingDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SO No.", "Transaction Date", "Dealer ID", "Total Net", "Cash Paid", "Payment Type", "Due Date", "Remain. Days", "Penalty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_OutstandingDetails.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_OutstandingDetails.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_OutstandingDetails.getTableHeader().setReorderingAllowed(false);
        tbl_OutstandingDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_OutstandingDetailsMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_OutstandingDetails);
        if (tbl_OutstandingDetails.getColumnModel().getColumnCount() > 0) {
            tbl_OutstandingDetails.getColumnModel().getColumn(0).setResizable(false);
            tbl_OutstandingDetails.getColumnModel().getColumn(1).setResizable(false);
            tbl_OutstandingDetails.getColumnModel().getColumn(2).setResizable(false);
            tbl_OutstandingDetails.getColumnModel().getColumn(3).setResizable(false);
            tbl_OutstandingDetails.getColumnModel().getColumn(4).setResizable(false);
            tbl_OutstandingDetails.getColumnModel().getColumn(5).setResizable(false);
            tbl_OutstandingDetails.getColumnModel().getColumn(6).setResizable(false);
            tbl_OutstandingDetails.getColumnModel().getColumn(7).setResizable(false);
            tbl_OutstandingDetails.getColumnModel().getColumn(8).setResizable(false);
        }
        tbl_OutstandingDetails.setBackground(Color.WHITE);
        tbl_OutstandingDetails.setRowHeight(27);
        tbl_OutstandingDetails.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_OutstandingDetails.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_OutstandingDetails.setShowGrid(true);
        tbl_OutstandingDetails.getTableHeader().setResizingAllowed(false);

        lbl_status1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_status1.setForeground(new java.awt.Color(0, 0, 204));
        lbl_status1.setText("Dealer Credit/Pullout Transaction Details");

        lbl_NewDealerMName3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_NewDealerMName3.setText("Totals:");

        lbl_ACLine.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_ACLine.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ACLine.setText("₱0.00");

        lbl_TBalance.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_TBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_TBalance.setText("₱0.00");

        lbl_InvStatTotal.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatTotal.setText("Total No. of Incoming Due Dates:");

        lbl_IncomingDDate.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_IncomingDDate.setForeground(new java.awt.Color(0, 0, 255));
        lbl_IncomingDDate.setText("0");

        lbl_InvStatTotal1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatTotal1.setText("Total No. of Penalty:");

        lbl_Penalty.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_Penalty.setForeground(new java.awt.Color(0, 0, 255));
        lbl_Penalty.setText("0");

        txt_dealerID.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_dealerID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dealerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dealerIDActionPerformed(evt);
            }
        });
        txt_dealerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dealerIDKeyReleased(evt);
            }
        });

        lbl_DealerCode.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_DealerCode.setText("Dealer ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_NewDealerMName3)
                .addGap(32, 32, 32)
                .addComponent(lbl_ACLine, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_TBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_InvStatTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_IncomingDDate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_InvStatTotal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Penalty, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_status1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_DealerCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_InventorySortBy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_OutstandingSort, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_DealerCode)
                        .addComponent(txt_dealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbo_OutstandingSort, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InventorySortBy)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TBalance)
                    .addComponent(lbl_ACLine)
                    .addComponent(lbl_NewDealerMName3))
                .addGap(25, 25, 25)
                .addComponent(lbl_status1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_InvStatTotal)
                    .addComponent(lbl_IncomingDDate)
                    .addComponent(lbl_InvStatTotal1)
                    .addComponent(lbl_Penalty))
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
            DatabaseLinker.updateTable(tbl_OutstandingDetails, "SELECT invoice_ID AS 'SO No.',IFNULL(DATE_FORMAT(transaction_date, '%b. %d, %Y'),'-') AS 'Transaction Date',dealer_ID AS 'Dealer ID', total_net AS 'Total Net',amount AS 'Cash Paid',payment_type.payment_type_name AS 'Payment Type', IFNULL(DATE_FORMAT(due_date, '%b. %d, %Y'),'-') AS 'Due Date',DATEDIFF(due_date,CURDATE()) AS 'Remain. Days',penalty AS 'Penalty' FROM credit_transaction,payment_type WHERE paymentTypeID = payment_type.idpayment_type AND dealer_ID="+clickedID_onTable);
            getTotals();
        }
        setJTable();
    }
    
    public static void setJTable()
    {
        setJTableColumnsWidth(tbl_Outstanding, 1330, 5, 20, 19, 10, 10, 10, 10,10);
        JTableFixer.setDealerReportTableField(tbl_Outstanding);
        
        setJTableColumnsWidth(tbl_OutstandingDetails, 1330, 5, 9, 7, 13, 13, 10, 10, 7, 13);
        JTableFixer.setDealerReportDetailsTableField(tbl_OutstandingDetails);
    }
    private void tbl_OutstandingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_OutstandingMousePressed
        tableclicked(evt, tbl_Outstanding);
    }//GEN-LAST:event_tbl_OutstandingMousePressed

    private void cbo_OutstandingSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_OutstandingSortActionPerformed
        button.dealerSort();
    }//GEN-LAST:event_cbo_OutstandingSortActionPerformed

    private void tbl_OutstandingDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_OutstandingDetailsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_OutstandingDetailsMousePressed

    private void txt_dealerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dealerIDKeyReleased
        if(!txt_dealerID.getText().equals("")) DatabaseLinker.updateTable(tbl_Outstanding, "SELECT iddealer AS 'ID',CONCAT(first_name,' ',last_name) AS 'Dealer Name',sponsor AS 'Sponsor/Recruiter Name',"
            + "DATE_FORMAT(registration_date, '%b. %d, %Y') AS 'Registration Date',credit_limit AS 'Credit Line',available_credit AS 'Available Credit',"
            + "balance AS 'Balance' FROM dealer WHERE iddealer="+txt_dealerID.getText());
        else DatabaseLinker.updateTable(tbl_Outstanding, "SELECT iddealer AS 'ID',CONCAT(first_name,' ',last_name) AS 'Dealer Name',sponsor AS 'Sponsor/Recruiter Name',"
            + "DATE_FORMAT(registration_date, '%b. %d, %Y') AS 'Registration Date',credit_limit AS 'Credit Line',available_credit AS 'Available Credit',"
            + "balance AS 'Balance' FROM dealer");
    }//GEN-LAST:event_txt_dealerIDKeyReleased

    private void txt_dealerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dealerIDActionPerformed
        setJTable();
    }//GEN-LAST:event_txt_dealerIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JComboBox<String> cbo_OutstandingSort;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    protected static javax.swing.JLabel lbl_ACLine;
    protected static javax.swing.JLabel lbl_DealerCode;
    protected static javax.swing.JLabel lbl_IncomingDDate;
    protected static javax.swing.JLabel lbl_InvStatTotal;
    protected static javax.swing.JLabel lbl_InvStatTotal1;
    protected static javax.swing.JLabel lbl_InventorySortBy;
    protected static javax.swing.JLabel lbl_NewDealerMName3;
    protected static javax.swing.JLabel lbl_Penalty;
    protected static javax.swing.JLabel lbl_TBalance;
    protected static javax.swing.JLabel lbl_status1;
    public static javax.swing.JTable tbl_Outstanding;
    public static javax.swing.JTable tbl_OutstandingDetails;
    protected static javax.swing.JTextField txt_dealerID;
    // End of variables declaration//GEN-END:variables
}
