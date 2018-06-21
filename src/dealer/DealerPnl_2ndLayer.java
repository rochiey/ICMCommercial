
package dealer;

import com.DB;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class DealerPnl_2ndLayer extends javax.swing.JPanel {

    Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
    
    public DealerPnl_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_DealerNew = new javax.swing.JButton();
        btn_DealerUpdate = new javax.swing.JButton();
        btn_DealerlFullDiscounts = new javax.swing.JButton();
        btn_DealerlLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_DealerNew.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_DealerNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Deal_Add2.png"))); // NOI18N
        btn_DealerNew.setText("<html><center><font color=blue>F3</font><br/>New<br/>Dealers<br/>Account</center></html>");
        btn_DealerNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_DealerNewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_DealerNewFocusLost(evt);
            }
        });
        btn_DealerNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DealerNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DealerNewMouseExited(evt);
            }
        });
        btn_DealerNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DealerNewActionPerformed(evt);
            }
        });

        btn_DealerUpdate.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_DealerUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Deal_Update.png"))); // NOI18N
        btn_DealerUpdate.setText("<html><center><font color=blue>F4</font><br/>Update<br/>Dealers<br/>Account</center></html>");
        btn_DealerUpdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_DealerUpdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_DealerUpdateFocusLost(evt);
            }
        });
        btn_DealerUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DealerUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DealerUpdateMouseExited(evt);
            }
        });
        btn_DealerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DealerUpdateActionPerformed(evt);
            }
        });

        btn_DealerlFullDiscounts.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_DealerlFullDiscounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Deal_FullDiscount.png"))); // NOI18N
        btn_DealerlFullDiscounts.setText("<html><center><font color=blue>F5</font><br/>View<br/>Dealer<br/>Discounts</center></html>");
        btn_DealerlFullDiscounts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_DealerlFullDiscountsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_DealerlFullDiscountsFocusLost(evt);
            }
        });
        btn_DealerlFullDiscounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DealerlFullDiscountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DealerlFullDiscountsMouseExited(evt);
            }
        });
        btn_DealerlFullDiscounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DealerlFullDiscountsActionPerformed(evt);
            }
        });

        btn_DealerlLogout.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_DealerlLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_DealerlLogout.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_DealerlLogout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_DealerlLogoutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_DealerlLogoutFocusLost(evt);
            }
        });
        btn_DealerlLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DealerlLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DealerlLogoutMouseExited(evt);
            }
        });
        btn_DealerlLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DealerlLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_DealerNew, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_DealerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_DealerlFullDiscounts, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_DealerlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_DealerlFullDiscounts, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DealerNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DealerlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DealerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_DealerNew.getInputMap(btn_DealerNew.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_DealerNew");
        btn_DealerNew.getActionMap().put("btn_DealerNew", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.dealerNew();
            }
        });
        btn_DealerUpdate.getInputMap(btn_DealerUpdate.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), "btn_DealerUpdate");
        btn_DealerUpdate.getActionMap().put("btn_DealerUpdate", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.dealerUpdate();
            }
        });
        btn_DealerlFullDiscounts.getInputMap(btn_DealerlFullDiscounts.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), "btn_DealerlFullDiscounts");
        btn_DealerlFullDiscounts.getActionMap().put("btn_DealerlFullDiscounts", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.dealerFullDiscounts();
            }
        });
        btn_DealerlLogout.getInputMap(btn_DealerlLogout.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_DealerlLogout");
        btn_DealerlLogout.getActionMap().put("btn_DealerlLogout", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DealerNewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerNewFocusGained
        btn_DealerNew.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerNewFocusGained

    private void btn_DealerNewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerNewFocusLost
        btn_DealerNew.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerNewFocusLost

    private void btn_DealerNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerNewMouseEntered
        btn_DealerNew.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerNewMouseEntered

    private void btn_DealerNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerNewMouseExited
        btn_DealerNew.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerNewMouseExited

    private void btn_DealerUpdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerUpdateFocusGained
        btn_DealerUpdate.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerUpdateFocusGained

    private void btn_DealerUpdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerUpdateFocusLost
        btn_DealerUpdate.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerUpdateFocusLost

    private void btn_DealerUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerUpdateMouseEntered
        btn_DealerUpdate.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerUpdateMouseEntered

    private void btn_DealerUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerUpdateMouseExited
        btn_DealerUpdate.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerUpdateMouseExited

    private void btn_DealerlFullDiscountsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerlFullDiscountsFocusGained
        btn_DealerlFullDiscounts.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerlFullDiscountsFocusGained

    private void btn_DealerlFullDiscountsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerlFullDiscountsFocusLost
        btn_DealerlFullDiscounts.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerlFullDiscountsFocusLost

    private void btn_DealerlFullDiscountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerlFullDiscountsMouseEntered
        btn_DealerlFullDiscounts.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerlFullDiscountsMouseEntered

    private void btn_DealerlFullDiscountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerlFullDiscountsMouseExited
        btn_DealerlFullDiscounts.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerlFullDiscountsMouseExited

    private void btn_DealerlLogoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerlLogoutFocusGained
        btn_DealerlLogout.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerlLogoutFocusGained

    private void btn_DealerlLogoutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerlLogoutFocusLost
        btn_DealerlLogout.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerlLogoutFocusLost

    private void btn_DealerlLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerlLogoutMouseEntered
        btn_DealerlLogout.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerlLogoutMouseEntered

    private void btn_DealerlLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerlLogoutMouseExited
        btn_DealerlLogout.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerlLogoutMouseExited

    private void btn_DealerlLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DealerlLogoutActionPerformed
        DB.mysqlStop();
        System.exit(0);
    }//GEN-LAST:event_btn_DealerlLogoutActionPerformed

    private void btn_DealerNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DealerNewActionPerformed
        button.dealerNew();
    }//GEN-LAST:event_btn_DealerNewActionPerformed

    private void btn_DealerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DealerUpdateActionPerformed
        button.dealerUpdate();
    }//GEN-LAST:event_btn_DealerUpdateActionPerformed

    private void btn_DealerlFullDiscountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DealerlFullDiscountsActionPerformed
        button.dealerFullDiscounts();
    }//GEN-LAST:event_btn_DealerlFullDiscountsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_DealerNew;
    protected static javax.swing.JButton btn_DealerUpdate;
    protected static javax.swing.JButton btn_DealerlFullDiscounts;
    private javax.swing.JButton btn_DealerlLogout;
    // End of variables declaration//GEN-END:variables
}
