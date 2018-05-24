package dialog_inventory;

import com.DatabaseLinker;
import inventory.InventoryPnl_1stLayer;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class Inventory_Company extends javax.swing.JDialog {

    private Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    public static int dialogclassification;
    DatabaseLinker tblCompany;
    static String query = "SELECT idsupplier as 'ID',supplier_name AS 'Supplier Name',contact_number AS 'Contact No.', discount AS 'Discount',contact_person AS 'Contact Person' FROM supplier";
    public Inventory_Company(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tblCompany = new DatabaseLinker(tbl_NewList, query);
    }
    public static void updateTable()
    {
        DatabaseLinker.updateTable(tbl_NewList,query);
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
        tbl_NewList = new javax.swing.JTable();
        txt_NewCompanyContactPerson = new javax.swing.JTextField();
        txt_NewCompanyDiscount = new javax.swing.JTextField();
        lbl_NewDiscount = new javax.swing.JLabel();
        lbl_NewContactPerson = new javax.swing.JLabel();
        txt_NewCompanyContact = new javax.swing.JTextField();
        txt_NewCompanyName = new javax.swing.JTextField();
        lbl_NewContactNumber = new javax.swing.JLabel();
        lbl_NewCompanyName = new javax.swing.JLabel();
        btn_NewInventory = new javax.swing.JButton();
        btn_EditInventory = new javax.swing.JButton();
        btn_ClearInventory = new javax.swing.JButton();
        btn_CloseInventory = new javax.swing.JButton();
        lbl_NewCompanyNote = new javax.swing.JLabel();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryCompany.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_NewList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_NewList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "%", "Contact No.", "Contact Person"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_NewList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_NewList.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_NewList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_NewListMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_NewList);
        tbl_NewList.setBackground(Color.WHITE);
        tbl_NewList.setRowHeight(27);
        tbl_NewList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_NewList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_NewList.setShowGrid(true);

        txt_NewCompanyContactPerson.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewCompanyContactPerson.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_NewCompanyContactPerson.setEnabled(false);

        txt_NewCompanyDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewCompanyDiscount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NewCompanyDiscount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_NewCompanyDiscount.setEnabled(false);

        lbl_NewDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDiscount.setText("Discount: *");
        lbl_NewDiscount.setEnabled(false);
        lbl_NewDiscount.setText("<html>Discount: <font color=red>*</font></html>");

        lbl_NewContactPerson.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewContactPerson.setText("Contact Person:");
        lbl_NewContactPerson.setEnabled(false);

        txt_NewCompanyContact.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewCompanyContact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_NewCompanyContact.setEnabled(false);

        txt_NewCompanyName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewCompanyName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_NewCompanyName.setEnabled(false);

        lbl_NewContactNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewContactNumber.setText("Contact Number:");
        lbl_NewContactNumber.setEnabled(false);

        lbl_NewCompanyName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewCompanyName.setText("Company Name: *");
        lbl_NewCompanyName.setEnabled(false);
        lbl_NewCompanyName.setText("<html>Company Name: <font color=red>*</font></html>");

        btn_NewInventory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewInventory.setText("New");
        btn_NewInventory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewInventoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewInventoryFocusLost(evt);
            }
        });
        btn_NewInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewInventoryMouseExited(evt);
            }
        });
        btn_NewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewInventoryActionPerformed(evt);
            }
        });

        btn_EditInventory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_EditInventory.setText("Edit");
        btn_EditInventory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_EditInventoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_EditInventoryFocusLost(evt);
            }
        });
        btn_EditInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditInventoryMouseExited(evt);
            }
        });
        btn_EditInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditInventoryActionPerformed(evt);
            }
        });

        btn_ClearInventory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ClearInventory.setText("Clear");
        btn_ClearInventory.setEnabled(false);
        btn_ClearInventory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ClearInventoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ClearInventoryFocusLost(evt);
            }
        });
        btn_ClearInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ClearInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ClearInventoryMouseExited(evt);
            }
        });
        btn_ClearInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearInventoryActionPerformed(evt);
            }
        });

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

        lbl_NewCompanyNote.setBackground(new java.awt.Color(255, 255, 255));
        lbl_NewCompanyNote.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_NewCompanyNote.setText("Note: Please fill out the information that has *");
        lbl_NewCompanyNote.setEnabled(false);
        lbl_NewCompanyNote.setText("<html><b>Note:</b> Please fill out the required fields that has <font color=red size=5>*</font>.</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_NewInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_EditInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_ClearInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_CloseInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_NewCompanyName)
                                .addComponent(lbl_NewContactNumber))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_NewCompanyContact, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(txt_NewCompanyName))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_NewDiscount)
                                .addComponent(lbl_NewContactPerson))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_NewCompanyDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_NewCompanyContactPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lbl_NewCompanyNote, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NewCompanyName)
                    .addComponent(txt_NewCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NewCompanyDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NewDiscount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NewContactNumber)
                    .addComponent(txt_NewCompanyContact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NewContactPerson)
                    .addComponent(txt_NewCompanyContactPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbl_NewCompanyNote, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CloseInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ClearInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_NewInventoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewInventoryFocusGained
        btn_NewInventory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewInventoryFocusGained

    private void btn_NewInventoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewInventoryFocusLost
        btn_NewInventory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewInventoryFocusLost

    private void btn_NewInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewInventoryMouseEntered
        btn_NewInventory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewInventoryMouseEntered

    private void btn_NewInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewInventoryMouseExited
        btn_NewInventory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewInventoryMouseExited

    private void btn_NewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewInventoryActionPerformed
        button.addNewCompany(dialogclassification);
        InventoryPnl_1stLayer.updateGenerateCompany();
    }//GEN-LAST:event_btn_NewInventoryActionPerformed

    private void btn_EditInventoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditInventoryFocusGained
        btn_EditInventory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditInventoryFocusGained

    private void btn_EditInventoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditInventoryFocusLost
        btn_EditInventory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditInventoryFocusLost

    private void btn_EditInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditInventoryMouseEntered
        btn_EditInventory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditInventoryMouseEntered

    private void btn_EditInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditInventoryMouseExited
        btn_EditInventory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditInventoryMouseExited

    private void btn_EditInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditInventoryActionPerformed
        button.editCompany();
    }//GEN-LAST:event_btn_EditInventoryActionPerformed

    private void btn_ClearInventoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ClearInventoryFocusGained
        btn_ClearInventory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ClearInventoryFocusGained

    private void btn_ClearInventoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ClearInventoryFocusLost
        btn_ClearInventory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ClearInventoryFocusLost

    private void btn_ClearInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearInventoryMouseEntered
        btn_ClearInventory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ClearInventoryMouseEntered

    private void btn_ClearInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearInventoryMouseExited
        btn_ClearInventory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ClearInventoryMouseExited

    private void btn_ClearInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearInventoryActionPerformed
        txt_NewCompanyContact.setText("");
        txt_NewCompanyContactPerson.setText("");
        txt_NewCompanyDiscount.setText("");
        txt_NewCompanyName.setText("");
    }//GEN-LAST:event_btn_ClearInventoryActionPerformed

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
        if (btn_CloseInventory.getText().equals("Close")){
            this.dispose();
        }
        else{
            btn_NewInventory.setText("New");
            btn_CloseInventory.setText("Close");
            txt_NewCompanyName.setText("");
            txt_NewCompanyDiscount.setText("");
            txt_NewCompanyContact.setText("");
            txt_NewCompanyContactPerson.setText("");
            btn_EditInventory.setEnabled(true);
            txt_NewCompanyName.setEnabled(false);
            txt_NewCompanyContact.setEnabled(false);
            txt_NewCompanyDiscount.setEnabled(false);
            txt_NewCompanyContactPerson.setEnabled(false);
            lbl_NewCompanyName.setEnabled(false);
            lbl_NewDiscount.setEnabled(false);
            lbl_NewContactNumber.setEnabled(false);
            lbl_NewContactPerson.setEnabled(false);
            lbl_NewCompanyNote.setEnabled(false);
            btn_ClearInventory.setEnabled(false);
        }
    }//GEN-LAST:event_btn_CloseInventoryActionPerformed

    private void tbl_NewListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NewListMousePressed
        Inventory_ButtonFunctions.tableclicked(evt, tbl_NewList);
    }//GEN-LAST:event_tbl_NewListMousePressed

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
            java.util.logging.Logger.getLogger(Inventory_Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_Company dialog = new Inventory_Company(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_ClearInventory;
    protected static javax.swing.JButton btn_CloseInventory;
    protected static javax.swing.JButton btn_EditInventory;
    protected static javax.swing.JButton btn_NewInventory;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_NewCompanyName;
    protected static javax.swing.JLabel lbl_NewCompanyNote;
    protected static javax.swing.JLabel lbl_NewContactNumber;
    protected static javax.swing.JLabel lbl_NewContactPerson;
    protected static javax.swing.JLabel lbl_NewDiscount;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_NewList;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_NewCompanyContact;
    protected static javax.swing.JTextField txt_NewCompanyContactPerson;
    protected static javax.swing.JTextField txt_NewCompanyDiscount;
    protected static javax.swing.JTextField txt_NewCompanyName;
    // End of variables declaration//GEN-END:variables
}
