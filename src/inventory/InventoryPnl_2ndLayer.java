
package inventory;

import com.DB;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class InventoryPnl_2ndLayer extends javax.swing.JPanel {
    
    Inventory_ButtonFunctions button = new Inventory_ButtonFunctions();
    
    public InventoryPnl_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_InventoryNew = new javax.swing.JButton();
        btn_InventoryUpdate = new javax.swing.JButton();
        btn_InventoryStock = new javax.swing.JButton();
        btn_InventoryLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_InventoryNew.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_InventoryNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Product_New.png"))); // NOI18N
        btn_InventoryNew.setText("<html><center><font color=blue>F3</font><br/>New<br/>Product<br/></center></html>");
        btn_InventoryNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryNewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryNewFocusLost(evt);
            }
        });
        btn_InventoryNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryNewMouseExited(evt);
            }
        });
        btn_InventoryNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryNewActionPerformed(evt);
            }
        });

        btn_InventoryUpdate.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_InventoryUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Product_Update.png"))); // NOI18N
        btn_InventoryUpdate.setText("<html><center><font color=blue>F4</font><br/>Update<br/>Product</center></html>");
        btn_InventoryUpdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryUpdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryUpdateFocusLost(evt);
            }
        });
        btn_InventoryUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryUpdateMouseExited(evt);
            }
        });
        btn_InventoryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryUpdateActionPerformed(evt);
            }
        });

        btn_InventoryStock.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_InventoryStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Product_AddDeduct.png"))); // NOI18N
        btn_InventoryStock.setText("<html><center><font color=blue>F6</font><br/>Inventory<br/>Movement</center></html>");
        btn_InventoryStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryStockFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryStockFocusLost(evt);
            }
        });
        btn_InventoryStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryStockMouseExited(evt);
            }
        });
        btn_InventoryStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryStockActionPerformed(evt);
            }
        });

        btn_InventoryLogout.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_InventoryLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_InventoryLogout.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_InventoryLogout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_InventoryLogoutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_InventoryLogoutFocusLost(evt);
            }
        });
        btn_InventoryLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InventoryLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InventoryLogoutMouseExited(evt);
            }
        });
        btn_InventoryLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventoryLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_InventoryNew, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_InventoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_InventoryStock, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_InventoryLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(747, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_InventoryLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_InventoryStock, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_InventoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_InventoryNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_InventoryNew.getInputMap(btn_InventoryNew.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_InventoryNew");
        btn_InventoryNew.getActionMap().put("btn_InventoryNew", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.inventoryNew();
            }
        });
        btn_InventoryUpdate.getInputMap(btn_InventoryUpdate.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), "btn_InventoryUpdate");
        btn_InventoryUpdate.getActionMap().put("btn_InventoryUpdate", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.inventoryUpdate();
            }
        });
        btn_InventoryStock.getInputMap(btn_InventoryStock.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0), "btn_InventoryStock");
        btn_InventoryStock.getActionMap().put("btn_InventoryStock", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.inventoryStockMovement();
            }
        });
        btn_InventoryLogout.getInputMap(btn_InventoryLogout.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_InventoryLogout");
        btn_InventoryLogout.getActionMap().put("btn_InventoryLogout", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InventoryNewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryNewFocusGained
        btn_InventoryNew.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryNewFocusGained

    private void btn_InventoryNewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryNewFocusLost
        btn_InventoryNew.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryNewFocusLost

    private void btn_InventoryNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryNewMouseEntered
        btn_InventoryNew.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryNewMouseEntered

    private void btn_InventoryNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryNewMouseExited
        btn_InventoryNew.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryNewMouseExited

    private void btn_InventoryUpdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryUpdateFocusGained
        btn_InventoryUpdate.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryUpdateFocusGained

    private void btn_InventoryUpdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryUpdateFocusLost
        btn_InventoryUpdate.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryUpdateFocusLost

    private void btn_InventoryUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryUpdateMouseEntered
        btn_InventoryUpdate.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryUpdateMouseEntered

    private void btn_InventoryUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryUpdateMouseExited
        btn_InventoryUpdate.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryUpdateMouseExited

    private void btn_InventoryStockFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryStockFocusGained
        btn_InventoryStock.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryStockFocusGained

    private void btn_InventoryStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryStockFocusLost
        btn_InventoryStock.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryStockFocusLost

    private void btn_InventoryStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryStockMouseEntered
        btn_InventoryStock.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryStockMouseEntered

    private void btn_InventoryStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryStockMouseExited
        btn_InventoryStock.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryStockMouseExited

    private void btn_InventoryLogoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryLogoutFocusGained
        btn_InventoryLogout.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryLogoutFocusGained

    private void btn_InventoryLogoutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_InventoryLogoutFocusLost
        btn_InventoryLogout.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryLogoutFocusLost

    private void btn_InventoryLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryLogoutMouseEntered
        btn_InventoryLogout.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_InventoryLogoutMouseEntered

    private void btn_InventoryLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InventoryLogoutMouseExited
        btn_InventoryLogout.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_InventoryLogoutMouseExited

    private void btn_InventoryNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryNewActionPerformed
        button.inventoryNew();
    }//GEN-LAST:event_btn_InventoryNewActionPerformed

    private void btn_InventoryLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryLogoutActionPerformed
        DB.mysqlStop();
        System.exit(0);
    }//GEN-LAST:event_btn_InventoryLogoutActionPerformed

    private void btn_InventoryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryUpdateActionPerformed
        button.inventoryUpdate();
        InventoryPnl_1stLayer.tbl_InventoryList.clearSelection();
    }//GEN-LAST:event_btn_InventoryUpdateActionPerformed

    private void btn_InventoryStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventoryStockActionPerformed
        button.inventoryStockMovement();
    }//GEN-LAST:event_btn_InventoryStockActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_InventoryLogout;
    protected static javax.swing.JButton btn_InventoryNew;
    protected static javax.swing.JButton btn_InventoryStock;
    protected static javax.swing.JButton btn_InventoryUpdate;
    // End of variables declaration//GEN-END:variables
}
