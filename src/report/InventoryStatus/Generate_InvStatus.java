package report.InventoryStatus;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class Generate_InvStatus extends javax.swing.JDialog {
    
    InvStatus_ButtonFunctions button = new InvStatus_ButtonFunctions();
    int xMouse, yMouse;
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    
    public Generate_InvStatus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        generateCompany();
        initComponents();
    }
    public static void createDB()
    {
        rs = null;
        stmt = null;
        conn = null;
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
    static int successEx = 0;
    private static void dbHandlerUpdates(String query)
    {
        
        try{
        DB.createDB();
         successEx = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:code:sql command()"
                   + "</font></center></html>", "Error Message", 0);
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Generate_InvStatus.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>error: session: sql commands"
                   + "</font></center></html>", "Error Message", 0);
            }
        }
    }
    static Vector vecsupplier = new Vector();
    private static void generateCompany()
    {
        DB.createDB();
        vecsupplier.add("ALL");
        try {
            rs = stmt.executeQuery("SELECT supplier_name FROM supplier");
            while(rs.next())
            {
                vecsupplier.add(rs.getObject("supplier_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Generate_InvStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioBtnGroup = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_GenerateInvStatus = new javax.swing.JButton();
        btn_CloseInvStatus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        radio_EProducts = new javax.swing.JRadioButton();
        radio_LSProducts = new javax.swing.JRadioButton();
        radio_NEProducts = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cbo_GenInvCompany = new javax.swing.JComboBox<String>(vecsupplier);

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_GenerateInvStatus.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_GenerateInvStatus.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_GenerateInvStatus.setText("Generate");
        btn_GenerateInvStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_GenerateInvStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_GenerateInvStatusFocusLost(evt);
            }
        });
        btn_GenerateInvStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GenerateInvStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GenerateInvStatusMouseExited(evt);
            }
        });
        btn_GenerateInvStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerateInvStatusActionPerformed(evt);
            }
        });

        btn_CloseInvStatus.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CloseInvStatus.setText("Close");
        btn_CloseInvStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CloseInvStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CloseInvStatusFocusLost(evt);
            }
        });
        btn_CloseInvStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseInvStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseInvStatusMouseExited(evt);
            }
        });
        btn_CloseInvStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseInvStatusActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Select Inventory Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 15))); // NOI18N

        radioBtnGroup.add(radio_EProducts);
        radio_EProducts.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_EProducts.setText("Expired Products");
        radio_EProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_EProductsActionPerformed(evt);
            }
        });

        radioBtnGroup.add(radio_LSProducts);
        radio_LSProducts.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_LSProducts.setSelected(true);
        radio_LSProducts.setText("Low Stock Products");
        radio_LSProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_LSProductsActionPerformed(evt);
            }
        });

        radioBtnGroup.add(radio_NEProducts);
        radio_NEProducts.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_NEProducts.setText("Nearly Expire Products");
        radio_NEProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_NEProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_LSProducts)
                    .addComponent(radio_NEProducts)
                    .addComponent(radio_EProducts))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio_LSProducts)
                .addGap(15, 15, 15)
                .addComponent(radio_NEProducts)
                .addGap(15, 15, 15)
                .addComponent(radio_EProducts)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Select Company", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 15))); // NOI18N

        cbo_GenInvCompany.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_GenInvCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_GenInvCompanyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(cbo_GenInvCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_GenInvCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(btn_GenerateInvStatus)
                .addGap(0, 0, 0)
                .addComponent(btn_CloseInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_CloseInvStatus, btn_GenerateInvStatus});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CloseInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_GenerateInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        btn_GenerateInvStatus.registerKeyboardAction(btn_GenerateInvStatus.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_GenerateInvStatus.registerKeyboardAction(btn_GenerateInvStatus.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_CloseInvStatus.registerKeyboardAction(btn_CloseInvStatus.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CloseInvStatus.registerKeyboardAction(btn_CloseInvStatus.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_GenerateInvStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateInvStatusFocusGained
        btn_GenerateInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateInvStatusFocusGained

    private void btn_GenerateInvStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateInvStatusFocusLost
        btn_GenerateInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateInvStatusFocusLost

    private void btn_GenerateInvStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateInvStatusMouseEntered
        btn_GenerateInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateInvStatusMouseEntered

    private void btn_GenerateInvStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateInvStatusMouseExited
        btn_GenerateInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateInvStatusMouseExited

    private void btn_GenerateInvStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateInvStatusActionPerformed
        this.dispose();
        button.generateInvStatus();
    }//GEN-LAST:event_btn_GenerateInvStatusActionPerformed

    private void btn_CloseInvStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseInvStatusFocusGained
        btn_CloseInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseInvStatusFocusGained

    private void btn_CloseInvStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseInvStatusFocusLost
        btn_CloseInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseInvStatusFocusLost

    private void btn_CloseInvStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseInvStatusMouseEntered
        btn_CloseInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseInvStatusMouseEntered

    private void btn_CloseInvStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseInvStatusMouseExited
        btn_CloseInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseInvStatusMouseExited

    private void btn_CloseInvStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseInvStatusActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CloseInvStatusActionPerformed

    private void radio_LSProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_LSProductsActionPerformed
        //button.radioAllSelected();
    }//GEN-LAST:event_radio_LSProductsActionPerformed

    private void radio_EProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_EProductsActionPerformed
        //button.radioCustomerSelected();
    }//GEN-LAST:event_radio_EProductsActionPerformed

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

    private void radio_NEProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_NEProductsActionPerformed
        //button.radioDateRegistered();
    }//GEN-LAST:event_radio_NEProductsActionPerformed

    private void cbo_GenInvCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_GenInvCompanyActionPerformed
        //DISPLAY LIST OF ALL COMPANIES WITH ALL AS THE DEFAULT SELECTED INDEX
        /*if(!cbo_GenInvCompany.getSelectedItem().equals("All")){
            DatabaseLinker.updateTable(tbl_InventoryList, sqlquery+" AND supplier_name ='"+cbo_GenInvCompany.getSelectedItem().toString()+"'");
            setJTable();
        }
        else updateTable();*/
    }//GEN-LAST:event_cbo_GenInvCompanyActionPerformed

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
            java.util.logging.Logger.getLogger(Generate_InvStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generate_InvStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generate_InvStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generate_InvStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Generate_InvStatus dialog = new Generate_InvStatus(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_CloseInvStatus;
    protected static javax.swing.JButton btn_GenerateInvStatus;
    protected static javax.swing.JComboBox<String> cbo_GenInvCompany;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.ButtonGroup radioBtnGroup;
    protected static javax.swing.JRadioButton radio_EProducts;
    protected static javax.swing.JRadioButton radio_LSProducts;
    protected static javax.swing.JRadioButton radio_NEProducts;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
