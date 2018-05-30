package dialog_salesOrder;

import account_login.Account_LoginOld;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class SalesOrder_Edit extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    
    public SalesOrder_Edit(java.awt.Frame parent, boolean modal) {
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
        txt_EditAdminPassword = new javax.swing.JPasswordField();
        btn_EditConfirm = new javax.swing.JButton();
        btn_EditClose = new javax.swing.JButton();

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

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesOrderEdit.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jLabel152.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel152.setText("Password:");

        txt_EditAdminPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_EditAdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EditAdminPasswordActionPerformed(evt);
            }
        });

        btn_EditConfirm.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btn_EditConfirm.setText("Confirm");
        btn_EditConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_EditConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_EditConfirmFocusLost(evt);
            }
        });
        btn_EditConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditConfirmMouseExited(evt);
            }
        });
        btn_EditConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditConfirmActionPerformed(evt);
            }
        });

        btn_EditClose.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btn_EditClose.setText("Close");
        btn_EditClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_EditCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_EditCloseFocusLost(evt);
            }
        });
        btn_EditClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditCloseMouseExited(evt);
            }
        });
        btn_EditClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditCloseActionPerformed(evt);
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
                        .addComponent(txt_EditAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addComponent(btn_EditConfirm)
                        .addGap(0, 0, 0)
                        .addComponent(btn_EditClose)))
                .addGap(20, 20, 20))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EditAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_EditClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btn_EditConfirm.registerKeyboardAction(btn_EditConfirm.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_EditConfirm.registerKeyboardAction(btn_EditConfirm.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_EditClose.registerKeyboardAction(btn_EditClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_EditClose.registerKeyboardAction(btn_EditClose.getActionForKeyStroke(
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

    private void btn_EditConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditConfirmFocusGained
        btn_EditConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditConfirmFocusGained

    private void btn_EditConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditConfirmFocusLost
        btn_EditConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditConfirmFocusLost

    private void btn_EditConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditConfirmMouseEntered
        btn_EditConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditConfirmMouseEntered

    private void btn_EditConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditConfirmMouseExited
        btn_EditConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditConfirmMouseExited
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    
    static int successExUpdate = 0 ;
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
    private static int dbHandlerUpdates(String query)
    {
        int success = 1;
        try{
        createDB();
         successExUpdate = stmt.executeUpdate(query);
         
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops. Something went wrong. Please try again."
                   + "</font></center></html>", "Error Message", 0);
            System.exit(0);
        }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Account_LoginOld.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return success;
    }
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
    private void btn_EditConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditConfirmActionPerformed
        //NOTE: ITEM MUST BE SELECTED FIRST BEFORE EDITING
        if (txt_EditAdminPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Wrong Password try again.</font></center></html>", 
                    "Error Message", 0);
        }
        else{
            
            String pass = txt_EditAdminPassword.getText();
            boolean found = false;
            createDB();
            try {
                rs = stmt.executeQuery("SELECT password FROM systemaccount WHERE usertype=51");
                while(rs.next())
                {
                    if(decodeCaesar(rs.getObject("password").toString(), 5).equals(pass)) found = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Account_LoginOld.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(found)
                {
                    this.dispose();
                    button.editConfirm();
                }
                else JOptionPane.showMessageDialog(null, "Password not found");
        }
    }//GEN-LAST:event_btn_EditConfirmActionPerformed

    private void btn_EditCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditCloseFocusGained
        btn_EditClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditCloseFocusGained

    private void btn_EditCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_EditCloseFocusLost
        btn_EditClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditCloseFocusLost

    private void btn_EditCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCloseMouseEntered
        btn_EditClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_EditCloseMouseEntered

    private void btn_EditCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCloseMouseExited
        btn_EditClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_EditCloseMouseExited

    private void btn_EditCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_EditCloseActionPerformed

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

    private void txt_EditAdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EditAdminPasswordActionPerformed
        if (txt_EditAdminPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Wrong Password try again.</font></center></html>", 
                    "Error Message", 0);
        }
        else{
            
            String pass = txt_EditAdminPassword.getText();
            boolean found = false;
            createDB();
            try {
                rs = stmt.executeQuery("SELECT password FROM systemaccount");
                while(rs.next())
                {
                    if(decodeCaesar(rs.getObject("password").toString(), 5).equals(pass)) found = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Account_LoginOld.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(found)
                {
                    this.dispose();
                    button.editConfirm();
                }
                else JOptionPane.showMessageDialog(null, "Password not found");
        }
    }//GEN-LAST:event_txt_EditAdminPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SalesOrder_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_Edit dialog = new SalesOrder_Edit(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_EditClose;
    protected static javax.swing.JButton btn_EditConfirm;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    private javax.swing.JPanel jPanel1;
    protected static javax.swing.JPanel jPanel30;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    protected static javax.swing.JPasswordField txt_EditAdminPassword;
    // End of variables declaration//GEN-END:variables
}
