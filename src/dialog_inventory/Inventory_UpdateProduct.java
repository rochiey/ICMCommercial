package dialog_inventory;

import static dialog_inventory.Inventory_UpdateProduct.cbo_UpdateProdCategory;
import inventory.InventoryPnl_1stLayer;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import com.DB;

public class Inventory_UpdateProduct extends javax.swing.JDialog {

    private Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    private static Vector vecsupplier,veccolor,veccategory;
    public Inventory_UpdateProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        populateCBO();
        initComponents();
        
      
    }
    private static void populateCBO()
    {
        getCategory2ComboBox();
        getColor2ComboBox();
        getSupplier2ComboBox();
    }
    public static void updateColorCBO()
    {
        getColor2ComboBox();
        cbo_UpdateProdColor.setModel(new DefaultComboBoxModel<>(veccolor));
    }
    public static void updateCategoryCBO()
    {
        getCategory2ComboBox();
        cbo_UpdateProdCategory.setModel(new DefaultComboBoxModel<>(veccategory));
    }
    public static void updateSupplierCBO()
    {
        getSupplier2ComboBox();
        cbo_UpdateProdCompany.setModel(new DefaultComboBoxModel<>(vecsupplier));
    }
    public static void updateCBO()
    {
        populateCBO();
        cbo_UpdateProdCategory.setModel(new DefaultComboBoxModel<>(veccategory));
        cbo_UpdateProdColor.setModel(new DefaultComboBoxModel<>(veccolor));
        cbo_UpdateProdCompany.setModel(new DefaultComboBoxModel<>(vecsupplier));
    }
    private static void getSupplier2ComboBox()
    {
        vecsupplier = new Vector();
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT supplier_name FROM supplier");
            while(DB.rs.next())
            {
                vecsupplier.add(DB.rs.getObject("supplier_name"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_NewProduct.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Oops. Something went wrong. (Error:populatingCbo section:newInventory)");
        }
    }
    private static void getColor2ComboBox()
    {
        veccolor = new Vector();
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT color_code FROM product_color");
            while(DB.rs.next())
            {
                veccolor.add(DB.rs.getObject("color_code"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_NewProduct.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Oops. Something went wrong. (Error:populatingCbo section:newInventory)");
        }
    }
    private static void getCategory2ComboBox()
    {
        veccategory = new Vector();
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT category_name FROM category");
            while(DB.rs.next())
            {
                veccategory.add(DB.rs.getObject("category_name"));
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
        btn_UpdateProd = new javax.swing.JButton();
        btn_UpdateProdClear = new javax.swing.JButton();
        btn_UpdateProdClose = new javax.swing.JButton();
        lbl_note2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbo_UpdateProdCategory = new javax.swing.JComboBox<>();
        jLabel141 = new javax.swing.JLabel();
        btn_UpdateAddCategory = new javax.swing.JButton();
        txt_UpdateProdSize = new javax.swing.JTextField();
        btn_UpdateAddCompany = new javax.swing.JButton();
        jLabel139 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        cbo_UpdateProdColor = new javax.swing.JComboBox<>();
        txt_UpdateProdPrice = new javax.swing.JTextField();
        btn_UpdateAddColor = new javax.swing.JButton();
        date_UpdateProdExpiration = new org.jdesktop.swingx.JXDatePicker();
        jLabel135 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        cbo_UpdateProdCompany = new javax.swing.JComboBox<>();
        txt_UpdateProdName = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryUProduct.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_UpdateProd.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_UpdateProd.setText("Update");
        btn_UpdateProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateProdFocusLost(evt);
            }
        });
        btn_UpdateProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateProdMouseExited(evt);
            }
        });
        btn_UpdateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateProdActionPerformed(evt);
            }
        });

        btn_UpdateProdClear.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_UpdateProdClear.setText("Clear");
        btn_UpdateProdClear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateProdClearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateProdClearFocusLost(evt);
            }
        });
        btn_UpdateProdClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateProdClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateProdClearMouseExited(evt);
            }
        });
        btn_UpdateProdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateProdClearActionPerformed(evt);
            }
        });

        btn_UpdateProdClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_UpdateProdClose.setText("Close");
        btn_UpdateProdClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateProdCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateProdCloseFocusLost(evt);
            }
        });
        btn_UpdateProdClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateProdCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateProdCloseMouseExited(evt);
            }
        });
        btn_UpdateProdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateProdCloseActionPerformed(evt);
            }
        });

        lbl_note2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_note2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_note2.setText("Note: Please fill out the information that has * and the rest are optional.");
        lbl_note2.setText("<html><b>Note:</b> Please fill out the information that has <font color=red size=4>*</font></html>");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbo_UpdateProdCategory = new javax.swing.JComboBox<String>(veccategory);
        cbo_UpdateProdCategory.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_UpdateProdCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_UpdateProdCategoryActionPerformed(evt);
            }
        });

        jLabel141.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel141.setText("Color:");
        jLabel141.setText("<html>Color: <font color=red>*</font></html>");

        btn_UpdateAddCategory.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_UpdateAddCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Add.png"))); // NOI18N
        btn_UpdateAddCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_UpdateAddCategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateAddCategoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateAddCategoryFocusLost(evt);
            }
        });
        btn_UpdateAddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateAddCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateAddCategoryMouseExited(evt);
            }
        });
        btn_UpdateAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateAddCategoryActionPerformed(evt);
            }
        });

        txt_UpdateProdSize.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateProdSize.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_UpdateProdSize.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn_UpdateAddCompany.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_UpdateAddCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Add.png"))); // NOI18N
        btn_UpdateAddCompany.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_UpdateAddCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateAddCompanyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateAddCompanyFocusLost(evt);
            }
        });
        btn_UpdateAddCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateAddCompanyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateAddCompanyMouseExited(evt);
            }
        });
        btn_UpdateAddCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateAddCompanyActionPerformed(evt);
            }
        });

        jLabel139.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel139.setText("Expiration Date:");
        jLabel139.setText("<html>Expiration Date: <font color=red>*</font></html>");

        jLabel143.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel143.setText("Size:");

        cbo_UpdateProdColor = new javax.swing.JComboBox<String>(veccolor);
        cbo_UpdateProdColor.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        txt_UpdateProdPrice.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateProdPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_UpdateProdPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn_UpdateAddColor.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_UpdateAddColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Add.png"))); // NOI18N
        btn_UpdateAddColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_UpdateAddColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateAddColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateAddColorFocusLost(evt);
            }
        });
        btn_UpdateAddColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateAddColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateAddColorMouseExited(evt);
            }
        });
        btn_UpdateAddColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateAddColorActionPerformed(evt);
            }
        });

        date_UpdateProdExpiration.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        date_UpdateProdExpiration.setFormats("yyyy-MM-dd");

        jLabel135.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel135.setText("SRP Price:");
        jLabel135.setText("<html>Retail Price: <font color=red>*</font></html>");

        jLabel130.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel130.setText("Article Name:");
        jLabel130.setText("<html>Article Name: <font color=red>*</font></html>");

        jLabel132.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel132.setText("Company:");
        jLabel132.setText("<html>Company: <font color=red>*</font></html>");

        cbo_UpdateProdCompany = new javax.swing.JComboBox<String>(vecsupplier);
        cbo_UpdateProdCompany.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        txt_UpdateProdName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateProdName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel140.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel140.setText("Category:");
        jLabel140.setText("<html>Category: <font color=red>*</font></html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel139)
                    .addComponent(jLabel130)
                    .addComponent(jLabel132))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_UpdateProdExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_UpdateProdName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(cbo_UpdateProdCompany, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(btn_UpdateAddCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel135)
                    .addComponent(jLabel143)
                    .addComponent(jLabel141)
                    .addComponent(jLabel140))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbo_UpdateProdCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_UpdateAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbo_UpdateProdColor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_UpdateAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_UpdateProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_UpdateProdSize, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbo_UpdateProdCompany, txt_UpdateProdName});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel132)
                        .addComponent(cbo_UpdateProdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel140))
                    .addComponent(cbo_UpdateProdCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UpdateAddCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UpdateAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel130)
                            .addComponent(txt_UpdateProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel141))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel139)
                            .addComponent(date_UpdateProdExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel143)
                            .addComponent(txt_UpdateProdSize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel135)
                            .addComponent(txt_UpdateProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbo_UpdateProdColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UpdateAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbo_UpdateProdCategory, cbo_UpdateProdColor, cbo_UpdateProdCompany});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_UpdateProdName, txt_UpdateProdPrice, txt_UpdateProdSize});

        btn_UpdateAddCategory.registerKeyboardAction(btn_UpdateAddCategory.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_UpdateAddCategory.registerKeyboardAction(btn_UpdateAddCategory.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UpdateAddCompany.registerKeyboardAction(btn_UpdateAddCompany.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateAddCompany.registerKeyboardAction(btn_UpdateAddCompany.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UpdateAddColor.registerKeyboardAction(btn_UpdateAddColor.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateAddColor.registerKeyboardAction(btn_UpdateAddColor.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lbl_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_UpdateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btn_UpdateProdClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btn_UpdateProdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_UpdateProdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_UpdateProdClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_UpdateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(lbl_note2)))
            .addGap(6, 6, 6))
    );

    btn_UpdateProd.registerKeyboardAction(btn_UpdateProd.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateProd.registerKeyboardAction(btn_UpdateProd.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UpdateProdClear.registerKeyboardAction(btn_UpdateProdClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateProdClear.registerKeyboardAction(btn_UpdateProdClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UpdateProdClose.registerKeyboardAction(btn_UpdateProdClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateProdClose.registerKeyboardAction(btn_UpdateProdClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_UpdateProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateProdFocusGained
        btn_UpdateProd.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateProdFocusGained

    private void btn_UpdateProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateProdFocusLost
        btn_UpdateProd.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateProdFocusLost

    private void btn_UpdateProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateProdMouseEntered
        btn_UpdateProd.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateProdMouseEntered

    private void btn_UpdateProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateProdMouseExited
        btn_UpdateProd.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateProdMouseExited

    private void btn_UpdateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateProdActionPerformed
        button.updateNewProduct();
        if(Inventory_ButtonFunctions.successEx > 0 ){
            inventory.InventoryPnl_1stLayer.tbl_InventoryList.clearSelection();
            this.dispose();
        }
        InventoryPnl_1stLayer.updateTable();
    }//GEN-LAST:event_btn_UpdateProdActionPerformed

    private void btn_UpdateProdClearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateProdClearFocusGained
        btn_UpdateProdClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateProdClearFocusGained

    private void btn_UpdateProdClearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateProdClearFocusLost
        btn_UpdateProdClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateProdClearFocusLost

    private void btn_UpdateProdClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateProdClearMouseEntered
        btn_UpdateProdClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateProdClearMouseEntered

    private void btn_UpdateProdClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateProdClearMouseExited
        btn_UpdateProdClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateProdClearMouseExited

    private void btn_UpdateProdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateProdClearActionPerformed
        button.clearUpdateProduct();
    }//GEN-LAST:event_btn_UpdateProdClearActionPerformed

    private void btn_UpdateProdCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateProdCloseFocusGained
        btn_UpdateProdClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateProdCloseFocusGained

    private void btn_UpdateProdCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateProdCloseFocusLost
        btn_UpdateProdClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateProdCloseFocusLost

    private void btn_UpdateProdCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateProdCloseMouseEntered
        btn_UpdateProdClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateProdCloseMouseEntered

    private void btn_UpdateProdCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateProdCloseMouseExited
        btn_UpdateProdClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateProdCloseMouseExited

    private void btn_UpdateProdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateProdCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_UpdateProdCloseActionPerformed

    private void btn_UpdateAddCompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateAddCompanyFocusGained
        btn_UpdateAddCompany.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateAddCompanyFocusGained

    private void btn_UpdateAddCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateAddCompanyFocusLost
        btn_UpdateAddCompany.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateAddCompanyFocusLost

    private void btn_UpdateAddCompanyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateAddCompanyMouseEntered
        btn_UpdateAddCompany.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateAddCompanyMouseEntered

    private void btn_UpdateAddCompanyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateAddCompanyMouseExited
        btn_UpdateAddCompany.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateAddCompanyMouseExited

    private void btn_UpdateAddCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateAddCompanyActionPerformed
        Inventory_Company inventory = new Inventory_Company(null, rootPaneCheckingEnabled);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        Inventory_Company.dialogclassification = 2;
        inventory.setVisible(true);
    }//GEN-LAST:event_btn_UpdateAddCompanyActionPerformed

    private void btn_UpdateAddColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateAddColorFocusGained
        btn_UpdateAddColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateAddColorFocusGained

    private void btn_UpdateAddColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateAddColorFocusLost
        btn_UpdateAddColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateAddColorFocusLost

    private void btn_UpdateAddColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateAddColorMouseEntered
        btn_UpdateAddColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateAddColorMouseEntered

    private void btn_UpdateAddColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateAddColorMouseExited
        btn_UpdateAddColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateAddColorMouseExited

    private void btn_UpdateAddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateAddColorActionPerformed
        Inventory_Color inventory = new Inventory_Color(null, rootPaneCheckingEnabled);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        Inventory_Color.dialogclassification = 2;
        inventory.setVisible(true);
    }//GEN-LAST:event_btn_UpdateAddColorActionPerformed

    private void btn_UpdateAddCategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateAddCategoryFocusGained
        btn_UpdateAddCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateAddCategoryFocusGained

    private void btn_UpdateAddCategoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateAddCategoryFocusLost
        btn_UpdateAddCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateAddCategoryFocusLost

    private void btn_UpdateAddCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateAddCategoryMouseEntered
        btn_UpdateAddCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateAddCategoryMouseEntered

    private void btn_UpdateAddCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateAddCategoryMouseExited
        btn_UpdateAddCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateAddCategoryMouseExited

    private void btn_UpdateAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateAddCategoryActionPerformed
        Inventory_Category inventory = new Inventory_Category(null, rootPaneCheckingEnabled);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        Inventory_Category.dialogclassification = 2;
        inventory.setVisible(true);
    }//GEN-LAST:event_btn_UpdateAddCategoryActionPerformed

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

    private void cbo_UpdateProdCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_UpdateProdCategoryActionPerformed
        dialog_inventory.Inventory_ButtonFunctions.disableUpdateRegDate(cbo_UpdateProdCategory);
    }//GEN-LAST:event_cbo_UpdateProdCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory_UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_UpdateProduct dialog = new Inventory_UpdateProduct(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_UpdateAddCategory;
    protected static javax.swing.JButton btn_UpdateAddColor;
    protected static javax.swing.JButton btn_UpdateAddCompany;
    protected static javax.swing.JButton btn_UpdateProd;
    protected static javax.swing.JButton btn_UpdateProdClear;
    protected static javax.swing.JButton btn_UpdateProdClose;
    protected static javax.swing.JComboBox<String> cbo_UpdateProdCategory;
    protected static javax.swing.JComboBox<String> cbo_UpdateProdColor;
    protected static javax.swing.JComboBox<String> cbo_UpdateProdCompany;
    protected static org.jdesktop.swingx.JXDatePicker date_UpdateProdExpiration;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_note2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_UpdateProdName;
    protected static javax.swing.JTextField txt_UpdateProdPrice;
    protected static javax.swing.JTextField txt_UpdateProdSize;
    // End of variables declaration//GEN-END:variables
}
