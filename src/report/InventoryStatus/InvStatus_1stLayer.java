package report.InventoryStatus;

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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

public class InvStatus_1stLayer extends javax.swing.JPanel {

    InvStatus_ButtonFunctions button = new InvStatus_ButtonFunctions();
    public InvStatus_1stLayer() {
        initComponents();
        DatabaseLinker.updateTable(InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                + "category.category_name AS 'Category',REPLACE(product.product_size, 'NULL', '-') AS 'Size',"
                + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',IFNULL(DATEDIFF(expiration,CURDATE()),'-') AS 'Remain. Days' "
                + "FROM product,supplier,product_color,category WHERE product.supplier = supplier.idsupplier and product.category = category.idcategory and product.product_color = product_color.idproduct_color");
        setJTable();
        getAllTotals();
    }
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null; 
    
    static int successExUpdate = 0 ;
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
    private static int dbHandlerUpdates(String query)
    {
        int success = 1;
        try{
        createDB();
         successExUpdate = stmt.executeUpdate(query);
         
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops. Something went wrong. Please try again."
                   + "</font></center></html>", "Error Message", 0);
        }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(InvStatus_1stLayer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return success;
    }
    public static void getAllTotals()
    {
        
        try {
            createDB();
            rs=stmt.executeQuery("SELECT COUNT(*) as 'how' FROM product WHERE quantity <=15");
            while(rs.next())
            {
                lbl_InvStatLStock.setText(rs.getObject("how").toString());
            }
            createDB();
            rs=stmt.executeQuery("SELECT COUNT(*) as 'how' FROM product WHERE DATEDIFF(expiration,CURDATE()) BETWEEN 0 AND 90");
            while(rs.next())
            {
                lbl_InvStatNExProd.setText(rs.getObject("how").toString());
            }
            createDB();
            rs=stmt.executeQuery("SELECT COUNT(*) as 'how' FROM product WHERE DATEDIFF(expiration,CURDATE())<=0");
            while(rs.next())
            {
                lbl_InvStatExProd.setText(rs.getObject("how").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvStatus_1stLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void setJTable(){
        setJTableColumnsWidth(tbl_InvStatus, 1331, 5, 19, 15, 14, 7, 7, 7, 8, 10, 8);
        JTableFixer.setInvStatusTableField(tbl_InvStatus);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_InvStatus = new javax.swing.JTable();
        lbl_note2 = new javax.swing.JLabel();
        lbl_InvStatTotal = new javax.swing.JLabel();
        lbl_InvStatLStock = new javax.swing.JLabel();
        lbl_InvStatNExProd = new javax.swing.JLabel();
        lbl_InvStatTotal1 = new javax.swing.JLabel();
        lbl_InvStatExProd = new javax.swing.JLabel();
        lbl_InvStatTotal2 = new javax.swing.JLabel();
        txt_articleCode = new javax.swing.JTextField();
        lbl_DealerCode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_InvStatus = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_InvStatus.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_InvStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Article Name", "Company", "Category", "Size", "Color Code", "Qty", "Retail Price", "Expiration Date", "Remain. Days"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_InvStatus.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_InvStatus.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_InvStatus.getTableHeader().setReorderingAllowed(false);
        tbl_InvStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_InvStatusMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_InvStatus);
        if (tbl_InvStatus.getColumnModel().getColumnCount() > 0) {
            tbl_InvStatus.getColumnModel().getColumn(0).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(1).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(2).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(3).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(4).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(5).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(6).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(7).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(8).setResizable(false);
            tbl_InvStatus.getColumnModel().getColumn(9).setResizable(false);
        }
        tbl_InvStatus.setBackground(Color.WHITE);
        tbl_InvStatus.setRowHeight(27);
        tbl_InvStatus.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_InvStatus.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_InvStatus.setShowGrid(true);
        tbl_InvStatus.getTableHeader().setResizingAllowed(false);

        lbl_note2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_note2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_note2.setText("Note: Please fill out the information that has * and the rest are optional.");
        lbl_note2.setText("<html><b>Note:</b> Products with stocks 15 below are considered <font color = red>Low Stocks</font> and products that will expire within 3 months (90 days) or below are considered <font color = red>Nearly Expire</font> and should be prioritize to sell.</html>");

        lbl_InvStatTotal.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatTotal.setText("Total No. of Low Stock Products:");

        lbl_InvStatLStock.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatLStock.setForeground(new java.awt.Color(0, 0, 255));
        lbl_InvStatLStock.setText("0");

        lbl_InvStatNExProd.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatNExProd.setForeground(new java.awt.Color(0, 0, 255));
        lbl_InvStatNExProd.setText("0");

        lbl_InvStatTotal1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatTotal1.setText("Total No. of Nearly Expire Products:");

        lbl_InvStatExProd.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatExProd.setForeground(new java.awt.Color(0, 0, 255));
        lbl_InvStatExProd.setText("0");

        lbl_InvStatTotal2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatTotal2.setText("Total No. of Expire Products:");

        txt_articleCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_articleCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_articleCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_articleCodeActionPerformed(evt);
            }
        });
        txt_articleCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_articleCodeKeyReleased(evt);
            }
        });

        lbl_DealerCode.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_DealerCode.setText("Article Code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_note2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_DealerCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_articleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_InvStatTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InvStatLStock, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_InvStatTotal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InvStatNExProd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_InvStatTotal2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InvStatExProd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 80, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DealerCode)
                    .addComponent(txt_articleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_InvStatTotal2)
                        .addComponent(lbl_InvStatExProd))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_InvStatTotal)
                        .addComponent(lbl_InvStatLStock)
                        .addComponent(lbl_InvStatTotal1)
                        .addComponent(lbl_InvStatNExProd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(lbl_note2))
        );
    }// </editor-fold>//GEN-END:initComponents
    public static void generateUpdate()
    {
        DatabaseLinker.updateTable(InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                + "category.category_name AS 'Category',REPLACE(product.product_size, 'NULL', '-') AS 'Size',"
                + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',DATEDIFF(expiration,CURDATE()) AS 'Remain. Days' "
                + "FROM product,supplier,product_color,category WHERE product.supplier = supplier.idsupplier and product.category = category.idcategory and product.product_color = product_color.idproduct_color and quantity BETWEEN -1 AND 15");
        setJTable();
    }
    private void tbl_InvStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_InvStatusMousePressed
        
    }//GEN-LAST:event_tbl_InvStatusMousePressed

    private void txt_articleCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_articleCodeActionPerformed
        setJTable();
    }//GEN-LAST:event_txt_articleCodeActionPerformed

    private void txt_articleCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_articleCodeKeyReleased
        if(!txt_articleCode.getText().equals("")) DatabaseLinker.updateTable(tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                + "category.category_name AS 'Category',REPLACE(product.product_size, '0', '-') AS 'Size',"
                + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',DATEDIFF(expiration,CURDATE()) AS 'Remain. Days' "
                + "FROM product,supplier,product_color,category WHERE product.supplier = supplier.idsupplier and product.category = category.idcategory and product.product_color = product_color.idproduct_color AND idproduct="+txt_articleCode.getText());
        else DatabaseLinker.updateTable(tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                + "category.category_name AS 'Category',REPLACE(product.product_size, '0', '-') AS 'Size',"
                + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',DATEDIFF(expiration,CURDATE()) AS 'Remain. Days' "
                + "FROM product,supplier,product_color,category WHERE product.supplier = supplier.idsupplier and product.category = category.idcategory and product.product_color = product_color.idproduct_color");
        setJTable();
    }//GEN-LAST:event_txt_articleCodeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane8;
    protected static javax.swing.JLabel lbl_DealerCode;
    protected static javax.swing.JLabel lbl_InvStatExProd;
    protected static javax.swing.JLabel lbl_InvStatLStock;
    protected static javax.swing.JLabel lbl_InvStatNExProd;
    protected static javax.swing.JLabel lbl_InvStatTotal;
    protected static javax.swing.JLabel lbl_InvStatTotal1;
    protected static javax.swing.JLabel lbl_InvStatTotal2;
    protected static javax.swing.JLabel lbl_note2;
    public static javax.swing.JTable tbl_InvStatus;
    protected static javax.swing.JTextField txt_articleCode;
    // End of variables declaration//GEN-END:variables
}
