
package salesOrder;

import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import static dialog_salesOrder.SalesOrder_ButtonFunctions.clickedBarcode;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class SalesPnl_2ndLayer extends javax.swing.JPanel {
    static Vector colNames = new Vector();
    public static DefaultTableModel tblModel;
   // DatabaseLinker poList;
    public SalesPnl_2ndLayer() {
        initComponents();
        
        colNames.add("No.");
        colNames.add("Code");
        colNames.add("Article Name");
        colNames.add("Color");
        colNames.add("Size");
        colNames.add("Qty");
        colNames.add("Retail Price");
        colNames.add("%");
        colNames.add("% Price");
        colNames.add("Total Price");
        Vector initial = new Vector();
        tbl_SalesCart.setModel(tblModel = new DefaultTableModel(initial,SalesPnl_2ndLayer.colNames));
        setJTable();
    }
    static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,javax.swing.JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
            dialog_salesOrder.SalesOrder_ButtonFunctions.clickedBarcode = tbl_SalesCart.getValueAt(row, 1).toString();
        }
        
    }
    public static float getRealFloat(String floatNum)
    {
        StringBuilder sb = new StringBuilder(floatNum);
        for(int i=0;i<floatNum.length();i++)
        {
            if(floatNum.charAt(i) == ',') sb.deleteCharAt(i);
        }
        float result = Float.parseFloat(sb.toString());
        return result;
    }
    public static void getTotalNet()
    {
        float sum = 0;
        int row = tbl_SalesCart.getRowCount();
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        
        for(int i=0;i<row;i++)
        {
            StringBuilder sb = new StringBuilder(tbl_SalesCart.getValueAt(i, 9).toString());
            sb.deleteCharAt(0);
            String resultString = sb.toString();
            sum+=getRealFloat(resultString);
        }
        lbl_SalesTotal.setText("₱"+formatter.format(Float.parseFloat(String.format("%.2f", sum))));
        setJTable();
    }
    static Connection conn = null;  
    static Statement stmt = null;
    static ResultSet rs = null; 
    public static void createDB()
    {
        try {
            Properties prop=new Properties();
            prop.setProperty("user","root");
            prop.setProperty("password","");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ICM",prop);
            stmt= conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    static int successEx = 0;
    private static void dbHandlerUpdates(String query)
    {
        
        try{
        createDB();
         successEx = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Error:Code:Sql Command"
                   + "</font></center></html>", "Error Message", 0);
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:session:connectionCloseDbHandlerUpdates(query)"
                   + "</font></center></html>", "Error Message", 0);
            }
        }
    }
    
    public static void setJTable()
    {
        setJTableColumnsWidth(tbl_SalesCart, 1331, 4, 4, 20, 6, 6, 4, 9, 4, 9, 9);
        JTableFixer.setSalesOrderTableField(tbl_SalesCart);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SalesCart = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txt_SalesTotalNetAmount = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbl_SalesTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_SalesCart = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_SalesCart.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_SalesCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, null, null, null, null, null, null},
                {"2", null, null, null, null, null, null, null, null, null},
                {"3", null, null, null, null, null, null, null, null, null},
                {"4", null, null, null, null, null, null, null, null, null},
                {"5", null, null, null, null, null, null, null, null, null},
                {"6", null, null, null, null, null, null, null, null, null},
                {"7", null, null, null, null, null, null, null, null, null},
                {"8", null, null, null, null, null, null, null, null, null},
                {"9", null, null, null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Unit No.", "Barcode", "Name", "Color", "Size", "Qty", "Selling Price", "Discount", "Discounted Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_SalesCart.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_SalesCart.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_SalesCart.setShowHorizontalLines(false);
        tbl_SalesCart.getTableHeader().setReorderingAllowed(false);
        tbl_SalesCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_SalesCartMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_SalesCart);
        tbl_SalesCart.setBackground(Color.WHITE);
        tbl_SalesCart.setRowHeight(27);
        tbl_SalesCart.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_SalesCart.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        //tbl_SalesCart.setShowGrid(false);
        tbl_SalesCart.setShowVerticalLines(true);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        txt_SalesTotalNetAmount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_SalesTotalNetAmount.setForeground(new java.awt.Color(255, 255, 255));
        txt_SalesTotalNetAmount.setText("Total Net Amount");

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        lbl_SalesTotal.setFont(new java.awt.Font("Arial", 1, 47)); // NOI18N
        lbl_SalesTotal.setForeground(new java.awt.Color(0, 204, 0));
        lbl_SalesTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_SalesTotal.setText("₱0.00");
        lbl_SalesTotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_SalesTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lbl_SalesTotal)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_SalesTotalNetAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_SalesTotalNetAmount)
                .addGap(3, 3, 3)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_SalesCartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SalesCartMousePressed
        tableclicked(evt, tbl_SalesCart);
    }//GEN-LAST:event_tbl_SalesCartMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbl_SalesTotal;
    public static javax.swing.JTable tbl_SalesCart;
    private javax.swing.JLabel txt_SalesTotalNetAmount;
    // End of variables declaration//GEN-END:variables
}
