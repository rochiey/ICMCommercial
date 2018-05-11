package dealer;

import com.DatabaseLinker;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import static dealer.DealerPnl_1stLayer.tbl_DealerAccounts;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.xswingx.PromptSupport;

public class DealerPnl_1stLayer extends javax.swing.JPanel {

    Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
    DatabaseLinker dealer;
    
    //static String dealerTableQuery = "SELECT iddealer AS 'Dealer ID',first_name AS 'First Name',last_name AS 'Last Name',address AS 'Address',contact_number AS 'Contact Number',credit_limit AS 'Credit Line',available_credit AS 'Available Credit',max_return_days AS 'Max Return Days' FROM dealer";
    static String dealerTableQuery = "SELECT iddealer AS 'ID',first_name AS 'First Name',last_name AS 'Last Name',"
            + "middle_name AS 'Middle Name', address AS 'Address', email_address AS 'Email Address', "
            + "contact_number AS 'Contact No.' FROM dealer";
    public DealerPnl_1stLayer() {
        initComponents();
        dealer = new DatabaseLinker(tbl_DealerAccounts, dealerTableQuery);
        setJTable();
    }
    public static void setJTable()
    {
        setJTableColumnsWidth(tbl_DealerAccounts, 1330, 6, 13, 13, 11, 26, 21, 10);
        JTableFixer.setDealerTableField(tbl_DealerAccounts);
    }
    public static void updateTable()
    {
        DatabaseLinker.updateTable(tbl_DealerAccounts, dealerTableQuery);
        setJTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_DealerCode = new javax.swing.JLabel();
        txt_DealerCode = new javax.swing.JTextField();
        btn_DealerSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_DealerAccounts = new javax.swing.JTable();
        lbl_DealerTemp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbl_DealerCode.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_DealerCode.setText("Dealer ID/Name:");

        txt_DealerCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        PromptSupport.setPrompt("Search Dealer", txt_DealerCode);
        txt_DealerCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DealerCodeActionPerformed(evt);
            }
        });
        txt_DealerCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_DealerCodeKeyReleased(evt);
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

        tbl_DealerAccounts = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_DealerAccounts.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_DealerAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "F-Name", "L-Name", "Address", "Contact No.", "Credit Line", "Avail. Credit", "Return Days"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DealerAccounts.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_DealerAccounts.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_DealerAccounts.getTableHeader().setReorderingAllowed(false);
        tbl_DealerAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_DealerAccountsMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_DealerAccounts);
        if (tbl_DealerAccounts.getColumnModel().getColumnCount() > 0) {
            tbl_DealerAccounts.getColumnModel().getColumn(0).setResizable(false);
            tbl_DealerAccounts.getColumnModel().getColumn(1).setResizable(false);
            tbl_DealerAccounts.getColumnModel().getColumn(2).setResizable(false);
            tbl_DealerAccounts.getColumnModel().getColumn(3).setResizable(false);
            tbl_DealerAccounts.getColumnModel().getColumn(4).setResizable(false);
            tbl_DealerAccounts.getColumnModel().getColumn(5).setResizable(false);
            tbl_DealerAccounts.getColumnModel().getColumn(6).setResizable(false);
            tbl_DealerAccounts.getColumnModel().getColumn(7).setResizable(false);
        }
        tbl_DealerAccounts.setBackground(Color.WHITE);
        tbl_DealerAccounts.setRowHeight(27);
        tbl_DealerAccounts.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_DealerAccounts.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_DealerAccounts.setShowGrid(true);

        tbl_DealerAccounts.getTableHeader().setResizingAllowed(false);

        lbl_DealerTemp.setBackground(new java.awt.Color(255, 255, 255));
        lbl_DealerTemp.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_DealerTemp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_DealerTemp.setText("View Full");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_DealerCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_DealerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_DealerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lbl_DealerTemp)
                        .addGap(160, 832, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_DealerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_DealerCode)
                        .addComponent(txt_DealerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_DealerTemp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_DealerSearch, txt_DealerCode});

        btn_DealerSearch.registerKeyboardAction(btn_DealerSearch.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_DealerSearch.registerKeyboardAction(btn_DealerSearch.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    }// </editor-fold>//GEN-END:initComponents

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
        button.dealerSearch();
        //JOptionPane.showMessageDialog(null, tbl_DealerAccounts.getWidth());
    }//GEN-LAST:event_btn_DealerSearchActionPerformed

    private void tbl_DealerAccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DealerAccountsMousePressed
        dialog_dealer.Dealer_ButtonFunctions.tableclicked(evt, tbl_DealerAccounts);
    }//GEN-LAST:event_tbl_DealerAccountsMousePressed

    private void txt_DealerCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DealerCodeKeyReleased
        try{
            int id = Integer.parseInt(txt_DealerCode.getText());
            DatabaseLinker.updateTable(tbl_DealerAccounts, dealerTableQuery+" WHERE dealer.iddealer LIKE '%"+txt_DealerCode.getText()+"%'");
            setJTable();
        }
        catch(NumberFormatException e)
        {
            DatabaseLinker.updateTable(tbl_DealerAccounts, dealerTableQuery+" WHERE dealer.first_name LIKE '%"+txt_DealerCode.getText()+"%'");
            setJTable();
        }    
    }//GEN-LAST:event_txt_DealerCodeKeyReleased

    private void txt_DealerCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DealerCodeActionPerformed
        
    }//GEN-LAST:event_txt_DealerCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_DealerSearch;
    private javax.swing.JScrollPane jScrollPane3;
    protected static javax.swing.JLabel lbl_DealerCode;
    protected static javax.swing.JLabel lbl_DealerTemp;
    protected static javax.swing.JTable tbl_DealerAccounts;
    protected static javax.swing.JTextField txt_DealerCode;
    // End of variables declaration//GEN-END:variables
}
