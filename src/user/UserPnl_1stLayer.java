package user;

import com.DatabaseLinker;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.xswingx.PromptSupport;

public class UserPnl_1stLayer extends javax.swing.JPanel {

    DatabaseLinker user; 
    static String tableView_Query = "SELECT systemaccount.ID AS 'ID',systemaccount.first_name AS 'First Name',"
            + "systemaccount.last_name AS 'Last Name',systemaccount.middle_name AS 'Middle Name',"
            + "systemaccount.address AS 'Address',systemaccount.username AS 'Username', usertype.usertype_name AS 'Account Type',"
            + "systemaccount.contact_number AS 'Contact No.' FROM systemaccount,usertype "
            + "WHERE systemaccount.usertype = usertype.idusertype";
    
    public UserPnl_1stLayer() {
        initComponents();
        user = new DatabaseLinker(tbl_UserAccounts,tableView_Query);
        setJTable();
    }
    public static void setJTable()
    {
        setJTableColumnsWidth(tbl_UserAccounts, 1330, 6, 13, 13, 11, 26, 11, 10, 10);
        JTableFixer.setUserTableField(tbl_UserAccounts);
    }
    public static void updateTable()
    {
        DatabaseLinker.updateTable(tbl_UserAccounts,tableView_Query);
        setJTable();
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_UserCode = new javax.swing.JLabel();
        txt_UserCode = new javax.swing.JTextField();
        btn_UserSearch = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_UserAccounts = new javax.swing.JTable();
        lbl_UserTemp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbl_UserCode.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_UserCode.setText("User ID/Name:");

        txt_UserCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        PromptSupport.setPrompt("Search User", txt_UserCode);
        txt_UserCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_UserCodeMouseReleased(evt);
            }
        });
        txt_UserCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_UserCodeKeyReleased(evt);
            }
        });

        btn_UserSearch.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_UserSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/All Search.png"))); // NOI18N
        btn_UserSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UserSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UserSearchFocusLost(evt);
            }
        });
        btn_UserSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserSearchMouseExited(evt);
            }
        });
        btn_UserSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserSearchActionPerformed(evt);
            }
        });

        tbl_UserAccounts = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_UserAccounts.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_UserAccounts.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Type", "Username", "Password", "F-Name", "L-Name", "Address", "Contact No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_UserAccounts.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_UserAccounts.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_UserAccounts.getTableHeader().setReorderingAllowed(false);
        tbl_UserAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_UserAccountsMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_UserAccounts);
        tbl_UserAccounts.setBackground(Color.WHITE);
        tbl_UserAccounts.setRowHeight(27);
        tbl_UserAccounts.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_UserAccounts.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_UserAccounts.setShowGrid(true);

        tbl_UserAccounts.getTableHeader().setResizingAllowed(false);

        lbl_UserTemp.setBackground(new java.awt.Color(255, 255, 255));
        lbl_UserTemp.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_UserTemp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_UserTemp.setText("View Full");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_UserCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_UserCode, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_UserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(lbl_UserTemp)
                        .addGap(160, 835, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_UserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_UserCode)
                        .addComponent(txt_UserCode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_UserTemp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_UserSearch, txt_UserCode});

        btn_UserSearch.registerKeyboardAction(btn_UserSearch.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_UserSearch.registerKeyboardAction(btn_UserSearch.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UserSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserSearchFocusGained
        btn_UserSearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserSearchFocusGained

    private void btn_UserSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UserSearchFocusLost
        btn_UserSearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserSearchFocusLost

    private void btn_UserSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserSearchMouseEntered
        btn_UserSearch.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UserSearchMouseEntered

    private void btn_UserSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserSearchMouseExited
        btn_UserSearch.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UserSearchMouseExited

    private void tbl_UserAccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_UserAccountsMousePressed
        dialog_user.User_ButtonFunctions.tableclicked(evt, tbl_UserAccounts);
    }//GEN-LAST:event_tbl_UserAccountsMousePressed

    private void btn_UserSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserSearchActionPerformed
        if(txt_UserCode.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input user id or name to search."
                   + "</font></center></html>", "Error Message", 0);
        }
        else{
           //SQL CODE FOR SEARCHING USER
        }      
    }//GEN-LAST:event_btn_UserSearchActionPerformed

    private void txt_UserCodeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_UserCodeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserCodeMouseReleased

    private void txt_UserCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UserCodeKeyReleased
        
        try{
            int id = Integer.parseInt(txt_UserCode.getText());
            DatabaseLinker.updateTable(UserPnl_1stLayer.tbl_UserAccounts,UserPnl_1stLayer.tableView_Query + " AND systemaccount.ID LIKE '%"+txt_UserCode.getText()+"%'" );
            setJTable();
        }
        catch(NumberFormatException e){
            DatabaseLinker.updateTable(UserPnl_1stLayer.tbl_UserAccounts,UserPnl_1stLayer.tableView_Query + " AND systemaccount.first_name LIKE '%"+txt_UserCode.getText()+"%'" );
            setJTable();
        }
    }//GEN-LAST:event_txt_UserCodeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_UserSearch;
    private javax.swing.JScrollPane jScrollPane8;
    protected static javax.swing.JLabel lbl_UserCode;
    protected static javax.swing.JLabel lbl_UserTemp;
    public static javax.swing.JTable tbl_UserAccounts;
    protected static javax.swing.JTextField txt_UserCode;
    // End of variables declaration//GEN-END:variables
}
