package account_login;

import com.Session;
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

public class Account_Login extends javax.swing.JDialog {

    int xMouse, yMouse;
    
    public Account_Login(java.awt.Frame parent, boolean modal) {
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
        jLabel151 = new javax.swing.JLabel();
        txt_VoidAdminUsername = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        txt_VoidAdminPassword = new javax.swing.JPasswordField();
        btn_VoidConfirm = new javax.swing.JButton();
        btn_VoidClose = new javax.swing.JButton();
        admin = new javax.swing.JLabel();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_Login.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jLabel151.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel151.setText("Username:");

        txt_VoidAdminUsername.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_VoidAdminUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel152.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel152.setText("Password:");

        txt_VoidAdminPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_VoidAdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_VoidAdminPasswordActionPerformed(evt);
            }
        });

        btn_VoidConfirm.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btn_VoidConfirm.setText("Login");
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
        btn_VoidClose.setText("Exit");
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
                .addGap(0, 0, 0)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel152)
                            .addComponent(jLabel151))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_VoidAdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txt_VoidAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addComponent(btn_VoidConfirm)
                        .addGap(0, 0, 0)
                        .addComponent(btn_VoidClose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_VoidClose, btn_VoidConfirm});

        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_VoidAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_VoidAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_VoidClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VoidConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel30Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_VoidClose, btn_VoidConfirm});

        jPanel30Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_VoidAdminPassword, txt_VoidAdminUsername});

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

    admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_Login.png"))); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(admin))
            .addGap(23, 23, 23))
    );

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Account_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return success;
    }
    private void btn_VoidConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoidConfirmActionPerformed
        String user = txt_VoidAdminUsername.getText();
        String pass = txt_VoidAdminPassword.getText();
        boolean found = false;
        createDB();
        try {
            rs=stmt.executeQuery("SELECT username FROM systemaccount");
            while(rs.next())
            {
                if(rs.getObject("username").equals(user)) found = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(found)
        {
            int usertype=0;
            boolean passFound= false;
            createDB();
            try {
                rs = stmt.executeQuery("SELECT password,usertype FROM systemaccount");
                while(rs.next())
                {
                    if(decodeCaesar(rs.getObject("password").toString(), 5).equals(pass)) passFound = true;
                    usertype = rs.getInt("usertype");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Account_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(passFound)
            {
                Session.indicateSession(txt_VoidAdminUsername.getText());
                this.dispose();
            }
            else JOptionPane.showMessageDialog(null, "Password not found");
        }else JOptionPane.showMessageDialog(null, "Username not found");
        
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
        System.exit(0);
    }//GEN-LAST:event_btn_VoidCloseActionPerformed

    private void txt_VoidAdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_VoidAdminPasswordActionPerformed
        btn_VoidConfirmActionPerformed(evt);
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
            java.util.logging.Logger.getLogger(Account_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Account_Login dialog = new Account_Login(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel admin;
    private javax.swing.JPanel background;
    protected static javax.swing.JButton btn_VoidClose;
    protected static javax.swing.JButton btn_VoidConfirm;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel151;
    protected static javax.swing.JLabel jLabel152;
    private javax.swing.JPanel jPanel1;
    protected static javax.swing.JPanel jPanel30;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    protected static javax.swing.JPasswordField txt_VoidAdminPassword;
    protected static javax.swing.JTextField txt_VoidAdminUsername;
    // End of variables declaration//GEN-END:variables
}
