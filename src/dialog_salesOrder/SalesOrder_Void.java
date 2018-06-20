package dialog_salesOrder;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import com.DB;

public class SalesOrder_Void extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    
    public SalesOrder_Void(java.awt.Frame parent, boolean modal) {
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
        jPanel30 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        txt_VoidAdminPassword = new javax.swing.JPasswordField();
        btn_VoidConfirm = new javax.swing.JButton();
        btn_VoidClose = new javax.swing.JButton();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesOrderVoid.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jLabel152.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel152.setText("Password:");

        txt_VoidAdminPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_VoidAdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_VoidAdminPasswordActionPerformed(evt);
            }
        });

        btn_VoidConfirm.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btn_VoidConfirm.setText("Confirm");
        btn_VoidConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_VoidConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_VoidConfirmFocusLost(evt);
            }
        });
        btn_VoidConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_VoidConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_VoidConfirmMouseExited(evt);
            }
        });
        btn_VoidConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoidConfirmActionPerformed(evt);
            }
        });

        btn_VoidClose.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btn_VoidClose.setText("Close");
        btn_VoidClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_VoidCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_VoidCloseFocusLost(evt);
            }
        });
        btn_VoidClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_VoidCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_VoidCloseMouseExited(evt);
            }
        });
        btn_VoidClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoidCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel152)
                        .addGap(7, 7, 7)
                        .addComponent(txt_VoidAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addComponent(btn_VoidConfirm)
                        .addGap(0, 0, 0)
                        .addComponent(btn_VoidClose)))
                .addGap(20, 20, 20))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_VoidAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_VoidClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VoidConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btn_VoidConfirm.registerKeyboardAction(btn_VoidConfirm.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_VoidConfirm.registerKeyboardAction(btn_VoidConfirm.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_VoidClose.registerKeyboardAction(btn_VoidClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_VoidClose.registerKeyboardAction(btn_VoidClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6))
    );

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_VoidConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_VoidConfirmFocusGained
        btn_VoidConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_VoidConfirmFocusGained

    private void btn_VoidConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_VoidConfirmFocusLost
        btn_VoidConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_VoidConfirmFocusLost

    private void btn_VoidConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VoidConfirmMouseEntered
        btn_VoidConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_VoidConfirmMouseEntered

    private void btn_VoidConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VoidConfirmMouseExited
        btn_VoidConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_VoidConfirmMouseExited
    
    private static String decodeCaesar(String enc, int offset) {
        return encodeCaesar(enc, 26-offset);
    }
    private static String encodeCaesar(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
    private void btn_VoidConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoidConfirmActionPerformed
        //NOTE: ITEM MUST BE SELECTED FIRST BEFORE REMOVING
        if ( txt_VoidAdminPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill-out the form and try again.</font></center></html>", 
                    "Error Message", 0);
        }
        else{
            
            String pass = txt_VoidAdminPassword.getText();
            boolean found = false;
            DB.createDB();
            try {
                DB.rs = DB.stmt.executeQuery("SELECT password FROM systemaccount WHERE usertype=51");
                while(DB.rs.next())
                {
                    if(decodeCaesar(DB.rs.getObject("password").toString(), 5).equals(pass)) found = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SalesOrder_Void.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(found)
                {
                    this.dispose();
                    button.voidConfirm();
                }
                else JOptionPane.showMessageDialog(null, "Password not found");
        }
    }//GEN-LAST:event_btn_VoidConfirmActionPerformed

    private void btn_VoidCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_VoidCloseFocusGained
        btn_VoidClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_VoidCloseFocusGained

    private void btn_VoidCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_VoidCloseFocusLost
        btn_VoidClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_VoidCloseFocusLost

    private void btn_VoidCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VoidCloseMouseEntered
        btn_VoidClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_VoidCloseMouseEntered

    private void btn_VoidCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VoidCloseMouseExited
        btn_VoidClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_VoidCloseMouseExited

    private void btn_VoidCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoidCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_VoidCloseActionPerformed

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

    private void txt_VoidAdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_VoidAdminPasswordActionPerformed
        if ( txt_VoidAdminPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill-out the form and try again.</font></center></html>", 
                    "Error Message", 0);
        }
        else{
            
            String pass = txt_VoidAdminPassword.getText();
            boolean found = false;
            DB.createDB();
            try {
                DB.rs = DB.stmt.executeQuery("SELECT password FROM systemaccount WHERE usertype=51");
                while(DB.rs.next())
                {
                    if(decodeCaesar(DB.rs.getObject("password").toString(), 5).equals(pass)) found = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SalesOrder_Void.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(found)
                {
                    this.dispose();
                    button.voidConfirm();
                }
                else JOptionPane.showMessageDialog(null, "Password not found");
        }
    }//GEN-LAST:event_txt_VoidAdminPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SalesOrder_Void.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Void.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Void.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Void.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_Void dialog = new SalesOrder_Void(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_VoidClose;
    protected static javax.swing.JButton btn_VoidConfirm;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    private javax.swing.JPanel jPanel1;
    protected static javax.swing.JPanel jPanel30;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    protected static javax.swing.JPasswordField txt_VoidAdminPassword;
    // End of variables declaration//GEN-END:variables
}
