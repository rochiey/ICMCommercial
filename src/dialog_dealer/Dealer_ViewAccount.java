package dialog_dealer;

import com.DatabaseLinker;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.xswingx.PromptSupport;

public class Dealer_ViewAccount extends javax.swing.JDialog {

    Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    int xMouse, yMouse;
    DatabaseLinker dealer;
    static String query = "SELECT iddealer AS 'Dealer ID', CONCAT(first_name,' ',last_name) AS 'Name' FROM dealer";
    public Dealer_ViewAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dealer = new DatabaseLinker(tbl_ViewDealerList, query);
        setJTable();
    }

    public void setJTable(){
        setJTableColumnsWidth(tbl_ViewDealerList, 360, 7, 20);
        JTableFixer.setViewDealerTableField(tbl_ViewDealerList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_ViewDealerClose = new javax.swing.JButton();
        btn_ViewDealerSelect = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbl_ViewDealerList = new javax.swing.JTable();
        txt_ViewDealerID = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_DealerVAccount.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_ViewDealerClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ViewDealerClose.setText("Close");
        btn_ViewDealerClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ViewDealerCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ViewDealerCloseFocusLost(evt);
            }
        });
        btn_ViewDealerClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ViewDealerCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ViewDealerCloseMouseExited(evt);
            }
        });
        btn_ViewDealerClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewDealerCloseActionPerformed(evt);
            }
        });

        btn_ViewDealerSelect.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ViewDealerSelect.setText("Select");
        btn_ViewDealerSelect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ViewDealerSelectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ViewDealerSelectFocusLost(evt);
            }
        });
        btn_ViewDealerSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ViewDealerSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ViewDealerSelectMouseExited(evt);
            }
        });
        btn_ViewDealerSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewDealerSelectActionPerformed(evt);
            }
        });

        tbl_ViewDealerList.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbl_ViewDealerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7789", "Dog Food"},
                {"1524", "Cat Food"},
                {"3322", "Rabit Food"},
                {"2948", "Sea Horse Food"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ViewDealerList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ViewDealerList.getTableHeader().setReorderingAllowed(false);
        tbl_ViewDealerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_ViewDealerListMousePressed(evt);
            }
        });
        jScrollPane18.setViewportView(tbl_ViewDealerList);
        tbl_ViewDealerList.setBackground(Color.WHITE);
        tbl_ViewDealerList.setRowHeight(27);
        tbl_ViewDealerList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_ViewDealerList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_ViewDealerList.setShowGrid(true);
        tbl_ViewDealerList.getTableHeader().setResizingAllowed(false);

        txt_ViewDealerID.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ViewDealerID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PromptSupport.setPrompt("Search Dealer", txt_ViewDealerID);
        txt_ViewDealerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ViewDealerIDKeyReleased(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel152.setText("Dealer ID/Name:");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ViewDealerSelect)
                        .addGap(0, 0, 0)
                        .addComponent(btn_ViewDealerClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel152)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ViewDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_DealerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_ViewDealerClose, btn_ViewDealerSelect});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_DealerSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel152)
                        .addComponent(txt_ViewDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ViewDealerSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ViewDealerClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_ViewDealerClose, btn_ViewDealerSelect});

        btn_DealerSearch.registerKeyboardAction(btn_DealerSearch.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_DealerSearch.registerKeyboardAction(btn_DealerSearch.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_ViewDealerSelectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ViewDealerSelectFocusGained
        btn_ViewDealerSelect.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ViewDealerSelectFocusGained

    private void btn_ViewDealerSelectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ViewDealerSelectFocusLost
        btn_ViewDealerSelect.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ViewDealerSelectFocusLost

    private void btn_ViewDealerSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewDealerSelectMouseEntered
        btn_ViewDealerSelect.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ViewDealerSelectMouseEntered

    private void btn_ViewDealerSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewDealerSelectMouseExited
        btn_ViewDealerSelect.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ViewDealerSelectMouseExited

    private void btn_ViewDealerSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewDealerSelectActionPerformed
        int row = tbl_ViewDealerList.getSelectedRow();
        salesOrder.SalesOrder_ButtonFunctions.getDealerDetails((int)tbl_ViewDealerList.getValueAt(row,0));
        //this.dispose();
    }//GEN-LAST:event_btn_ViewDealerSelectActionPerformed

    private void btn_ViewDealerCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ViewDealerCloseFocusGained
        btn_ViewDealerClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ViewDealerCloseFocusGained

    private void btn_ViewDealerCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ViewDealerCloseFocusLost
        btn_ViewDealerClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ViewDealerCloseFocusLost

    private void btn_ViewDealerCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewDealerCloseMouseEntered
        btn_ViewDealerClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ViewDealerCloseMouseEntered

    private void btn_ViewDealerCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewDealerCloseMouseExited
        btn_ViewDealerClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ViewDealerCloseMouseExited

    private void btn_ViewDealerCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewDealerCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ViewDealerCloseActionPerformed

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
        button.dealerSearchVAccount();
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

    private void tbl_ViewDealerListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ViewDealerListMousePressed
        int row = tbl_ViewDealerList.getSelectedRow();
        //txt_ViewDealerID.setText((String) tbl_ViewDealerList.getValueAt(row, 1)); //populating  name in the search textfield
        switch (flag) {
            case 1: //flag of picking sponspor upline
                dialog_dealer.Dealer_NewAccount.txt_NewDealerSponsor.setText((String) tbl_ViewDealerList.getValueAt(row, 1));
                setJTable();
                break;
            case 2: //flag of populating dealer in the dealer information
                salesOrder.SalesOrder_ButtonFunctions.iddealer=dialog_dealer.Dealer_ButtonFunctions.clickedID_onTable;
                setJTable();
                break;
            case 3:
                dialog_salesOrder.SalesOrder_ReturnForm.txt_ReturnCustName.setText(tbl_ViewDealerList.getValueAt(row, 1).toString());
                dialog_salesOrder.SalesOrder_ReturnForm.iddealer=dialog_dealer.Dealer_ButtonFunctions.clickedID_onTable;
                setJTable();
                break;
            case 4:
                report.DealerAccount.CLTransact_Generate.txt_CLDealID.setText(tbl_ViewDealerList.getValueAt(row, 0).toString());
                setJTable();
                break;
            case 5:
                report.ReturnHistory.Return_CustomDate.txt_ReturnCustName.setText(tbl_ViewDealerList.getValueAt(row, 1).toString());
                setJTable();
                break;
            default:
                setJTable();
                break;
        }
        setJTable();
    }//GEN-LAST:event_tbl_ViewDealerListMousePressed

    private void txt_ViewDealerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ViewDealerIDKeyReleased
        try{
            int id = Integer.parseInt(txt_ViewDealerID.getText());
            DatabaseLinker.updateTable(tbl_ViewDealerList, query+" WHERE iddealer LIKE '%"+id+"%'");
            setJTable();
        }catch(NumberFormatException e){
            DatabaseLinker.updateTable(tbl_ViewDealerList, query+" WHERE first_name LIKE '%"+txt_ViewDealerID.getText()+"%'");
            setJTable();
        }
    }//GEN-LAST:event_txt_ViewDealerIDKeyReleased
    public static int flag = 1;
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
            java.util.logging.Logger.getLogger(Dealer_ViewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dealer_ViewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dealer_ViewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dealer_ViewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dealer_ViewAccount dialog = new Dealer_ViewAccount(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    protected static javax.swing.JButton btn_DealerSearch;
    protected javax.swing.JButton btn_ViewDealerClose;
    protected javax.swing.JButton btn_ViewDealerSelect;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_ViewDealerList;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_ViewDealerID;
    // End of variables declaration//GEN-END:variables
}
