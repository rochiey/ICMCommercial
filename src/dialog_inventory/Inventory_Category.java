package dialog_inventory;

import com.DatabaseLinker;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class Inventory_Category extends javax.swing.JDialog {
    public static int dialogclassification;
    DatabaseLinker category;
    private Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    static String query = "SELECT category.idcategory AS 'ID',category.category_name AS 'Category Name',category_type.category_type_name AS 'Category Type' FROM category,category_type WHERE category.category_type = category_type.idcategory_type";
    public Inventory_Category(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      
        category = new DatabaseLinker(tbl_categoryList, query);
    }
    public static void updateTable()
    {
        DatabaseLinker.updateTable(tbl_categoryList,query);
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
        tbl_categoryList = new javax.swing.JTable();
        txt_CategoryName = new javax.swing.JTextField();
        lbl_CategoryType = new javax.swing.JLabel();
        lbl_CategoryName = new javax.swing.JLabel();
        btn_NewCategory = new javax.swing.JButton();
        btn_EditCategory = new javax.swing.JButton();
        btn_ClearCategory = new javax.swing.JButton();
        btn_CloseCategory = new javax.swing.JButton();
        cbo_CategoryType = new javax.swing.JComboBox<String>();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 452, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryCategory.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_categoryList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_categoryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_categoryList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_categoryList.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_categoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_categoryListMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_categoryList);
        tbl_categoryList.setBackground(Color.WHITE);
        tbl_categoryList.setRowHeight(27);
        tbl_categoryList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_categoryList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_categoryList.setShowGrid(true);

        txt_CategoryName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_CategoryName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_CategoryName.setEnabled(false);

        lbl_CategoryType.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_CategoryType.setText("Category Type:");
        lbl_CategoryType.setEnabled(false);

        lbl_CategoryName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_CategoryName.setText("Category Name:");
        lbl_CategoryName.setEnabled(false);

        btn_NewCategory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewCategory.setText("New");
        btn_NewCategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewCategoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewCategoryFocusLost(evt);
            }
        });
        btn_NewCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewCategoryMouseExited(evt);
            }
        });
        btn_NewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewCategoryActionPerformed(evt);
            }
        });

        btn_EditCategory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_EditCategory.setText("Edit");
        btn_EditCategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_EditCategoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_EditCategoryFocusLost(evt);
            }
        });
        btn_EditCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditCategoryMouseExited(evt);
            }
        });
        btn_EditCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditCategoryActionPerformed(evt);
            }
        });

        btn_ClearCategory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ClearCategory.setText("Clear");
        btn_ClearCategory.setEnabled(false);
        btn_ClearCategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ClearCategoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ClearCategoryFocusLost(evt);
            }
        });
        btn_ClearCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ClearCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ClearCategoryMouseExited(evt);
            }
        });
        btn_ClearCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearCategoryActionPerformed(evt);
            }
        });

        btn_CloseCategory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CloseCategory.setText("Close");
        btn_CloseCategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CloseCategoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CloseCategoryFocusLost(evt);
            }
        });
        btn_CloseCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseCategoryMouseExited(evt);
            }
        });
        btn_CloseCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseCategoryActionPerformed(evt);
            }
        });

        cbo_CategoryType.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_CategoryType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Expirable", "Non-Expirable" }));
        cbo_CategoryType.setEnabled(false);
        cbo_CategoryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_CategoryTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CategoryName)
                            .addComponent(lbl_CategoryType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_CategoryType, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_NewCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_EditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_ClearCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_CloseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CategoryName)
                    .addComponent(txt_CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CategoryType)
                    .addComponent(cbo_CategoryType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CloseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ClearCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbo_CategoryType, txt_CategoryName});

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_NewCategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewCategoryFocusGained
        btn_NewCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewCategoryFocusGained

    private void btn_NewCategoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewCategoryFocusLost
        btn_NewCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewCategoryFocusLost

    private void btn_NewCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewCategoryMouseEntered
        btn_NewCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewCategoryMouseEntered

    private void btn_NewCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewCategoryMouseExited
        btn_NewCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewCategoryMouseExited

    private void btn_NewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewCategoryActionPerformed
        button.addNewCategory(dialogclassification);
    }//GEN-LAST:event_btn_NewCategoryActionPerformed

    private void btn_EditCategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditCategoryFocusGained
        btn_EditCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditCategoryFocusGained

    private void btn_EditCategoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditCategoryFocusLost
        btn_EditCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditCategoryFocusLost

    private void btn_EditCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCategoryMouseEntered
        btn_EditCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditCategoryMouseEntered

    private void btn_EditCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCategoryMouseExited
        btn_EditCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditCategoryMouseExited

    private void btn_EditCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditCategoryActionPerformed
        button.editCategory();
    }//GEN-LAST:event_btn_EditCategoryActionPerformed

    private void btn_ClearCategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ClearCategoryFocusGained
        btn_ClearCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ClearCategoryFocusGained

    private void btn_ClearCategoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ClearCategoryFocusLost
        btn_ClearCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ClearCategoryFocusLost

    private void btn_ClearCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearCategoryMouseEntered
        btn_ClearCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ClearCategoryMouseEntered

    private void btn_ClearCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearCategoryMouseExited
        btn_ClearCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ClearCategoryMouseExited

    private void btn_ClearCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearCategoryActionPerformed
        button.clearCategory();
    }//GEN-LAST:event_btn_ClearCategoryActionPerformed

    private void btn_CloseCategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseCategoryFocusGained
        btn_CloseCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseCategoryFocusGained

    private void btn_CloseCategoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseCategoryFocusLost
        btn_CloseCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseCategoryFocusLost

    private void btn_CloseCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseCategoryMouseEntered
        btn_CloseCategory.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseCategoryMouseEntered

    private void btn_CloseCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseCategoryMouseExited
        btn_CloseCategory.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseCategoryMouseExited
    public static boolean wasClosed = false;
    private void btn_CloseCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseCategoryActionPerformed
        if (btn_CloseCategory.getText().equals("Close")){
            this.dispose();
        }
        else{
            btn_NewCategory.setText("New");
            btn_CloseCategory.setText("Close");
            txt_CategoryName.setText("");
            cbo_CategoryType.setSelectedIndex(0);
            btn_EditCategory.setEnabled(true);
            txt_CategoryName.setEnabled(false);
            cbo_CategoryType.setEnabled(false);
            lbl_CategoryName.setEnabled(false);
            lbl_CategoryType.setEnabled(false);
            btn_ClearCategory.setEnabled(false);
        }
    }//GEN-LAST:event_btn_CloseCategoryActionPerformed

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

    private void tbl_categoryListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_categoryListMousePressed
        Inventory_ButtonFunctions.tableclicked(evt, tbl_categoryList);
    }//GEN-LAST:event_tbl_categoryListMousePressed

    private void cbo_CategoryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_CategoryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_CategoryTypeActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory_Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_Category dialog = new Inventory_Category(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_ClearCategory;
    protected static javax.swing.JButton btn_CloseCategory;
    protected static javax.swing.JButton btn_EditCategory;
    protected static javax.swing.JButton btn_NewCategory;
    protected static javax.swing.JComboBox<String> cbo_CategoryType;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_CategoryName;
    protected static javax.swing.JLabel lbl_CategoryType;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_categoryList;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_CategoryName;
    // End of variables declaration//GEN-END:variables
}
