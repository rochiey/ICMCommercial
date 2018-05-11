package dialog_salesOrder;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class SalesOrder_CreditAmount extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    
    public SalesOrder_CreditAmount(java.awt.Frame parent, boolean modal) {
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
        btn_CAmountSort = new javax.swing.JButton();
        btn_CAmountClose = new javax.swing.JButton();
        cbo_CAmount = new javax.swing.JComboBox<>();
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

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesOrderCAmount.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_CAmountSort.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CAmountSort.setText("Sort");
        btn_CAmountSort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CAmountSortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CAmountSortFocusLost(evt);
            }
        });
        btn_CAmountSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CAmountSortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CAmountSortMouseExited(evt);
            }
        });
        btn_CAmountSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CAmountSortActionPerformed(evt);
            }
        });

        btn_CAmountClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CAmountClose.setText("Close");
        btn_CAmountClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CAmountCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CAmountCloseFocusLost(evt);
            }
        });
        btn_CAmountClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CAmountCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CAmountCloseMouseExited(evt);
            }
        });
        btn_CAmountClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CAmountCloseActionPerformed(evt);
            }
        });

        cbo_CAmount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbo_CAmount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        jLabel152.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel152.setText("Credit Amount:");

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
                        .addComponent(cbo_CAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_CAmountSort, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_CAmountClose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(cbo_CAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CAmountClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CAmountSort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btn_CAmountSort.registerKeyboardAction(btn_CAmountSort.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_CAmountSort.registerKeyboardAction(btn_CAmountSort.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_CAmountClose.registerKeyboardAction(btn_CAmountClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CAmountClose.registerKeyboardAction(btn_CAmountClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_CAmountSortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CAmountSortFocusGained
        btn_CAmountSort.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CAmountSortFocusGained

    private void btn_CAmountSortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CAmountSortFocusLost
        btn_CAmountSort.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CAmountSortFocusLost

    private void btn_CAmountSortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CAmountSortMouseEntered
        btn_CAmountSort.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CAmountSortMouseEntered

    private void btn_CAmountSortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CAmountSortMouseExited
        btn_CAmountSort.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CAmountSortMouseExited

    private void btn_CAmountSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CAmountSortActionPerformed
        button.creditAmountSort(cbo_CAmount);
        this.dispose();
    }//GEN-LAST:event_btn_CAmountSortActionPerformed

    private void btn_CAmountCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CAmountCloseFocusGained
        btn_CAmountClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CAmountCloseFocusGained

    private void btn_CAmountCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CAmountCloseFocusLost
        btn_CAmountClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CAmountCloseFocusLost

    private void btn_CAmountCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CAmountCloseMouseEntered
        btn_CAmountClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CAmountCloseMouseEntered

    private void btn_CAmountCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CAmountCloseMouseExited
        btn_CAmountClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CAmountCloseMouseExited

    private void btn_CAmountCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CAmountCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CAmountCloseActionPerformed

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
            java.util.logging.Logger.getLogger(SalesOrder_CreditAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_CreditAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_CreditAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_CreditAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_CreditAmount dialog = new SalesOrder_CreditAmount(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_CAmountClose;
    protected static javax.swing.JButton btn_CAmountSort;
    protected static javax.swing.JComboBox<String> cbo_CAmount;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
