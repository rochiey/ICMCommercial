package dialog_inventory;

import com.DatabaseLinker;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class Inventory_Color extends javax.swing.JDialog {
    public static int dialogclassification;
    private Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    DatabaseLinker productColor;
    static String query = "SELECT idproduct_color AS 'ID', color_code AS 'Color Code', color_name AS 'color_name' FROM product_color";
    public Inventory_Color(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        productColor = new DatabaseLinker(tbl_ColorList, query );
    }
    public static void updateTable()
    {
        DatabaseLinker.updateTable(tbl_ColorList,query);
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
        tbl_ColorList = new javax.swing.JTable();
        txt_ColorCode = new javax.swing.JTextField();
        lbl_ColorName = new javax.swing.JLabel();
        lbl_ColorCode = new javax.swing.JLabel();
        btn_NewColor = new javax.swing.JButton();
        btn_EditColor = new javax.swing.JButton();
        btn_ClearColor = new javax.swing.JButton();
        btn_CloseColor = new javax.swing.JButton();
        txt_ColorName = new javax.swing.JTextField();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryColor.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_ColorList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_ColorList.setModel(new javax.swing.table.DefaultTableModel(
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
                "Code", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ColorList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ColorList.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_ColorList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_ColorListMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_ColorList);
        tbl_ColorList.setBackground(Color.WHITE);
        tbl_ColorList.setRowHeight(27);
        tbl_ColorList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_ColorList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_ColorList.setShowGrid(true);

        txt_ColorCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ColorCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ColorCode.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ColorCode.setEnabled(false);

        lbl_ColorName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_ColorName.setText("Color Name:");
        lbl_ColorName.setEnabled(false);

        lbl_ColorCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_ColorCode.setText("Color Code:");
        lbl_ColorCode.setEnabled(false);

        btn_NewColor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewColor.setText("New");
        btn_NewColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewColorFocusLost(evt);
            }
        });
        btn_NewColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewColorMouseExited(evt);
            }
        });
        btn_NewColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewColorActionPerformed(evt);
            }
        });

        btn_EditColor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_EditColor.setText("Edit");
        btn_EditColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_EditColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_EditColorFocusLost(evt);
            }
        });
        btn_EditColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditColorMouseExited(evt);
            }
        });
        btn_EditColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditColorActionPerformed(evt);
            }
        });

        btn_ClearColor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ClearColor.setText("Clear");
        btn_ClearColor.setEnabled(false);
        btn_ClearColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ClearColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ClearColorFocusLost(evt);
            }
        });
        btn_ClearColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ClearColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ClearColorMouseExited(evt);
            }
        });
        btn_ClearColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearColorActionPerformed(evt);
            }
        });

        btn_CloseColor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CloseColor.setText("Close");
        btn_CloseColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CloseColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CloseColorFocusLost(evt);
            }
        });
        btn_CloseColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseColorMouseExited(evt);
            }
        });
        btn_CloseColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseColorActionPerformed(evt);
            }
        });

        txt_ColorName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ColorName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ColorName.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_NewColor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_EditColor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_ClearColor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_CloseColor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_ColorCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ColorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ColorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ColorName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ColorCode)
                    .addComponent(txt_ColorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ColorName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ColorName))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CloseColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ClearColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_ColorCode, txt_ColorName});

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_NewColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewColorFocusGained
        btn_NewColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewColorFocusGained

    private void btn_NewColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewColorFocusLost
        btn_NewColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewColorFocusLost

    private void btn_NewColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewColorMouseEntered
        btn_NewColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewColorMouseEntered

    private void btn_NewColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewColorMouseExited
        btn_NewColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewColorMouseExited

    private void btn_NewColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewColorActionPerformed
        button.addNewColor(dialogclassification);
    }//GEN-LAST:event_btn_NewColorActionPerformed

    private void btn_EditColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditColorFocusGained
        btn_EditColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditColorFocusGained

    private void btn_EditColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditColorFocusLost
        btn_EditColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditColorFocusLost

    private void btn_EditColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditColorMouseEntered
        btn_EditColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditColorMouseEntered

    private void btn_EditColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditColorMouseExited
        btn_EditColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditColorMouseExited

    private void btn_EditColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditColorActionPerformed
        button.editColor();
    }//GEN-LAST:event_btn_EditColorActionPerformed

    private void btn_ClearColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ClearColorFocusGained
        btn_ClearColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ClearColorFocusGained

    private void btn_ClearColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ClearColorFocusLost
        btn_ClearColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ClearColorFocusLost

    private void btn_ClearColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearColorMouseEntered
        btn_ClearColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ClearColorMouseEntered

    private void btn_ClearColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearColorMouseExited
        btn_ClearColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ClearColorMouseExited

    private void btn_ClearColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearColorActionPerformed
        button.clearColor();
    }//GEN-LAST:event_btn_ClearColorActionPerformed

    private void btn_CloseColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseColorFocusGained
        btn_CloseColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseColorFocusGained

    private void btn_CloseColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseColorFocusLost
        btn_CloseColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseColorFocusLost

    private void btn_CloseColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseColorMouseEntered
        btn_CloseColor.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseColorMouseEntered

    private void btn_CloseColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseColorMouseExited
        btn_CloseColor.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseColorMouseExited

    private void btn_CloseColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseColorActionPerformed
        if (btn_CloseColor.getText().equals("Close")){
            this.dispose();
        }
        else{
            btn_NewColor.setText("New");
            btn_CloseColor.setText("Close");
            txt_ColorCode.setText("");
            txt_ColorName.setText("");
            btn_EditColor.setEnabled(true);
            txt_ColorCode.setEnabled(false);
            txt_ColorName.setEnabled(false);
            lbl_ColorCode.setEnabled(false);
            lbl_ColorName.setEnabled(false);
            btn_ClearColor.setEnabled(false);
        }
    }//GEN-LAST:event_btn_CloseColorActionPerformed

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

    private void tbl_ColorListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ColorListMousePressed
        Inventory_ButtonFunctions.tableclicked(evt, tbl_ColorList);
    }//GEN-LAST:event_tbl_ColorListMousePressed

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
            java.util.logging.Logger.getLogger(Inventory_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_Color dialog = new Inventory_Color(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_ClearColor;
    protected static javax.swing.JButton btn_CloseColor;
    protected static javax.swing.JButton btn_EditColor;
    protected static javax.swing.JButton btn_NewColor;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_ColorCode;
    protected static javax.swing.JLabel lbl_ColorName;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_ColorList;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_ColorCode;
    protected static javax.swing.JTextField txt_ColorName;
    // End of variables declaration//GEN-END:variables
}
