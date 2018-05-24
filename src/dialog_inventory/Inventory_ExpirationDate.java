package dialog_inventory;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class Inventory_ExpirationDate extends javax.swing.JDialog {

    Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    
    public Inventory_ExpirationDate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        date_InventoryExDateTo = new org.jdesktop.swingx.JXDatePicker();
        jLabel153 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        date_InventoryExDateFrom = new org.jdesktop.swingx.JXDatePicker();
        btnPanel = new javax.swing.JPanel();
        btn_InventoryExClose = new javax.swing.JButton();
        btn_InventoryExSort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dealer's Credit Amount");
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(65, 105, 225));
        background.setMinimumSize(new java.awt.Dimension(350, 390));
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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryEDate.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        date_InventoryExDateTo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel153.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel153.setText("To:");

        jLabel152.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel152.setText("From:");

        date_InventoryExDateFrom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnPanel.setBackground(new java.awt.Color(255, 255, 255));

        btn_InventoryExClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_InventoryExClose.setText("Close");
        btn_InventoryExClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryExCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryExCloseFocusLost(evt);
            }
        });
        btn_InventoryExClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryExCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryExCloseMouseExited(evt);
            }
        });
        btn_InventoryExClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryExCloseActionPerformed(evt);
            }
        });

        btn_InventoryExSort.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_InventoryExSort.setText("Sort");
        btn_InventoryExSort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryExSortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryExSortFocusLost(evt);
            }
        });
        btn_InventoryExSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryExSortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryExSortMouseExited(evt);
            }
        });
        btn_InventoryExSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryExSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_InventoryExSort, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_InventoryExClose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_InventoryExClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_InventoryExSort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        btn_InventoryExClose.registerKeyboardAction(btn_InventoryExClose.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_InventoryExClose.registerKeyboardAction(btn_InventoryExClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_InventoryExSort.registerKeyboardAction(btn_InventoryExSort.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_InventoryExSort.registerKeyboardAction(btn_InventoryExSort.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel153)
                        .addComponent(jLabel152))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(date_InventoryExDateTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date_InventoryExDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(14, 14, 14))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel152)
                .addComponent(date_InventoryExDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(date_InventoryExDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel153))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date_InventoryExDateFrom, date_InventoryExDateTo});

    date_InventoryExDateTo.setFormats("yyyy-MM-dd");
    Date inventoryExTo = new Date();
    date_InventoryExDateTo.setDate(inventoryExTo);
    date_InventoryExDateFrom.setFormats("yyyy-MM-dd");
    Date inventoryExFrom = new Date();
    date_InventoryExDateFrom.setDate(inventoryExFrom);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_InventoryExSortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryExSortFocusGained
        btn_InventoryExSort.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryExSortFocusGained

    private void btn_InventoryExSortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryExSortFocusLost
        btn_InventoryExSort.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryExSortFocusLost

    private void btn_InventoryExSortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryExSortMouseEntered
        btn_InventoryExSort.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryExSortMouseEntered

    private void btn_InventoryExSortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryExSortMouseExited
        btn_InventoryExSort.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryExSortMouseExited

    private void btn_InventoryExSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryExSortActionPerformed
        inventory.Inventory_ButtonFunctions.sortExpDate(date_InventoryExDateFrom.getEditor().getText(), date_InventoryExDateTo.getEditor().getText());
        this.dispose();
    }//GEN-LAST:event_btn_InventoryExSortActionPerformed

    private void btn_InventoryExCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryExCloseFocusGained
        btn_InventoryExClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryExCloseFocusGained

    private void btn_InventoryExCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryExCloseFocusLost
        btn_InventoryExClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryExCloseFocusLost

    private void btn_InventoryExCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryExCloseMouseEntered
        btn_InventoryExClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryExCloseMouseEntered

    private void btn_InventoryExCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryExCloseMouseExited
        btn_InventoryExClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryExCloseMouseExited

    private void btn_InventoryExCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryExCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_InventoryExCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory_ExpirationDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_ExpirationDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_ExpirationDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_ExpirationDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_ExpirationDate dialog = new Inventory_ExpirationDate(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel btnPanel;
    protected static javax.swing.JButton btn_InventoryExClose;
    protected static javax.swing.JButton btn_InventoryExSort;
    protected static org.jdesktop.swingx.JXDatePicker date_InventoryExDateFrom;
    protected static org.jdesktop.swingx.JXDatePicker date_InventoryExDateTo;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    protected static javax.swing.JLabel jLabel153;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
