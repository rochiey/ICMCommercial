
package user;

import com.DB;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class UserPnl_2ndLayer extends javax.swing.JPanel {

    User_ButtonFunctions button = new User_ButtonFunctions();
    public UserPnl_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_UserLogout = new javax.swing.JButton();
        btn_UserUpdate = new javax.swing.JButton();
        btn_UserNew = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_UserLogout.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_UserLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_UserLogout.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_UserLogout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UserLogoutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UserLogoutFocusLost(evt);
            }
        });
        btn_UserLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserLogoutMouseExited(evt);
            }
        });
        btn_UserLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserLogoutActionPerformed(evt);
            }
        });

        btn_UserUpdate.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_UserUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/User_Update.png"))); // NOI18N
        btn_UserUpdate.setText("<html><center><font color=blue>F4</font><br/>Update<br/>User<br/>Account</center></html>");
        btn_UserUpdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UserUpdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UserUpdateFocusLost(evt);
            }
        });
        btn_UserUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserUpdateMouseExited(evt);
            }
        });
        btn_UserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserUpdateActionPerformed(evt);
            }
        });

        btn_UserNew.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_UserNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/User_Add.png"))); // NOI18N
        btn_UserNew.setText("<html><center><font color=blue>F3</font><br/>New<br/>User<br/>Account</center></html>");
        btn_UserNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UserNewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UserNewFocusLost(evt);
            }
        });
        btn_UserNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserNewMouseExited(evt);
            }
        });
        btn_UserNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_UserNew, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_UserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_UserLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_UserLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UserNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_UserLogout.getInputMap(btn_UserLogout.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_UserLogout");
        btn_UserLogout.getActionMap().put("btn_UserLogout", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_UserUpdate.getInputMap(btn_UserUpdate.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), "btn_UserUpdate");
        btn_UserUpdate.getActionMap().put("btn_UserUpdate", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.userUpdateAccount();
            }
        });
        btn_UserNew.getInputMap(btn_UserNew.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_UserNew");
        btn_UserNew.getActionMap().put("btn_UserNew", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.userNewAccount();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UserLogoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserLogoutFocusGained
        btn_UserLogout.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserLogoutFocusGained

    private void btn_UserLogoutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserLogoutFocusLost
        btn_UserLogout.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserLogoutFocusLost

    private void btn_UserLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserLogoutMouseEntered
        btn_UserLogout.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserLogoutMouseEntered

    private void btn_UserLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserLogoutMouseExited
        btn_UserLogout.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserLogoutMouseExited

    private void btn_UserUpdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserUpdateFocusGained
        btn_UserUpdate.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserUpdateFocusGained

    private void btn_UserUpdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserUpdateFocusLost
        btn_UserUpdate.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserUpdateFocusLost

    private void btn_UserUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserUpdateMouseEntered
        btn_UserUpdate.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserUpdateMouseEntered

    private void btn_UserUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserUpdateMouseExited
        btn_UserUpdate.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserUpdateMouseExited

    private void btn_UserNewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserNewFocusGained
        btn_UserNew.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserNewFocusGained

    private void btn_UserNewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserNewFocusLost
        btn_UserNew.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserNewFocusLost

    private void btn_UserNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserNewMouseEntered
        btn_UserNew.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserNewMouseEntered

    private void btn_UserNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserNewMouseExited
        btn_UserNew.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserNewMouseExited

    private void btn_UserNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserNewActionPerformed
       button.userNewAccount();
    }//GEN-LAST:event_btn_UserNewActionPerformed

    private void btn_UserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserUpdateActionPerformed
       button.userUpdateAccount();
       UserPnl_1stLayer.tbl_UserAccounts.setCellSelectionEnabled(false);
    }//GEN-LAST:event_btn_UserUpdateActionPerformed

    private void btn_UserLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserLogoutActionPerformed
        DB.mysqlStop();
        System.exit(0);
    }//GEN-LAST:event_btn_UserLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_UserLogout;
    protected static javax.swing.JButton btn_UserNew;
    protected static javax.swing.JButton btn_UserUpdate;
    // End of variables declaration//GEN-END:variables
}
