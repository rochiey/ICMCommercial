
package salesOrder;

import account_login.Account_Login;
import dialog_salesOrder.SalesOrder_Tender;
import icm.ICMMainSystem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class SalesPnl_3rdLayer extends javax.swing.JPanel {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    public SalesPnl_3rdLayer() {
        initComponents(); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_SalesNew = new javax.swing.JButton();
        btn_SalesEdit = new javax.swing.JButton();
        btn_SalesDealer = new javax.swing.JButton();
        btn_SalesView = new javax.swing.JButton();
        btn_SalesDiscount = new javax.swing.JButton();
        btn_SalesLogout = new javax.swing.JButton();
        btn_SalesTender = new javax.swing.JButton();
        btn_SalesRemove = new javax.swing.JButton();
        btn_SalesReturn = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_SalesNew.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice New.png"))); // NOI18N
        btn_SalesNew.setText("<html><center><font color=blue>F1</font><br/>New Sales<br/>Transaction</center></html>");
        btn_SalesNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesNewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesNewFocusLost(evt);
            }
        });
        btn_SalesNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesNewMouseExited(evt);
            }
        });
        btn_SalesNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesNewActionPerformed(evt);
            }
        });

        btn_SalesEdit.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Edit.png"))); // NOI18N
        btn_SalesEdit.setText("<html><center><font color=blue>F6</font><br/>Edit<br/>Quantity</center></html>");
        btn_SalesEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesEditFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesEditFocusLost(evt);
            }
        });
        btn_SalesEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesEditMouseExited(evt);
            }
        });
        btn_SalesEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesEditActionPerformed(evt);
            }
        });

        btn_SalesDealer.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesDealer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice_View Dealer.png"))); // NOI18N
        btn_SalesDealer.setText("<html><center><font color=blue>F3</font><br/>View<br/>Dealers</center></html>");
        btn_SalesDealer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesDealerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesDealerFocusLost(evt);
            }
        });
        btn_SalesDealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesDealerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesDealerMouseExited(evt);
            }
        });
        btn_SalesDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesDealerActionPerformed(evt);
            }
        });

        btn_SalesView.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice_View Inventory.png"))); // NOI18N
        btn_SalesView.setText("<html><center><font color=blue>F4</font><center>View<br/>Inventory</html>");
        btn_SalesView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesViewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesViewFocusLost(evt);
            }
        });
        btn_SalesView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesViewMouseExited(evt);
            }
        });
        btn_SalesView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesViewActionPerformed(evt);
            }
        });

        btn_SalesDiscount.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesDiscount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Discount.png"))); // NOI18N
        btn_SalesDiscount.setText("<html><center><font color=blue>F5</font><br/>Change<br/>Discount</center></html>");
        btn_SalesDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesDiscountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesDiscountFocusLost(evt);
            }
        });
        btn_SalesDiscount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesDiscountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesDiscountMouseExited(evt);
            }
        });
        btn_SalesDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesDiscountActionPerformed(evt);
            }
        });

        btn_SalesLogout.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_SalesLogout.setText("<html><center><font color=blue>F11</font><br/>Log-out<br/>Account</center></html>");
        btn_SalesLogout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesLogoutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesLogoutFocusLost(evt);
            }
        });
        btn_SalesLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesLogoutMouseExited(evt);
            }
        });
        btn_SalesLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesLogoutActionPerformed(evt);
            }
        });

        btn_SalesTender.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesTender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Tender.png"))); // NOI18N
        btn_SalesTender.setText("<html><center><font color=blue>F9</font><br/>Receive<br/>Payment</center></html>");
        btn_SalesTender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesTenderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesTenderFocusLost(evt);
            }
        });
        btn_SalesTender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesTenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesTenderMouseExited(evt);
            }
        });
        btn_SalesTender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesTenderActionPerformed(evt);
            }
        });

        btn_SalesRemove.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Remove.png"))); // NOI18N
        btn_SalesRemove.setText("<html><center><font color=blue>F7</font><br/>Void Sales<br/>Order</center></html>");
        btn_SalesRemove.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesRemoveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesRemoveFocusLost(evt);
            }
        });
        btn_SalesRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesRemoveMouseExited(evt);
            }
        });
        btn_SalesRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesRemoveActionPerformed(evt);
            }
        });

        btn_SalesReturn.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_SalesReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice_Return.png"))); // NOI18N
        btn_SalesReturn.setText("<html><center><font color=blue>F8</font><br/>Return<br/>Product</center></html>");
        btn_SalesReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesReturnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesReturnFocusLost(evt);
            }
        });
        btn_SalesReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesReturnMouseExited(evt);
            }
        });
        btn_SalesReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_SalesNew, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SalesDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SalesView, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SalesDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SalesEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SalesRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SalesReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SalesTender, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SalesLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_SalesDealer, btn_SalesDiscount, btn_SalesEdit, btn_SalesLogout, btn_SalesNew, btn_SalesRemove, btn_SalesReturn, btn_SalesTender, btn_SalesView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_SalesReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_SalesLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SalesTender, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SalesDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SalesRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_SalesView, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SalesDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SalesEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SalesNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btn_SalesNew.getInputMap(btn_SalesNew.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "btn_SalesNew");
        btn_SalesNew.getActionMap().put("btn_SalesNew", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.SalesOrderNew();
                salesOrder.SalesPnl_1stLayer.txt_SalesInput.requestFocusInWindow();
            }
        });
        btn_SalesEdit.getInputMap(btn_SalesEdit.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0), "btn_SalesEdit");
        btn_SalesEdit.getActionMap().put("btn_SalesEdit", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                btn_SalesEditActionPerformed(e);
                //if(SalesPnl_2ndLayer.clickedID_onTable > 0)button.SalesOrderEdit();
                //else JOptionPane.showMessageDialog(null,"Please select an item again.");
            }
        });
        btn_SalesView.getInputMap(btn_SalesView.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), "btn_SalesView");
        btn_SalesView.getActionMap().put("btn_SalesView", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                btn_SalesViewActionPerformed(e);
                //button.SalesOrderView();
            }
        });
        btn_SalesDiscount.getInputMap(btn_SalesDiscount.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), "btn_SalesDiscount");
        btn_SalesDiscount.getActionMap().put("btn_SalesDiscount", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                btn_SalesDiscountActionPerformed(e);
                //if(SalesPnl_2ndLayer.clickedID_onTable > 0)button.SalesOrderDiscount();
                //else JOptionPane.showMessageDialog(null, "Please select an item.");
            }
        });
        btn_SalesLogout.getInputMap(btn_SalesLogout.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_SalesLogout");
        btn_SalesLogout.getActionMap().put("btn_SalesLogout", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                /*int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to Log-out?","Confirm Action",dialogButton);
                if(dialogResult == 0){
                    System.exit(0);
                }
                else{}*/
            }
        });
        btn_SalesTender.getInputMap(btn_SalesTender.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "btn_SalesTender");
        btn_SalesTender.getActionMap().put("btn_SalesTender", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                btn_SalesTenderActionPerformed(e);
            }
        });
        btn_SalesRemove.getInputMap(btn_SalesRemove.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), "btn_SalesRemove");
        btn_SalesRemove.getActionMap().put("btn_SalesRemove", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                btn_SalesRemoveActionPerformed(e);
                // if(SalesPnl_2ndLayer.clickedID_onTable > 0)button.SalesOrderRemove();
                //else JOptionPane.showMessageDialog(null,"Please select an item again.");
            }
        });
        btn_SalesReturn.getInputMap(btn_SalesTender.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0), "btn_SalesReturn");
        btn_SalesReturn.getActionMap().put("btn_SalesReturn", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                btn_SalesReturnActionPerformed(e);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalesNewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesNewFocusGained
        btn_SalesNew.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesNewFocusGained

    private void btn_SalesNewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesNewFocusLost
        btn_SalesNew.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesNewFocusLost

    private void btn_SalesNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesNewMouseEntered
        btn_SalesNew.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesNewMouseEntered

    private void btn_SalesNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesNewMouseExited
        btn_SalesNew.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesNewMouseExited

    private void btn_SalesEditFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesEditFocusGained
        btn_SalesEdit.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesEditFocusGained

    private void btn_SalesEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesEditFocusLost
        btn_SalesEdit.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesEditFocusLost

    private void btn_SalesEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesEditMouseEntered
        //btn_InvEdit.setBackground(Color.CYAN);
        btn_SalesEdit.setBackground(Color.decode("#8fc6f8"));//searcn how to input RGB or Hex Color in netbeans 98c2e8 or 8fc6f8
    }//GEN-LAST:event_btn_SalesEditMouseEntered

    private void btn_SalesEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesEditMouseExited
        btn_SalesEdit.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesEditMouseExited

    private void btn_SalesDealerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesDealerFocusGained
        btn_SalesDealer.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesDealerFocusGained

    private void btn_SalesDealerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesDealerFocusLost
        btn_SalesDealer.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesDealerFocusLost

    private void btn_SalesDealerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesDealerMouseEntered
        btn_SalesDealer.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesDealerMouseEntered

    private void btn_SalesDealerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesDealerMouseExited
        btn_SalesDealer.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesDealerMouseExited

    private void btn_SalesViewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesViewFocusGained
        btn_SalesView.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesViewFocusGained

    private void btn_SalesViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesViewFocusLost
        btn_SalesView.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesViewFocusLost

    private void btn_SalesViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesViewMouseEntered
        btn_SalesView.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesViewMouseEntered

    private void btn_SalesViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesViewMouseExited
        btn_SalesView.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesViewMouseExited

    private void btn_SalesDiscountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesDiscountFocusGained
        btn_SalesDiscount.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesDiscountFocusGained

    private void btn_SalesDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesDiscountFocusLost
        btn_SalesDiscount.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesDiscountFocusLost

    private void btn_SalesDiscountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesDiscountMouseEntered
        btn_SalesDiscount.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesDiscountMouseEntered

    private void btn_SalesDiscountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesDiscountMouseExited
        btn_SalesDiscount.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesDiscountMouseExited

    private void btn_SalesLogoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesLogoutFocusGained
        btn_SalesLogout.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesLogoutFocusGained

    private void btn_SalesLogoutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesLogoutFocusLost
        btn_SalesLogout.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesLogoutFocusLost

    private void btn_SalesLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesLogoutMouseEntered
        btn_SalesLogout.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesLogoutMouseEntered

    private void btn_SalesLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesLogoutMouseExited
        btn_SalesLogout.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesLogoutMouseExited

    private void btn_SalesTenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesTenderFocusGained
        btn_SalesTender.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesTenderFocusGained

    private void btn_SalesTenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesTenderFocusLost
        btn_SalesTender.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesTenderFocusLost

    private void btn_SalesTenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesTenderMouseEntered
        btn_SalesTender.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesTenderMouseEntered

    private void btn_SalesTenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesTenderMouseExited
        btn_SalesTender.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesTenderMouseExited

    private void btn_SalesRemoveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesRemoveFocusGained
        btn_SalesRemove.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesRemoveFocusGained

    private void btn_SalesRemoveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesRemoveFocusLost
        btn_SalesRemove.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesRemoveFocusLost

    private void btn_SalesRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesRemoveMouseEntered
        btn_SalesRemove.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesRemoveMouseEntered

    private void btn_SalesRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesRemoveMouseExited
        btn_SalesRemove.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesRemoveMouseExited

    private void btn_SalesLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesLogoutActionPerformed
        if (JOptionPane.showConfirmDialog(null, "<html><center><font size=4>Are you sure you want to logout now?"
                   + "</font></center></html>", "Confirmation Message",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           System.exit(0);
        } 
        else {
            
        }
    }//GEN-LAST:event_btn_SalesLogoutActionPerformed

    private void btn_SalesTenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesTenderActionPerformed
        button.SalesOrderTender();
    }//GEN-LAST:event_btn_SalesTenderActionPerformed

    private void btn_SalesDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesDealerActionPerformed
        button.viewDealers();
    }//GEN-LAST:event_btn_SalesDealerActionPerformed

    private void btn_SalesViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesViewActionPerformed
        button.SalesOrderView();
    }//GEN-LAST:event_btn_SalesViewActionPerformed

    private void btn_SalesDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesDiscountActionPerformed
        if(SalesPnl_2ndLayer.clickedID_onTable > 0)button.SalesOrderDiscount();
        else JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please select an item."
                   + "</font></center></html>", "Information Message", 1);
    }//GEN-LAST:event_btn_SalesDiscountActionPerformed

    private void btn_SalesRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesRemoveActionPerformed
       if(SalesPnl_2ndLayer.clickedID_onTable > 0)button.SalesOrderRemove();
       else JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please select an item."
                   + "</font></center></html>", "Information Message", 1);
    }//GEN-LAST:event_btn_SalesRemoveActionPerformed

    private void btn_SalesNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesNewActionPerformed
        button.SalesOrderNew();
    }//GEN-LAST:event_btn_SalesNewActionPerformed

    private void btn_SalesEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesEditActionPerformed
        if(SalesPnl_2ndLayer.clickedID_onTable > 0)button.SalesOrderEdit();
        else JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please select an item."
                   + "</font></center></html>", "Information Message", 1);
    }//GEN-LAST:event_btn_SalesEditActionPerformed

    private void btn_SalesReturnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesReturnFocusGained
        btn_SalesReturn.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesReturnFocusGained

    private void btn_SalesReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesReturnFocusLost
        btn_SalesReturn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesReturnFocusLost

    private void btn_SalesReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesReturnMouseEntered
        btn_SalesReturn.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesReturnMouseEntered

    private void btn_SalesReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesReturnMouseExited
        btn_SalesReturn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesReturnMouseExited

    private void btn_SalesReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesReturnActionPerformed
        button.SalesOrderReturn();
    }//GEN-LAST:event_btn_SalesReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_SalesDealer;
    protected static javax.swing.JButton btn_SalesDiscount;
    protected static javax.swing.JButton btn_SalesEdit;
    private javax.swing.JButton btn_SalesLogout;
    protected static javax.swing.JButton btn_SalesNew;
    protected static javax.swing.JButton btn_SalesRemove;
    protected static javax.swing.JButton btn_SalesReturn;
    protected static javax.swing.JButton btn_SalesTender;
    protected static javax.swing.JButton btn_SalesView;
    // End of variables declaration//GEN-END:variables
}
