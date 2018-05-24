package dialog_salesOrder;

import com.DatabaseLinker;
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
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.xswingx.PromptSupport;
import salesOrder.SalesPnl_1stLayer;

public class SalesOrder_ViewInventory extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions dialogSalesButton = new SalesOrder_ButtonFunctions();
    salesOrder.SalesOrder_ButtonFunctions salesOrderButton = new salesOrder.SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    DatabaseLinker productDisplay;
    static String query = "SELECT idproduct AS 'Code', product_name AS 'Product Name',product_color.color_code AS 'Color', REPLACE(product_size, 'NULL', '-') as 'Size', quantity AS 'Quantity', selling_price AS 'Price' FROM product,product_color WHERE product.product_color=product_color.idproduct_color";
    public static int toViewInventory = 0;
    public SalesOrder_ViewInventory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        generateCompany();
        initComponents();
        if(SalesOrder_ButtonFunctions.inventoryView==2)
        {
            DatabaseLinker.updateTable(tbl_InventoryList,"SELECT idproduct AS 'Code', product_name AS 'Product Name',product_color.color_code AS 'Color', product_size as 'Size', product.quantity AS 'Quantity', selling_price AS 'Price' FROM product,product_color WHERE product.product_color=product_color.idproduct_color AND product.supplier=(SELECT idsupplier FROM supplier WHERE supplier_name='"+supplierName+"')");
            lbl_NewDiscount.setVisible(false);
            cbo_ProductCompany.setVisible(false);
        }
        if(SalesOrder_ButtonFunctions.inventoryView==3)
        {
            DatabaseLinker.updateTable(tbl_InventoryList,"SELECT idproduct AS 'Code', product_name AS 'Product Name',product_color.color_code AS 'Color', product_size as 'Size', product.quantity AS 'Quantity', selling_price AS 'Price' FROM product,product_color WHERE product.product_color=product_color.idproduct_color AND product.supplier=(SELECT idsupplier FROM supplier WHERE supplier_name='"+supplierName+"')");
            lbl_NewDiscount.setVisible(false);
            cbo_ProductCompany.setVisible(false);
        }
        else if(SalesOrder_ButtonFunctions.inventoryView==0) DatabaseLinker.updateTable(tbl_InventoryList, query);  
        setJTable();
    }
    public static String supplierName = "";
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
        createDB();
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
                Logger.getLogger(SalesOrder_ViewInventory.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>error: session: sql commands"
                   + "</font></center></html>", "Error Message", 0);
            }
        }
    }

    public static void setJTable(){
        setJTableColumnsWidth(tbl_InventoryList, 720, 5, 19, 7, 7, 6, 9);
        JTableFixer.setViewInventoryTableField(tbl_InventoryList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_InventoryList = new javax.swing.JTable();
        lbl_NewDiscount = new javax.swing.JLabel();
        btn_CloseInventory = new javax.swing.JButton();
        cbo_ProductCompany = new javax.swing.JComboBox<>();
        lbl_NewDiscount1 = new javax.swing.JLabel();
        txt_ProductName = new javax.swing.JTextField();
        btn_AddCart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dealer's Credit Amount");
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        background.setBackground(new java.awt.Color(65, 105, 225));
        background.setMinimumSize(new java.awt.Dimension(613, 390));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frameGrabber.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameGrabberMouseDragged(evt);
            }
        });
        frameGrabber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameGrabberMousePressed(evt);
            }
        });
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 765, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesVInventory.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_InventoryList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_InventoryList.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Color", "Size", "Qty", "%", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_InventoryList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_InventoryList.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_InventoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_InventoryListMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_InventoryList);
        tbl_InventoryList.setBackground(Color.WHITE);
        tbl_InventoryList.setRowHeight(27);
        tbl_InventoryList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_InventoryList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_InventoryList.setShowGrid(true);

        lbl_NewDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDiscount.setText("Company/Supplier:");

        btn_CloseInventory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CloseInventory.setText("Close");
        btn_CloseInventory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CloseInventoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CloseInventoryFocusLost(evt);
            }
        });
        btn_CloseInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseInventoryMouseExited(evt);
            }
        });
        btn_CloseInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseInventoryActionPerformed(evt);
            }
        });

        cbo_ProductCompany = new javax.swing.JComboBox<String>(vecsupplier);
        cbo_ProductCompany.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_ProductCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ProductCompanyActionPerformed(evt);
            }
        });

        lbl_NewDiscount1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDiscount1.setText("Product Name:");

        txt_ProductName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ProductName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PromptSupport.setPrompt("Search Product", txt_ProductName);
        txt_ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ProductNameActionPerformed(evt);
            }
        });
        txt_ProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ProductNameKeyReleased(evt);
            }
        });

        btn_AddCart.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_AddCart.setText("Add to cart");
        btn_AddCart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_AddCartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_AddCartFocusLost(evt);
            }
        });
        btn_AddCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddCartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddCartMouseExited(evt);
            }
        });
        btn_AddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_NewDiscount1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_NewDiscount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_ProductCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(504, 504, 504)
                                .addComponent(btn_AddCart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_CloseInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_AddCart, btn_CloseInventory});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NewDiscount)
                    .addComponent(cbo_ProductCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NewDiscount1)
                    .addComponent(txt_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CloseInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frameGrabberMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameGrabberMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameGrabberMouseDragged

    private void frameGrabberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameGrabberMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameGrabberMousePressed

    private void btn_CloseInventoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseInventoryFocusGained
        btn_CloseInventory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseInventoryFocusGained

    private void btn_CloseInventoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseInventoryFocusLost
        btn_CloseInventory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseInventoryFocusLost

    private void btn_CloseInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseInventoryMouseEntered
        btn_CloseInventory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseInventoryMouseEntered

    private void btn_CloseInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseInventoryMouseExited
        btn_CloseInventory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseInventoryMouseExited

    private void btn_CloseInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseInventoryActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CloseInventoryActionPerformed
    
    static Vector vecsupplier = new Vector();
    public static void updateGenerateCompany()
    {
        generateCompany();
        cbo_ProductCompany.setModel(new DefaultComboBoxModel<>(vecsupplier));
    }
    private static void generateCompany()
    {
        createDB();
        vecsupplier.add("ALL");
        try {
            rs = stmt.executeQuery("SELECT supplier_name FROM supplier");
            while(rs.next())
            {
                vecsupplier.add(rs.getObject("supplier_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ViewInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void cbo_ProductCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ProductCompanyActionPerformed
        if(!cbo_ProductCompany.getSelectedItem().equals("ALL")) {
            DatabaseLinker.updateTable(tbl_InventoryList,"SELECT idproduct AS 'Code', product_name AS 'Product Name',product_color.color_code AS 'Color', product_size as 'Size', quantity AS 'Quantity', selling_price AS 'Price' FROM product,product_color,supplier WHERE product.product_color=product_color.idproduct_color AND supplier=(SELECT idsupplier WHERE supplier_name='"+cbo_ProductCompany.getSelectedItem().toString()+"')");
            setJTable();
        }   
        else {
            DatabaseLinker.updateTable(tbl_InventoryList, query);
            setJTable();
        }
    }//GEN-LAST:event_cbo_ProductCompanyActionPerformed

    private void btn_AddCartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_AddCartFocusGained
        btn_AddCart.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_AddCartFocusGained

    private void btn_AddCartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_AddCartFocusLost
        btn_AddCart.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_AddCartFocusLost

    private void btn_AddCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddCartMouseEntered
        btn_AddCart.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_AddCartMouseEntered

    private void btn_AddCartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddCartMouseExited
        btn_AddCart.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_AddCartMouseExited

    private void btn_AddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddCartActionPerformed
        
        if(SalesOrder_ButtonFunctions.inventoryView==0){ //sales order
            String barcode="";
            createDB();
            try {
                //fetch barcode thru product id
                rs = stmt.executeQuery("SELECT barcode FROM product WHERE idproduct="+idprod);
                while(rs.next())
                {
                    barcode = rs.getObject("barcode").toString();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SalesOrder_ViewInventory.class.getName()).log(Level.SEVERE, null, ex);
            }
            salesOrderButton.salesBarcode = barcode;
            salesOrderButton.addSalesCart();
//            this.dispose();
        }
        else if(SalesOrder_ButtonFunctions.inventoryView==3)
        {
            boolean found = false;
            dialog_inventory.Inventory_ProductMovement.txt_ArticleName.setText(idprod+"");
            for(int i=0;i<dialog_inventory.Inventory_ProductMovement.tbl_PMovementList.getRowCount();i++)
            {
                if(dialog_inventory.Inventory_ProductMovement.tbl_PMovementList.getValueAt(i, 0).equals(idprod)) found = true;
            }
            if(!found)
            {
                createDB();
                Vector inRow = new Vector();
                try {
                    rs=stmt.executeQuery("SELECT barcode,product_name,product_color.color_code,product_size,quantity,quantity_dangerLevel FROM product,product_color WHERE product_color=product_color.idproduct_color AND product.idproduct="+idprod);
                    while(rs.next())
                    {
                        inRow.add(dialog_inventory.Inventory_ProductMovement.tbl_PMovementList.getRowCount()+1);
                        inRow.add(rs.getObject("barcode"));
                        inRow.add(rs.getObject("product_name"));
                        inRow.add(rs.getObject("color_code"));
                        inRow.add(rs.getObject("product_size"));
                        inRow.add(rs.getObject("quantity"));
                        inRow.add(rs.getObject("quantity_dangerLevel"));
                        dialog_inventory.Inventory_ProductMovement.txt_ArticleName.setText(tbl_InventoryList.getValueAt(tbl_InventoryList.getSelectedRow(), 0).toString());
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SalesOrder_ViewInventory.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog_inventory.Inventory_ProductMovement.tblModel.addRow(inRow);
            }
            this.dispose();
        }
    }//GEN-LAST:event_btn_AddCartActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        background.setBackground(new Color(65, 105, 225));
        text.setVisible(true);
        logo.setVisible(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        background.setBackground(new Color(235, 235, 235));
        text.setVisible(false);
        logo.setVisible(false);

    }//GEN-LAST:event_formWindowLostFocus
    public static int idprod;
    public void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            idprod = Integer.parseInt(tbl_data.getModel().getValueAt(row, 0).toString());
           //dialogSalesButton.dialogSalesBarcode = clickedBarcode_onTable; //pass the clicked barcode inside view inventory(sales order 0)
        }
    }
    private void txt_ProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ProductNameKeyReleased
        if(dialog_salesOrder.SalesOrder_ButtonFunctions.inventoryView==2){
            DatabaseLinker.updateTable(tbl_InventoryList, "SELECT idproduct AS 'Code', product_name AS 'Product Name',product_color.color_code AS 'Color', product_size as 'Size', quantity AS 'Quantity', selling_price AS 'Price' FROM product,product_color WHERE product.product_color=product_color.idproduct_color AND supplier=(SELECT idsupplier FROM supplier WHERE supplier_name='"+supplierName+"') AND product_name LIKE '%"+txt_ProductName.getText()+"%'");
            setJTable();
        }
                
        else{
            DatabaseLinker.updateTable(tbl_InventoryList, query+" AND product_name LIKE '%"+txt_ProductName.getText()+"%'");
            setJTable();
        }
    }//GEN-LAST:event_txt_ProductNameKeyReleased

    private void tbl_InventoryListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_InventoryListMousePressed
        tableclicked(evt, tbl_InventoryList);
    }//GEN-LAST:event_tbl_InventoryListMousePressed

    private void txt_ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ProductNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ViewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ViewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ViewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ViewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_ViewInventory dialog = new SalesOrder_ViewInventory(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    protected static javax.swing.JButton btn_AddCart;
    protected static javax.swing.JButton btn_CloseInventory;
    protected static javax.swing.JComboBox<String> cbo_ProductCompany;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_NewDiscount;
    protected static javax.swing.JLabel lbl_NewDiscount1;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_InventoryList;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_ProductName;
    // End of variables declaration//GEN-END:variables
}
