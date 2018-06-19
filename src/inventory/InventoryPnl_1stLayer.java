package inventory;

import com.DatabaseLinker;
import com.DbUtils;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.xswingx.PromptSupport;

public class InventoryPnl_1stLayer extends javax.swing.JPanel {
    
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    DatabaseLinker product;
    private Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    static String sqlquery = "SELECT product.idproduct AS 'Code',supplier.supplier_name AS 'Company Name',"
            + "product.product_name AS 'Article Name',category.category_name AS 'Category',"
            + "product.product_size AS 'Size',product_color.color_code AS 'Color',product.quantity AS 'Quantity',"
            + "product.selling_price AS 'Retail Price',"
            + "IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date' FROM product,supplier,product_color,category "
            + "WHERE product.supplier = supplier.idsupplier and product.category = category.idcategory and "
            + "product.product_color = product_color.idproduct_color";
    
    public InventoryPnl_1stLayer() {
        generateCompany();
        initComponents();
        product = new DatabaseLinker(tbl_InventoryList,sqlquery);
        setJTable();

    }
    public static void setJTable()
    {
        setJTableColumnsWidth(tbl_InventoryList, 1315, 5, 13, 17, 12, 6, 6, 6, 8, 8);
        JTableFixer.setInventoryTableField(tbl_InventoryList);
    }
    public static void updateTable()
    {
        DatabaseLinker.updateTable(tbl_InventoryList,sqlquery);
        setJTable();
    }
    
    public static void createDB()
    {
        rs = null;
        stmt = null;
        conn = null;
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
        DB.createDB();
         successEx = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:code:sql command()"
                   + "</font></center></html>", "Error Message", 0);
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbUtils.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>error: session: sql commands"
                   + "</font></center></html>", "Error Message", 0);
            }
        }
    }
    static Vector vecsupplier = new Vector();
    public static void updateGenerateCompany()
    {
        generateCompany();
        cbo_InventoryCompany.setModel(new DefaultComboBoxModel<>(vecsupplier));
    }
    private static void generateCompany()
    {
        DB.createDB();
        vecsupplier.add("ALL");
        try {
            rs = stmt.executeQuery("SELECT supplier_name FROM supplier");
            while(rs.next())
            {
                vecsupplier.add(rs.getObject("supplier_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryPnl_1stLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_InventoryCompany = new javax.swing.JLabel();
        cbo_InventoryCompany = new javax.swing.JComboBox<String>(vecsupplier);
        lbl_InventoryCode = new javax.swing.JLabel();
        txt_InventoryCode = new javax.swing.JTextField();
        btn_InventorySearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_InventoryList = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lbl_InventoryCompany.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_InventoryCompany.setText("Company/Supplier:");

        cbo_InventoryCompany.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_InventoryCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_InventoryCompanyActionPerformed(evt);
            }
        });

        lbl_InventoryCode.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_InventoryCode.setText("Article Code/Name:");

        txt_InventoryCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        PromptSupport.setPrompt("Search Article", txt_InventoryCode);
        txt_InventoryCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_InventoryCodeKeyReleased(evt);
            }
        });

        btn_InventorySearch.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_InventorySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/All Search.png"))); // NOI18N
        btn_InventorySearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventorySearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventorySearchFocusLost(evt);
            }
        });
        btn_InventorySearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventorySearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventorySearchMouseExited(evt);
            }
        });
        btn_InventorySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventorySearchActionPerformed(evt);
            }
        });

        tbl_InventoryList = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_InventoryList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_InventoryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_InventoryList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_InventoryList.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_InventoryList.getTableHeader().setReorderingAllowed(false);
        tbl_InventoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_InventoryListMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_InventoryList);
        if (tbl_InventoryList.getColumnModel().getColumnCount() > 0) {
            tbl_InventoryList.getColumnModel().getColumn(0).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(1).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(2).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(3).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(4).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(5).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(6).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(7).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(8).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(9).setResizable(false);
            tbl_InventoryList.getColumnModel().getColumn(10).setResizable(false);
        }
        tbl_InventoryList.setBackground(Color.WHITE);
        tbl_InventoryList.setRowHeight(27);
        tbl_InventoryList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_InventoryList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_InventoryList.setShowGrid(true);

        tbl_InventoryList.getTableHeader().setResizingAllowed(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_InventoryCompany)
                            .addComponent(lbl_InventoryCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_InventoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_InventorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbo_InventoryCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_InventoryCompany)
                    .addComponent(cbo_InventoryCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_InventorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_InventoryCode)
                        .addComponent(txt_InventoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_InventorySearch, txt_InventoryCode});

        btn_InventorySearch.registerKeyboardAction(btn_InventorySearch.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_InventorySearch.registerKeyboardAction(btn_InventorySearch.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InventorySearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventorySearchFocusGained
        btn_InventorySearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventorySearchFocusGained

    private void btn_InventorySearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventorySearchFocusLost
        btn_InventorySearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventorySearchFocusLost

    private void btn_InventorySearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventorySearchMouseEntered
        btn_InventorySearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventorySearchMouseEntered

    private void btn_InventorySearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventorySearchMouseExited
        btn_InventorySearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventorySearchMouseExited

    private void btn_InventorySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventorySearchActionPerformed
        button.searchInventory();
        
    }//GEN-LAST:event_btn_InventorySearchActionPerformed

    private void tbl_InventoryListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_InventoryListMousePressed
        dialog_inventory.Inventory_ButtonFunctions.tableclicked(evt, tbl_InventoryList);
    }//GEN-LAST:event_tbl_InventoryListMousePressed

    private void txt_InventoryCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_InventoryCodeKeyReleased
        try{
            int id = Integer.parseInt(txt_InventoryCode.getText());
            DatabaseLinker.updateTable(tbl_InventoryList,sqlquery+"  AND idproduct LIKE '%"+txt_InventoryCode.getText()+"%'");
            setJTable();
        }catch(NumberFormatException e)
        {
            DatabaseLinker.updateTable(tbl_InventoryList,sqlquery+"  AND product_name LIKE '%"+txt_InventoryCode.getText()+"%'");
            setJTable();
        }
    }//GEN-LAST:event_txt_InventoryCodeKeyReleased

    private void cbo_InventoryCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_InventoryCompanyActionPerformed
        if(!cbo_InventoryCompany.getSelectedItem().equals("ALL")){
            DatabaseLinker.updateTable(tbl_InventoryList, sqlquery+" AND supplier_name ='"+cbo_InventoryCompany.getSelectedItem().toString()+"'");
            setJTable();
        }
        else updateTable();
    }//GEN-LAST:event_cbo_InventoryCompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_InventorySearch;
    protected static javax.swing.JComboBox<String> cbo_InventoryCompany;
    private javax.swing.JScrollPane jScrollPane2;
    protected static javax.swing.JLabel lbl_InventoryCode;
    protected static javax.swing.JLabel lbl_InventoryCompany;
    protected static javax.swing.JTable tbl_InventoryList;
    protected static javax.swing.JTextField txt_InventoryCode;
    // End of variables declaration//GEN-END:variables
}
