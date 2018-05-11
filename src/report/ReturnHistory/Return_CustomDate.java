package report.ReturnHistory;

import dialog_dealer.Dealer_ButtonFunctions;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class Return_CustomDate extends javax.swing.JDialog {
    
    Return_ButtonFunctions button = new Return_ButtonFunctions();
    int xMouse, yMouse;
    
    public Return_CustomDate(java.awt.Frame parent, boolean modal) {
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
        btn_GenerateReturn = new javax.swing.JButton();
        btn_ReturnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        radio_customer = new javax.swing.JRadioButton();
        date_ReturnFrom = new org.jdesktop.swingx.JXDatePicker();
        cbo_ReturnCType = new javax.swing.JComboBox<String>();
        jLabel153 = new javax.swing.JLabel();
        date_ReturnTo = new org.jdesktop.swingx.JXDatePicker();
        lblCustomer = new javax.swing.JLabel();
        radio_All = new javax.swing.JRadioButton();
        txt_ReturnCustName = new javax.swing.JTextField();
        btn_ReturnCName = new javax.swing.JButton();

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

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_ReturnHistory.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_GenerateReturn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_GenerateReturn.setText("Generate");
        btn_GenerateReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_GenerateReturnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_GenerateReturnFocusLost(evt);
            }
        });
        btn_GenerateReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GenerateReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GenerateReturnMouseExited(evt);
            }
        });
        btn_GenerateReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerateReturnActionPerformed(evt);
            }
        });

        btn_ReturnClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ReturnClose.setText("Close");
        btn_ReturnClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnCloseFocusLost(evt);
            }
        });
        btn_ReturnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnCloseMouseExited(evt);
            }
        });
        btn_ReturnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnCloseActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel152.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel152.setText("From:");

        radioBtnGroup.add(radio_customer);
        radio_customer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_customer.setText("By Customer:");
        radio_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_customerActionPerformed(evt);
            }
        });

        date_ReturnFrom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cbo_ReturnCType.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_ReturnCType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dealer", "Walk-in" }));
        cbo_ReturnCType.setEnabled(false);
        cbo_ReturnCType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ReturnCTypeActionPerformed(evt);
            }
        });

        jLabel153.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel153.setText("To:");

        date_ReturnTo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblCustomer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCustomer.setText("Dealer Name/ID:");
        lblCustomer.setEnabled(false);

        radioBtnGroup.add(radio_All);
        radio_All.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_All.setSelected(true);
        radio_All.setText("All");
        radio_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_AllActionPerformed(evt);
            }
        });

        txt_ReturnCustName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ReturnCustName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ReturnCustName.setEnabled(false);

        btn_ReturnCName.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_ReturnCName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Dealer New View.png"))); // NOI18N
        btn_ReturnCName.setEnabled(false);
        btn_ReturnCName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnCNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnCNameFocusLost(evt);
            }
        });
        btn_ReturnCName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnCNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnCNameMouseExited(evt);
            }
        });
        btn_ReturnCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnCNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radio_customer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_ReturnCType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radio_All)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel153)
                            .addComponent(jLabel152))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_ReturnFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_ReturnTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomer)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_ReturnCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_ReturnCName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(date_ReturnFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_ReturnTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel153))
                .addGap(18, 18, 18)
                .addComponent(radio_All)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_customer)
                    .addComponent(cbo_ReturnCType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ReturnCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ReturnCName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date_ReturnFrom, date_ReturnTo});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_ReturnCName, txt_ReturnCustName});

        date_ReturnFrom.setFormats("yyyy-MM-dd");
        Date inventoryExFrom = new Date();
        date_ReturnFrom.setDate(inventoryExFrom);
        date_ReturnTo.setFormats("yyyy-MM-dd");
        Date inventoryExTo = new Date();
        date_ReturnTo.setDate(inventoryExTo);
        btn_ReturnCName.registerKeyboardAction(btn_ReturnCName.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_ReturnCName.registerKeyboardAction(btn_ReturnCName.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(btn_GenerateReturn)
            .addGap(0, 0, 0)
            .addComponent(btn_ReturnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_GenerateReturn, btn_ReturnClose});

    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ReturnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GenerateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(6, 6, 6))
    );

    btn_GenerateReturn.registerKeyboardAction(btn_GenerateReturn.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_GenerateReturn.registerKeyboardAction(btn_GenerateReturn.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_ReturnClose.registerKeyboardAction(btn_ReturnClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_ReturnClose.registerKeyboardAction(btn_ReturnClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_GenerateReturnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateReturnFocusGained
        btn_GenerateReturn.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateReturnFocusGained

    private void btn_GenerateReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateReturnFocusLost
        btn_GenerateReturn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateReturnFocusLost

    private void btn_GenerateReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateReturnMouseEntered
        btn_GenerateReturn.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateReturnMouseEntered

    private void btn_GenerateReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateReturnMouseExited
        btn_GenerateReturn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateReturnMouseExited

    private void btn_GenerateReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateReturnActionPerformed
        this.dispose();
        button.generateReturn();
    }//GEN-LAST:event_btn_GenerateReturnActionPerformed

    private void btn_ReturnCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnCloseFocusGained
        btn_ReturnClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnCloseFocusGained

    private void btn_ReturnCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnCloseFocusLost
        btn_ReturnClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnCloseFocusLost

    private void btn_ReturnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnCloseMouseEntered
        btn_ReturnClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnCloseMouseEntered

    private void btn_ReturnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnCloseMouseExited
        btn_ReturnClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnCloseMouseExited

    private void btn_ReturnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ReturnCloseActionPerformed

    private void btn_ReturnCNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnCNameFocusGained
        btn_ReturnCName.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnCNameFocusGained

    private void btn_ReturnCNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnCNameFocusLost
        btn_ReturnCName.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnCNameFocusLost

    private void btn_ReturnCNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnCNameMouseEntered
        btn_ReturnCName.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnCNameMouseEntered

    private void btn_ReturnCNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnCNameMouseExited
        btn_ReturnCName.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnCNameMouseExited

    private void btn_ReturnCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnCNameActionPerformed
        Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
        dialog_dealer.Dealer_ViewAccount.flag=5;
        button.dealerViewAccount();
    }//GEN-LAST:event_btn_ReturnCNameActionPerformed

    private void radio_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_AllActionPerformed
        button.radioAllSelected();
    }//GEN-LAST:event_radio_AllActionPerformed

    private void radio_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_customerActionPerformed
        button.radioCustomerSelected();
    }//GEN-LAST:event_radio_customerActionPerformed

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

    private void cbo_ReturnCTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ReturnCTypeActionPerformed
        button.customerType();
    }//GEN-LAST:event_cbo_ReturnCTypeActionPerformed

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
            java.util.logging.Logger.getLogger(Return_CustomDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return_CustomDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return_CustomDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return_CustomDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                Return_CustomDate dialog = new Return_CustomDate(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_GenerateReturn;
    protected static javax.swing.JButton btn_ReturnCName;
    protected static javax.swing.JButton btn_ReturnClose;
    public static javax.swing.JComboBox<String> cbo_ReturnCType;
    protected static org.jdesktop.swingx.JXDatePicker date_ReturnFrom;
    protected static org.jdesktop.swingx.JXDatePicker date_ReturnTo;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    protected static javax.swing.JLabel jLabel153;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    protected static javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel logo;
    private javax.swing.ButtonGroup radioBtnGroup;
    protected static javax.swing.JRadioButton radio_All;
    protected static javax.swing.JRadioButton radio_customer;
    private javax.swing.JLabel text;
    public static javax.swing.JTextField txt_ReturnCustName;
    // End of variables declaration//GEN-END:variables
}
