
package report.InventoryStatus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class InvStatus_2ndLayer extends javax.swing.JPanel {

    InvStatus_ButtonFunctions button = new InvStatus_ButtonFunctions();
    public InvStatus_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_LogOutInvStatus = new javax.swing.JButton();
        btn_PrintInvStatus = new javax.swing.JButton();
        btn_InventoryLowStocks = new javax.swing.JButton();
        btn_RefreshInvStatus = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_LogOutInvStatus.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_LogOutInvStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_LogOutInvStatus.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_LogOutInvStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_LogOutInvStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_LogOutInvStatusFocusLost(evt);
            }
        });
        btn_LogOutInvStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogOutInvStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogOutInvStatusMouseExited(evt);
            }
        });
        btn_LogOutInvStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutInvStatusActionPerformed(evt);
            }
        });

        btn_PrintInvStatus.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_PrintInvStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Print.png"))); // NOI18N
        btn_PrintInvStatus.setText("<html><center><font color=blue>F9</font><br/>Print<br/>Details</center></html>");
        btn_PrintInvStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_PrintInvStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_PrintInvStatusFocusLost(evt);
            }
        });
        btn_PrintInvStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PrintInvStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PrintInvStatusMouseExited(evt);
            }
        });
        btn_PrintInvStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintInvStatusActionPerformed(evt);
            }
        });

        btn_InventoryLowStocks.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_InventoryLowStocks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice_View Inventory.png"))); // NOI18N
        btn_InventoryLowStocks.setText("<html><center><font color=blue>F3</font><br/>Generate<br/>Inventory<br/>Status</center></html>");
        btn_InventoryLowStocks.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryLowStocksFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryLowStocksFocusLost(evt);
            }
        });
        btn_InventoryLowStocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryLowStocksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryLowStocksMouseExited(evt);
            }
        });
        btn_InventoryLowStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryLowStocksActionPerformed(evt);
            }
        });

        btn_RefreshInvStatus.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_RefreshInvStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Record_refresh.png"))); // NOI18N
        btn_RefreshInvStatus.setText("<html><center><font color=blue>F1</font><br/>Refresh<br/>Records</center></html>");
        btn_RefreshInvStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_RefreshInvStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_RefreshInvStatusFocusLost(evt);
            }
        });
        btn_RefreshInvStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RefreshInvStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RefreshInvStatusMouseExited(evt);
            }
        });
        btn_RefreshInvStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshInvStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_RefreshInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_InventoryLowStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_PrintInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_LogOutInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_RefreshInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_InventoryLowStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LogOutInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_PrintInvStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_LogOutInvStatus.getInputMap(btn_LogOutInvStatus.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_LogOutInvStatus");
        btn_LogOutInvStatus.getActionMap().put("btn_LogOutInvStatus", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_PrintInvStatus.getInputMap(btn_PrintInvStatus.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "btn_PrintInvStatus");
        btn_PrintInvStatus.getActionMap().put("btn_PrintInvStatus", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.printInvTrans();
            }
        });
        btn_InventoryLowStocks.getInputMap(btn_InventoryLowStocks.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_InventoryLowStocks");
        btn_InventoryLowStocks.getActionMap().put("btn_InventoryLowStocks", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.generateInvStatusForm();
            }
        });
        btn_RefreshInvStatus.getInputMap(btn_RefreshInvStatus.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "btn_RefreshInvStatus");
        btn_RefreshInvStatus.getActionMap().put("btn_RefreshInvStatus", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.refresh_InvStatus();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogOutInvStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutInvStatusFocusGained
        btn_LogOutInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutInvStatusFocusGained

    private void btn_LogOutInvStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_LogOutInvStatusFocusLost
        btn_LogOutInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutInvStatusFocusLost

    private void btn_LogOutInvStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutInvStatusMouseEntered
        btn_LogOutInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_LogOutInvStatusMouseEntered

    private void btn_LogOutInvStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutInvStatusMouseExited
        btn_LogOutInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_LogOutInvStatusMouseExited

    private void btn_PrintInvStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrintInvStatusFocusGained
        btn_PrintInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PrintInvStatusFocusGained

    private void btn_PrintInvStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrintInvStatusFocusLost
        btn_PrintInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PrintInvStatusFocusLost

    private void btn_PrintInvStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintInvStatusMouseEntered
        btn_PrintInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_PrintInvStatusMouseEntered

    private void btn_PrintInvStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintInvStatusMouseExited
        btn_PrintInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_PrintInvStatusMouseExited

    private void btn_LogOutInvStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutInvStatusActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_LogOutInvStatusActionPerformed

    private void btn_PrintInvStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintInvStatusActionPerformed
        button.printInvTrans();
    }//GEN-LAST:event_btn_PrintInvStatusActionPerformed

    private void btn_InventoryLowStocksFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryLowStocksFocusGained
        btn_InventoryLowStocks.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryLowStocksFocusGained

    private void btn_InventoryLowStocksFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryLowStocksFocusLost
        btn_InventoryLowStocks.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryLowStocksFocusLost

    private void btn_InventoryLowStocksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryLowStocksMouseEntered
        btn_InventoryLowStocks.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryLowStocksMouseEntered

    private void btn_InventoryLowStocksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryLowStocksMouseExited
        btn_InventoryLowStocks.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryLowStocksMouseExited

    private void btn_InventoryLowStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryLowStocksActionPerformed
        button.generateInvStatusForm();
    }//GEN-LAST:event_btn_InventoryLowStocksActionPerformed

    private void btn_RefreshInvStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshInvStatusFocusGained
        btn_RefreshInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshInvStatusFocusGained

    private void btn_RefreshInvStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshInvStatusFocusLost
        btn_RefreshInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshInvStatusFocusLost

    private void btn_RefreshInvStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshInvStatusMouseEntered
        btn_RefreshInvStatus.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshInvStatusMouseEntered

    private void btn_RefreshInvStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshInvStatusMouseExited
        btn_RefreshInvStatus.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshInvStatusMouseExited

    private void btn_RefreshInvStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshInvStatusActionPerformed
        button.refresh_InvStatus();
    }//GEN-LAST:event_btn_RefreshInvStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_InventoryLowStocks;
    private javax.swing.JButton btn_LogOutInvStatus;
    protected static javax.swing.JButton btn_PrintInvStatus;
    protected static javax.swing.JButton btn_RefreshInvStatus;
    // End of variables declaration//GEN-END:variables
}
