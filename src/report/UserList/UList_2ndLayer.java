
package report.UserList;

import com.DB;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class UList_2ndLayer extends javax.swing.JPanel {

    UList_ButtonFunctions button = new UList_ButtonFunctions();
    public UList_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_LogOutUList = new javax.swing.JButton();
        btn_PrintUList = new javax.swing.JButton();
        btn_GenerateUList = new javax.swing.JButton();
        btn_UListRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_LogOutUList.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_LogOutUList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_LogOutUList.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_LogOutUList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_LogOutUListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_LogOutUListFocusLost(evt);
            }
        });
        btn_LogOutUList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogOutUListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogOutUListMouseExited(evt);
            }
        });
        btn_LogOutUList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutUListActionPerformed(evt);
            }
        });

        btn_PrintUList.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_PrintUList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Print.png"))); // NOI18N
        btn_PrintUList.setText("<html><center><font color=blue>F9</font><br/>Print<br/>Details</center></html>");
        btn_PrintUList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_PrintUListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_PrintUListFocusLost(evt);
            }
        });
        btn_PrintUList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PrintUListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PrintUListMouseExited(evt);
            }
        });
        btn_PrintUList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintUListActionPerformed(evt);
            }
        });

        btn_GenerateUList.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        btn_GenerateUList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/User List.png"))); // NOI18N
        btn_GenerateUList.setText("<html><center><font color=blue>F3</font><br/>Generate<br/>User<br/>List/Records</center></html>");
        btn_GenerateUList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_GenerateUListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_GenerateUListFocusLost(evt);
            }
        });
        btn_GenerateUList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GenerateUListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GenerateUListMouseExited(evt);
            }
        });
        btn_GenerateUList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerateUListActionPerformed(evt);
            }
        });

        btn_UListRefresh.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_UListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Record_refresh.png"))); // NOI18N
        btn_UListRefresh.setText("<html><center><font color=blue>F1</font><br/>Refresh<br/>Records</center></html>");
        btn_UListRefresh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UListRefreshFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UListRefreshFocusLost(evt);
            }
        });
        btn_UListRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UListRefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UListRefreshMouseExited(evt);
            }
        });
        btn_UListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UListRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_UListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_GenerateUList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_PrintUList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_LogOutUList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_UListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LogOutUList, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_PrintUList, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GenerateUList, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_LogOutUList.getInputMap(btn_LogOutUList.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_LogOutUList");
        btn_LogOutUList.getActionMap().put("btn_LogOutUList", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_PrintUList.getInputMap(btn_PrintUList.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "btn_PrintUList");
        btn_PrintUList.getActionMap().put("btn_PrintUList", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.printUList();
            }
        });
        btn_GenerateUList.getInputMap(btn_GenerateUList.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_GenerateUList");
        btn_GenerateUList.getActionMap().put("btn_GenerateUList", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.generateUserListForm();
            }
        });
        btn_UListRefresh.getInputMap(btn_UListRefresh.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "btn_UListRefresh");
        btn_UListRefresh.getActionMap().put("btn_UListRefresh", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.refresh_UserList();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogOutUListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutUListFocusGained
        btn_LogOutUList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutUListFocusGained

    private void btn_LogOutUListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutUListFocusLost
        btn_LogOutUList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutUListFocusLost

    private void btn_LogOutUListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutUListMouseEntered
        btn_LogOutUList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutUListMouseEntered

    private void btn_LogOutUListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutUListMouseExited
        btn_LogOutUList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutUListMouseExited

    private void btn_PrintUListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrintUListFocusGained
        btn_PrintUList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PrintUListFocusGained

    private void btn_PrintUListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrintUListFocusLost
        btn_PrintUList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PrintUListFocusLost

    private void btn_PrintUListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintUListMouseEntered
        btn_PrintUList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PrintUListMouseEntered

    private void btn_PrintUListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintUListMouseExited
        btn_PrintUList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PrintUListMouseExited

    private void btn_GenerateUListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateUListFocusGained
        btn_GenerateUList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateUListFocusGained

    private void btn_GenerateUListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateUListFocusLost
        btn_GenerateUList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateUListFocusLost

    private void btn_GenerateUListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateUListMouseEntered
        btn_GenerateUList.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateUListMouseEntered

    private void btn_GenerateUListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateUListMouseExited
        btn_GenerateUList.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateUListMouseExited

    private void btn_LogOutUListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutUListActionPerformed
        DB.mysqlStop();
        System.exit(0);
    }//GEN-LAST:event_btn_LogOutUListActionPerformed

    private void btn_GenerateUListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateUListActionPerformed
        button.generateUserListForm();
    }//GEN-LAST:event_btn_GenerateUListActionPerformed

    private void btn_PrintUListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintUListActionPerformed
        button.printUList();
    }//GEN-LAST:event_btn_PrintUListActionPerformed

    private void btn_UListRefreshFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UListRefreshFocusGained
        btn_UListRefresh.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UListRefreshFocusGained

    private void btn_UListRefreshFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UListRefreshFocusLost
        btn_UListRefresh.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UListRefreshFocusLost

    private void btn_UListRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UListRefreshMouseEntered
        btn_UListRefresh.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UListRefreshMouseEntered

    private void btn_UListRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UListRefreshMouseExited
        btn_UListRefresh.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UListRefreshMouseExited

    private void btn_UListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UListRefreshActionPerformed
        button.refresh_UserList();
    }//GEN-LAST:event_btn_UListRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_GenerateUList;
    private javax.swing.JButton btn_LogOutUList;
    protected static javax.swing.JButton btn_PrintUList;
    protected static javax.swing.JButton btn_UListRefresh;
    // End of variables declaration//GEN-END:variables
}
