
package report.ReturnHistory;

import com.DB;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class ReturntPnl_2ndLayer extends javax.swing.JPanel {

    Return_ButtonFunctions button = new Return_ButtonFunctions();
    public ReturntPnl_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_LogOutReport = new javax.swing.JButton();
        btn_PrintReturn = new javax.swing.JButton();
        btn_GenerateReturn = new javax.swing.JButton();
        btn_RefreshReturn = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_LogOutReport.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_LogOutReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_LogOutReport.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_LogOutReport.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_LogOutReportFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_LogOutReportFocusLost(evt);
            }
        });
        btn_LogOutReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogOutReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogOutReportMouseExited(evt);
            }
        });
        btn_LogOutReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutReportActionPerformed(evt);
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

        btn_GenerateReturn.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_GenerateReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Return_Generate.png"))); // NOI18N
        btn_GenerateReturn.setText("<html><center><font color=blue>F3</font><br/>Generate<br/>Return<br/>History</center></html>");
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

        btn_RefreshReturn.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_RefreshReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Record_refresh.png"))); // NOI18N
        btn_RefreshReturn.setText("<html><center><font color=blue>F1</font><br/>Refresh<br/>Records</center></html>");
        btn_RefreshReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_RefreshReturnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_RefreshReturnFocusLost(evt);
            }
        });
        btn_RefreshReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RefreshReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RefreshReturnMouseExited(evt);
            }
        });
        btn_RefreshReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_RefreshReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_GenerateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_PrintReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_LogOutReport, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_RefreshReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LogOutReport, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_PrintReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GenerateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_LogOutReport.getInputMap(btn_LogOutReport.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_LogOutReport");
        btn_LogOutReport.getActionMap().put("btn_LogOutReport", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_PrintReturn.getInputMap(btn_PrintReturn.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "btn_PrintReturn");
        btn_PrintReturn.getActionMap().put("btn_PrintReturn", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.printReturn();
            }
        });
        btn_GenerateReturn.getInputMap(btn_GenerateReturn.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_GenerateReturn");
        btn_GenerateReturn.getActionMap().put("btn_GenerateReturn", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.generateReturnForm();
            }
        });
        btn_RefreshReturn.getInputMap(btn_RefreshReturn.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "btn_RefreshReturn");
        btn_RefreshReturn.getActionMap().put("btn_RefreshReturn", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.refresh_Return();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogOutReportFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutReportFocusGained
        btn_LogOutReport.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutReportFocusGained

    private void btn_LogOutReportFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutReportFocusLost
        btn_LogOutReport.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutReportFocusLost

    private void btn_LogOutReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutReportMouseEntered
        btn_LogOutReport.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutReportMouseEntered

    private void btn_LogOutReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutReportMouseExited
        btn_LogOutReport.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutReportMouseExited

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

    private void btn_LogOutReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutReportActionPerformed
        DB.mysqlStop();
        System.exit(0);
    }//GEN-LAST:event_btn_LogOutReportActionPerformed

    private void btn_GenerateReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateReturnActionPerformed
        button.generateReturnForm();
    }//GEN-LAST:event_btn_GenerateReturnActionPerformed

    private void btn_PrintReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintReturnActionPerformed
        button.printReturn();
    }//GEN-LAST:event_btn_PrintReturnActionPerformed

    private void btn_RefreshReturnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshReturnFocusGained
        btn_RefreshReturn.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshReturnFocusGained

    private void btn_RefreshReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshReturnFocusLost
        btn_RefreshReturn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshReturnFocusLost

    private void btn_RefreshReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshReturnMouseEntered
        btn_RefreshReturn.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshReturnMouseEntered

    private void btn_RefreshReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshReturnMouseExited
        btn_RefreshReturn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshReturnMouseExited

    private void btn_RefreshReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshReturnActionPerformed
        button.refresh_Return();
    }//GEN-LAST:event_btn_RefreshReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_GenerateReturn;
    private javax.swing.JButton btn_LogOutReport;
    protected static javax.swing.JButton btn_PrintReturn;
    protected static javax.swing.JButton btn_RefreshReturn;
    // End of variables declaration//GEN-END:variables
}
