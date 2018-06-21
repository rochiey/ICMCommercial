
package report.InventoryTrans;

import com.DB;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class InvTransactions_2ndLayer extends javax.swing.JPanel {

    InvTransactions_ButtonFunctions button = new InvTransactions_ButtonFunctions();
    public InvTransactions_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_LogOutInvTrans = new javax.swing.JButton();
        btn_PrintInvTrans = new javax.swing.JButton();
        btn_GenerateInvTrans = new javax.swing.JButton();
        btn_RefreshInvTrans = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_LogOutInvTrans.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_LogOutInvTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_LogOutInvTrans.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_LogOutInvTrans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_LogOutInvTransFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_LogOutInvTransFocusLost(evt);
            }
        });
        btn_LogOutInvTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogOutInvTransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogOutInvTransMouseExited(evt);
            }
        });
        btn_LogOutInvTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutInvTransActionPerformed(evt);
            }
        });

        btn_PrintInvTrans.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_PrintInvTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Print.png"))); // NOI18N
        btn_PrintInvTrans.setText("<html><center><font color=blue>F9</font><br/>Print<br/>Details</center></html>");
        btn_PrintInvTrans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_PrintInvTransFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_PrintInvTransFocusLost(evt);
            }
        });
        btn_PrintInvTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PrintInvTransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PrintInvTransMouseExited(evt);
            }
        });
        btn_PrintInvTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintInvTransActionPerformed(evt);
            }
        });

        btn_GenerateInvTrans.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        btn_GenerateInvTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Inventory_Transactions.png"))); // NOI18N
        btn_GenerateInvTrans.setText("<html><center><font color=blue>F3</font><br/>Generate<br/>Inventory<br/>Transactions</center></html>");
        btn_GenerateInvTrans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_GenerateInvTransFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_GenerateInvTransFocusLost(evt);
            }
        });
        btn_GenerateInvTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GenerateInvTransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GenerateInvTransMouseExited(evt);
            }
        });
        btn_GenerateInvTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerateInvTransActionPerformed(evt);
            }
        });

        btn_RefreshInvTrans.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_RefreshInvTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Record_refresh.png"))); // NOI18N
        btn_RefreshInvTrans.setText("<html><center><font color=blue>F1</font><br/>Refresh<br/>Records</center></html>");
        btn_RefreshInvTrans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_RefreshInvTransFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_RefreshInvTransFocusLost(evt);
            }
        });
        btn_RefreshInvTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RefreshInvTransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RefreshInvTransMouseExited(evt);
            }
        });
        btn_RefreshInvTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshInvTransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_RefreshInvTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_GenerateInvTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_PrintInvTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_LogOutInvTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_RefreshInvTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LogOutInvTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_PrintInvTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GenerateInvTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_LogOutInvTrans.getInputMap(btn_LogOutInvTrans.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_LogOutInvTrans");
        btn_LogOutInvTrans.getActionMap().put("btn_LogOutInvTrans", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_PrintInvTrans.getInputMap(btn_PrintInvTrans.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "btn_PrintInvTrans");
        btn_PrintInvTrans.getActionMap().put("btn_PrintInvTrans", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.printInvTrans();
            }
        });
        btn_GenerateInvTrans.getInputMap(btn_GenerateInvTrans.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_GenerateInvTrans");
        btn_GenerateInvTrans.getActionMap().put("btn_GenerateInvTrans", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.generateInvTransForm();
            }
        });
        btn_RefreshInvTrans.getInputMap(btn_RefreshInvTrans.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "btn_RefreshInvTrans");
        btn_RefreshInvTrans.getActionMap().put("btn_RefreshInvTrans", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.refresh_InvTrans();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogOutInvTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutInvTransFocusGained
        btn_LogOutInvTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutInvTransFocusGained

    private void btn_LogOutInvTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutInvTransFocusLost
        btn_LogOutInvTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutInvTransFocusLost

    private void btn_LogOutInvTransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutInvTransMouseEntered
        btn_LogOutInvTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutInvTransMouseEntered

    private void btn_LogOutInvTransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutInvTransMouseExited
        btn_LogOutInvTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutInvTransMouseExited

    private void btn_PrintInvTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrintInvTransFocusGained
        btn_PrintInvTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PrintInvTransFocusGained

    private void btn_PrintInvTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrintInvTransFocusLost
        btn_PrintInvTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PrintInvTransFocusLost

    private void btn_PrintInvTransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintInvTransMouseEntered
        btn_PrintInvTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PrintInvTransMouseEntered

    private void btn_PrintInvTransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintInvTransMouseExited
        btn_PrintInvTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PrintInvTransMouseExited

    private void btn_GenerateInvTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateInvTransFocusGained
        btn_GenerateInvTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateInvTransFocusGained

    private void btn_GenerateInvTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateInvTransFocusLost
        btn_GenerateInvTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateInvTransFocusLost

    private void btn_GenerateInvTransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateInvTransMouseEntered
        btn_GenerateInvTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateInvTransMouseEntered

    private void btn_GenerateInvTransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateInvTransMouseExited
        btn_GenerateInvTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateInvTransMouseExited

    private void btn_LogOutInvTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutInvTransActionPerformed
        DB.mysqlStop();
        System.exit(0);
    }//GEN-LAST:event_btn_LogOutInvTransActionPerformed

    private void btn_GenerateInvTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateInvTransActionPerformed
        button.generateInvTransForm();
    }//GEN-LAST:event_btn_GenerateInvTransActionPerformed

    private void btn_PrintInvTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintInvTransActionPerformed
        button.printInvTrans();
    }//GEN-LAST:event_btn_PrintInvTransActionPerformed

    private void btn_RefreshInvTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshInvTransFocusGained
        btn_RefreshInvTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshInvTransFocusGained

    private void btn_RefreshInvTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshInvTransFocusLost
        btn_RefreshInvTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshInvTransFocusLost

    private void btn_RefreshInvTransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshInvTransMouseEntered
        btn_RefreshInvTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshInvTransMouseEntered

    private void btn_RefreshInvTransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshInvTransMouseExited
        btn_RefreshInvTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshInvTransMouseExited

    private void btn_RefreshInvTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshInvTransActionPerformed
        button.refresh_InvTrans();
    }//GEN-LAST:event_btn_RefreshInvTransActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_GenerateInvTrans;
    private javax.swing.JButton btn_LogOutInvTrans;
    protected static javax.swing.JButton btn_PrintInvTrans;
    protected static javax.swing.JButton btn_RefreshInvTrans;
    // End of variables declaration//GEN-END:variables
}
