package icm;

import com.DB;
import javax.swing.JFrame;
import dealer.*;
import inventory.*;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import report.InventoryStatus.InvStatus_1stLayer;
import report.InventoryStatus.InvStatus_2ndLayer;
import report.InventoryTrans.InvTransactions_1stLayer;
import report.InventoryTrans.InvTransactions_2ndLayer;
import report.DealerAccount.DealerAccount_1stLayer;
import report.DealerAccount.DealerAccount_2ndLayer;
import report.ReturnHistory.*;
import report.SalesReport.ReportPnl_1stLayer;
import report.SalesReport.ReportPnl_2ndLayer;
import salesOrder.*;
import user.*;

public class ICMMainSystem extends javax.swing.JFrame {

    public ICMMainSystem() {
        initComponents();
        fullScreen(this);
        SalesPnl_1stLayer firstSale = new SalesPnl_1stLayer();
        SalesPnl_2ndLayer secondSale = new SalesPnl_2ndLayer();
        SalesPnl_3rdLayer thirdSale = new SalesPnl_3rdLayer();
        InventoryPnl_1stLayer firstInv = new InventoryPnl_1stLayer();
        InventoryPnl_2ndLayer secondInv = new InventoryPnl_2ndLayer();
        DealerPnl_1stLayer firstDeal = new DealerPnl_1stLayer();
        DealerPnl_2ndLayer secondDeal = new DealerPnl_2ndLayer();
        UserPnl_1stLayer firstUser = new UserPnl_1stLayer();
        UserPnl_2ndLayer secondUser = new UserPnl_2ndLayer();
        ReportPnl_1stLayer firstReport = new ReportPnl_1stLayer();
        ReportPnl_2ndLayer secondReport = new ReportPnl_2ndLayer();
        ReturntPnl_1stLayer firstReturn = new ReturntPnl_1stLayer();
        ReturntPnl_2ndLayer secondReturn = new ReturntPnl_2ndLayer();
        InvTransactions_1stLayer firstInvT = new InvTransactions_1stLayer();
        InvTransactions_2ndLayer secondInvT = new InvTransactions_2ndLayer();
        InvStatus_1stLayer firstInvS = new InvStatus_1stLayer();
        InvStatus_2ndLayer secondInvS = new InvStatus_2ndLayer();
        DealerAccount_1stLayer firstOut = new DealerAccount_1stLayer();
        DealerAccount_2ndLayer secondOut = new DealerAccount_2ndLayer();
        
        pnl_Sales1stLayer.add(firstSale);
        pnl_Sales2ndLayer.add(secondSale);
        pnl_Sales3rdLayer.add(thirdSale);
        pnl_Inventory1stLayer.add(firstInv);
        pnl_Inventory2ndLayer.add(secondInv);
        pnl_Dealer1stLayer.add(firstDeal);
        pnl_Dealer2ndLayer.add(secondDeal);
        pnl_User1stLayer.add(firstUser);
        pnl_User2ndLayer.add(secondUser);
        pnl_Report1stLayer.add(firstReport);
        pnl_Report2ndLayer.add(secondReport);
        pnl_Return1stLayer.add(firstReturn);
        pnl_Return2ndLayer.add(secondReturn);
        pnl_InvStatus1stLayer.add(firstInvS);
        pnl_InvStatus2ndLayer.add(secondInvS);
        pnl_InvTransactions1stLayer.add(firstInvT);
        pnl_InvTransactions2ndLayer.add(secondInvT);
        pnl_Outstanding1stLayer.add(firstOut);
        pnl_Outstanding2ndLayer.add(secondOut);
    }
    
    public void CloseFrame(){
        this.dispose();
    }

    private void fullScreen(JFrame aFrame){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setVisible(true);
        /*this.toFront();
        this.repaint();*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Main = new javax.swing.JPanel();
        Tab_Main = new javax.swing.JTabbedPane();
        pnl_SalesOrder = new javax.swing.JPanel();
        pnl_Sales1stLayer = new javax.swing.JPanel();
        pnl_Sales2ndLayer = new javax.swing.JPanel();
        pnl_Sales3rdLayer = new javax.swing.JPanel();
        pnl_InventoryManagement = new javax.swing.JPanel();
        pnl_Inventory1stLayer = new javax.swing.JPanel();
        pnl_Inventory2ndLayer = new javax.swing.JPanel();
        pnl_DealerAccounts = new javax.swing.JPanel();
        pnl_Dealer1stLayer = new javax.swing.JPanel();
        pnl_Dealer2ndLayer = new javax.swing.JPanel();
        pnl_UserAccounts = new javax.swing.JPanel();
        pnl_User1stLayer = new javax.swing.JPanel();
        pnl_User2ndLayer = new javax.swing.JPanel();
        pnl_Reports = new javax.swing.JPanel();
        Tab_Report = new javax.swing.JTabbedPane();
        pnl_SalesReport = new javax.swing.JPanel();
        pnl_Report1stLayer = new javax.swing.JPanel();
        pnl_Report2ndLayer = new javax.swing.JPanel();
        pnl_InventoryStatus = new javax.swing.JPanel();
        pnl_InvStatus1stLayer = new javax.swing.JPanel();
        pnl_InvStatus2ndLayer = new javax.swing.JPanel();
        pnl_InventoryReport = new javax.swing.JPanel();
        pnl_InvTransactions1stLayer = new javax.swing.JPanel();
        pnl_InvTransactions2ndLayer = new javax.swing.JPanel();
        pnl_ReturnReport = new javax.swing.JPanel();
        pnl_Return1stLayer = new javax.swing.JPanel();
        pnl_Return2ndLayer = new javax.swing.JPanel();
        pnl_OutstandingReport = new javax.swing.JPanel();
        pnl_Outstanding1stLayer = new javax.swing.JPanel();
        pnl_Outstanding2ndLayer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnl_Main.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Main.setPreferredSize(new java.awt.Dimension(1366, 768));
        pnl_Main.setLayout(new java.awt.GridLayout(1, 0));

        Tab_Main.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        Tab_Main.setPreferredSize(new java.awt.Dimension(1366, 768));
        Tab_Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_MainMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Tab_MainMouseReleased(evt);
            }
        });
        Tab_Main.setUI(new BasicTabbedPaneUI() {
            @Override
            protected int calculateTabHeight(
                int tabPlacement, int tabIndex, int fontHeight) {
                return 38; // the height of the tab
            }
            // for the borderless
            private final Insets borderInsets = new Insets(0, 0, 0, 0);
            @Override
            protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
            }
            @Override
            protected Insets getContentBorderInsets(int tabPlacement) {
                return borderInsets;
            }
        });
        UIManager.put("TabbedPane.selected", Color.gray);

        pnl_SalesOrder.setBackground(new java.awt.Color(255, 255, 255));
        pnl_SalesOrder.setPreferredSize(new java.awt.Dimension(1361, 768));

        pnl_Sales1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_Sales2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_Sales3rdLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_SalesOrderLayout = new javax.swing.GroupLayout(pnl_SalesOrder);
        pnl_SalesOrder.setLayout(pnl_SalesOrderLayout);
        pnl_SalesOrderLayout.setHorizontalGroup(
            pnl_SalesOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Sales1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
            .addComponent(pnl_Sales2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
            .addComponent(pnl_Sales3rdLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_SalesOrderLayout.setVerticalGroup(
            pnl_SalesOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SalesOrderLayout.createSequentialGroup()
                .addComponent(pnl_Sales1stLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnl_Sales2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(pnl_Sales3rdLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Main.addTab("SALES ORDER", pnl_SalesOrder);

        pnl_InventoryManagement.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Inventory1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_Inventory2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_InventoryManagementLayout = new javax.swing.GroupLayout(pnl_InventoryManagement);
        pnl_InventoryManagement.setLayout(pnl_InventoryManagementLayout);
        pnl_InventoryManagementLayout.setHorizontalGroup(
            pnl_InventoryManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Inventory1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
            .addComponent(pnl_Inventory2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_InventoryManagementLayout.setVerticalGroup(
            pnl_InventoryManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_InventoryManagementLayout.createSequentialGroup()
                .addComponent(pnl_Inventory1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_Inventory2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Main.addTab("INVENTORY", pnl_InventoryManagement);

        pnl_DealerAccounts.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Dealer1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_Dealer2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_DealerAccountsLayout = new javax.swing.GroupLayout(pnl_DealerAccounts);
        pnl_DealerAccounts.setLayout(pnl_DealerAccountsLayout);
        pnl_DealerAccountsLayout.setHorizontalGroup(
            pnl_DealerAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Dealer1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
            .addComponent(pnl_Dealer2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_DealerAccountsLayout.setVerticalGroup(
            pnl_DealerAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DealerAccountsLayout.createSequentialGroup()
                .addComponent(pnl_Dealer1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_Dealer2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Main.addTab("DEALER ACCOUNTS", pnl_DealerAccounts);

        pnl_UserAccounts.setBackground(new java.awt.Color(255, 255, 255));

        pnl_User1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_User2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_UserAccountsLayout = new javax.swing.GroupLayout(pnl_UserAccounts);
        pnl_UserAccounts.setLayout(pnl_UserAccountsLayout);
        pnl_UserAccountsLayout.setHorizontalGroup(
            pnl_UserAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_User1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
            .addComponent(pnl_User2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_UserAccountsLayout.setVerticalGroup(
            pnl_UserAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_UserAccountsLayout.createSequentialGroup()
                .addComponent(pnl_User1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_User2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Main.addTab("USER ACCOUNTS", pnl_UserAccounts);

        pnl_Reports.setBackground(new java.awt.Color(255, 255, 255));

        Tab_Report.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        Tab_Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_ReportMouseClicked(evt);
            }
        });

        pnl_SalesReport.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Report1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_Report2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_SalesReportLayout = new javax.swing.GroupLayout(pnl_SalesReport);
        pnl_SalesReport.setLayout(pnl_SalesReportLayout);
        pnl_SalesReportLayout.setHorizontalGroup(
            pnl_SalesReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Report1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
            .addComponent(pnl_Report2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_SalesReportLayout.setVerticalGroup(
            pnl_SalesReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SalesReportLayout.createSequentialGroup()
                .addComponent(pnl_Report1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_Report2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Report.addTab("Sales Report", pnl_SalesReport);

        pnl_InventoryStatus.setBackground(new java.awt.Color(255, 255, 255));

        pnl_InvStatus1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_InvStatus2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_InventoryStatusLayout = new javax.swing.GroupLayout(pnl_InventoryStatus);
        pnl_InventoryStatus.setLayout(pnl_InventoryStatusLayout);
        pnl_InventoryStatusLayout.setHorizontalGroup(
            pnl_InventoryStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_InvStatus1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
            .addComponent(pnl_InvStatus2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_InventoryStatusLayout.setVerticalGroup(
            pnl_InventoryStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_InventoryStatusLayout.createSequentialGroup()
                .addComponent(pnl_InvStatus1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_InvStatus2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Report.addTab("Inventory Status", pnl_InventoryStatus);

        pnl_InventoryReport.setBackground(new java.awt.Color(255, 255, 255));

        pnl_InvTransactions1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_InvTransactions2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_InventoryReportLayout = new javax.swing.GroupLayout(pnl_InventoryReport);
        pnl_InventoryReport.setLayout(pnl_InventoryReportLayout);
        pnl_InventoryReportLayout.setHorizontalGroup(
            pnl_InventoryReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_InvTransactions1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
            .addComponent(pnl_InvTransactions2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_InventoryReportLayout.setVerticalGroup(
            pnl_InventoryReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_InventoryReportLayout.createSequentialGroup()
                .addComponent(pnl_InvTransactions1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_InvTransactions2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Report.addTab("Inventory Transactions", pnl_InventoryReport);

        pnl_ReturnReport.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Return1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_Return2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_ReturnReportLayout = new javax.swing.GroupLayout(pnl_ReturnReport);
        pnl_ReturnReport.setLayout(pnl_ReturnReportLayout);
        pnl_ReturnReportLayout.setHorizontalGroup(
            pnl_ReturnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Return1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
            .addComponent(pnl_Return2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_ReturnReportLayout.setVerticalGroup(
            pnl_ReturnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ReturnReportLayout.createSequentialGroup()
                .addComponent(pnl_Return1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_Return2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Report.addTab("Return History", pnl_ReturnReport);

        pnl_OutstandingReport.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Outstanding1stLayer.setLayout(new java.awt.GridLayout(1, 0));

        pnl_Outstanding2ndLayer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnl_OutstandingReportLayout = new javax.swing.GroupLayout(pnl_OutstandingReport);
        pnl_OutstandingReport.setLayout(pnl_OutstandingReportLayout);
        pnl_OutstandingReportLayout.setHorizontalGroup(
            pnl_OutstandingReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Outstanding1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
            .addComponent(pnl_Outstanding2ndLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_OutstandingReportLayout.setVerticalGroup(
            pnl_OutstandingReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OutstandingReportLayout.createSequentialGroup()
                .addComponent(pnl_Outstanding1stLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_Outstanding2ndLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab_Report.addTab("Dealer Account Reports", pnl_OutstandingReport);

        javax.swing.GroupLayout pnl_ReportsLayout = new javax.swing.GroupLayout(pnl_Reports);
        pnl_Reports.setLayout(pnl_ReportsLayout);
        pnl_ReportsLayout.setHorizontalGroup(
            pnl_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab_Report)
        );
        pnl_ReportsLayout.setVerticalGroup(
            pnl_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab_Report)
        );

        Tab_Main.addTab("REPORTS & TRANSACTIONS", pnl_Reports);

        pnl_Main.add(Tab_Main);
        /*Tab_Main.setEnabledAt(1, false);
        Tab_Main.setEnabledAt(2, false);
        Tab_Main.setEnabledAt(3, false);
        */

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tab_MainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_MainMouseClicked
        if(pnl_Sales1stLayer.isShowing())
        {
            SalesPnl_1stLayer.txt_SalesInput.requestFocusInWindow();
        }
        dealer.DealerPnl_1stLayer.tbl_DealerAccounts.clearSelection();
        inventory.InventoryPnl_1stLayer.tbl_InventoryList.clearSelection();
        user.UserPnl_1stLayer.tbl_UserAccounts.clearSelection();
        report.DealerAccount.DealerAccount_1stLayer.tbl_Outstanding.clearSelection();
        report.InventoryStatus.InvStatus_1stLayer.tbl_InvStatus.clearSelection();
        report.InventoryTrans.InvTransactions_1stLayer.tbl_InvTransactions.clearSelection();
        report.ReturnHistory.ReturntPnl_1stLayer.tbl_ReturnReport.clearSelection();
        report.SalesReport.ReportPnl_1stLayer.tbl_ReportSales.clearSelection();
    }//GEN-LAST:event_Tab_MainMouseClicked

    private void Tab_MainMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_MainMouseReleased
        if(pnl_Sales1stLayer.isShowing())
        {
            SalesPnl_1stLayer.txt_SalesInput.requestFocusInWindow();
        }
    }//GEN-LAST:event_Tab_MainMouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        DB.mysqlStop();
       
       System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void Tab_ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_ReportMouseClicked
        report.DealerAccount.DealerAccount_1stLayer.tbl_Outstanding.clearSelection();
        report.InventoryStatus.InvStatus_1stLayer.tbl_InvStatus.clearSelection();
        report.InventoryTrans.InvTransactions_1stLayer.tbl_InvTransactions.clearSelection();
        report.ReturnHistory.ReturntPnl_1stLayer.tbl_ReturnReport.clearSelection();
        report.SalesReport.ReportPnl_1stLayer.tbl_ReportSales.clearSelection();
    }//GEN-LAST:event_Tab_ReportMouseClicked
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ICMMainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICMMainSystem().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane Tab_Main;
    private javax.swing.JTabbedPane Tab_Report;
    private javax.swing.JPanel pnl_Dealer1stLayer;
    private javax.swing.JPanel pnl_Dealer2ndLayer;
    public static javax.swing.JPanel pnl_DealerAccounts;
    private javax.swing.JPanel pnl_InvStatus1stLayer;
    private javax.swing.JPanel pnl_InvStatus2ndLayer;
    private javax.swing.JPanel pnl_InvTransactions1stLayer;
    private javax.swing.JPanel pnl_InvTransactions2ndLayer;
    private javax.swing.JPanel pnl_Inventory1stLayer;
    private javax.swing.JPanel pnl_Inventory2ndLayer;
    public static javax.swing.JPanel pnl_InventoryManagement;
    private javax.swing.JPanel pnl_InventoryReport;
    private javax.swing.JPanel pnl_InventoryStatus;
    private javax.swing.JPanel pnl_Main;
    private javax.swing.JPanel pnl_Outstanding1stLayer;
    private javax.swing.JPanel pnl_Outstanding2ndLayer;
    private javax.swing.JPanel pnl_OutstandingReport;
    private javax.swing.JPanel pnl_Report1stLayer;
    private javax.swing.JPanel pnl_Report2ndLayer;
    private javax.swing.JPanel pnl_Reports;
    private javax.swing.JPanel pnl_Return1stLayer;
    private javax.swing.JPanel pnl_Return2ndLayer;
    private javax.swing.JPanel pnl_ReturnReport;
    private javax.swing.JPanel pnl_Sales1stLayer;
    private javax.swing.JPanel pnl_Sales2ndLayer;
    private javax.swing.JPanel pnl_Sales3rdLayer;
    private javax.swing.JPanel pnl_SalesOrder;
    private javax.swing.JPanel pnl_SalesReport;
    private javax.swing.JPanel pnl_User1stLayer;
    private javax.swing.JPanel pnl_User2ndLayer;
    public static javax.swing.JPanel pnl_UserAccounts;
    // End of variables declaration//GEN-END:variables
}
