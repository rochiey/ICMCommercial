package dialog_salesOrder;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class SalesOrder_ReturnEditQty extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    
    public SalesOrder_ReturnEditQty(java.awt.Frame parent, boolean modal) {
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
        btn_ReturnEditConfirm = new javax.swing.JButton();
        btn_ReturnEditClose = new javax.swing.JButton();
        txt_ReturnEditQty = new javax.swing.JTextField();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_ReturnEditQty.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_ReturnEditConfirm.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ReturnEditConfirm.setText("Confirm");
        btn_ReturnEditConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnEditConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnEditConfirmFocusLost(evt);
            }
        });
        btn_ReturnEditConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnEditConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnEditConfirmMouseExited(evt);
            }
        });
        btn_ReturnEditConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnEditConfirmActionPerformed(evt);
            }
        });

        btn_ReturnEditClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ReturnEditClose.setText("Close");
        btn_ReturnEditClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnEditCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnEditCloseFocusLost(evt);
            }
        });
        btn_ReturnEditClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnEditCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnEditCloseMouseExited(evt);
            }
        });
        btn_ReturnEditClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnEditCloseActionPerformed(evt);
            }
        });

        txt_ReturnEditQty.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txt_ReturnEditQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ReturnEditQty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ReturnEditQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ReturnEditQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_ReturnEditQty)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ReturnEditConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_ReturnEditClose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txt_ReturnEditQty, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ReturnEditClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ReturnEditConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btn_ReturnEditConfirm.registerKeyboardAction(btn_ReturnEditConfirm.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_ReturnEditConfirm.registerKeyboardAction(btn_ReturnEditConfirm.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_ReturnEditClose.registerKeyboardAction(btn_ReturnEditClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_ReturnEditClose.registerKeyboardAction(btn_ReturnEditClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_ReturnEditConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnEditConfirmFocusGained
        btn_ReturnEditConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnEditConfirmFocusGained

    private void btn_ReturnEditConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnEditConfirmFocusLost
        btn_ReturnEditConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnEditConfirmFocusLost

    private void btn_ReturnEditConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnEditConfirmMouseEntered
        btn_ReturnEditConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnEditConfirmMouseEntered

    private void btn_ReturnEditConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnEditConfirmMouseExited
        btn_ReturnEditConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnEditConfirmMouseExited

    private void btn_ReturnEditConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnEditConfirmActionPerformed
        if(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(0, 0) == "") JOptionPane.showMessageDialog(null, "Please select Invoice transaction first.");
        else
        {
            button.ReturnEditQty();
            this.dispose();
        }
    }//GEN-LAST:event_btn_ReturnEditConfirmActionPerformed

    private void btn_ReturnEditCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnEditCloseFocusGained
        btn_ReturnEditClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnEditCloseFocusGained

    private void btn_ReturnEditCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnEditCloseFocusLost
        btn_ReturnEditClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnEditCloseFocusLost

    private void btn_ReturnEditCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnEditCloseMouseEntered
        btn_ReturnEditClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnEditCloseMouseEntered

    private void btn_ReturnEditCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnEditCloseMouseExited
        btn_ReturnEditClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnEditCloseMouseExited

    private void btn_ReturnEditCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnEditCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ReturnEditCloseActionPerformed

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

    private void txt_ReturnEditQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ReturnEditQtyActionPerformed
        btn_ReturnEditConfirmActionPerformed(evt);
    }//GEN-LAST:event_txt_ReturnEditQtyActionPerformed

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
            java.util.logging.Logger.getLogger(SalesOrder_ReturnEditQty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ReturnEditQty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ReturnEditQty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ReturnEditQty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_ReturnEditQty dialog = new SalesOrder_ReturnEditQty(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_ReturnEditClose;
    protected static javax.swing.JButton btn_ReturnEditConfirm;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_ReturnEditQty;
    // End of variables declaration//GEN-END:variables
}
