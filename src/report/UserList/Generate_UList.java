package report.UserList;

import dialog_dealer.Dealer_ButtonFunctions;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class Generate_UList extends javax.swing.JDialog {
    
    UList_ButtonFunctions button = new UList_ButtonFunctions();
    int xMouse, yMouse;
    
    public Generate_UList(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
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
        btn_GenerateDList = new javax.swing.JButton();
        btn_CloseDList = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_FromDList = new javax.swing.JLabel();
        date_DListFrom = new org.jdesktop.swingx.JXDatePicker();
        lbl_ToDList = new javax.swing.JLabel();
        date_DListTo = new org.jdesktop.swingx.JXDatePicker();
        radio_AllDList = new javax.swing.JRadioButton();
        radio_DRegisterDList = new javax.swing.JRadioButton();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_UList.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_GenerateDList.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_GenerateDList.setText("Generate");
        btn_GenerateDList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_GenerateDListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_GenerateDListFocusLost(evt);
            }
        });
        btn_GenerateDList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GenerateDListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GenerateDListMouseExited(evt);
            }
        });
        btn_GenerateDList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerateDListActionPerformed(evt);
            }
        });

        btn_CloseDList.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CloseDList.setText("Close");
        btn_CloseDList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CloseDListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CloseDListFocusLost(evt);
            }
        });
        btn_CloseDList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseDListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseDListMouseExited(evt);
            }
        });
        btn_CloseDList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseDListActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_FromDList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_FromDList.setText("From:");
        lbl_FromDList.setEnabled(false);

        date_DListFrom.setEnabled(false);
        date_DListFrom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbl_ToDList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_ToDList.setText("To:");
        lbl_ToDList.setEnabled(false);

        date_DListTo.setEnabled(false);
        date_DListTo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        radioBtnGroup.add(radio_AllDList);
        radio_AllDList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_AllDList.setSelected(true);
        radio_AllDList.setText("All");
        radio_AllDList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_AllDListActionPerformed(evt);
            }
        });

        radioBtnGroup.add(radio_DRegisterDList);
        radio_DRegisterDList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_DRegisterDList.setText("Date Registered:");
        radio_DRegisterDList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_DRegisterDListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_AllDList)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_ToDList)
                                .addComponent(lbl_FromDList))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(date_DListFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_DListTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(radio_DRegisterDList)
                            .addGap(91, 91, 91))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio_AllDList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_DRegisterDList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FromDList)
                    .addComponent(date_DListFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_DListTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ToDList))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date_DListFrom, date_DListTo});

        date_DListFrom.setFormats("yyyy-MM-dd");
        Date inventoryExFrom = new Date();
        date_DListFrom.setDate(inventoryExFrom);
        date_DListTo.setFormats("yyyy-MM-dd");
        Date inventoryExTo = new Date();
        date_DListTo.setDate(inventoryExTo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btn_GenerateDList)
                .addGap(0, 0, 0)
                .addComponent(btn_CloseDList, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_CloseDList, btn_GenerateDList});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CloseDList, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_GenerateDList, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btn_GenerateDList.registerKeyboardAction(btn_GenerateDList.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_GenerateDList.registerKeyboardAction(btn_GenerateDList.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_CloseDList.registerKeyboardAction(btn_CloseDList.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CloseDList.registerKeyboardAction(btn_CloseDList.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_GenerateDListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateDListFocusGained
        btn_GenerateDList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateDListFocusGained

    private void btn_GenerateDListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateDListFocusLost
        btn_GenerateDList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateDListFocusLost

    private void btn_GenerateDListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateDListMouseEntered
        btn_GenerateDList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateDListMouseEntered

    private void btn_GenerateDListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateDListMouseExited
        btn_GenerateDList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateDListMouseExited

    private void btn_GenerateDListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateDListActionPerformed
        this.dispose();
        button.generateUserList();
    }//GEN-LAST:event_btn_GenerateDListActionPerformed

    private void btn_CloseDListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseDListFocusGained
        btn_CloseDList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseDListFocusGained

    private void btn_CloseDListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseDListFocusLost
        btn_CloseDList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseDListFocusLost

    private void btn_CloseDListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseDListMouseEntered
        btn_CloseDList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseDListMouseEntered

    private void btn_CloseDListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseDListMouseExited
        btn_CloseDList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseDListMouseExited

    private void btn_CloseDListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseDListActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CloseDListActionPerformed

    private void radio_AllDListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_AllDListActionPerformed
        button.radioAllSelected();
    }//GEN-LAST:event_radio_AllDListActionPerformed

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

    private void radio_DRegisterDListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_DRegisterDListActionPerformed
        button.radioDateRegistered();
    }//GEN-LAST:event_radio_DRegisterDListActionPerformed

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
            java.util.logging.Logger.getLogger(Generate_UList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generate_UList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generate_UList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generate_UList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                Generate_UList dialog = new Generate_UList(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_CloseDList;
    protected static javax.swing.JButton btn_GenerateDList;
    protected static org.jdesktop.swingx.JXDatePicker date_DListFrom;
    protected static org.jdesktop.swingx.JXDatePicker date_DListTo;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    protected static javax.swing.JLabel lbl_FromDList;
    protected static javax.swing.JLabel lbl_ToDList;
    private javax.swing.JLabel logo;
    private javax.swing.ButtonGroup radioBtnGroup;
    protected static javax.swing.JRadioButton radio_AllDList;
    protected static javax.swing.JRadioButton radio_DRegisterDList;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
