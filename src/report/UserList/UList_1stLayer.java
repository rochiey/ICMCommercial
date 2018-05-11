package report.UserList;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class UList_1stLayer extends javax.swing.JPanel {

    
    public UList_1stLayer() {
        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_UList = new javax.swing.JTable();
        lbl_NewDealerMName = new javax.swing.JLabel();
        lbl_UListDate = new javax.swing.JLabel();
        lbl_InvStatTotal = new javax.swing.JLabel();
        lbl_ULNoOfAccount = new javax.swing.JLabel();
        cbo_UserSort = new javax.swing.JComboBox<>();
        lbl_UserSortBy = new javax.swing.JLabel();
        lbl_InvStatTotal1 = new javax.swing.JLabel();
        lbl_ULNoOfAdmin = new javax.swing.JLabel();
        lbl_ULNoOfUser = new javax.swing.JLabel();
        lbl_InvStatTotal2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_UList = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_UList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_UList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "First Name", "Middle Name", "Last Name", "User Name", "User Type", "Date Registered"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_UList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_UList.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_UList.getTableHeader().setReorderingAllowed(false);
        tbl_UList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_UListMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_UList);
        tbl_UList.setBackground(Color.WHITE);
        tbl_UList.setRowHeight(27);
        tbl_UList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_UList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_UList.setShowGrid(true);

        lbl_NewDealerMName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDealerMName.setText("User List (From-To):");
        lbl_NewDealerMName.setVisible(false);

        lbl_UListDate.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_UListDate.setForeground(new java.awt.Color(0, 0, 255));
        lbl_UListDate.setText("July 22 - July 30");
        lbl_UListDate.setVisible(false);

        lbl_InvStatTotal.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatTotal.setText("Total No. of Account:");
        lbl_InvStatTotal.setVisible(false);

        lbl_ULNoOfAccount.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_ULNoOfAccount.setForeground(new java.awt.Color(0, 0, 255));
        lbl_ULNoOfAccount.setText("0");
        lbl_ULNoOfAccount.setVisible(false);

        cbo_UserSort.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_UserSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Account Type" }));
        cbo_UserSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_UserSortActionPerformed(evt);
            }
        });

        lbl_UserSortBy.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lbl_UserSortBy.setText("Sort by:");

        lbl_InvStatTotal1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatTotal1.setText("Admin Account:");
        lbl_InvStatTotal1.setVisible(false);

        lbl_ULNoOfAdmin.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_ULNoOfAdmin.setForeground(new java.awt.Color(0, 0, 255));
        lbl_ULNoOfAdmin.setText("0");
        lbl_ULNoOfAdmin.setVisible(false);

        lbl_ULNoOfUser.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbl_ULNoOfUser.setForeground(new java.awt.Color(0, 0, 255));
        lbl_ULNoOfUser.setText("0");
        lbl_ULNoOfUser.setVisible(false);

        lbl_InvStatTotal2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_InvStatTotal2.setText("User Account:");
        lbl_InvStatTotal2.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_NewDealerMName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_UListDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_UserSortBy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_UserSort, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_InvStatTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_ULNoOfAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(lbl_InvStatTotal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ULNoOfAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_InvStatTotal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ULNoOfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_UserSort, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_UserSortBy)
                    .addComponent(lbl_NewDealerMName)
                    .addComponent(lbl_UListDate))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_InvStatTotal)
                    .addComponent(lbl_ULNoOfAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_InvStatTotal2)
                        .addComponent(lbl_ULNoOfUser))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_InvStatTotal1)
                        .addComponent(lbl_ULNoOfAdmin)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_UListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_UListMousePressed
        
    }//GEN-LAST:event_tbl_UListMousePressed

    private void cbo_UserSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_UserSortActionPerformed
        if(cbo_UserSort.getSelectedItem().equals("Default")){
            //default view
            //updateTable();
        }

        else if(cbo_UserSort.getSelectedItem().equals("Account Type")){
            UList_AccountType user = new UList_AccountType(null, true);
            user.pack();
            user.setLocationRelativeTo(null);
            user.setVisible(true);
        }

    }//GEN-LAST:event_cbo_UserSortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JComboBox<String> cbo_UserSort;
    private javax.swing.JScrollPane jScrollPane8;
    protected static javax.swing.JLabel lbl_InvStatTotal;
    protected static javax.swing.JLabel lbl_InvStatTotal1;
    protected static javax.swing.JLabel lbl_InvStatTotal2;
    protected static javax.swing.JLabel lbl_NewDealerMName;
    protected static javax.swing.JLabel lbl_ULNoOfAccount;
    protected static javax.swing.JLabel lbl_ULNoOfAdmin;
    protected static javax.swing.JLabel lbl_ULNoOfUser;
    protected static javax.swing.JLabel lbl_UListDate;
    protected static javax.swing.JLabel lbl_UserSortBy;
    protected static javax.swing.JTable tbl_UList;
    // End of variables declaration//GEN-END:variables
}
