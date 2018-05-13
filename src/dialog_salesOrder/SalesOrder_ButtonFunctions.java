package dialog_salesOrder;

import com.DatabaseLinker;
import static dialog_salesOrder.SalesOrder_CreditHistory.cbo_CreditSort;
import static dialog_salesOrder.SalesOrder_Discount.txt_Discount;
import static dialog_salesOrder.SalesOrder_ReturnEditQty.txt_ReturnEditQty;
import static dialog_salesOrder.SalesOrder_ReturnForm.btn_ReturnCName;
import static dialog_salesOrder.SalesOrder_ReturnForm.cbo_ReturnCType;
import static dialog_salesOrder.SalesOrder_ReturnForm.lbl_ReturnCustomer;
import static dialog_salesOrder.SalesOrder_ReturnForm.txt_ReturnSONo;
import static dialog_salesOrder.SalesOrder_ViewInventory.txt_ProductName;
import static dialog_salesOrder.SalesOrder_ViewSO.txt_ViewSO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static salesOrder.SalesOrder_ButtonFunctions.*;
import salesOrder.SalesPnl_1stLayer;
import static salesOrder.SalesPnl_1stLayer.txt_SalesInput;
import salesOrder.SalesPnl_2ndLayer;


public class SalesOrder_ButtonFunctions {
    
    static SalesOrder_Void sales = new SalesOrder_Void(null, true);
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null; 
    public static void createDB()
    {
        try {
            Properties prop=new Properties();
            prop.setProperty("user","root");
            prop.setProperty("password","");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ICM",prop);
            stmt= conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    static int successEx = 0;
    public static void dbHandlerUpdates(String query)
    {
        
        try{
        createDB();
         successEx = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Error:Code:Sql Command"
                   + "</font></center></html>", "Error Message", 0);
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:session:connectionCloseDbHandlerUpdates(query)"
                   + "</font></center></html>", "Error Message", 0);
            }
        }
    }
    public static String clickedBarcode = "";
//    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
//    {
//        if(evt.getClickCount() >= 1 )
//        {
//            int row = tbl_data.getSelectedRow();
//            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
//        }
//        
//    }
    
    protected void creditDateSort(javax.swing.JComboBox cboOption)
    {
        if(cboOption.getSelectedItem().equals("Ascending")) DatabaseLinker.updateTable(SalesOrder_CreditHistory.tbl_CreditHistory, SalesOrder_CreditHistory.query+" ORDER BY due_date ASC");
        else DatabaseLinker.updateTable(SalesOrder_CreditHistory.tbl_CreditHistory, SalesOrder_CreditHistory.query+" ORDER BY due_date DESC");
    }
    
    protected void creidtHistorySort(){
        if(cbo_CreditSort.getSelectedItem().equals("Default")){
            DatabaseLinker.updateTable(SalesOrder_CreditHistory.tbl_CreditHistory, SalesOrder_CreditHistory.query);
        }
        else if(cbo_CreditSort.getSelectedItem().equals("Due Date")){
            SalesOrder_DueDate sales = new SalesOrder_DueDate(null, true);
            sales.pack();
            sales.setLocationRelativeTo(null);
            sales.setVisible(true);
        }
        else {
            SalesOrder_CreditAmount sales = new SalesOrder_CreditAmount(null, true);
            sales.pack();
            sales.setLocationRelativeTo(null);
            sales.setVisible(true);
        }
    }
    
    protected void discountConfirm(){
        if(txt_Discount.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input discount to confirm transaction."
                   + "</font></center></html>", "Error Message", 0);
        }
        else{
            /*SalesOrder_Discount sales = new SalesOrder_Discount(null, true);
            sales.dispose();*/
            int dialogButton = JOptionPane.YES_NO_CANCEL_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "<html><center><font size=4>Apply discount to all product orders?"
                   + "</font></center></html>","Confirmation Message",dialogButton);
            switch (dialogResult) {
                case JOptionPane.YES_OPTION:
                    int rowCount = SalesPnl_2ndLayer.tbl_SalesCart.getRowCount();
                    int discount = Integer.parseInt(SalesOrder_Discount.txt_Discount.getText());
                    for(int i=0;i<rowCount;i++)
                    {
                        DecimalFormat df = new DecimalFormat("#,###.00");
                        salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(discount, i, 7);
                       // salesOrder.SalesPnl_1stLayer.txt_SalesInput.setText(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString());
                        SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(Float.parseFloat(String.format("%.2f", getTotalDiscountedPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 7).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString())))), i, 8);
                        salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(Float.parseFloat(String.format("%.2f", salesOrder.SalesOrder_ButtonFunctions.getTotalPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 7).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 5).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString())))), i, 9);
                        salesOrder.SalesPnl_2ndLayer.getTotalNet();
                    }
                    break;
            
                case JOptionPane.NO_OPTION:
                    if (JOptionPane.showConfirmDialog(null, "<html><center><font size=4>Are you sure you want to edit this item?"
                   + "</font></center></html>", "Confirmation Message",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        discount = Integer.parseInt(SalesOrder_Discount.txt_Discount.getText());
                        try{
                            DecimalFormat df = new DecimalFormat("#,###.00");
                            salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(discount, SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7);
                           // salesOrder.SalesPnl_1stLayer.txt_SalesInput.setText(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 1).toString());
                            SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(String.format("%.2f", getTotalDiscountedPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7).toString(), clickedBarcode))), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 8);
                            salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(String.format("%.2f", salesOrder.SalesOrder_ButtonFunctions.getTotalPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 5).toString(), clickedBarcode))), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 9);
                            salesOrder.SalesPnl_2ndLayer.getTotalNet();
                        }catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null, "Please enter correct quantity");
                        }
                    } 
                    break;
                default:
                    //CANCEL PROMPT. BACK TO DISCOUNT DIALOG
                    break;
            }
        }
    }
    
    protected void editConfirm(){
        //NOTE: ITEM MUST BE SELECTED FIRST BEFORE EDITING
        if (JOptionPane.showConfirmDialog(null, "<html><center><font size=4>Are you sure you want to edit this item?"
                   + "</font></center></html>", "Confirmation Message",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try{
                DecimalFormat df = new DecimalFormat("#,###.00");
                Integer quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter new quantity"));
                createDB();
                int currentQuantity=0;
                rs = stmt.executeQuery("SELECT quantity FROM product WHERE idproduct="+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(0, 1));
                while(rs.next())
                {
                    currentQuantity = rs.getInt("quantity");
                }
                if(quantity<currentQuantity && quantity >0)
                {
                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(quantity, SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 5);
                    salesOrder.SalesPnl_1stLayer.txt_SalesInput.setText(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(0, 1).toString());
                    StringBuilder sb = new StringBuilder(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 8).toString());
                    sb.deleteCharAt(0);
                    Float discountedPrice = Float.parseFloat(sb.toString());
                    discountedPrice*=quantity;
                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(discountedPrice), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 9);
                    salesOrder.SalesPnl_2ndLayer.getTotalNet();
                }else JOptionPane.showMessageDialog(null, "The input quantity is either above the stored quantity or below zero. Please try again.");
            }catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Please enter correct quantity");
            }
        } 
        else {
                //STAY ON THIS FRAME
        }
    }
    
    protected void voidConfirm(){
         //NOTE: ITEM MUST BE SELECTED FIRST BEFORE REMOVING
        if (JOptionPane.showConfirmDialog(null, "<html><center><font size=4>Are you sure you want to remove this item?"
                   + "</font></center></html>", "Confirmation Message",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                salesOrder.SalesPnl_2ndLayer.tblModel.removeRow(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow());
                for(int i=0;i<salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getRowCount();i++)
                {
                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(i+1, i, 0);
                }
                SalesPnl_2ndLayer.getTotalNet();
        } 
        else {
                //STAY ON THIS FRAME
        }
    }
    public static float getRealFloat(String floatNum)
    {
        StringBuilder sb = new StringBuilder(floatNum);
        for(int i=0;i<floatNum.length();i++)
        {
            if(floatNum.charAt(i) == ',') sb.deleteCharAt(i);
        }
        float result = Float.parseFloat(sb.toString());
        return result;
    }
    protected void cashTenderAccept()
    {
        if(salesOrder.SalesOrder_ButtonFunctions.customerInfo[1][1] != "")
        {
            StringBuilder sb = new StringBuilder(SalesOrder_Tender.lbl_CashTotal.getText());
            sb.deleteCharAt(0);
            float change=0,amountoPurchase = 0,totalNet = getRealFloat(sb.toString());
            try{
                amountoPurchase = Float.parseFloat(SalesOrder_Tender.txt_CashAmount.getText());
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Please enter correct account");
            }
            if(amountoPurchase<totalNet) JOptionPane.showMessageDialog(null, "You don't meet the required amount to purchase.");
            else
            {
                dialog_salesOrder.SalesOrder_ButtonFunctions.toPurchaseOrder();
                dialog_salesOrder.SalesOrder_ButtonFunctions.dbHandlerUpdates("UPDATE invoice SET payment_type=234,amount_paid="+amountoPurchase+",total_net="+totalNet+" WHERE idinvoice="+salesOrder.SalesOrder_ButtonFunctions.invoiceID);
                dialog_salesOrder.SalesOrder_ButtonFunctions.dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,POid,remarks) VALUES((SELECT CURDATE()),'Sales Order',"+salesOrder.SalesOrder_ButtonFunctions.invoiceID+",'Cash')");
                SalesOrder_Tender.dbHandlerUpdates("DELETE FROM invoice WHERE total_net IS NULL");
                salesOrder.SalesOrder_ButtonFunctions.SalesOrderNew();
                JOptionPane.showMessageDialog(null, "Transaction done.");
                inventory.InventoryPnl_1stLayer.updateTable();
                //this.dispose();
            }
        }
        else JOptionPane.showMessageDialog(null, "No customers input. Please try again");
    }
    public static void toPurchaseOrder()
    {
        int rowCount = SalesPnl_2ndLayer.tbl_SalesCart.getRowCount(); Object idprod = 0; Integer quantity = 0, oldquantity=0;
        for(int i =0;i<rowCount ; i++)
        {
            createDB();
            idprod = SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1);
            quantity = Integer.parseInt(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 5).toString());
            try {
                rs = stmt.executeQuery("SELECT quantity FROM product WHERE idproduct="+idprod);
                while(rs.next())
                {
                    oldquantity = Integer.parseInt(rs.getObject("quantity").toString());
                }
            } catch (SQLException ex) {
                Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            }
            oldquantity-=quantity;
            StringBuilder retailPrice = new StringBuilder(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 6).toString());
            StringBuilder discountedPrice = new StringBuilder(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 8).toString());
            StringBuilder totalNetPrice = new StringBuilder(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 9).toString());
            retailPrice.deleteCharAt(0);
            discountedPrice.deleteCharAt(0);
            totalNetPrice.deleteCharAt(0);
            dbHandlerUpdates("UPDATE product SET quantity="+oldquantity+" WHERE idproduct="+idprod);
            System.out.println(salesOrder.SalesOrder_ButtonFunctions.invoiceID);
            dbHandlerUpdates("INSERT INTO purchase_order_list(idinvoice,item_code,item_name,quantity,unit_price,discount_percent,discounted_price,total_price) VALUES("+salesOrder.SalesOrder_ButtonFunctions.invoiceID+","+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1)+",'"+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 2)+"',"+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 5)+","+getRealFloat(retailPrice.toString())+","+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 7)+","+getRealFloat(discountedPrice.toString())+","+getRealFloat(totalNetPrice.toString())+")");
        }
    }
    protected void creditAccept()
    {
        if(SalesOrder_Tender.hasAvailableCredit())
        {
            StringBuilder sb = new StringBuilder(SalesOrder_Tender.lbl_CreditTotal.getText());
            sb.deleteCharAt(0);
            float totalNetCredit = getRealFloat(sb.toString());
            if(SalesOrder_Tender.isHugeThanLimit(totalNetCredit))
            {
                createDB(); Float availableCredit =null; Float currentBal=null;
                try {
                    rs= stmt.executeQuery("SELECT available_credit,balance FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                    while(rs.next())
                    {
                        availableCredit = rs.getFloat("available_credit");
                        currentBal = rs.getFloat("balance");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                }
                availableCredit-=totalNetCredit;
                currentBal+=totalNetCredit;
                String duedate = SalesOrder_Tender.date_CreditDue.getEditor().getText();
                String format = "%Y-%m-%d";
                dbHandlerUpdates("UPDATE invoice SET payment_type=243,amount_paid=0,total_net="+totalNetCredit+" WHERE idinvoice="+salesOrder.SalesOrder_ButtonFunctions.invoiceID);
                dbHandlerUpdates("UPDATE dealer SET available_credit="+availableCredit+",balance="+currentBal+" WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,POid,remarks) VALUES((SELECT CURDATE()),'Sales Order',"+salesOrder.SalesOrder_ButtonFunctions.invoiceID+",'Credit')");
                dbHandlerUpdates("INSERT INTO credit_transaction(invoice_ID,transaction_date,dealer_ID,total_net,amount,paymentTypeID,due_date,penalty) VALUES("+salesOrder.SalesOrder_ButtonFunctions.invoiceID+",(SELECT CURDATE()),"+salesOrder.SalesOrder_ButtonFunctions.iddealer+","+totalNetCredit+",0,243,STR_TO_DATE('"+duedate+"','"+format+"'),0)");
                toPurchaseOrder();
                JOptionPane.showMessageDialog(null, "Transaction Done");
                inventory.InventoryPnl_1stLayer.updateTable();
                salesOrder.SalesOrder_ButtonFunctions.SalesOrderNew();
            }
            else JOptionPane.showMessageDialog(null, "Total Net Credit is bigger than the Dealer's Available Credit. Please try again.");
        }
        else JOptionPane.showConfirmDialog(null, "Dealer has no available credits left.");
    }
    
    public static boolean isCreditDue(int id){
        boolean flag=false;
        createDB();
        try {
            rs = stmt.executeQuery("SELECT due_date,CURDATE() AS 'date today' FROM credit_transaction WHERE due_date IS NOT NULL AND paymentTypeID=243 AND dealer_ID="+id);
            while(rs.next())
            {
                Date duedate = rs.getDate("due_date");
                Date today = rs.getDate("date today");
                if(today.after(duedate)) flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    public static void generatePenalty()
    {
        Vector iddealer = new Vector();
        createDB();
        try {
            rs=stmt.executeQuery("SELECT iddealer FROM dealer");
            while(rs.next())
            {
                iddealer.add(rs.getObject("iddealer"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<iddealer.size();i++)
        {
            if(isCreditDue((int) iddealer.get(i)))
            {
                int daysleft=0; float money=0,penalty=0;
                try {
                    createDB();
                    rs = stmt.executeQuery("SELECT DATEDIFF(due_date,CURDATE()) as 'days',total_net,penalty FROM credit_transaction WHERE dealer_ID="+iddealer.get(i));
                    while(rs.next())
                    {
                        daysleft=rs.getInt("days");
                        money = rs.getFloat("total_net");
                        penalty = rs.getFloat("penalty");
                        if(daysleft==-1) //1st week
                        {
                            float temp = (float) (money*0.02);
                            penalty+=temp;
                            money+=temp;
                            dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+", total_net="+money);
                        }
                        else if(daysleft==-8)//2nd week
                        {
                            float temp = (float) (money*0.05);
                            penalty+=temp;
                            money+=temp;
                            dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+", total_net="+money);
                        }
                        else if(daysleft==-15)//3rd week
                        {
                            float temp = (float) (money*0.05);
                            penalty+=temp;
                            money+=temp;
                            dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+", total_net="+money);
                        }
                        else if(daysleft==-22)//4th week
                        {
                            float temp = (float) (money*0.05);
                            penalty+=temp;
                            money+=temp;
                            dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+", total_net="+money);
                        }
                        else if(daysleft==-29)//5th week
                        {
                            float temp = (float) (money*0.10);
                            penalty+=temp;
                            money+=temp;
                            dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+", total_net="+money);
                        }
                        //after 5th week, send demand letter to the unpaid dealer. after 1 month of demand letter. send subpoena and file a case
                    }
                 createDB();
                 float totalBalance=0;
                 rs=stmt.executeQuery("SELECT total_net FROM credit_transaction WHERE paymentTypeID=243 AND dealer_ID="+iddealer.get(i));
                 while(rs.next())
                 {
                     totalBalance+=rs.getFloat("total_net");
                 }
                    dbHandlerUpdates("UPDATE dealer SET balance="+totalBalance);
                } catch (SQLException ex) {
                    Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    protected void creditAmountSort(javax.swing.JComboBox cboOption)
    {
        if(cboOption.getSelectedItem().equals("Ascending")) DatabaseLinker.updateTable(SalesOrder_CreditHistory.tbl_CreditHistory, SalesOrder_CreditHistory.query+" ORDER BY total_net ASC");
        else DatabaseLinker.updateTable(SalesOrder_CreditHistory.tbl_CreditHistory, SalesOrder_CreditHistory.query+" ORDER BY total_net DESC");
    }
    
    protected void creditSelect(){
        //txt_CPullCash.requestFocusInWindow();
    }
    
    protected void pullOutAccept()
    {
        if(salesOrder.SalesOrder_ButtonFunctions.customerInfo[1][1] != "")
        {
            StringBuilder sb = new StringBuilder(SalesOrder_Tender.lbl_CPullBalance.getText());
            sb.deleteCharAt(0);
            float change=0,amountoPurchase = 0,totalNet = getRealFloat(sb.toString());
            try{
                amountoPurchase = Float.parseFloat(SalesOrder_Tender.txt_CPullCash.getText());
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Please enter correct account");
            }
            if(amountoPurchase<totalNet) JOptionPane.showMessageDialog(null, "You don't meet the required amount to pay.");
            else
            {
                Float creditLine = null,balance=null;
                createDB();
                try {
                    rs = stmt.executeQuery("SELECT credit_limit,balance FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                    while(rs.next())
                    {
                        creditLine = rs.getFloat("credit_limit");
                        balance = rs.getFloat("balance");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
                }
                Float creditLineIncrease = (float)(amountoPurchase*.20)+creditLine;
                Float availableCredit = (float)(amountoPurchase*.20)+creditLine;
                balance-=totalNet;
                dbHandlerUpdates("UPDATE dealer SET credit_limit="+creditLineIncrease+",available_credit="+availableCredit+", balance="+balance+" WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                if(SalesOrder_Tender.invoiceID == 0){
                    dbHandlerUpdates("INSERT INTO credit_transaction(transaction_date,dealer_ID,total_net,amount,paymentTypeID,penalty) VALUES((SELECT CURDATE()),"+salesOrder.SalesOrder_ButtonFunctions.iddealer+","+totalNet+","+amountoPurchase+",432,0)");
                    dbHandlerUpdates("UPDATE credit_transaction SET due_date=NULL where dealer_ID="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                }
                else{
                    dbHandlerUpdates("INSERT INTO credit_transaction(invoice_ID,transaction_date,dealer_ID,total_net,amount,paymentTypeID,penalty) VALUES("+SalesOrder_Tender.invoiceID+",(SELECT CURDATE()),"+salesOrder.SalesOrder_ButtonFunctions.iddealer+","+totalNet+","+amountoPurchase+",432,0)");
                    dbHandlerUpdates("UPDATE credit_transaction SET due_date=NULL where invoice_ID="+SalesOrder_Tender.invoiceID);
                }
                salesOrder.SalesOrder_ButtonFunctions.SalesOrderNew();
                JOptionPane.showMessageDialog(null, "Transaction done.");
            }
        }
        else JOptionPane.showMessageDialog(null, "No customers input. Please try again");
    }
    
    
    protected void pullViewCredit(){
        SalesOrder_CreditHistory sales = new SalesOrder_CreditHistory(null, true);
        sales.pack();
        sales.setLocationRelativeTo(null);
        sales.setVisible(true);
    }
    
    protected void SOHistory(){
        SalesOrder_ViewSO sales = new SalesOrder_ViewSO(null, true);
        sales.pack();
        sales.setLocationRelativeTo(null);
        sales.setVisible(true);
    }
    
    protected void productSearchViewInventory(){
        if (txt_ProductName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input product code or <font color=white></font>"
                + "<br/>name to search and try again.</font></center></html>", "Error Message", 0);
        }
        else{
            //SEARCH PRODUCT
        }
    }
    public static int inventoryView = 0;
    public static boolean isHigherQuantity(int quantity)
    {
        createDB(); 
        int dbQuantity = 0;
        try {
            rs = stmt.executeQuery("SELECT quantity FROM product WHERE idproduct="+barcode);
            while(rs.next())
            {
                if(rs.getObject("quantity") != null)dbQuantity = Integer.parseInt(rs.getObject("quantity").toString());
                //else JOptionPane.showMessageDialog(null, "The quantity is empty. Please try again later.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(quantity>dbQuantity) return true;
        else return false;
    }
    protected static String barcode = "";
    protected void addCart(){
        
            if(inventoryView==0)
            {
                        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
                        if(isHigherQuantity(quantity) || quantity <= 0) //higher && below quantity trapped
                        {
                            JOptionPane.showMessageDialog(null,"conflict with the product's stored quantity.");
                            SalesPnl_1stLayer.txt_SalesInput.setText("");
                            this.barcode = ""; //revert to init
                        }
                        else{
                            
                            try{
                                if(!checkDuplicate(barcode)){
                                    if(customerInfo[0][1] == "Dealer")
                                    {
                                        updateCustomerInfo();
                                        setProduct_toCart(this.barcode);
                                        SalesPnl_2ndLayer.getTotalNet();
                                    }else{
                                        customerInfo[0][1] = "Walk-in";
                                        customerInfo[1][1] = " ";
                                        customerInfo[2][1]="₱0.00";
                                        customerInfo[3][1]="₱0.00";
                                        customerInfo[4][1]="₱0.00";
                                        updateCustomerInfo();
                                        getCustomerName();
                                        setProduct_toCart(this.barcode);
                                        SalesPnl_2ndLayer.getTotalNet();
                                    }
                                }
                                else
                                {
                                    for(int i=0;i<salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getRowCount();i++)
                                    {
                                        DecimalFormat df = new DecimalFormat("#,###.00");
                                        if(txt_SalesInput.getText().equals(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString()))
                                        {
                                            createDB();
                                            int currentQuantity=0;
                                            try
                                            {
                                                rs = stmt.executeQuery("SELECT quantity FROM product WHERE idproduct="+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(0, 1));
                                                while(rs.next())
                                                {
                                                    currentQuantity = rs.getInt("quantity");
                                                }
                                                if(quantity<currentQuantity && quantity >0)
                                                {
                                                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(quantity, i, 5);
                                                    salesOrder.SalesPnl_1stLayer.txt_SalesInput.setText(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(0, 1).toString());
                                                    StringBuilder sb = new StringBuilder(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 8).toString());
                                                    sb.deleteCharAt(0);
                                                    Float discountedPrice = Float.parseFloat(sb.toString());
                                                    discountedPrice*=quantity;
                                                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(String.format("%.2f", discountedPrice)), i, 9);
                                                    salesOrder.SalesPnl_2ndLayer.getTotalNet();
                                                }else JOptionPane.showMessageDialog(null, "The input quantity is either above the stored quantity or below zero. Please try again.");
                                            }catch(SQLException e)
                                            {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                }
                            }catch(NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null, "Please enter Product ID correctly");
                            }
                            SalesPnl_2ndLayer.getTotalNet();

                        }
            }
            else if(inventoryView==1)
            {
                dialog_inventory.Inventory_ProductMovement.txt_ArticleName.setText(dialog_salesOrder.SalesOrder_ViewInventory.clickedBarcode_onTable+"");
                
            }
    }
    
    protected void customerType(){
        if(cbo_ReturnCType.getSelectedItem().equals("Dealer")){
            lbl_ReturnCustomer.setText("Dealer ID/Name:");
            btn_ReturnCName.setEnabled(true);
        }
        else{
           lbl_ReturnCustomer.setText("Customer Name:");
           btn_ReturnCName.setEnabled(false);
           SalesOrder_ReturnForm.txt_ReturnCustName.setText("");
           SalesOrder_ReturnForm.txt_ReturnCustName.setEnabled(false);
        }
    }
    
    protected void ReturnEditForm(){
         SalesOrder_ReturnEditQty editQty = new SalesOrder_ReturnEditQty(null, true);
         editQty.pack();
         editQty.setLocationRelativeTo(null);
         editQty.setVisible(true);
      }
    protected void ReturnEditQty(){
         if (txt_ReturnEditQty.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input quantity."
                    + "</font></center></html>", "Error Message", 0);
         }
        else{
            //Edit Quantity
            int newQuantity = Integer.parseInt(SalesOrder_ReturnEditQty.txt_ReturnEditQty.getText());
            SalesOrder_ReturnForm.tbl_ReturnList.setValueAt(newQuantity, SalesOrder_ReturnForm.tbl_ReturnList.getSelectedRow(), 5); //5-quantity column
            Integer quantity = Integer.parseInt(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(SalesOrder_ReturnForm.tbl_ReturnList.getSelectedRow(), 5).toString());
            Float discountedPrice = Float.parseFloat(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(SalesOrder_ReturnForm.tbl_ReturnList.getSelectedRow(), 7).toString()); //totaldiscountedprice
            Float totalprice =discountedPrice*quantity;
            totalprice = Float.parseFloat(String.format("%.2f", totalprice));
            SalesOrder_ReturnForm.tbl_ReturnList.setValueAt(totalprice, SalesOrder_ReturnForm.tbl_ReturnList.getSelectedRow(), 8);
            SalesOrder_ViewSO.getTotalNet();
        }
      }
     public static boolean detectProductExceed()
     {
         boolean flag=false;
         createDB(); int maxrdays =0;
        try {
            if(SalesOrder_ReturnForm.iddealer != 0){
                rs = stmt.executeQuery("SELECT max_return_days FROM dealer WHERE iddealer="+SalesOrder_ReturnForm.iddealer);
                while(rs.next())
                {
                    maxrdays=rs.getInt("max_return_days");
                }
                rs.close();
                createDB();
                rs = stmt.executeQuery("SELECT CURDATE() as currentdate,DATE_ADD(date_of_transaction,INTERVAL "+maxrdays+" DAY) AS 'newdate' FROM invoice LIMIT 1");
                while(rs.next())
                {
                    Date datenow = rs.getDate("currentdate");
                    Date returndate = rs.getDate("newdate");
                    flag = datenow.after(returndate);
                }
            }
            else
            {
                rs = stmt.executeQuery("SELECT CURDATE() as currentdate,DATE_ADD(date_of_transaction,INTERVAL 7 DAY) AS 'newdate' FROM invoice LIMIT 1");
                while(rs.next())
                {
                    Date datenow = rs.getDate("currentdate");
                    Date returndate = rs.getDate("newdate");
                    flag = datenow.after(returndate);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
         return flag;
     }
     protected void returnAccept(){
         if (txt_ReturnSONo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>SO number is  required in this transaction."
                    + "</font></center></html>", "Error Message", 0);
        }
        else{
            /*IF NO NAME WILL SPECIFY, THE RETURN WILL BE BASE ON THE SO NUMBER. IF THE USER WILL CLICK THE OPEN BUTTON
             IN SO, ALL THE SO TRANSACTION HISTORY WILL SHOW UP. IF THE USER SPECIFY THE NAME OF DEALER OR WALK IN, 
             THE SO HISTORY OF THAT CUSTOMER WILL BE THE ONLY ONE THAT WILL SHOW UP WHEN THE USER WILL CLICK THE OPEN
             BUTTON. THEN, UPON ACCEPTING, THIS FORM WILL ALSO DETECT IF THAT PRODUCT EXCEEDS THE NUMBER OF DAYS OF
             RETURN OR IF THAT PRODUCT CAN STILL BE RETURN IN THAT SPAN OF TIME :) 
             
             ROCH: THIS IS EZ AS 1 2 3*/
            if(detectProductExceed())
            {
                 JOptionPane.showMessageDialog(null, "Sorry, maximum days of returning item exceeded.");
            }
            else
            {
                int rowCount = SalesOrder_ReturnForm.tbl_ReturnList.getRowCount(); Object idprod = 0,idinvoice=0; Integer quantity = 0, oldquantity=0;
                float totalnet = 0;
                
                for(int i =0;i<rowCount ; i++)
                {
                    createDB();
                    idinvoice = SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 0);
                    totalnet = Float.parseFloat(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 8).toString());
                    idprod = SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 1);
                    quantity = Integer.parseInt(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 5).toString());
                    try {
                        rs = stmt.executeQuery("SELECT quantity FROM product WHERE idproduct='"+idprod+"'");
                        while(rs.next())
                        {
                            oldquantity = Integer.parseInt(rs.getObject("quantity").toString());
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    oldquantity+=quantity; int poQuantity = 0;
                    createDB();
                    try {
                        rs=stmt.executeQuery("SELECT quantity FROM purchase_order_list WHERE item_code="+idprod);
                        while(rs.next())
                        {
                            poQuantity = rs.getInt("quantity");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    poQuantity-=quantity;
//                    String reason = SalesOrder_ReturnForm.txt_ReturnReason.getText();
                    Object deductedAmount = SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 8);
                    if(SalesOrder_ReturnForm.cbo_ReturnReason.getSelectedItem().equals("Change Size") || SalesOrder_ReturnForm.cbo_ReturnReason.getSelectedItem().equals("Other..")){
                        dbHandlerUpdates("UPDATE product SET quantity="+oldquantity+" WHERE idproduct="+idprod);
                    }
                    dbHandlerUpdates("UPDATE purchase_order_list SET quantity="+poQuantity+",refund="+totalnet+" WHERE item_code="+idprod);
                    dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,POid,remarks) VALUES((SELECT CURDATE()),'RETURN',"+idinvoice+",'"+SalesOrder_ReturnForm.cbo_ReturnReason.getSelectedItem().toString()+"')");
                    dbHandlerUpdates("INSERT INTO return_history(return_date,customer_name,return_reason,refund,invoiceID) VALUES((SELECT CURDATE()),'"+SalesOrder_ReturnForm.txt_ReturnCustName.getText()+"','"+SalesOrder_ReturnForm.cbo_ReturnReason.getSelectedItem().toString()+"',"+deductedAmount+","+idinvoice+")");
                }
                StringBuilder sb = new StringBuilder(SalesOrder_ReturnForm.lbl_ReturnSalesTotal.getText());
                sb.deleteCharAt(0);
                dbHandlerUpdates("UPDATE invoice SET total_refund="+sb.toString()+" WHERE idinvoice="+idinvoice);//stock in logs
                JOptionPane.showMessageDialog(null, "Return transaction done.");
            }
        }
    }
     
      protected void SOSelect(){
         if (txt_ViewSO.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>SO number is  required in this transaction."
                    + "</font></center></html>", "Error Message", 0);
        }
        else{
            //ADD TO THE RETURN LIST
        }
      }
      
      protected void SOSearch(){
         if (txt_ViewSO.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please provide the SO Number to search"
                    + "</font></center></html>", "Error Message", 0);
        }
        else{
            //DETERMINE IF SO EXISTS, ELSE, ADD TO RETURN LIST
        }
      }
    
   
}
