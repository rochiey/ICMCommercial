package dialog_inventory;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class Inventory_Stocks extends javax.swing.JDialog {

    Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    int xMouse, yMouse;
    
    public Inventory_Stocks(java.awt.Frame parent, boolean modal) {
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
        btn_InventoryStockSort = new javax.swing.JButton();
        btn_InventoryStockClose = new javax.swing.JButton();
        cbo_InventoryStocks = new javax.swing.JComboBox<>();
        jLabel152 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dealer's Credit Amount");
        setUndecorated(true);
        setResizable(false);

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventorySQty.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_InventoryStockSort.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_InventoryStockSort.setText("Sort");
        btn_InventoryStockSort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryStockSortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryStockSortFocusLost(evt);
            }
        });
        btn_InventoryStockSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryStockSortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryStockSortMouseExited(evt);
            }
        });
        btn_InventoryStockSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryStockSortActionPerformed(evt);
            }
        });

        btn_InventoryStockClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_InventoryStockClose.setText("Close");
        btn_InventoryStockClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryStockCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryStockCloseFocusLost(evt);
            }
        });
        btn_InventoryStockClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryStockCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryStockCloseMouseExited(evt);
            }
        });
        btn_InventoryStockClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryStockCloseActionPerformed(evt);
            }
        });

        cbo_InventoryStocks.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbo_InventoryStocks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High - Low", "Low - High" }));

        jLabel152.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel152.setText("Stocks Quantity:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel152)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_InventoryStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_InventoryStockSort, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_InventoryStockClose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(cbo_InventoryStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_InventoryStockClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_InventoryStockSort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btn_InventoryStockSort.registerKeyboardAction(btn_InventoryStockSort.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_InventoryStockSort.registerKeyboardAction(btn_InventoryStockSort.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_InventoryStockClose.registerKeyboardAction(btn_InventoryStockClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_InventoryStockClose.registerKeyboardAction(btn_InventoryStockClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 155, Short.MAX_VALUE)
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

    private void btn_InventoryStockSortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryStockSortFocusGained
        btn_InventoryStockSort.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryStockSortFocusGained

    private void btn_InventoryStockSortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryStockSortFocusLost
        btn_InventoryStockSort.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryStockSortFocusLost

    private void btn_InventoryStockSortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryStockSortMouseEntered
        btn_InventoryStockSort.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryStockSortMouseEntered

    private void btn_InventoryStockSortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryStockSortMouseExited
        btn_InventoryStockSort.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryStockSortMouseExited

    private void btn_InventoryStockSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryStockSortActionPerformed
        inventory.Inventory_ButtonFunctions.sortByStocks(cbo_InventoryStocks);
        this.dispose();
    }//GEN-LAST:event_btn_InventoryStockSortActionPerformed

    private void btn_InventoryStockCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryStockCloseFocusGained
        btn_InventoryStockClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryStockCloseFocusGained

    private void btn_InventoryStockCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryStockCloseFocusLost
        btn_InventoryStockClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryStockCloseFocusLost

    private void btn_InventoryStockCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryStockCloseMouseEntered
        btn_InventoryStockClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryStockCloseMouseEntered

    private void btn_InventoryStockCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryStockCloseMouseExited
        btn_InventoryStockClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryStockCloseMouseExited

    private void btn_InventoryStockCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryStockCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_InventoryStockCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory_Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inventory_Stocks dialog = new Inventory_Stocks(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_InventoryStockClose;
    protected static javax.swing.JButton btn_InventoryStockSort;
    protected static javax.swing.JComboBox<String> cbo_InventoryStocks;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
