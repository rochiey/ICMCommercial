package dialog_salesOrder;

import com.DatabaseLinker;
import static dialog_salesOrder.SalesOrder_Tender.createDB;
import static dialog_salesOrder.SalesOrder_Tender.rs;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class SalesOrder_CreditHistory extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    public static String query="SELECT invoice_ID AS 'SO No.',transaction_date AS 'Transaction Date',total_net AS 'Total Net',due_date AS 'Due Date',DATEDIFF(due_date,CURDATE()) AS 'Days Left',penalty AS 'Penalty' FROM credit_transaction WHERE paymentTypeID=243 AND dealer_ID="+salesOrder.SalesOrder_ButtonFunctions.iddealer+" AND due_date IS NOT NULL";
    
    public SalesOrder_CreditHistory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        DatabaseLinker.updateTable(tbl_CreditHistory, query);
    }
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_CreditHistory = new javax.swing.JTable();
        lbl_NewDiscount = new javax.swing.JLabel();
        btn_CreditClose = new javax.swing.JButton();
        cbo_CreditSort = new javax.swing.JComboBox<String>();
        lbl_NewDiscount1 = new javax.swing.JLabel();
        txt_CreditSO = new javax.swing.JTextField();
        btn_CreditSearch = new javax.swing.JButton();
        btn_CreditSelect = new javax.swing.JButton();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesOrderCHistory.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_CreditHistory.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_CreditHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SO No.", "SO Date", "Credit Amount", "Due Date", "Remain. Days"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_CreditHistory.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_CreditHistory.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_CreditHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_CreditHistoryMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_CreditHistory);
        tbl_CreditHistory.setBackground(Color.WHITE);
        tbl_CreditHistory.setRowHeight(27);
        tbl_CreditHistory.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_CreditHistory.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_CreditHistory.setShowGrid(true);

        lbl_NewDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDiscount.setText("Sort By:");

        btn_CreditClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CreditClose.setText("Close");
        btn_CreditClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CreditCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CreditCloseFocusLost(evt);
            }
        });
        btn_CreditClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CreditCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CreditCloseMouseExited(evt);
            }
        });
        btn_CreditClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreditCloseActionPerformed(evt);
            }
        });

        cbo_CreditSort.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_CreditSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Due Date", "Credit Amount" }));
        cbo_CreditSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_CreditSortActionPerformed(evt);
            }
        });

        lbl_NewDiscount1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDiscount1.setText("SO No.:");

        txt_CreditSO.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_CreditSO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CreditSO.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_CreditSO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CreditSOKeyReleased(evt);
            }
        });

        btn_CreditSearch.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_CreditSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/All Search.png"))); // NOI18N
        btn_CreditSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CreditSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CreditSearchFocusLost(evt);
            }
        });
        btn_CreditSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CreditSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CreditSearchMouseExited(evt);
            }
        });
        btn_CreditSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreditSearchActionPerformed(evt);
            }
        });

        btn_CreditSelect.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CreditSelect.setText("Select");
        btn_CreditSelect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CreditSelectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CreditSelectFocusLost(evt);
            }
        });
        btn_CreditSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CreditSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CreditSelectMouseExited(evt);
            }
        });
        btn_CreditSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreditSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_CreditSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_CreditClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_NewDiscount1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CreditSO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_CreditSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_NewDiscount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_CreditSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_CreditClose, btn_CreditSelect});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_CreditSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_NewDiscount1)
                            .addComponent(txt_CreditSO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_NewDiscount)
                        .addComponent(cbo_CreditSort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CreditClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CreditSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_CreditSearch, cbo_CreditSort, txt_CreditSO});

        btn_CreditSearch.registerKeyboardAction(btn_CreditSearch.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_CreditSearch.registerKeyboardAction(btn_CreditSearch.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_CreditCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditCloseFocusGained
        btn_CreditClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditCloseFocusGained

    private void btn_CreditCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditCloseFocusLost
        btn_CreditClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditCloseFocusLost

    private void btn_CreditCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditCloseMouseEntered
        btn_CreditClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditCloseMouseEntered

    private void btn_CreditCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditCloseMouseExited
        btn_CreditClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditCloseMouseExited

    private void btn_CreditCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreditCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CreditCloseActionPerformed

    private void cbo_CreditSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_CreditSortActionPerformed
         button.creidtHistorySort();
    }//GEN-LAST:event_cbo_CreditSortActionPerformed

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

    private void btn_CreditSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditSearchFocusGained
        btn_CreditSearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditSearchFocusGained

    private void btn_CreditSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditSearchFocusLost
        btn_CreditSearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditSearchFocusLost

    private void btn_CreditSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditSearchMouseEntered
        btn_CreditSearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditSearchMouseEntered

    private void btn_CreditSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditSearchMouseExited
        btn_CreditSearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditSearchMouseExited

    private void btn_CreditSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreditSearchActionPerformed
        //button.dealerSearch();
    }//GEN-LAST:event_btn_CreditSearchActionPerformed

    private void btn_CreditSelectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditSelectFocusGained
        btn_CreditSelect.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditSelectFocusGained

    private void btn_CreditSelectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditSelectFocusLost
        btn_CreditSelect.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditSelectFocusLost

    private void btn_CreditSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditSelectMouseEntered
        btn_CreditSelect.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditSelectMouseEntered

    private void btn_CreditSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditSelectMouseExited
        btn_CreditSelect.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditSelectMouseExited

    private void btn_CreditSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreditSelectActionPerformed
        int row = tbl_CreditHistory.getSelectedRow();
        clickedID_onTable = (Integer) tbl_CreditHistory.getModel().getValueAt(row, 0);
        SalesOrder_Tender.lbl_CPullBalance.setText("₱"+SalesOrder_CreditHistory.tbl_CreditHistory.getValueAt(row, 2));
        SalesOrder_Tender.invoiceID=clickedID_onTable;
        this.dispose();
    }//GEN-LAST:event_btn_CreditSelectActionPerformed

    private void txt_CreditSOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CreditSOKeyReleased
        DatabaseLinker.updateTable(tbl_CreditHistory, query+" AND invoice_ID LIKE '%"+txt_CreditSO.getText()+"%'");
    }//GEN-LAST:event_txt_CreditSOKeyReleased

    private void tbl_CreditHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CreditHistoryMousePressed
        tableclicked(evt, tbl_CreditHistory);
    }//GEN-LAST:event_tbl_CreditHistoryMousePressed
    public static int clickedID_onTable = 0;
    protected static float getTotalPenalty() //per invoice
    {
        float totalPenalty=0;
        try {
            createDB();
            rs = stmt.executeQuery("SELECT penalty FROM credit_transaction WHERE invoice_ID="+SalesOrder_Tender.invoiceID);
            while(rs.next())
            {
                totalPenalty=rs.getFloat("penalty");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPenalty;
    }
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
            SalesOrder_Tender.lbl_CPullBalance.setText("₱"+((Float)tbl_CreditHistory.getValueAt(row, 2)+getTotalPenalty()));
            SalesOrder_Tender.invoiceID=clickedID_onTable;
        }
    }
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
            java.util.logging.Logger.getLogger(SalesOrder_CreditHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_CreditHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_CreditHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_CreditHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_CreditHistory dialog = new SalesOrder_CreditHistory(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_CreditClose;
    protected static javax.swing.JButton btn_CreditSearch;
    protected static javax.swing.JButton btn_CreditSelect;
    protected static javax.swing.JComboBox<String> cbo_CreditSort;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_NewDiscount;
    protected static javax.swing.JLabel lbl_NewDiscount1;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_CreditHistory;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_CreditSO;
    // End of variables declaration//GEN-END:variables
}
