package report.InventoryTrans;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import report.InventoryTrans.InvTransactions_ButtonFunctions;

public class Inv_TransactDate extends javax.swing.JDialog {

    int xMouse, yMouse;
    InvTransactions_ButtonFunctions button = new InvTransactions_ButtonFunctions();
    public Inv_TransactDate(java.awt.Frame parent, boolean modal) {
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
        btn_InvTransClose = new javax.swing.JButton();
        btn_InvTransGenerate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        date_InvTranstFrom = new org.jdesktop.swingx.JXDatePicker();
        date_InvTransTo = new org.jdesktop.swingx.JXDatePicker();
        jLabel153 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_InventoryTrans.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_InvTransClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_InvTransClose.setText("Close");
        btn_InvTransClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InvTransCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InvTransCloseFocusLost(evt);
            }
        });
        btn_InvTransClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InvTransCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InvTransCloseMouseExited(evt);
            }
        });
        btn_InvTransClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InvTransCloseActionPerformed(evt);
            }
        });

        btn_InvTransGenerate.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_InvTransGenerate.setText("Generate");
        btn_InvTransGenerate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InvTransGenerateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InvTransGenerateFocusLost(evt);
            }
        });
        btn_InvTransGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InvTransGenerateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InvTransGenerateMouseExited(evt);
            }
        });
        btn_InvTransGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InvTransGenerateActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        date_InvTranstFrom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        date_InvTransTo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel153.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel153.setText("To:");

        jLabel152.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel152.setText("From:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel153)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date_InvTransTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_InvTranstFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(date_InvTranstFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_InvTransTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel153))
                .addGap(15, 15, 15))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date_InvTransTo, date_InvTranstFrom});

        date_InvTranstFrom.setFormats("yyyy-MM-dd");
        Date inventoryExFrom = new Date();
        date_InvTranstFrom.setDate(inventoryExFrom);
        date_InvTransTo.setFormats("yyyy-MM-dd");
        Date inventoryExTo = new Date();
        date_InvTransTo.setDate(inventoryExTo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btn_InvTransGenerate)
                .addGap(0, 0, 0)
                .addComponent(btn_InvTransClose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_InvTransClose, btn_InvTransGenerate});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_InvTransClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_InvTransGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        btn_InvTransClose.registerKeyboardAction(btn_InvTransClose.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_InvTransClose.registerKeyboardAction(btn_InvTransClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_InvTransGenerate.registerKeyboardAction(btn_InvTransGenerate.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_InvTransGenerate.registerKeyboardAction(btn_InvTransGenerate.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_InvTransGenerateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InvTransGenerateFocusGained
        btn_InvTransGenerate.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InvTransGenerateFocusGained

    private void btn_InvTransGenerateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InvTransGenerateFocusLost
        btn_InvTransGenerate.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InvTransGenerateFocusLost

    private void btn_InvTransGenerateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InvTransGenerateMouseEntered
        btn_InvTransGenerate.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InvTransGenerateMouseEntered

    private void btn_InvTransGenerateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InvTransGenerateMouseExited
        btn_InvTransGenerate.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InvTransGenerateMouseExited

    private void btn_InvTransGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InvTransGenerateActionPerformed
        this.dispose();
        button.generateInvTrans();
    }//GEN-LAST:event_btn_InvTransGenerateActionPerformed

    private void btn_InvTransCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InvTransCloseFocusGained
        btn_InvTransClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InvTransCloseFocusGained

    private void btn_InvTransCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InvTransCloseFocusLost
        btn_InvTransClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InvTransCloseFocusLost

    private void btn_InvTransCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InvTransCloseMouseEntered
        btn_InvTransClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InvTransCloseMouseEntered

    private void btn_InvTransCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InvTransCloseMouseExited
        btn_InvTransClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InvTransCloseMouseExited

    private void btn_InvTransCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InvTransCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_InvTransCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Inv_TransactDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inv_TransactDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inv_TransactDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inv_TransactDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inv_TransactDate dialog = new Inv_TransactDate(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_InvTransClose;
    protected static javax.swing.JButton btn_InvTransGenerate;
    protected static org.jdesktop.swingx.JXDatePicker date_InvTransTo;
    protected static org.jdesktop.swingx.JXDatePicker date_InvTranstFrom;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    protected static javax.swing.JLabel jLabel153;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
