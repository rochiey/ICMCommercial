package dialog_inventory;

import com.DbUtils;
import static dialog_inventory.Inventory_NewProduct.cbo_NewProdCategory;
import inventory.InventoryPnl_1stLayer;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class Inventory_NewProduct extends javax.swing.JDialog {
    private static Vector vecsupplier,veccolor,veccategory;
    private Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null; 
    
    public Inventory_NewProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        populateCBO();
        initComponents();
        if(!isCategoryExpirable(cbo_NewProdCategory)) Inventory_ButtonFunctions.disableNewRegDate(cbo_NewProdCategory);
        repaint();
    }
    private boolean isCategoryExpirable(javax.swing.JComboBox cboCategory)
    {
        boolean flag = false;
        createDB();
        try {
            rs = stmt.executeQuery("SELECT category_type FROM category WHERE category_name='"+cboCategory.getSelectedItem()+"'");
            while(rs.next())
            {
                if(rs.getInt("category_type") == 15) flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_NewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    public static void updateColorCBO()
    {
        getColor2ComboBox();
        cbo_NewProdColor.setModel(new DefaultComboBoxModel<>(veccolor));
    }
    public static void updateCategoryCBO()
    {
        getCategory2ComboBox();
        cbo_NewProdCategory.setModel(new DefaultComboBoxModel<>(veccategory));
    }
    public static void updateSupplierCBO()
    {
        getSupplier2ComboBox();
        cbo_NewProdCompany.setModel(new DefaultComboBoxModel<>(vecsupplier));
    }
    private static void populateCBO()
    {
        getCategory2ComboBox();
        getColor2ComboBox();
        getSupplier2ComboBox();
    }
    public static void updateCBO()
    {
        populateCBO();
        cbo_NewProdCategory.setModel(new DefaultComboBoxModel<>(veccategory));
        cbo_NewProdColor.setModel(new DefaultComboBoxModel<>(veccolor));
        cbo_NewProdCompany.setModel(new DefaultComboBoxModel<>(vecsupplier));
    }
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
    private static void dbHandlerUpdates(String query)
    {
        try{
        createDB();
         stmt.executeUpdate(query);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "Oops, something went wrong. Please try again. (error: sql syntax)");
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private static void getSupplier2ComboBox()
    {
        vecsupplier = new Vector();
        createDB();
        try {
            rs = stmt.executeQuery("SELECT supplier_name FROM supplier");
            while(rs.next())
            {
                vecsupplier.add(rs.getObject("supplier_name"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_NewProduct.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Oops. Something went wrong. (Error:populatingCbo section:newInventory)");
        }
    }
    private static void getColor2ComboBox()
    {
        veccolor = new Vector();
        createDB();
        try {
            rs = stmt.executeQuery("SELECT color_code FROM product_color");
            while(rs.next())
            {
                veccolor.add(rs.getObject("color_code"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_NewProduct.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Oops. Something went wrong. (Error:populatingCbo section:newInventory)");
        }
    }
    private static void getCategory2ComboBox()
    {
        veccategory = new Vector();
        createDB();
        try {
            rs = stmt.executeQuery("SELECT category_name FROM category");
            while(rs.next())
            {
                veccategory.add(rs.getObject("category_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_NewProduct.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Oops. Something went wrong. (Error:populatingCbo section:newInventory)");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_NewProdClose = new javax.swing.JButton();
        btn_NewProdAdd = new javax.swing.JButton();
        btn_NewProdClear = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_NewProdSize = new javax.swing.JTable();
        jLabel133 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        cbo_NewProdCompany = new javax.swing.JComboBox<>();
        txt_NewProdName = new javax.swing.JTextField();
        date_NewProdExpiration = new org.jdesktop.swingx.JXDatePicker();
        txt_NewProdQSupply = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        cbo_NewProdColor = new javax.swing.JComboBox<>();
        cbo_NewProdCategory = new javax.swing.JComboBox<>();
        btn_NewAddColor = new javax.swing.JButton();
        btn_NewAddCategory = new javax.swing.JButton();
        lbl_note2 = new javax.swing.JLabel();
        btn_NewAddCompany = new javax.swing.JButton();
        txt_NewProdPrice = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        txt_NewBarcode = new javax.swing.JTextField();

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
        background.setPreferredSize(new java.awt.Dimension(760, 344));
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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryNProduct.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_NewProdClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewProdClose.setText("Close");
        btn_NewProdClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewProdCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewProdCloseFocusLost(evt);
            }
        });
        btn_NewProdClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewProdCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewProdCloseMouseExited(evt);
            }
        });
        btn_NewProdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewProdCloseActionPerformed(evt);
            }
        });

        btn_NewProdAdd.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewProdAdd.setText("Add");
        btn_NewProdAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewProdAddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewProdAddFocusLost(evt);
            }
        });
        btn_NewProdAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewProdAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewProdAddMouseExited(evt);
            }
        });
        btn_NewProdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewProdAddActionPerformed(evt);
            }
        });

        btn_NewProdClear.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewProdClear.setText("Clear");
        btn_NewProdClear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewProdClearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewProdClearFocusLost(evt);
            }
        });
        btn_NewProdClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewProdClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewProdClearMouseExited(evt);
            }
        });
        btn_NewProdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewProdClearActionPerformed(evt);
            }
        });

        tbl_NewProdSize.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_NewProdSize.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", "", "", "", "", "", ""}
            },
            new String [] {
                "#1", "#2", "#3", "#4", "#5", "#6", "#7", "#8", "#9", "#10", "#11", "#12"
            }
        ));
        tbl_NewProdSize.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbl_NewProdSize.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_NewProdSize.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tbl_NewProdSize);
        tbl_NewProdSize.setBackground(Color.WHITE);
        tbl_NewProdSize.setShowGrid(true);
        tbl_NewProdSize.setRowHeight(26);
        tbl_NewProdSize.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 13));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tbl_NewProdSize.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(10).setCellRenderer(centerRenderer);
        tbl_NewProdSize.getColumnModel().getColumn(11).setCellRenderer(centerRenderer);
        ((DefaultTableCellRenderer)tbl_NewProdSize.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        jLabel133.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel133.setText("Size:");

        jLabel131.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel131.setText("Danger Level:");
        jLabel131.setText("<html>Qty Supply: <font color=red>*</font></html>");

        jLabel137.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel137.setText("Expiration Date:");
        jLabel137.setText("<html>Expiration Date: <font color=red>*</font></html>");

        jLabel127.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel127.setText("Article Name:");
        jLabel127.setText("<html>Article Name: <font color=red>*</font></html>");

        jLabel128.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel128.setText("Company:");
        jLabel128.setText("<html>Company: <font color=red>*</font></html>");

        cbo_NewProdCompany = new javax.swing.JComboBox<String>(vecsupplier);
        cbo_NewProdCompany.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_NewProdCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_NewProdCompanyActionPerformed(evt);
            }
        });

        txt_NewProdName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewProdName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        date_NewProdExpiration.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        txt_NewProdQSupply.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewProdQSupply.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NewProdQSupply.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel134.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel134.setText("Category:");
        jLabel134.setText("<html>Category: <font color=red>*</font></html>");

        jLabel138.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel138.setText("Color:");
        jLabel138.setText("<html>Color: <font color=red>*</font></html>");

        cbo_NewProdColor = new javax.swing.JComboBox<String>(veccolor);
        cbo_NewProdColor.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        cbo_NewProdCategory = new javax.swing.JComboBox<String>(veccategory);
        cbo_NewProdCategory.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_NewProdCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_NewProdCategoryActionPerformed(evt);
            }
        });

        btn_NewAddColor.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_NewAddColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Add.png"))); // NOI18N
        btn_NewAddColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NewAddColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewAddColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewAddColorFocusLost(evt);
            }
        });
        btn_NewAddColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewAddColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewAddColorMouseExited(evt);
            }
        });
        btn_NewAddColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewAddColorActionPerformed(evt);
            }
        });

        btn_NewAddCategory.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_NewAddCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Add.png"))); // NOI18N
        btn_NewAddCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NewAddCategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewAddCategoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewAddCategoryFocusLost(evt);
            }
        });
        btn_NewAddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewAddCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewAddCategoryMouseExited(evt);
            }
        });
        btn_NewAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewAddCategoryActionPerformed(evt);
            }
        });

        lbl_note2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_note2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_note2.setText("Note: Please fill out the information that has * and the rest are optional.");
        lbl_note2.setText("<html><b>Note:</b> Please fill out the information that has <font color=red size=4>*</font></html>");

        btn_NewAddCompany.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_NewAddCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Add.png"))); // NOI18N
        btn_NewAddCompany.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NewAddCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewAddCompanyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewAddCompanyFocusLost(evt);
            }
        });
        btn_NewAddCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewAddCompanyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewAddCompanyMouseExited(evt);
            }
        });
        btn_NewAddCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewAddCompanyActionPerformed(evt);
            }
        });

        txt_NewProdPrice.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewProdPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NewProdPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel139.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel139.setText("Retail Price:");
        jLabel139.setText("<html>Retail Price: <font color=red>*</font></html>");

        jLabel135.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel135.setText("Barcode:");
        jLabel135.setText("<html>Barcode: <font color=red>*</font></html>");

        txt_NewBarcode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewBarcode.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_NewProdAdd)
                            .addGap(0, 0, 0)
                            .addComponent(btn_NewProdClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btn_NewProdClose))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel133)
                                    .addComponent(jLabel131)
                                    .addComponent(jLabel137)
                                    .addComponent(jLabel127)
                                    .addComponent(jLabel128))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date_NewProdExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_NewProdQSupply, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_NewProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel139)
                                            .addComponent(jLabel138)
                                            .addComponent(jLabel134)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbo_NewProdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_NewAddCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel135)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_NewBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbo_NewProdCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbo_NewProdColor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(btn_NewAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_NewAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_NewProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(14, 14, 14))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_NewProdAdd, btn_NewProdClear, btn_NewProdClose});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel128)
                                .addComponent(cbo_NewProdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_NewAddCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel135)
                            .addComponent(txt_NewBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel127)
                            .addComponent(txt_NewProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel137)
                            .addComponent(date_NewProdExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel131)
                            .addComponent(txt_NewProdQSupply, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel133))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel134)
                                    .addComponent(cbo_NewProdCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel138)
                                    .addComponent(cbo_NewProdColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_NewAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NewProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel139)))
                    .addComponent(btn_NewAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_note2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NewProdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewProdClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewProdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_NewProdAdd, btn_NewProdClear, btn_NewProdClose});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_NewAddCategory, btn_NewAddColor, btn_NewAddCompany, cbo_NewProdCategory, cbo_NewProdColor, cbo_NewProdCompany, date_NewProdExpiration, txt_NewProdName, txt_NewProdQSupply});

        date_NewProdExpiration.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_NewProdExpiration.setDate(newDealerRegDate);
        btn_NewAddColor.registerKeyboardAction(btn_NewAddColor.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_NewAddColor.registerKeyboardAction(btn_NewAddColor.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_NewAddCategory.registerKeyboardAction(btn_NewAddCategory.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_NewAddCategory.registerKeyboardAction(btn_NewAddCategory.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_NewAddCompany.registerKeyboardAction(btn_NewAddCompany.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_NewAddCompany.registerKeyboardAction(btn_NewAddCompany.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_NewProdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewProdClearActionPerformed
        button.clearNewProduct();
    }//GEN-LAST:event_btn_NewProdClearActionPerformed

    private void btn_NewProdClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewProdClearMouseExited
        btn_NewProdClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewProdClearMouseExited

    private void btn_NewProdClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewProdClearMouseEntered
        btn_NewProdClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewProdClearMouseEntered

    private void btn_NewProdClearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewProdClearFocusLost
        btn_NewProdClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewProdClearFocusLost

    private void btn_NewProdClearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewProdClearFocusGained
        btn_NewProdClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewProdClearFocusGained

    private void btn_NewProdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewProdAddActionPerformed
        button.addNewProduct();
        if(Inventory_ButtonFunctions.successEx > 0 )this.dispose();
        InventoryPnl_1stLayer.updateTable();
    }//GEN-LAST:event_btn_NewProdAddActionPerformed

    private void btn_NewProdAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewProdAddMouseExited
        btn_NewProdAdd.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewProdAddMouseExited

    private void btn_NewProdAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewProdAddMouseEntered
        btn_NewProdAdd.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewProdAddMouseEntered

    private void btn_NewProdAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewProdAddFocusLost
        btn_NewProdAdd.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewProdAddFocusLost

    private void btn_NewProdAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewProdAddFocusGained
        btn_NewProdAdd.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewProdAddFocusGained

    private void btn_NewProdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewProdCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_NewProdCloseActionPerformed

    private void btn_NewProdCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewProdCloseMouseExited
        btn_NewProdClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewProdCloseMouseExited

    private void btn_NewProdCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewProdCloseMouseEntered
        btn_NewProdClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewProdCloseMouseEntered

    private void btn_NewProdCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewProdCloseFocusLost
        btn_NewProdClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewProdCloseFocusLost

    private void btn_NewProdCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewProdCloseFocusGained
        btn_NewProdClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewProdCloseFocusGained

    private void btn_NewAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewAddCategoryActionPerformed
        Inventory_Category inventory = new Inventory_Category(null, rootPaneCheckingEnabled);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        Inventory_Category.dialogclassification =1;
        inventory.setVisible(true);
    }//GEN-LAST:event_btn_NewAddCategoryActionPerformed

    private void btn_NewAddCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewAddCategoryMouseExited
        btn_NewAddCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewAddCategoryMouseExited

    private void btn_NewAddCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewAddCategoryMouseEntered
        btn_NewAddCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewAddCategoryMouseEntered

    private void btn_NewAddCategoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewAddCategoryFocusLost
        btn_NewAddCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewAddCategoryFocusLost

    private void btn_NewAddCategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewAddCategoryFocusGained
        btn_NewAddCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewAddCategoryFocusGained

    private void btn_NewAddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewAddColorActionPerformed
        Inventory_Color inventory = new Inventory_Color(null, rootPaneCheckingEnabled);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        Inventory_Color.dialogclassification=1;
        inventory.setVisible(true);
    }//GEN-LAST:event_btn_NewAddColorActionPerformed

    private void btn_NewAddColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewAddColorMouseExited
        btn_NewAddColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewAddColorMouseExited

    private void btn_NewAddColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewAddColorMouseEntered
        btn_NewAddColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewAddColorMouseEntered

    private void btn_NewAddColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewAddColorFocusLost
        btn_NewAddColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewAddColorFocusLost

    private void btn_NewAddColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewAddColorFocusGained
        btn_NewAddColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewAddColorFocusGained

    private void btn_NewAddCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewAddCompanyActionPerformed
        Inventory_Company inventory = new Inventory_Company(null, rootPaneCheckingEnabled);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        Inventory_Company.dialogclassification = 1;
        inventory.setVisible(true);
    }//GEN-LAST:event_btn_NewAddCompanyActionPerformed

    private void btn_NewAddCompanyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewAddCompanyMouseExited
        btn_NewAddCompany.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewAddCompanyMouseExited

    private void btn_NewAddCompanyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewAddCompanyMouseEntered
        btn_NewAddCompany.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewAddCompanyMouseEntered

    private void btn_NewAddCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewAddCompanyFocusLost
        btn_NewAddCompany.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewAddCompanyFocusLost

    private void btn_NewAddCompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewAddCompanyFocusGained
        btn_NewAddCompany.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewAddCompanyFocusGained

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        background.setBackground(new Color(235, 235, 235));
        text.setVisible(false);
        logo.setVisible(false);
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        background.setBackground(new Color(65, 105, 225));
        text.setVisible(true);
        logo.setVisible(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void cbo_NewProdCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_NewProdCategoryActionPerformed
        dialog_inventory.Inventory_ButtonFunctions.disableNewRegDate(cbo_NewProdCategory);
    }//GEN-LAST:event_cbo_NewProdCategoryActionPerformed

    private void cbo_NewProdCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_NewProdCompanyActionPerformed
        
    }//GEN-LAST:event_cbo_NewProdCompanyActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory_NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_NewProduct dialog = new Inventory_NewProduct(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_NewAddCategory;
    protected static javax.swing.JButton btn_NewAddColor;
    protected static javax.swing.JButton btn_NewAddCompany;
    protected static javax.swing.JButton btn_NewProdAdd;
    protected static javax.swing.JButton btn_NewProdClear;
    protected static javax.swing.JButton btn_NewProdClose;
    protected static javax.swing.JComboBox<String> cbo_NewProdCategory;
    protected static javax.swing.JComboBox<String> cbo_NewProdColor;
    protected static javax.swing.JComboBox<String> cbo_NewProdCompany;
    protected static org.jdesktop.swingx.JXDatePicker date_NewProdExpiration;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel127;
    protected static javax.swing.JLabel jLabel128;
    protected static javax.swing.JLabel jLabel131;
    protected static javax.swing.JLabel jLabel133;
    protected static javax.swing.JLabel jLabel134;
    protected static javax.swing.JLabel jLabel135;
    protected static javax.swing.JLabel jLabel137;
    protected static javax.swing.JLabel jLabel138;
    protected static javax.swing.JLabel jLabel139;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbl_note2;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_NewProdSize;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_NewBarcode;
    protected static javax.swing.JTextField txt_NewProdName;
    protected static javax.swing.JTextField txt_NewProdPrice;
    protected static javax.swing.JTextField txt_NewProdQSupply;
    // End of variables declaration//GEN-END:variables
}
