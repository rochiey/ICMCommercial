package dialog_salesOrder;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class SalesOrder_Discount extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    
    public SalesOrder_Discount(java.awt.Frame parent, boolean modal) {
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
        btn_DiscountConfirm = new javax.swing.JButton();
        btn_DiscountClose = new javax.swing.JButton();
        txt_Discount = new javax.swing.JTextField();

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

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesODiscount.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_DiscountConfirm.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_DiscountConfirm.setText("Confirm");
        btn_DiscountConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_DiscountConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_DiscountConfirmFocusLost(evt);
            }
        });
        btn_DiscountConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DiscountConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DiscountConfirmMouseExited(evt);
            }
        });
        btn_DiscountConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DiscountConfirmActionPerformed(evt);
            }
        });

        btn_DiscountClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_DiscountClose.setText("Close");
        btn_DiscountClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_DiscountCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_DiscountCloseFocusLost(evt);
            }
        });
        btn_DiscountClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DiscountCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DiscountCloseMouseExited(evt);
            }
        });
        btn_DiscountClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DiscountCloseActionPerformed(evt);
            }
        });

        txt_Discount.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txt_Discount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Discount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Discount)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_DiscountConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_DiscountClose, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txt_Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DiscountClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DiscountConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btn_DiscountConfirm.registerKeyboardAction(btn_DiscountConfirm.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_DiscountConfirm.registerKeyboardAction(btn_DiscountConfirm.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_DiscountClose.registerKeyboardAction(btn_DiscountClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_DiscountClose.registerKeyboardAction(btn_DiscountClose.getActionForKeyStroke(
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

    private void btn_DiscountConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DiscountConfirmFocusGained
        btn_DiscountConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DiscountConfirmFocusGained

    private void btn_DiscountConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DiscountConfirmFocusLost
        btn_DiscountConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DiscountConfirmFocusLost

    private void btn_DiscountConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DiscountConfirmMouseEntered
        btn_DiscountConfirm.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DiscountConfirmMouseEntered

    private void btn_DiscountConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DiscountConfirmMouseExited
        btn_DiscountConfirm.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DiscountConfirmMouseExited

    private void btn_DiscountConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DiscountConfirmActionPerformed
       try{
           int TRAP = Integer.parseInt(txt_Discount.getText());
           if(TRAP<=100 && TRAP >=0)
           {
                button.discountConfirm();
                this.dispose();
           }else JOptionPane.showMessageDialog(null, "Please enter correct discount.");
       }catch(NumberFormatException e)
       {
           JOptionPane.showMessageDialog(null, "Please enter correct discount");
       }
    }//GEN-LAST:event_btn_DiscountConfirmActionPerformed

    private void btn_DiscountCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DiscountCloseFocusGained
        btn_DiscountClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DiscountCloseFocusGained

    private void btn_DiscountCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DiscountCloseFocusLost
        btn_DiscountClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DiscountCloseFocusLost

    private void btn_DiscountCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DiscountCloseMouseEntered
        btn_DiscountClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DiscountCloseMouseEntered

    private void btn_DiscountCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DiscountCloseMouseExited
        btn_DiscountClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DiscountCloseMouseExited

    private void btn_DiscountCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DiscountCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_DiscountCloseActionPerformed

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
            java.util.logging.Logger.getLogger(SalesOrder_Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_Discount dialog = new SalesOrder_Discount(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_DiscountClose;
    protected static javax.swing.JButton btn_DiscountConfirm;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_Discount;
    // End of variables declaration//GEN-END:variables
}
