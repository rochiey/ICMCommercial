
package report.SalesReport;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class ReportPnl_2ndLayer extends javax.swing.JPanel {

    SalesReport_ButtonFunctions button = new SalesReport_ButtonFunctions();
    public ReportPnl_2ndLayer() {
        initComponents(); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ReportSalesLogOut = new javax.swing.JButton();
        btn_ReportSalesPrint = new javax.swing.JButton();
        btn_ReportSalesDaily = new javax.swing.JButton();
        btn_RefreshSales = new javax.swing.JButton();
        btn_ReportSalesUpdateDB = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_ReportSalesLogOut.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_ReportSalesLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Logut 2.png"))); // NOI18N
        btn_ReportSalesLogOut.setText("<html><center><font color=blue>F11</font><br/>Logout<br/>Account</center></html>");
        btn_ReportSalesLogOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReportSalesLogOutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReportSalesLogOutFocusLost(evt);
            }
        });
        btn_ReportSalesLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReportSalesLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReportSalesLogOutMouseExited(evt);
            }
        });
        btn_ReportSalesLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportSalesLogOutActionPerformed(evt);
            }
        });

        btn_ReportSalesPrint.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_ReportSalesPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Print.png"))); // NOI18N
        btn_ReportSalesPrint.setText("<html><center><font color=blue>F9</font><br/>Print<br/>Details</center></html>");
        btn_ReportSalesPrint.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReportSalesPrintFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReportSalesPrintFocusLost(evt);
            }
        });
        btn_ReportSalesPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReportSalesPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReportSalesPrintMouseExited(evt);
            }
        });
        btn_ReportSalesPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportSalesPrintActionPerformed(evt);
            }
        });

        btn_ReportSalesDaily.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_ReportSalesDaily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Report_DailySales.png"))); // NOI18N
        btn_ReportSalesDaily.setText("<html><center><font color=blue>F3</font><br/>Generate<br/>Sales<br/>Report</center></html>");
        btn_ReportSalesDaily.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReportSalesDailyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReportSalesDailyFocusLost(evt);
            }
        });
        btn_ReportSalesDaily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReportSalesDailyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReportSalesDailyMouseExited(evt);
            }
        });
        btn_ReportSalesDaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportSalesDailyActionPerformed(evt);
            }
        });

        btn_RefreshSales.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_RefreshSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Record_refresh.png"))); // NOI18N
        btn_RefreshSales.setText("<html><center><font color=blue>F1</font><br/>Refresh<br/>Records</center></html>");
        btn_RefreshSales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_RefreshSalesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_RefreshSalesFocusLost(evt);
            }
        });
        btn_RefreshSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RefreshSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RefreshSalesMouseExited(evt);
            }
        });
        btn_RefreshSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshSalesActionPerformed(evt);
            }
        });

        btn_ReportSalesUpdateDB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_ReportSalesUpdateDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice view 2.png"))); // NOI18N
        btn_ReportSalesUpdateDB.setText("<html><center><font color='green'>Update<br/>Database<br/>Online</font></center></html>");
        btn_ReportSalesUpdateDB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReportSalesUpdateDBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReportSalesUpdateDBFocusLost(evt);
            }
        });
        btn_ReportSalesUpdateDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReportSalesUpdateDBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReportSalesUpdateDBMouseExited(evt);
            }
        });
        btn_ReportSalesUpdateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportSalesUpdateDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_RefreshSales, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_ReportSalesDaily, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_ReportSalesPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_ReportSalesLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btn_ReportSalesUpdateDB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ReportSalesUpdateDB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_RefreshSales, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ReportSalesLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ReportSalesPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ReportSalesDaily, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_ReportSalesLogOut.getInputMap(btn_ReportSalesLogOut.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "btn_ReportSalesLogOut");
        btn_ReportSalesLogOut.getActionMap().put("btn_ReportSalesLogOut", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_ReportSalesPrint.getInputMap(btn_ReportSalesPrint.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "btn_ReportSalesPrint");
        btn_ReportSalesPrint.getActionMap().put("btn_ReportSalesPrint", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.salesReport_Print();
            }
        });
        btn_ReportSalesDaily.getInputMap(btn_ReportSalesDaily.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "btn_ReportSalesDaily");
        btn_ReportSalesDaily.getActionMap().put("btn_ReportSalesDaily", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.generateSReportForm();
            }
        });
        btn_RefreshSales.getInputMap(btn_RefreshSales.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "btn_RefreshSales");
        btn_RefreshSales.getActionMap().put("btn_RefreshSales", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                button.salesReport_Refresh();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ReportSalesLogOutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportSalesLogOutFocusGained
        btn_ReportSalesLogOut.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReportSalesLogOutFocusGained

    private void btn_ReportSalesLogOutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportSalesLogOutFocusLost
        btn_ReportSalesLogOut.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReportSalesLogOutFocusLost

    private void btn_ReportSalesLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportSalesLogOutMouseEntered
        btn_ReportSalesLogOut.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReportSalesLogOutMouseEntered

    private void btn_ReportSalesLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportSalesLogOutMouseExited
        btn_ReportSalesLogOut.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReportSalesLogOutMouseExited

    private void btn_ReportSalesPrintFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportSalesPrintFocusGained
        btn_ReportSalesPrint.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReportSalesPrintFocusGained

    private void btn_ReportSalesPrintFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportSalesPrintFocusLost
        btn_ReportSalesPrint.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReportSalesPrintFocusLost

    private void btn_ReportSalesPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportSalesPrintMouseEntered
        btn_ReportSalesPrint.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReportSalesPrintMouseEntered

    private void btn_ReportSalesPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportSalesPrintMouseExited
        btn_ReportSalesPrint.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReportSalesPrintMouseExited

    private void btn_ReportSalesDailyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportSalesDailyFocusGained
        btn_ReportSalesDaily.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReportSalesDailyFocusGained

    private void btn_ReportSalesDailyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportSalesDailyFocusLost
        btn_ReportSalesDaily.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReportSalesDailyFocusLost

    private void btn_ReportSalesDailyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportSalesDailyMouseEntered
        btn_ReportSalesDaily.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReportSalesDailyMouseEntered

    private void btn_ReportSalesDailyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportSalesDailyMouseExited
        btn_ReportSalesDaily.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReportSalesDailyMouseExited

    private void btn_ReportSalesLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportSalesLogOutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_ReportSalesLogOutActionPerformed

    private void btn_ReportSalesDailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportSalesDailyActionPerformed
        button.generateSReportForm();
    }//GEN-LAST:event_btn_ReportSalesDailyActionPerformed

    private void btn_RefreshSalesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshSalesFocusGained
        btn_RefreshSales.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshSalesFocusGained

    private void btn_RefreshSalesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_RefreshSalesFocusLost
        btn_RefreshSales.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshSalesFocusLost

    private void btn_RefreshSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshSalesMouseEntered
        btn_RefreshSales.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_RefreshSalesMouseEntered

    private void btn_RefreshSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshSalesMouseExited
        btn_RefreshSales.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_RefreshSalesMouseExited

    private void btn_RefreshSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshSalesActionPerformed
        button.salesReport_Refresh();
    }//GEN-LAST:event_btn_RefreshSalesActionPerformed

    private void btn_ReportSalesPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportSalesPrintActionPerformed
        button.salesReport_Print();
    }//GEN-LAST:event_btn_ReportSalesPrintActionPerformed

    private void btn_ReportSalesUpdateDBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportSalesUpdateDBFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReportSalesUpdateDBFocusGained

    private void btn_ReportSalesUpdateDBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReportSalesUpdateDBFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReportSalesUpdateDBFocusLost

    private void btn_ReportSalesUpdateDBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportSalesUpdateDBMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReportSalesUpdateDBMouseEntered

    private void btn_ReportSalesUpdateDBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReportSalesUpdateDBMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReportSalesUpdateDBMouseExited

    private void btn_ReportSalesUpdateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportSalesUpdateDBActionPerformed
        JOptionPane.showMessageDialog(null, "Function under construction.");
    }//GEN-LAST:event_btn_ReportSalesUpdateDBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_RefreshSales;
    protected static javax.swing.JButton btn_ReportSalesDaily;
    private javax.swing.JButton btn_ReportSalesLogOut;
    protected static javax.swing.JButton btn_ReportSalesPrint;
    private javax.swing.JButton btn_ReportSalesUpdateDB;
    // End of variables declaration//GEN-END:variables
}
