package report.UserList;

import dialog_user.User_ButtonFunctions;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class UList_AccountType extends javax.swing.JDialog {

    User_ButtonFunctions button = new User_ButtonFunctions();
    int xMouse, yMouse;
    
    public UList_AccountType(java.awt.Frame parent, boolean modal) {
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
        btn_UserSort = new javax.swing.JButton();
        btn_UserClose = new javax.swing.JButton();
        cbo_UserType = new javax.swing.JComboBox<>();
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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 247, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_UserAType.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_UserSort.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_UserSort.setText("Sort");
        btn_UserSort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UserSortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UserSortFocusLost(evt);
            }
        });
        btn_UserSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserSortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserSortMouseExited(evt);
            }
        });
        btn_UserSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserSortActionPerformed(evt);
            }
        });

        btn_UserClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_UserClose.setText("Close");
        btn_UserClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UserCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UserCloseFocusLost(evt);
            }
        });
        btn_UserClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserCloseMouseExited(evt);
            }
        });
        btn_UserClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserCloseActionPerformed(evt);
            }
        });

        cbo_UserType.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbo_UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        jLabel152.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel152.setText("Account Type:");

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
                        .addComponent(cbo_UserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btn_UserSort, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_UserClose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(cbo_UserType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_UserClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UserSort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btn_UserSort.registerKeyboardAction(btn_UserSort.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_UserSort.registerKeyboardAction(btn_UserSort.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UserClose.registerKeyboardAction(btn_UserClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UserClose.registerKeyboardAction(btn_UserClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 154, Short.MAX_VALUE)
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

    private void btn_UserSortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserSortFocusGained
        btn_UserSort.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserSortFocusGained

    private void btn_UserSortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserSortFocusLost
        btn_UserSort.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserSortFocusLost

    private void btn_UserSortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserSortMouseEntered
        btn_UserSort.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserSortMouseEntered

    private void btn_UserSortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserSortMouseExited
        btn_UserSort.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserSortMouseExited

    private void btn_UserSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserSortActionPerformed
        //user.User_ButtonFunctions.sortByUserType(cbo_UserType);
        //this.dispose();
    }//GEN-LAST:event_btn_UserSortActionPerformed

    private void btn_UserCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserCloseFocusGained
        btn_UserClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserCloseFocusGained

    private void btn_UserCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserCloseFocusLost
        btn_UserClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserCloseFocusLost

    private void btn_UserCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserCloseMouseEntered
        btn_UserClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserCloseMouseEntered

    private void btn_UserCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserCloseMouseExited
        btn_UserClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserCloseMouseExited

    private void btn_UserCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_UserCloseActionPerformed

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
            java.util.logging.Logger.getLogger(UList_AccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UList_AccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UList_AccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UList_AccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UList_AccountType dialog = new UList_AccountType(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_UserClose;
    protected static javax.swing.JButton btn_UserSort;
    protected static javax.swing.JComboBox<String> cbo_UserType;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
