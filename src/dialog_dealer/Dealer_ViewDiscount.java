package dialog_dealer;

import com.DatabaseLinker;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.xswingx.PromptSupport;

public class Dealer_ViewDiscount extends javax.swing.JDialog {

    Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
    int xMouse, yMouse;
    DatabaseLinker dealer_supplier_bridge;
    static String query = "SELECT dealer_supplier_bridge.iddealer_supplier_bridge AS 'ID', dealer.first_name AS 'Dealer Name',supplier.supplier_name AS 'Company', dealer_supplier_bridge.discount AS 'Discount' FROM dealer_supplier_bridge,dealer,supplier WHERE dealer_supplier_bridge.dealerID = dealer.iddealer AND dealer_supplier_bridge.supplierID = supplier.idsupplier";
    
    public Dealer_ViewDiscount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      
        dealer_supplier_bridge = new DatabaseLinker(tbl_DealerDiscount, query);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_DealerDiscount = new javax.swing.JTable();
        lbl_NewDiscount = new javax.swing.JLabel();
        btn_DiscountClose = new javax.swing.JButton();
        txt_DealerDCode = new javax.swing.JTextField();
        btn_DealerSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dealer's Credit Amount");
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        background.setBackground(new java.awt.Color(65, 105, 225));
        background.setMinimumSize(new java.awt.Dimension(613, 390));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frameGrabber.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameGrabberMouseDragged(evt);
            }
        });
        frameGrabber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameGrabberMousePressed(evt);
            }
        });
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 602, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_DealerDiscount.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_DealerDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_DealerDiscount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Dealer Name", "Company", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DealerDiscount.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_DealerDiscount.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jScrollPane4.setViewportView(tbl_DealerDiscount);
        tbl_DealerDiscount.setBackground(Color.WHITE);
        tbl_DealerDiscount.setRowHeight(27);
        tbl_DealerDiscount.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_DealerDiscount.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_DealerDiscount.setShowGrid(true);

        lbl_NewDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDiscount.setText("Dealer ID/Name:");

        btn_DiscountClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_DiscountClose.setText("Close");
        btn_DiscountClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_DiscountCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_DiscountCloseFocusLost(evt);
            }
        });
        btn_DiscountClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DiscountCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DiscountCloseMouseExited(evt);
            }
        });
        btn_DiscountClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DiscountCloseActionPerformed(evt);
            }
        });

        txt_DealerDCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        PromptSupport.setPrompt("Search Dealer", txt_DealerDCode);
        PromptSupport.setPrompt("Search Dealer", txt_DealerDCode);
        txt_DealerDCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_DealerDCodeKeyReleased(evt);
            }
        });

        btn_DealerSearch.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_DealerSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/All Search.png"))); // NOI18N
        btn_DealerSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_DealerSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_DealerSearchFocusLost(evt);
            }
        });
        btn_DealerSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DealerSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DealerSearchMouseExited(evt);
            }
        });
        btn_DealerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DealerSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_NewDiscount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_DealerDCode, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_DealerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_DiscountClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_NewDiscount)
                        .addComponent(txt_DealerDCode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_DealerSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DiscountClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        btn_DealerSearch.registerKeyboardAction(btn_DealerSearch.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_DealerSearch.registerKeyboardAction(btn_DealerSearch.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, 590, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frameGrabberMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameGrabberMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameGrabberMouseDragged

    private void frameGrabberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameGrabberMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameGrabberMousePressed

    private void btn_DiscountCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DiscountCloseFocusGained
        btn_DiscountClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DiscountCloseFocusGained

    private void btn_DiscountCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DiscountCloseFocusLost
        btn_DiscountClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DiscountCloseFocusLost

    private void btn_DiscountCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DiscountCloseMouseEntered
        btn_DiscountClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DiscountCloseMouseEntered

    private void btn_DiscountCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DiscountCloseMouseExited
        btn_DiscountClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DiscountCloseMouseExited

    private void btn_DiscountCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DiscountCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_DiscountCloseActionPerformed

    private void btn_DealerSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerSearchFocusGained
        btn_DealerSearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerSearchFocusGained

    private void btn_DealerSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_DealerSearchFocusLost
        btn_DealerSearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerSearchFocusLost

    private void btn_DealerSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerSearchMouseEntered
        btn_DealerSearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_DealerSearchMouseEntered

    private void btn_DealerSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DealerSearchMouseExited
        btn_DealerSearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_DealerSearchMouseExited

    private void btn_DealerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DealerSearchActionPerformed
        button.dealerSearchVDiscount();
    }//GEN-LAST:event_btn_DealerSearchActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        background.setBackground(new Color(65, 105, 225));
        text.setVisible(true);
        logo.setVisible(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        background.setBackground(new Color(235, 235, 235));
        text.setVisible(false);
        logo.setVisible(false);
    }//GEN-LAST:event_formWindowLostFocus

    private void txt_DealerDCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DealerDCodeKeyReleased
        DatabaseLinker.updateTable(tbl_DealerDiscount, "SELECT dealer_supplier_bridge.iddealer_supplier_bridge AS 'ID', dealer.first_name AS 'Dealer Name',supplier.supplier_name AS 'Company', dealer_supplier_bridge.discount AS 'Discount' FROM dealer_supplier_bridge,dealer,supplier WHERE dealer_supplier_bridge.dealerID = dealer.iddealer AND dealer_supplier_bridge.supplierID = supplier.idsupplier AND dealer.first_name LIKE '%"+txt_DealerDCode.getText()+"%'");
    }//GEN-LAST:event_txt_DealerDCodeKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dealer_ViewDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dealer_ViewDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dealer_ViewDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dealer_ViewDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dealer_ViewDiscount dialog = new Dealer_ViewDiscount(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    protected static javax.swing.JButton btn_DealerSearch;
    protected static javax.swing.JButton btn_DiscountClose;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_NewDiscount;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_DealerDiscount;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_DealerDCode;
    // End of variables declaration//GEN-END:variables
}
