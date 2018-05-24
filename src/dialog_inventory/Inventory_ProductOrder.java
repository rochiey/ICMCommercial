package dialog_inventory;

import com.DatabaseLinker;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import dialog_salesOrder.SalesOrder_ViewInventory;
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
import javax.swing.table.DefaultTableModel;

public class Inventory_ProductOrder extends javax.swing.JDialog {

    private Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    DatabaseLinker tblCompany;
    public static DefaultTableModel tblModel;
    public Inventory_ProductOrder(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        populateCBO();
        initializeMovement();
        setJTable();
    }
    public static Vector <Vector<Object>> rowData = new Vector<Vector<Object>>();
    private static void initializeMovement()
    {
        rowData.clear();
        Vector colNames = new Vector();
         int num =1;
            colNames.add("No.");
            colNames.add("Code");
            colNames.add("Article Name");
            colNames.add("Color");
            colNames.add("Size");
            colNames.add("Current Qty");
            colNames.add("Danger Level");
        createDB();
        try {
            rs=stmt.executeQuery("SELECT idproduct,product_name,product_color.color_code,product_size,quantity,quantity_dangerLevel FROM product,product_color WHERE product_color=product_color.idproduct_color AND quantity <= quantity_dangerLevel AND supplier=(SELECT idsupplier FROM supplier WHERE supplier_name='"+cbo_Company.getSelectedItem().toString()+"')");
            while(rs.next())
            {
                Vector inRow = new Vector();
                inRow.add(num);
                inRow.add(rs.getObject("idproduct"));
                inRow.add(rs.getObject("product_name"));
                inRow.add(rs.getObject("color_code"));
                inRow.add(rs.getObject("product_size"));
                inRow.add(rs.getObject("quantity")); 
                inRow.add(rs.getObject("quantity_dangerLevel"));
                num++;
                rowData.add(inRow);
            }
            //setJTable();
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ProductMovement.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbl_PMovementList.setModel(tblModel = new DefaultTableModel(rowData,colNames){
            public boolean isCellEditable(int row,int col){
                return false;
            }
        });
    }
    
    public static void setJTable(){
        setJTableColumnsWidth(tbl_PMovementList, 625, 4, 5, 16, 7, 7, 9, 9);
        JTableFixer.setPOTableField(tbl_PMovementList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_POConfirm = new javax.swing.JButton();
        btn_POClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_NewContactNumber = new javax.swing.JLabel();
        txt_ArticleName = new javax.swing.JTextField();
        txt_Qty = new javax.swing.JTextField();
        cbo_Company = new javax.swing.JComboBox<>();
        lbl_NewContactPerson1 = new javax.swing.JLabel();
        btn_AddToTable = new javax.swing.JButton();
        btn_ViewArticle = new javax.swing.JButton();
        txt_POReceipt = new javax.swing.JTextField();
        lbl_NewCompanyName1 = new javax.swing.JLabel();
        lbl_NewContactPerson = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_PMovementList = new javax.swing.JTable();
        btn_GeneratePO = new javax.swing.JButton();
        btn_PORemove = new javax.swing.JButton();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryPOrder.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_POConfirm.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_POConfirm.setText("Confirm");
        btn_POConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_POConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_POConfirmFocusLost(evt);
            }
        });
        btn_POConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_POConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_POConfirmMouseExited(evt);
            }
        });
        btn_POConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_POConfirmActionPerformed(evt);
            }
        });

        btn_POClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_POClose.setText("Close");
        btn_POClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_POCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_POCloseFocusLost(evt);
            }
        });
        btn_POClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_POCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_POCloseMouseExited(evt);
            }
        });
        btn_POClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_POCloseActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NewContactNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewContactNumber.setText("Company:");
        jPanel3.add(lbl_NewContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 11, -1, -1));

        txt_ArticleName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ArticleName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ArticleName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(txt_ArticleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 36, 100, 38));

        txt_Qty.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_Qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Qty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(txt_Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 36, 70, 38));

        cbo_Company.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_Company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Forever Living" }));
        cbo_Company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_CompanyActionPerformed(evt);
            }
        });
        jPanel3.add(cbo_Company, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 36, 160, 38));

        lbl_NewContactPerson1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewContactPerson1.setText("Article Code:");
        jPanel3.add(lbl_NewContactPerson1, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 11, -1, -1));

        btn_AddToTable.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_AddToTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Add.png"))); // NOI18N
        btn_AddToTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_AddToTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_AddToTableFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_AddToTableFocusLost(evt);
            }
        });
        btn_AddToTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddToTableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddToTableMouseExited(evt);
            }
        });
        btn_AddToTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddToTableActionPerformed(evt);
            }
        });
        jPanel3.add(btn_AddToTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 36, 35, 38));
        btn_AddToTable.registerKeyboardAction(btn_AddToTable.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_AddToTable.registerKeyboardAction(btn_AddToTable.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    btn_ViewArticle.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
    btn_ViewArticle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Dealer New View.png"))); // NOI18N
    btn_ViewArticle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn_ViewArticle.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_ViewArticleFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_ViewArticleFocusLost(evt);
        }
    });
    btn_ViewArticle.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_ViewArticleMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_ViewArticleMouseExited(evt);
        }
    });
    btn_ViewArticle.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_ViewArticleActionPerformed(evt);
        }
    });
    jPanel3.add(btn_ViewArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 36, 35, 38));
    btn_ViewArticle.registerKeyboardAction(btn_ViewArticle.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_ViewArticle.registerKeyboardAction(btn_ViewArticle.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    txt_POReceipt.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_POReceipt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txt_POReceipt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    txt_POReceipt.setEnabled(false);
    txt_POReceipt.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_POReceiptActionPerformed(evt);
        }
    });
    jPanel3.add(txt_POReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 36, 80, 38));

    lbl_NewCompanyName1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    lbl_NewCompanyName1.setText("PO No.:");
    jPanel3.add(lbl_NewCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, -1, -1));

    lbl_NewContactPerson.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    lbl_NewContactPerson.setText("Qty:");
    jPanel3.add(lbl_NewContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 11, -1, -1));

    tbl_PMovementList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    tbl_PMovementList.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "No.", "ID", "Article Name", "Color", "Size", "Qty", "Qty Supply"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tbl_PMovementList.setGridColor(new java.awt.Color(204, 204, 204));
    tbl_PMovementList.setIntercellSpacing(new java.awt.Dimension(2, 2));
    tbl_PMovementList.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            tbl_PMovementListMousePressed(evt);
        }
    });
    jScrollPane4.setViewportView(tbl_PMovementList);
    if (tbl_PMovementList.getColumnModel().getColumnCount() > 0) {
        tbl_PMovementList.getColumnModel().getColumn(0).setResizable(false);
        tbl_PMovementList.getColumnModel().getColumn(1).setResizable(false);
        tbl_PMovementList.getColumnModel().getColumn(2).setResizable(false);
        tbl_PMovementList.getColumnModel().getColumn(3).setResizable(false);
        tbl_PMovementList.getColumnModel().getColumn(4).setResizable(false);
        tbl_PMovementList.getColumnModel().getColumn(5).setResizable(false);
        tbl_PMovementList.getColumnModel().getColumn(6).setResizable(false);
    }
    tbl_PMovementList.setBackground(Color.WHITE);
    tbl_PMovementList.setRowHeight(27);
    tbl_PMovementList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
    ((DefaultTableCellRenderer)tbl_PMovementList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    tbl_PMovementList.setShowGrid(true);
    tbl_PMovementList.getTableHeader().setResizingAllowed(false);

    jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 631, 164));

    btn_GeneratePO.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
    btn_GeneratePO.setText("<html><center>Empty All<br/>Product Order<center></html>");
    btn_GeneratePO.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_GeneratePOFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_GeneratePOFocusLost(evt);
        }
    });
    btn_GeneratePO.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_GeneratePOMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_GeneratePOMouseExited(evt);
        }
    });
    btn_GeneratePO.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_GeneratePOActionPerformed(evt);
        }
    });

    btn_PORemove.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_PORemove.setText("Remove");
    btn_PORemove.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_PORemoveFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_PORemoveFocusLost(evt);
        }
    });
    btn_PORemove.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_PORemoveMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_PORemoveMouseExited(evt);
        }
    });
    btn_PORemove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_PORemoveActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(btn_GeneratePO, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                    .addComponent(btn_POConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btn_PORemove)
                    .addGap(0, 0, 0)
                    .addComponent(btn_POClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_POClose, btn_POConfirm, btn_PORemove});

    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btn_GeneratePO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_PORemove, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_POConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_POClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(6, 6, 6))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_GeneratePO, btn_POClose, btn_POConfirm, btn_PORemove});

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_POConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_POConfirmFocusGained
        btn_POConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_POConfirmFocusGained

    private void btn_POConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_POConfirmFocusLost
        btn_POConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_POConfirmFocusLost

    private void btn_POConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_POConfirmMouseEntered
        btn_POConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_POConfirmMouseEntered

    private void btn_POConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_POConfirmMouseExited
        btn_POConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_POConfirmMouseExited

    private void btn_POConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_POConfirmActionPerformed
        button.purchaseOrderToSupplier();
        this.dispose();
    }//GEN-LAST:event_btn_POConfirmActionPerformed

    private void btn_POCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_POCloseFocusGained
        btn_POClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_POCloseFocusGained

    private void btn_POCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_POCloseFocusLost
        btn_POClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_POCloseFocusLost

    private void btn_POCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_POCloseMouseEntered
        btn_POClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_POCloseMouseEntered

    private void btn_POCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_POCloseMouseExited
        btn_POClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_POCloseMouseExited

    private void btn_POCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_POCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_POCloseActionPerformed
    static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 2 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 1);
            txt_ArticleName.setText(clickedID_onTable+"");
            txt_Qty.setText(tbl_data.getModel().getValueAt(row, 6).toString());
        }
        
    }
    private void tbl_PMovementListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PMovementListMousePressed
        tableclicked(evt, tbl_PMovementList);
    }//GEN-LAST:event_tbl_PMovementListMousePressed

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

    private void btn_AddToTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_AddToTableFocusGained
        btn_AddToTable.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_AddToTableFocusGained

    private void btn_AddToTableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_AddToTableFocusLost
        btn_AddToTable.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_AddToTableFocusLost

    private void btn_AddToTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddToTableMouseEntered
        btn_AddToTable.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_AddToTableMouseEntered

    private void btn_AddToTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddToTableMouseExited
        btn_AddToTable.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_AddToTableMouseExited

    private void btn_AddToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddToTableActionPerformed
        try
        {
            int qty = Integer.parseInt(txt_Qty.getText());
            int prodID = Integer.parseInt(txt_ArticleName.getText());
            if(txt_ArticleName.getText().equals("")) JOptionPane.showMessageDialog(null, "Please click an item.");
            else
            {
                boolean putNew = true;
                for(int i=0;i<tblModel.getRowCount();i++)
                {
                    if(tblModel.getValueAt(i, 1).equals(prodID)){
                        tbl_PMovementList.setValueAt(qty, i, 6);
                        putNew = false;
                    }
                }
                if(putNew)
                {
                    createDB();
                    try {
                        rs=stmt.executeQuery("SELECT idproduct,product_name,product_color.color_code,product_size,quantity,quantity_dangerLevel FROM product,product_color WHERE product_color=product_color.idproduct_color AND idproduct="+prodID+" AND supplier=(SELECT idsupplier FROM supplier WHERE supplier_name='"+cbo_Company.getSelectedItem().toString()+"')");
                        while(rs.next())
                        {
                            Vector inRow = new Vector();
                            inRow.add(tbl_PMovementList.getRowCount()+1);
                            inRow.add(rs.getObject("idproduct"));
                            inRow.add(rs.getObject("product_name"));
                            inRow.add(rs.getObject("color_code"));
                            inRow.add(rs.getObject("product_size"));
                            inRow.add(rs.getObject("quantity"));
                            inRow.add(rs.getObject("quantity_dangerLevel"));
                            rowData.add(inRow);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Inventory_ProductMovement.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Please enter correct quantity/article ID");
        }
    }//GEN-LAST:event_btn_AddToTableActionPerformed

    private void btn_ViewArticleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ViewArticleFocusGained
        btn_ViewArticle.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ViewArticleFocusGained

    private void btn_ViewArticleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ViewArticleFocusLost
        btn_ViewArticle.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ViewArticleFocusLost

    private void btn_ViewArticleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewArticleMouseEntered
        btn_ViewArticle.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ViewArticleMouseEntered

    private void btn_ViewArticleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewArticleMouseExited
        btn_ViewArticle.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ViewArticleMouseExited
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
            javax.swing.JOptionPane.showMessageDialog(null, "Oops, something went wrong. Please try again. (error: sql syntax)");
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Inventory_ProductOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null; 
    
    static Vector vecsupplier;
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
            javax.swing.JOptionPane.showMessageDialog(null, "Oops. Something went wrong. (Error:populatingCbo section:newInventory)");
        }
    }
    private static void populateCBO()
    {
        getSupplier2ComboBox();
        cbo_Company.setModel(new DefaultComboBoxModel<>(vecsupplier));
    }
    private void btn_ViewArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewArticleActionPerformed
        dialog_salesOrder.SalesOrder_ViewInventory.supplierName=cbo_Company.getSelectedItem().toString();
        dialog_salesOrder.SalesOrder_ButtonFunctions.inventoryView=2;
        SalesOrder_ViewInventory viewInv = new SalesOrder_ViewInventory(null,true);
        viewInv.pack();
        viewInv.setLocationRelativeTo(null);
        viewInv.setVisible(true);
    }//GEN-LAST:event_btn_ViewArticleActionPerformed

    private void btn_GeneratePOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GeneratePOFocusGained
        btn_GeneratePO.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GeneratePOFocusGained

    private void btn_GeneratePOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GeneratePOFocusLost
        btn_GeneratePO.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GeneratePOFocusLost

    private void btn_GeneratePOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GeneratePOMouseEntered
        btn_GeneratePO.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GeneratePOMouseEntered

    private void btn_GeneratePOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GeneratePOMouseExited
        btn_GeneratePO.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GeneratePOMouseExited

    private void btn_GeneratePOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GeneratePOActionPerformed
         if (btn_GeneratePO.getText().equals(("<html><center>Auto Generate<br/>Product Order<center></html>"))){
            btn_GeneratePO.setText("<html><center>Empty All<br/>Product Order<center></html>");
            initializeMovement();
        }
         else{
            btn_GeneratePO.setText("<html><center>Auto Generate<br/>Product Order<center></html>");
            tblModel.setRowCount(0);
         }
       
    }//GEN-LAST:event_btn_GeneratePOActionPerformed

    private void btn_PORemoveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PORemoveFocusGained
        btn_PORemove.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PORemoveFocusGained

    private void btn_PORemoveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PORemoveFocusLost
        btn_PORemove.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PORemoveFocusLost

    private void btn_PORemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PORemoveMouseEntered
        btn_PORemove.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PORemoveMouseEntered

    private void btn_PORemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PORemoveMouseExited
        btn_PORemove.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PORemoveMouseExited

    private void btn_PORemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PORemoveActionPerformed
        tblModel.removeRow(tbl_PMovementList.getSelectedRow());
        for(int i=0;i<tblModel.getRowCount();i++)
        {
            tblModel.setValueAt(i+1, i, 0);
        }
    }//GEN-LAST:event_btn_PORemoveActionPerformed

    private void cbo_CompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_CompanyActionPerformed
        initializeMovement();
        setJTable();
    }//GEN-LAST:event_cbo_CompanyActionPerformed

    private void txt_POReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_POReceiptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_POReceiptActionPerformed
    
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
            java.util.logging.Logger.getLogger(Inventory_ProductOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_ProductOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_ProductOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_ProductOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_ProductOrder dialog = new Inventory_ProductOrder(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_AddToTable;
    protected static javax.swing.JButton btn_GeneratePO;
    protected static javax.swing.JButton btn_POClose;
    protected static javax.swing.JButton btn_POConfirm;
    protected static javax.swing.JButton btn_PORemove;
    protected static javax.swing.JButton btn_ViewArticle;
    protected static javax.swing.JComboBox<String> cbo_Company;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_NewCompanyName1;
    protected static javax.swing.JLabel lbl_NewContactNumber;
    protected static javax.swing.JLabel lbl_NewContactPerson;
    protected static javax.swing.JLabel lbl_NewContactPerson1;
    private javax.swing.JLabel logo;
    public static javax.swing.JTable tbl_PMovementList;
    private javax.swing.JLabel text;
    public static javax.swing.JTextField txt_ArticleName;
    public static javax.swing.JTextField txt_POReceipt;
    public static javax.swing.JTextField txt_Qty;
    // End of variables declaration//GEN-END:variables
}
