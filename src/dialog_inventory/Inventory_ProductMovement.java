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
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Inventory_ProductMovement extends javax.swing.JDialog {

    private Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    DatabaseLinker productMovement;
    public Inventory_ProductMovement(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        populateCBO();
        
       tblModel=new DefaultTableModel();
       setJTable();
    }
   
    public static void setJTable(){
        setJTableColumnsWidth(tbl_PMovementList, 625, 5, 16, 8, 8, 9, 9);
        JTableFixer.setPMTableField(tbl_PMovementList);
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
        tbl_PMovementList = new javax.swing.JTable();
        btn_Confirm = new javax.swing.JButton();
        btn_Close = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_NewDiscount = new javax.swing.JLabel();
        date_Purchase = new org.jdesktop.swingx.JXDatePicker();
        lbl_NewCompanyName3 = new javax.swing.JLabel();
        txt_POReceipt = new javax.swing.JTextField();
        lbl_NewCompanyName2 = new javax.swing.JLabel();
        lbl_NewCompanyName1 = new javax.swing.JLabel();
        lbl_NewCompanyName = new javax.swing.JLabel();
        cbo_Remarks = new javax.swing.JComboBox<>();
        cbo_InventoryType = new javax.swing.JComboBox<>();
        txt_POReceipt1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbl_NewContactNumber = new javax.swing.JLabel();
        lbl_NewContactPerson = new javax.swing.JLabel();
        txt_ArticleName = new javax.swing.JTextField();
        txt_Qty = new javax.swing.JTextField();
        cbo_Company = new javax.swing.JComboBox<>();
        lbl_NewContactPerson1 = new javax.swing.JLabel();
        btn_AddToTable = new javax.swing.JButton();
        btn_ViewArticle = new javax.swing.JButton();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryPMovement.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_PMovementList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_PMovementList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Article Name", "Color", "Size", "Current Qty", "Qty Supply"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        tbl_PMovementList.setBackground(Color.WHITE);
        tbl_PMovementList.setRowHeight(27);
        tbl_PMovementList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_PMovementList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_PMovementList.setShowGrid(true);

        btn_Confirm.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_Confirm.setText("Confirm");
        btn_Confirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ConfirmFocusLost(evt);
            }
        });
        btn_Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ConfirmMouseExited(evt);
            }
        });
        btn_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmActionPerformed(evt);
            }
        });

        btn_Close.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_Close.setText("Close");
        btn_Close.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CloseFocusLost(evt);
            }
        });
        btn_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseMouseExited(evt);
            }
        });
        btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NewDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDiscount.setText("Company Receipt No.:");
        jPanel2.add(lbl_NewDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 21, -1, -1));

        date_Purchase.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel2.add(date_Purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 60, 150, 38));
        date_Purchase.setFormats("yyyy-MM-dd");

        lbl_NewCompanyName3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewCompanyName3.setText("Remarks:");
        jPanel2.add(lbl_NewCompanyName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 117, -1, -1));

        txt_POReceipt.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_POReceipt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_POReceipt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_POReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_POReceiptActionPerformed(evt);
            }
        });
        jPanel2.add(txt_POReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 13, 90, 38));

        lbl_NewCompanyName2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewCompanyName2.setText("Inventory Type:");
        jPanel2.add(lbl_NewCompanyName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 69, -1, -1));

        lbl_NewCompanyName1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewCompanyName1.setText("Date Purchased:");
        jPanel2.add(lbl_NewCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 69, -1, -1));

        lbl_NewCompanyName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewCompanyName.setText("PO No.:");
        jPanel2.add(lbl_NewCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, -1, -1));

        cbo_Remarks.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_Remarks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good Condition" }));
        cbo_Remarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_RemarksActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 107, 475, 38));

        cbo_InventoryType.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_InventoryType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inventory IN", "Inventory OUT"}));
        cbo_InventoryType.setFocusable(false);
        cbo_InventoryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_InventoryTypeActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_InventoryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 60, 140, 38));

        txt_POReceipt1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_POReceipt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txt_POReceipt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 13, 140, 38));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NewContactNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewContactNumber.setText("Company:");
        jPanel3.add(lbl_NewContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 22, -1, -1));

        lbl_NewContactPerson.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewContactPerson.setText("Qty:");
        jPanel3.add(lbl_NewContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 22, -1, -1));

        txt_ArticleName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ArticleName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ArticleName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ArticleName.setEnabled(false);
        jPanel3.add(txt_ArticleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 13, 100, 38));

        txt_Qty.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_Qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Qty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(txt_Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 13, 70, 38));

        cbo_Company.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_Company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Forever Living" }));
        cbo_Company.setEnabled(false);
        jPanel3.add(cbo_Company, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 13, 140, 38));

        lbl_NewContactPerson1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewContactPerson1.setText("Article Code:");
        jPanel3.add(lbl_NewContactPerson1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 22, -1, -1));

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
        jPanel3.add(btn_AddToTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 13, 35, 38));
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
    btn_ViewArticle.setEnabled(false);
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
    jPanel3.add(btn_ViewArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 13, 35, 38));
    btn_ViewArticle.registerKeyboardAction(btn_ViewArticle.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_ViewArticle.registerKeyboardAction(btn_ViewArticle.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btn_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)))
            .addGap(11, 11, 11))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(2, 2, 2)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(5, 5, 5))
    );

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_ConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ConfirmFocusGained
        btn_Confirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ConfirmFocusGained

    private void btn_ConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ConfirmFocusLost
        btn_Confirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ConfirmFocusLost

    private void btn_ConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConfirmMouseEntered
        btn_Confirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ConfirmMouseEntered

    private void btn_ConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConfirmMouseExited
        btn_Confirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ConfirmMouseExited

    private void btn_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmActionPerformed
        try
        {
            int receipt = Integer.parseInt(txt_POReceipt1.getText());
            if(date_Purchase.getEditor().getText() == "" || txt_POReceipt1.getText().equals("")) JOptionPane.showMessageDialog(null, "Please fill in the fields completely.");
            else
            {
                if(tbl_PMovementList.getRowCount()==0)
                {
                    JOptionPane.showMessageDialog(null, "Please put an item in the movement");
                } 
                else
                {
                    String format="%Y-%m-%d";
                    String datePurchase = date_Purchase.getEditor().getText();
                    if(cbo_InventoryType.getSelectedItem().equals("Inventory IN"))
                    {
                        for(int i=0;i<tbl_PMovementList.getRowCount();i++)
                        {
                            createDB(); int currentQty=0;
                            try {
                                rs = stmt.executeQuery("SELECT quantity FROM product WHERE idproduct="+tbl_PMovementList.getValueAt(i, 0));
                                while(rs.next())
                                {
                                    currentQty=rs.getInt("quantity");
                                }
                             currentQty+=Integer.parseInt(tbl_PMovementList.getValueAt(i, 5).toString());
                             dbHandlerUpdates("UPDATE product SET quantity="+currentQty+" WHERE idproduct="+tbl_PMovementList.getValueAt(i, 0));
                            } catch (SQLException ex) {
                                Logger.getLogger(Inventory_ProductMovement.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,POid,remarks) VALUES((SELECT CURDATE()),'"+cbo_InventoryType.getSelectedItem().toString()+"',"+txt_POReceipt.getText()+",'"+cbo_Remarks.getSelectedItem().toString()+"')");
                        dbHandlerUpdates("UPDATE invoice_supplier SET supplier_SOno="+txt_POReceipt1.getText()+",date_of_purchase=STR_TO_DATE('"+datePurchase+"','"+format+"') WHERE idinvoice_supplier="+getLastID("invoice_supplier"));
                        JOptionPane.showMessageDialog(null, "Transaction done.");
                    }
                    else
                    {
                        dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,remarks) VALUES((SELECT CURDATE()),'"+cbo_InventoryType.getSelectedItem().toString()+"','"+cbo_Remarks.getSelectedItem().toString()+"')");
                        dbHandlerUpdates("UPDATE invoice_supplier SET supplier_SOno="+txt_POReceipt1.getText()+",date_of_purchase=STR_TO_DATE('"+datePurchase+"','"+format+"') WHERE idinvoice_supplier="+getLastID("invoice_supplier"));
                        JOptionPane.showMessageDialog(null, "Transaction done.");
                    }
                }
                this.dispose();
            }
            inventory.InventoryPnl_1stLayer.updateTable();
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "The Company Receipt should be numbers");
        }
    }//GEN-LAST:event_btn_ConfirmActionPerformed

    private void btn_CloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseFocusGained
        btn_Close.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseFocusGained

    private void btn_CloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseFocusLost
        btn_Close.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseFocusLost

    private void btn_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseMouseEntered
        btn_Close.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseMouseEntered

    private void btn_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseMouseExited
        btn_Close.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseMouseExited

    private void btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseActionPerformed
        this.dispose();
        
        //JOptionPane.showMessageDialog(null, tbl_PMovementList.getWidth());
    }//GEN-LAST:event_btn_CloseActionPerformed
    static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,javax.swing.JTable tbl_data)
    {
        if(evt.getClickCount() >= 2 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
            txt_ArticleName.setText(clickedID_onTable+"");
            txt_Qty.setText(tbl_data.getModel().getValueAt(row, 5).toString());
        }
        setJTable();
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

    private void cbo_InventoryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_InventoryTypeActionPerformed
        if(cbo_InventoryType.getSelectedItem().equals("Inventory IN")){
            cbo_Remarks.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Good Condition"}));
        }
        else{
            cbo_Company.setEnabled(true);
            txt_ArticleName.setEnabled(true);
            btn_ViewArticle.setEnabled(true);
            cbo_Remarks.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bad Condition", "Expired Product", 
                "Return to Company (Lacking)", 
                "Return to Company (Bad Condition)" , "Return to Company (Good Condition)" }));
        }
    }//GEN-LAST:event_cbo_InventoryTypeActionPerformed

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
    public static DefaultTableModel tblModel;
    
    public static Vector <Vector<Object>> rowData = new Vector<Vector<Object>>();
    private void btn_AddToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddToTableActionPerformed
        try
        {
            
            int qty = Integer.parseInt(txt_Qty.getText());
            int prodID = Integer.parseInt(txt_ArticleName.getText());
            if(txt_ArticleName.getText().equals("")) JOptionPane.showMessageDialog(null, "Please click an item.");
            else
            {
                boolean putNew = true;
                for(int i=0;i<tbl_PMovementList.getRowCount();i++)
                {
                    if(tbl_PMovementList.getValueAt(i, 0).equals(prodID)){
                        tbl_PMovementList.setValueAt(qty, i, 5);
                        putNew = false;
                    }
                }
                if(putNew)
                {
                     Vector colNames = new Vector();
                    int num =1;
                    colNames.add("ID");
                    colNames.add("Article Name");
                    colNames.add("Color");
                    colNames.add("Size");
                    colNames.add("Current Qty");
                    colNames.add("Qty Supply");
                    createDB();
                    try {
                        rs=stmt.executeQuery("SELECT idproduct AS 'ID',product_name AS 'Product Name',product_color.color_code As 'Color Code',product_size AS 'Size',product.quantity AS 'Current Qty',quantity_supply AS 'Qty Supply' FROM product,product_color WHERE idproduct="+prodID+" AND product_color=product_color.idproduct_color AND supplier=(SELECT idsupplier FROM supplier WHERE supplier_name='"+cbo_Company.getSelectedItem().toString()+"')");
                        while(rs.next())
                        {
                            Vector inRow = new Vector();
                            inRow.add(rs.getObject("ID"));
                            inRow.add(rs.getObject("Product Name"));
                            inRow.add(rs.getObject("Color Code"));
                            inRow.add(rs.getObject("Size"));
                            inRow.add(rs.getObject("Current Qty"));
                            inRow.add(rs.getObject("Qty Supply"));
                            tblModel.addRow(inRow);
                        } //DILI PA KA ADD UG TRANSFER SUPPLY NA FUNCTION
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
                Logger.getLogger(Inventory_ProductMovement.class.getName()).log(Level.SEVERE, null, ex);
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
        dialog_salesOrder.SalesOrder_ButtonFunctions.inventoryView=3;
        dialog_salesOrder.SalesOrder_ViewInventory.supplierName=cbo_Company.getSelectedItem().toString();
        SalesOrder_ViewInventory viewInv = new SalesOrder_ViewInventory(null,true);
        viewInv.pack();
        viewInv.setLocationRelativeTo(null);
        viewInv.setVisible(true);
    }//GEN-LAST:event_btn_ViewArticleActionPerformed

    private void cbo_RemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_RemarksActionPerformed
        if(cbo_Remarks.getSelectedItem().equals("Product Transfer")) 
        {
            txt_ArticleName.setEnabled(true);
            btn_ViewArticle.setEnabled(true);
            cbo_Company.setEnabled(true);
        }
        else
        {
            cbo_Company.setEnabled(false);
            txt_ArticleName.setText("");
            txt_ArticleName.setEnabled(false);
            btn_ViewArticle.setEnabled(false);
        }
    }//GEN-LAST:event_cbo_RemarksActionPerformed
    public static int getLastID(String tblName)
    {
        Integer theID = 0;
        createDB();
        try {
            rs = stmt.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = '"+tblName+"' LIMIT 1");
            while(rs.next())
            {
                theID = Integer.parseInt(rs.getObject("AUTO_INCREMENT").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ProductMovement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return theID-1;
    }
    private void txt_POReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_POReceiptActionPerformed
        createDB();
        DatabaseLinker.updateTable(tbl_PMovementList,"SELECT productID AS 'ID',productName AS 'Article Name',product_color.color_code As 'Color',product_size AS 'Size',product.quantity AS 'Current Qty',purchase_order_supplier.quantity AS 'Qty Supply' FROM purchase_order_supplier, product,product_color WHERE productID = idproduct AND product_color=product_color.idproduct_color AND salesOrderNo="+txt_POReceipt.getText());
        setJTable();
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
            java.util.logging.Logger.getLogger(Inventory_ProductMovement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_ProductMovement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_ProductMovement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_ProductMovement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_ProductMovement dialog = new Inventory_ProductMovement(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_Close;
    protected static javax.swing.JButton btn_Confirm;
    protected static javax.swing.JButton btn_ViewArticle;
    private static javax.swing.JComboBox<String> cbo_Company;
    protected static javax.swing.JComboBox<String> cbo_InventoryType;
    protected static javax.swing.JComboBox<String> cbo_Remarks;
    protected static org.jdesktop.swingx.JXDatePicker date_Purchase;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_NewCompanyName;
    protected static javax.swing.JLabel lbl_NewCompanyName1;
    protected static javax.swing.JLabel lbl_NewCompanyName2;
    protected static javax.swing.JLabel lbl_NewCompanyName3;
    protected static javax.swing.JLabel lbl_NewContactNumber;
    protected static javax.swing.JLabel lbl_NewContactPerson;
    protected static javax.swing.JLabel lbl_NewContactPerson1;
    protected static javax.swing.JLabel lbl_NewDiscount;
    private javax.swing.JLabel logo;
    public static javax.swing.JTable tbl_PMovementList;
    private javax.swing.JLabel text;
    public static javax.swing.JTextField txt_ArticleName;
    protected static javax.swing.JTextField txt_POReceipt;
    protected static javax.swing.JTextField txt_POReceipt1;
    public static javax.swing.JTextField txt_Qty;
    // End of variables declaration//GEN-END:variables
}
