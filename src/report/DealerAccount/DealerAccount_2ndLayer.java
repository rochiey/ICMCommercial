
package report.DealerAccount;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import static report.DealerAccount.DealerAccount_1stLayer.tbl_Outstanding;

public class DealerAccount_2ndLayer extends javax.swing.JPanel {

    DealerAccount_ButtonFunctions button = new DealerAccount_ButtonFunctions();
    public DealerAccount_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_LogOutOutstanding = new javax.swing.JButton();
        btn_PrintReturn = new javax.swing.JButton();
        btn_RefreshOutstanding = new javax.swing.JButton();
        btn_GenerateCLTrans = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_LogOutOutstanding.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_LogOutOutstanding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_LogOutOutstanding.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_LogOutOutstanding.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_LogOutOutstandingFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_LogOutOutstandingFocusLost(evt);
            }
        });
        btn_LogOutOutstanding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogOutOutstandingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogOutOutstandingMouseExited(evt);
            }
        });
        btn_LogOutOutstanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutOutstandingActionPerformed(evt);
            }
        });

        btn_PrintReturn.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_PrintReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Print.png"))); // NOI18N
        btn_PrintReturn.setText("<html><center><font color=blue>F9</font><br/>Print<br/>Details</center></html>");
        btn_PrintReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_PrintReturnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_PrintReturnFocusLost(evt);
            }
        });
        btn_PrintReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PrintReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PrintReturnMouseExited(evt);
            }
        });
        btn_PrintReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintReturnActionPerformed(evt);
            }
        });

        btn_RefreshOutstanding.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_RefreshOutstanding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Record_refresh.png"))); // NOI18N
        btn_RefreshOutstanding.setText("<html><center><font color=blue>F1</font><br/>Refresh<br/>Records</center></html>");
        btn_RefreshOutstanding.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_RefreshOutstandingFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_RefreshOutstandingFocusLost(evt);
            }
        });
        btn_RefreshOutstanding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RefreshOutstandingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RefreshOutstandingMouseExited(evt);
            }
        });
        btn_RefreshOutstanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshOutstandingActionPerformed(evt);
            }
        });

        btn_GenerateCLTrans.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        btn_GenerateCLTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Credit_Line.png"))); // NOI18N
        btn_GenerateCLTrans.setText("<html><center><font color=blue>F3</font><br/>Generate<br/>Credit Line<br/>Transactions</center></html>");
        btn_GenerateCLTrans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_GenerateCLTransFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_GenerateCLTransFocusLost(evt);
            }
        });
        btn_GenerateCLTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GenerateCLTransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GenerateCLTransMouseExited(evt);
            }
        });
        btn_GenerateCLTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerateCLTransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_RefreshOutstanding, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_GenerateCLTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_PrintReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_LogOutOutstanding, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_GenerateCLTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_RefreshOutstanding, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LogOutOutstanding, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_PrintReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_LogOutOutstanding.getInputMap(btn_LogOutOutstanding.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_LogOutOutstanding");
        btn_LogOutOutstanding.getActionMap().put("btn_LogOutOutstanding", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_PrintReturn.getInputMap(btn_PrintReturn.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "btn_PrintReturn");
        btn_PrintReturn.getActionMap().put("btn_PrintReturn", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.printBalance();
            }
        });
        btn_RefreshOutstanding.getInputMap(btn_RefreshOutstanding.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "btn_RefreshOutstanding");
        btn_RefreshOutstanding.getActionMap().put("btn_RefreshOutstanding", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.refresh_Outstanding();
                DealerAccount_1stLayer.generateIncomingDue();
                DealerAccount_1stLayer.generateUpdate();
            }
        });
        btn_GenerateCLTrans.getInputMap(btn_GenerateCLTrans.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_GenerateCLTrans");
        btn_GenerateCLTrans.getActionMap().put("btn_GenerateCLTrans", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.generateCLForm();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogOutOutstandingFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutOutstandingFocusGained
        btn_LogOutOutstanding.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutOutstandingFocusGained

    private void btn_LogOutOutstandingFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutOutstandingFocusLost
        btn_LogOutOutstanding.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutOutstandingFocusLost

    private void btn_LogOutOutstandingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutOutstandingMouseEntered
        btn_LogOutOutstanding.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutOutstandingMouseEntered

    private void btn_LogOutOutstandingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutOutstandingMouseExited
        btn_LogOutOutstanding.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutOutstandingMouseExited

    private void btn_PrintReturnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrintReturnFocusGained
        btn_PrintReturn.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PrintReturnFocusGained

    private void btn_PrintReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrintReturnFocusLost
        btn_PrintReturn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PrintReturnFocusLost

    private void btn_PrintReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintReturnMouseEntered
        btn_PrintReturn.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PrintReturnMouseEntered

    private void btn_PrintReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintReturnMouseExited
        btn_PrintReturn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PrintReturnMouseExited

    private void btn_LogOutOutstandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutOutstandingActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_LogOutOutstandingActionPerformed

    private void btn_PrintReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintReturnActionPerformed
        button.printBalance();
    }//GEN-LAST:event_btn_PrintReturnActionPerformed

    private void btn_RefreshOutstandingFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshOutstandingFocusGained
        btn_RefreshOutstanding.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshOutstandingFocusGained

    private void btn_RefreshOutstandingFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshOutstandingFocusLost
        btn_RefreshOutstanding.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshOutstandingFocusLost

    private void btn_RefreshOutstandingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshOutstandingMouseEntered
        btn_RefreshOutstanding.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshOutstandingMouseEntered

    private void btn_RefreshOutstandingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshOutstandingMouseExited
        btn_RefreshOutstanding.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshOutstandingMouseExited

    private void btn_RefreshOutstandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshOutstandingActionPerformed
        button.refresh_Outstanding();
        DealerAccount_1stLayer.generateIncomingDue();
        DealerAccount_1stLayer.generateUpdate();
    }//GEN-LAST:event_btn_RefreshOutstandingActionPerformed

    private void btn_GenerateCLTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateCLTransFocusGained
        btn_GenerateCLTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateCLTransFocusGained

    private void btn_GenerateCLTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateCLTransFocusLost
        btn_GenerateCLTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateCLTransFocusLost

    private void btn_GenerateCLTransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateCLTransMouseEntered
        btn_GenerateCLTrans.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateCLTransMouseEntered

    private void btn_GenerateCLTransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateCLTransMouseExited
        btn_GenerateCLTrans.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateCLTransMouseExited

    private void btn_GenerateCLTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateCLTransActionPerformed
        button.generateCLForm();
    }//GEN-LAST:event_btn_GenerateCLTransActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_GenerateCLTrans;
    private javax.swing.JButton btn_LogOutOutstanding;
    protected static javax.swing.JButton btn_PrintReturn;
    protected static javax.swing.JButton btn_RefreshOutstanding;
    // End of variables declaration//GEN-END:variables
}
