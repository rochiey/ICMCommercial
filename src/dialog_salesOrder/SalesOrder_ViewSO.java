package dialog_salesOrder;

import com.DatabaseLinker;
import static dialog_salesOrder.SalesOrder_ReturnForm.setJTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class SalesOrder_ViewSO extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    static DatabaseLinker invoice;
    static String query = "SELECT idinvoice AS 'SO No.',date_of_transaction AS 'Date',total_net AS 'Net Amount',payment_type.payment_type_name AS 'SO Type' FROM invoice,payment_type WHERE invoice.payment_type=payment_type.idpayment_type AND total_net != 0";
    static String queryForDealer,queryForWalkin;
    public SalesOrder_ViewSO(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        if(SalesOrder_ReturnForm.cbo_ReturnCType.getSelectedItem().equals("Dealer")) DatabaseLinker.updateTable(tbl_ViewSOList,         queryForDealer = "SELECT idinvoice AS 'SO No.',date_of_transaction AS 'Date',total_net AS 'Net Amount',payment_type.payment_type_name AS 'SO Type' FROM invoice,payment_type WHERE invoice.payment_type=payment_type.idpayment_type AND total_net != 0 AND invoice.customerDealer="+SalesOrder_ReturnForm.iddealer);
        else DatabaseLinker.updateTable(tbl_ViewSOList, "SELECT idinvoice AS 'SO No.',date_of_transaction AS 'Date',total_net AS 'Net Amount',payment_type.payment_type_name AS 'SO Type' FROM invoice,payment_type WHERE invoice.payment_type=payment_type.idpayment_type AND total_net != 0 AND invoice.customerDealer IS NULL");
    }
    public static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
            SalesOrder_ReturnForm.query="SELECT idinvoice AS 'SO No.',idproduct AS 'Code',item_name as 'Name'"
            + ", product_color.color_code AS 'Color',REPLACE(product.product_size, 'NULL', '-') AS 'Size'"
            + ",purchase_order_list.quantity AS 'Qty', unit_price AS 'Price'"
            + ", discounted_price AS '% Price',purchase_order_list.total_price AS 'Net' FROM purchase_order_list,product_color,product "
            + "WHERE product.product_color=product_color.idproduct_color "
            + "AND product.idproduct = purchase_order_list.item_code AND idinvoice="+clickedID_onTable;
            SalesOrder_ReturnForm.txt_ReturnSONo.setText(clickedID_onTable+"");
            DatabaseLinker.updateTable(SalesOrder_ReturnForm.tbl_ReturnList, SalesOrder_ReturnForm.query);
            getTotalNet();
            setJTable();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_ViewSOClose = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbl_ViewSOList = new javax.swing.JTable();
        txt_ViewSO = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        btn_SOSearch = new javax.swing.JButton();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesOrderHistory.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_ViewSOClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ViewSOClose.setText("Close");
        btn_ViewSOClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ViewSOCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ViewSOCloseFocusLost(evt);
            }
        });
        btn_ViewSOClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ViewSOCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ViewSOCloseMouseExited(evt);
            }
        });
        btn_ViewSOClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewSOCloseActionPerformed(evt);
            }
        });

        tbl_ViewSOList.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbl_ViewSOList.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "SO No.", "Date", "Gross", "Net Amount", "SO Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ViewSOList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ViewSOList.getTableHeader().setReorderingAllowed(false);
        tbl_ViewSOList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_ViewSOListMousePressed(evt);
            }
        });
        jScrollPane18.setViewportView(tbl_ViewSOList);
        tbl_ViewSOList.setBackground(Color.WHITE);
        tbl_ViewSOList.setRowHeight(27);
        tbl_ViewSOList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_ViewSOList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_ViewSOList.setShowGrid(true);

        txt_ViewSO.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ViewSO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ViewSO.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ViewSO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ViewSOKeyReleased(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel152.setText("SO No.:");

        btn_SOSearch.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_SOSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/All Search.png"))); // NOI18N
        btn_SOSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SOSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SOSearchFocusLost(evt);
            }
        });
        btn_SOSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SOSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SOSearchMouseExited(evt);
            }
        });
        btn_SOSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SOSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel152)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ViewSO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_SOSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ViewSOClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_SOSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel152)
                        .addComponent(txt_ViewSO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ViewSOClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        btn_SOSearch.registerKeyboardAction(btn_SOSearch.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_SOSearch.registerKeyboardAction(btn_SOSearch.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void getTotalNet()
    {
        float sum = 0;
        int row = SalesOrder_ReturnForm.tbl_ReturnList.getRowCount();
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        
        for(int i=0;i<row;i++)
        {
            StringBuilder sb = new StringBuilder(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 8).toString());
            String resultString = sb.toString();
            sum+=Float.parseFloat(resultString);
        }
        //sum = Float.parseFloat(String.format("%.2f", sum));
        SalesOrder_ReturnForm.lbl_ReturnSalesTotal.setText("₱"+formatter.format(sum));
    }
    private void frameGrabberMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameGrabberMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameGrabberMouseDragged

    private void frameGrabberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameGrabberMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameGrabberMousePressed

    private void btn_ViewSOCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ViewSOCloseFocusGained
        btn_ViewSOClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ViewSOCloseFocusGained

    private void btn_ViewSOCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ViewSOCloseFocusLost
        btn_ViewSOClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ViewSOCloseFocusLost

    private void btn_ViewSOCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewSOCloseMouseEntered
        btn_ViewSOClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ViewSOCloseMouseEntered

    private void btn_ViewSOCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewSOCloseMouseExited
        btn_ViewSOClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ViewSOCloseMouseExited

    private void btn_ViewSOCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewSOCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ViewSOCloseActionPerformed

    private void btn_SOSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SOSearchFocusGained
        btn_SOSearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SOSearchFocusGained

    private void btn_SOSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SOSearchFocusLost
        btn_SOSearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SOSearchFocusLost

    private void btn_SOSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SOSearchMouseEntered
        btn_SOSearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SOSearchMouseEntered

    private void btn_SOSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SOSearchMouseExited
        btn_SOSearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SOSearchMouseExited

    private void btn_SOSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SOSearchActionPerformed
        button.SOSearch();
    }//GEN-LAST:event_btn_SOSearchActionPerformed

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

    private void tbl_ViewSOListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ViewSOListMousePressed
        tableclicked(evt, tbl_ViewSOList);
    }//GEN-LAST:event_tbl_ViewSOListMousePressed

    private void txt_ViewSOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ViewSOKeyReleased
        if(SalesOrder_ReturnForm.iddealer == 0)
        {
            DatabaseLinker.updateTable(tbl_ViewSOList, query+" AND idinvoice LIKE '%"+txt_ViewSO.getText()+"%'");
        }
        else
        {
            DatabaseLinker.updateTable(tbl_ViewSOList, queryForDealer+" AND idinvoice LIKE '%"+txt_ViewSO.getText()+"%'");
        }
    }//GEN-LAST:event_txt_ViewSOKeyReleased

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
            java.util.logging.Logger.getLogger(SalesOrder_ViewSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ViewSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ViewSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ViewSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_ViewSO dialog = new SalesOrder_ViewSO(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_SOSearch;
    protected javax.swing.JButton btn_ViewSOClose;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JLabel logo;
    protected javax.swing.JTable tbl_ViewSOList;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_ViewSO;
    // End of variables declaration//GEN-END:variables
}
