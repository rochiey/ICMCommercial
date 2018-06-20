package dialog_salesOrder;

import com.DatabaseLinker;
import static dialog_salesOrder.SalesOrder_CreditHistory.cbo_CreditSort;
import static dialog_salesOrder.SalesOrder_Discount.txt_Discount;
import static dialog_salesOrder.SalesOrder_ReturnEditQty.txt_ReturnEditQty;
import static dialog_salesOrder.SalesOrder_ReturnForm.btn_ReturnCName;
import static dialog_salesOrder.SalesOrder_ReturnForm.cbo_ReturnCType;
import static dialog_salesOrder.SalesOrder_ReturnForm.lbl_ReturnCustomer;
import static dialog_salesOrder.SalesOrder_ReturnForm.txt_ReturnSONo;
import static dialog_salesOrder.SalesOrder_ViewSO.txt_ViewSO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static salesOrder.SalesOrder_ButtonFunctions.*;
import salesOrder.SalesPnl_2ndLayer;
import com.DB;


public class SalesOrder_ButtonFunctions {
    
    static SalesOrder_Void sales = new SalesOrder_Void(null, true);
    
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
                            SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(getTotalDiscountedPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7).toString(), clickedBarcode)), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 8);
                            salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(salesOrder.SalesOrder_ButtonFunctions.getTotalPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 5).toString(), clickedBarcode)), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 9);
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
                DB.createDB();
                int currentQuantity=0;
                DB.rs = DB.stmt.executeQuery("SELECT quantity FROM product WHERE product.barcode='"+this.clickedBarcode+"'");
                while(DB.rs.next())
                {
                    currentQuantity = DB.rs.getInt("quantity");
                }
                if(quantity<=currentQuantity && quantity >0)
                {
                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(quantity, SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 5);
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
                JOptionPane.showMessageDialog(null,"Please enter correct amount");
            }
            if(amountoPurchase<totalNet) JOptionPane.showMessageDialog(null, "You don't meet the required amount to purchase.");
            else
            {
                if(salesOrder.SalesOrder_ButtonFunctions.customerInfo[1][1] == "Walk-in")
                {
                    DB.dbHandlerUpdates("INSERT INTO invoice(payment_type,date_of_transaction,amount_paid,total_net) VALUES(234,(SELECT CURDATE()),"+amountoPurchase+","+totalNet+")");
                    dialog_salesOrder.SalesOrder_ButtonFunctions.toPurchaseOrder();
                    DB.dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,POid,remarks) VALUES((SELECT CURDATE()),'Sales Order',"+salesOrder.SalesOrder_ButtonFunctions.invoiceID+",'Cash')");
                    salesOrder.SalesOrder_ButtonFunctions.SalesOrderNew();
                    //JOptionPane.showMessageDialog(null, "Transaction done.");
                    inventory.InventoryPnl_1stLayer.updateTable();
                }
                else // dealer
                {
                    DB.dbHandlerUpdates("INSERT INTO invoice(CustomerDealer,payment_type,date_of_transaction,amount_paid,total_net) VALUES("+salesOrder.SalesOrder_ButtonFunctions.iddealer+",234,(SELECT CURDATE()),"+amountoPurchase+","+totalNet+")");
                    dialog_salesOrder.SalesOrder_ButtonFunctions.toPurchaseOrder();
                    DB.dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,POid,remarks) VALUES((SELECT CURDATE()),'Sales Order',"+salesOrder.SalesOrder_ButtonFunctions.invoiceID+",'Cash')");
                    //SalesOrder_Tender.dbHandlerUpdates("DELETE FROM invoice WHERE total_net IS NULL");
                    salesOrder.SalesOrder_ButtonFunctions.SalesOrderNew();
                    //JOptionPane.showMessageDialog(null, "Transaction done.");
                    inventory.InventoryPnl_1stLayer.updateTable();
                    //this.dispose();
                }
            }
        }
        else JOptionPane.showMessageDialog(null, "No customers input. Please try again");
    }
    public static void toPurchaseOrder()
    {
        int rowCount = SalesPnl_2ndLayer.tbl_SalesCart.getRowCount(); String barcode = ""; Integer quantity = 0, oldquantity=0;
        for(int i =0;i<rowCount ; i++)
        {
            DB.createDB();
            barcode = SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString();
            quantity = Integer.parseInt(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 5).toString());
            try {
                DB.rs = DB.stmt.executeQuery("SELECT quantity FROM product WHERE barcode='"+barcode+"'");
                while(DB.rs.next())
                {
                    oldquantity = Integer.parseInt(DB.rs.getObject("quantity").toString());
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
            DB.dbHandlerUpdates("UPDATE product SET quantity="+oldquantity+" WHERE barcode='"+barcode+"'");
            DB.dbHandlerUpdates("INSERT INTO purchase_order_list(idinvoice,item_code,item_name,quantity,unit_price,discount_percent,discounted_price,total_price) VALUES("+salesOrder.SalesOrder_ButtonFunctions.invoiceID+","+getProductID(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString())+",'"+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 2)+"',"+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 5)+","+getRealFloat(retailPrice.toString())+","+SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 7)+","+getRealFloat(discountedPrice.toString())+","+getRealFloat(totalNetPrice.toString())+")");
        }
    }
    protected static int getProductID(String barcode)
    {
        int idproduct = -1;
        try {
            DB.createDB();
            DB.rs = DB.stmt.executeQuery("SELECT idproduct FROM product WHERE barcode='"+barcode+"'");
            while(DB.rs.next())
            {
                idproduct = DB.rs.getInt("idproduct");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idproduct;
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
                DB.createDB(); Float availableCredit =null; Float currentBal=null;
                try {
                    DB.rs= DB.stmt.executeQuery("SELECT available_credit,balance FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                    while(DB.rs.next())
                    {
                        availableCredit = DB.rs.getFloat("available_credit");
                        currentBal = DB.rs.getFloat("balance");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                }
                availableCredit-=totalNetCredit;
                currentBal+=totalNetCredit;
                String duedate = SalesOrder_Tender.date_CreditDue.getEditor().getText();
                String format = "%Y-%m-%d";
                DB.dbHandlerUpdates("INSERT INTO invoice(CustomerDealer,payment_type,date_of_transaction,amount_paid,total_net) VALUES("+salesOrder.SalesOrder_ButtonFunctions.iddealer+",243,(SELECT CURDATE()),0,"+totalNetCredit+")");
                DB.dbHandlerUpdates("UPDATE dealer SET available_credit="+availableCredit+",balance="+currentBal+" WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                DB.dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,POid,remarks) VALUES((SELECT CURDATE()),'Sales Order',"+salesOrder.SalesOrder_ButtonFunctions.invoiceID+",'Credit')");
                DB.dbHandlerUpdates("INSERT INTO credit_transaction(invoice_ID,transaction_date,dealer_ID,total_net,amount,paymentTypeID,due_date,penalty) VALUES("+salesOrder.SalesOrder_ButtonFunctions.invoiceID+",(SELECT CURDATE()),"+salesOrder.SalesOrder_ButtonFunctions.iddealer+","+totalNetCredit+",0,243,STR_TO_DATE('"+duedate+"','"+format+"'),0)");
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
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT due_date,CURDATE() AS 'date today' FROM credit_transaction WHERE due_date IS NOT NULL AND paymentTypeID=243 AND dealer_ID="+id);
            while(DB.rs.next())
            {
                Date duedate = DB.rs.getDate("due_date");
                Date today = DB.rs.getDate("date today");
                if(today.after(duedate)) flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    private static void updateDealerTotalPenalty(float currentPenalty,Object dealer)
    {
        DB.createDB();
        ResultSet result = null;
        float totalPenalty = 0;
        try {
             result = DB.stmt.executeQuery("SELECT total_penalty FROM dealer WHERE iddealer="+dealer);
             while(result.next())
             {
                 totalPenalty = result.getFloat("total_penalty");
             }
             totalPenalty += currentPenalty;
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void generatePenalty()
    {
        Vector iddealer = new Vector();
        DB.createDB();
        try {
            DB.rs=DB.stmt.executeQuery("SELECT iddealer FROM dealer");
            while(DB.rs.next())
            {
                iddealer.add(DB.rs.getObject("iddealer"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<iddealer.size();i++)
        {
            if(isCreditDue((int) iddealer.get(i)))
            {
                int daysleft=0; float money=0,penalty=0,totalPenalty=0;
                try {
                    DB.createDB();
                    DB.rs = DB.stmt.executeQuery("SELECT DATEDIFF(due_date,CURDATE()) as 'days',total_net,penalty FROM credit_transaction WHERE due_date IS NOT NULL AND dealer_ID="+iddealer.get(i));
                    while(DB.rs.next())
                    {
                        daysleft=DB.rs.getInt("days");
                        money = DB.rs.getFloat("total_net");
                        penalty = DB.rs.getFloat("penalty");
                        switch (daysleft) {
                        //1st week
                            case -1:
                                {
                                    float temp = (float) (money*0.02);
                                    penalty+=temp;
                                    updateDealerTotalPenalty(penalty, iddealer.get(i));
                                    DB.dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+" WHERE dealer_ID="+iddealer.get(i));
                                    break;
                                }
                        //after 5th week, send demand letter to the unpaid dealer. after 1 month of demand letter. send subpoena and file a case
                        //2nd week
                            case -8:
                                {
                                    float temp = (float) (money*0.05);
                                    penalty+=temp;
                                    updateDealerTotalPenalty(penalty, iddealer.get(i));
                                    DB.dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+" WHERE dealer_ID="+iddealer.get(i));
                                    break;
                                }
                        //3rd week
                            case -15:
                                {
                                    float temp = (float) (money*0.05);
                                    penalty+=temp;
                                    updateDealerTotalPenalty(penalty, iddealer.get(i));
                                    DB.dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+" WHERE dealer_ID="+iddealer.get(i));
                                    break;
                                }
                        //4th week
                            case -22:
                                {
                                    float temp = (float) (money*0.05);
                                    penalty+=temp;
                                    updateDealerTotalPenalty(penalty, iddealer.get(i));
                                    DB.dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+" WHERE dealer_ID="+iddealer.get(i));
                                    break;
                                }
                        //5th week
                            case -29:
                                {
                                    float temp = (float) (money*0.10);
                                    penalty+=temp;
                                    updateDealerTotalPenalty(penalty, iddealer.get(i));
                                    DB.dbHandlerUpdates("UPDATE credit_transaction SET penalty="+penalty+" WHERE dealer_ID="+iddealer.get(i));
                                    break;
                                }
                            default:
                                break;
                        }
                    }
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
        if(salesOrder.SalesOrder_ButtonFunctions.customerInfo[1][1] != "Walk-in")
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
                Float creditLine = null,balance=null,penalty=null;
                DB.createDB();
                try {
                    DB.rs = DB.stmt.executeQuery("SELECT credit_limit,balance,total_penalty FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                    while(DB.rs.next())
                    {
                        creditLine = DB.rs.getFloat("credit_limit");
                        balance = DB.rs.getFloat("balance");
                        penalty = DB.rs.getFloat("total_penalty");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
                }
                //CREDIT LINE INCREASE IF WHOLE BALANCE IS PAID
                Float creditLineIncrease = (float)(amountoPurchase*.20)+creditLine;
                balance-=totalNet;
                penalty-=totalNet;
                
                //salesOrderTender.invoiceID represents the id of credited invoices in credit history
                if(SalesOrder_Tender.invoiceID == 0){
                    DB.dbHandlerUpdates("UPDATE dealer SET credit_limit="+creditLineIncrease+",available_credit="+creditLineIncrease+", balance=0, total_penalty=0 WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                    DB.dbHandlerUpdates("INSERT INTO credit_transaction(transaction_date,dealer_ID,total_net,amount,paymentTypeID,penalty) VALUES((SELECT CURDATE()),"+salesOrder.SalesOrder_ButtonFunctions.iddealer+","+totalNet+","+amountoPurchase+",432,0)");
                    DB.dbHandlerUpdates("UPDATE credit_transaction SET due_date=NULL,penalty=0 where dealer_ID="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                }
                else{ //if partial. credit line not increase
                    DB.dbHandlerUpdates("UPDATE dealer SET balance="+balance+" WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
                    DB.dbHandlerUpdates("INSERT INTO credit_transaction(invoice_ID,transaction_date,dealer_ID,total_net,amount,paymentTypeID,penalty) VALUES("+SalesOrder_Tender.invoiceID+",(SELECT CURDATE()),"+salesOrder.SalesOrder_ButtonFunctions.iddealer+","+totalNet+","+amountoPurchase+",432,0)");
                    DB.dbHandlerUpdates("UPDATE credit_transaction SET due_date=NULL,penalty=0 where invoice_ID="+SalesOrder_Tender.invoiceID);
                }
                salesOrder.SalesOrder_ButtonFunctions.SalesOrderNew();
                SalesOrder_Tender.invoiceID = 0;
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
    public static int inventoryView = 0;
    
    protected void customerType(){
        DefaultTableModel dm = (DefaultTableModel) SalesOrder_ReturnForm.tbl_ReturnList.getModel();
        if(cbo_ReturnCType.getSelectedItem().equals("Dealer")){
            lbl_ReturnCustomer.setText("Dealer ID/Name:");
            btn_ReturnCName.setEnabled(true);
            SalesOrder_ReturnForm.txt_ReturnSONo.setText("");
            dm.setRowCount(0); //clears the table
        }
        else{
           lbl_ReturnCustomer.setText("Customer Name:");
           btn_ReturnCName.setEnabled(false);
           SalesOrder_ReturnForm.txt_ReturnCustName.setText("");
           SalesOrder_ReturnForm.iddealer=0;
           SalesOrder_ReturnForm.txt_ReturnCustName.setEnabled(false);
           SalesOrder_ReturnForm.txt_ReturnSONo.setText("");
           dm.setRowCount(0); //clears the table
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
            try{
                int oldQuantity = (Integer) SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(SalesOrder_ReturnForm.row, 5);
                int newQuantity = Integer.parseInt(SalesOrder_ReturnEditQty.txt_ReturnEditQty.getText());
                if(newQuantity<oldQuantity && newQuantity>0)
                {
                    SalesOrder_ReturnForm.tbl_ReturnList.setValueAt(newQuantity, SalesOrder_ReturnForm.tbl_ReturnList.getSelectedRow(), 5); //5-quantity column
                    Integer quantity = Integer.parseInt(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(SalesOrder_ReturnForm.tbl_ReturnList.getSelectedRow(), 5).toString());
                    Float discountedPrice = Float.parseFloat(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(SalesOrder_ReturnForm.tbl_ReturnList.getSelectedRow(), 7).toString()); //totaldiscountedprice
                    Float totalprice =discountedPrice*quantity;
                    totalprice = Float.parseFloat(String.format("%.2f", totalprice));
                    SalesOrder_ReturnForm.tbl_ReturnList.setValueAt(totalprice, SalesOrder_ReturnForm.tbl_ReturnList.getSelectedRow(), 8);
                    SalesOrder_ViewSO.getTotalNet();
                }
                else JOptionPane.showMessageDialog(null, "Oops, something went wrong. Please enter correct quantity.");
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Oops, something went wrong. Please enter correct quantity.");
            }
        }
        SalesOrder_ReturnForm.row = 0; //init after using
      }
     public static boolean detectProductExceed()
     {
        boolean flag=false;
        DB.createDB(); int maxrdays =0;
        try {
            if(SalesOrder_ReturnForm.iddealer != 0){ //dealer
                DB.rs = DB.stmt.executeQuery("SELECT max_return_days FROM dealer WHERE iddealer="+SalesOrder_ReturnForm.iddealer);
                while(DB.rs.next())
                {
                    maxrdays=DB.rs.getInt("max_return_days"); //from a specific dealer
                }
                DB.rs.close();
                DB.createDB();
                DB.rs = DB.stmt.executeQuery("SELECT CURDATE() as currentdate,DATE_ADD((SELECT date_of_transaction FROM invoice WHERE idinvoice="+txt_ReturnSONo.getText()+"),INTERVAL "+maxrdays+" DAY) AS 'newdate' FROM invoice LIMIT 1");
                while(DB.rs.next())
                {
                    Date datenow = DB.rs.getDate("currentdate");
                    Date returndate = DB.rs.getDate("newdate");
                    flag = datenow.after(returndate);
                }
            }
            else // walk in (7 days return)
            {
                DB.rs = DB.stmt.executeQuery("SELECT CURDATE() as currentdate,DATE_ADD((SELECT date_of_transaction FROM invoice WHERE idinvoice="+txt_ReturnSONo.getText()+"),INTERVAL 7 DAY) AS 'newdate' FROM invoice LIMIT 1");
                while(DB.rs.next())
                {
                    Date datenow = DB.rs.getDate("currentdate");
                    Date returndate = DB.rs.getDate("newdate");
                    flag = datenow.after(returndate);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
         return flag;
     }
     public static int getLastID(String tblName)
    {
        Integer theID = 0;
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = '"+tblName+"'");
            while(DB.rs.next())
            {
                theID = Integer.parseInt(DB.rs.getObject("AUTO_INCREMENT").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return theID-1;
    }
     protected void returnAccept(){
         if (txt_ReturnSONo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>SO number is  required in this transaction."
                    + "</font></center></html>", "Error Message", 0);
        }
        else{
            if(detectProductExceed())
            {
                 JOptionPane.showMessageDialog(null, "Sorry, maximum days of returning item exceeded.");
            }
            else
            {
                int rowCount = SalesOrder_ReturnForm.tbl_ReturnList.getRowCount(); Object idprod = 0,idinvoice=0; Integer quantity = 0, oldquantity=0;
                float totalnet = 0;
                DB.dbHandlerUpdates("INSERT INTO return_history(return_date,customer_name,return_reason,refund,invoiceID) VALUES((SELECT CURDATE()),'"+SalesOrder_ReturnForm.txt_ReturnCustName.getText()+"','"+SalesOrder_ReturnForm.cbo_ReturnReason.getSelectedItem().toString()+"',"+totalnet+","+idinvoice+")");
                DB.dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,POid,remarks) VALUES((SELECT CURDATE()),'RETURN',"+idinvoice+",'"+SalesOrder_ReturnForm.cbo_ReturnReason.getSelectedItem().toString()+"')");
                for(int i =0;i<rowCount ; i++)
                {
                    DB.createDB();
                    idinvoice = SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 0);
                    totalnet = Float.parseFloat(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 8).toString());
                    idprod = SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 1);
                    quantity = Integer.parseInt(SalesOrder_ReturnForm.tbl_ReturnList.getValueAt(i, 5).toString());
                    try {
                        DB.rs = DB.stmt.executeQuery("SELECT quantity FROM product WHERE idproduct="+idprod);
                        while(DB.rs.next())
                        {
                            oldquantity = (Integer) DB.rs.getObject("quantity");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    oldquantity+=quantity; int poQuantity = 0;
                    DB.createDB();
                    try {
                        DB.rs=DB.stmt.executeQuery("SELECT quantity FROM purchase_order_list WHERE item_code="+idprod+" AND idinvoice="+txt_ReturnSONo.getText()); 
                        while(DB.rs.next())
                        {
                            poQuantity = DB.rs.getInt("quantity");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    poQuantity-=quantity;
//                    String reason = SalesOrder_ReturnForm.txt_ReturnReason.getText();
                    if(SalesOrder_ReturnForm.cbo_ReturnReason.getSelectedItem().equals("Change Size") || SalesOrder_ReturnForm.cbo_ReturnReason.getSelectedItem().equals("Other..")){
                        DB.dbHandlerUpdates("UPDATE product SET quantity="+oldquantity+" WHERE idproduct="+idprod);
                    }
                    DB.dbHandlerUpdates("UPDATE purchase_order_list SET quantity="+poQuantity+",refund="+totalnet+" WHERE item_code="+idprod+" AND idinvoice="+txt_ReturnSONo.getText()); 
                    DB.dbHandlerUpdates("INSERT INTO return_list(transactNo,idproduct,totalNet,returned_quantity) VALUES("+getLastID("return_history")+","+idprod+","+totalnet+","+quantity+")");
                }
                StringBuilder sb = new StringBuilder(SalesOrder_ReturnForm.lbl_ReturnSalesTotal.getText());
                sb.deleteCharAt(0);
                DB.dbHandlerUpdates("UPDATE invoice SET total_refund="+sb.toString()+" WHERE idinvoice="+idinvoice);//stock in logs
                if(cbo_ReturnCType.getSelectedItem().equals("Dealer")) //refund to dealer's available credit
                {
                    float old_availableCredit=0;
                    DB.createDB();
                    try {
                        DB.rs = DB.stmt.executeQuery("SELECT available_credit FROM dealer WHERE iddealer="+SalesOrder_ReturnForm.iddealer);
                        while(DB.rs.next())
                        {
                            old_availableCredit = DB.rs.getFloat("available_credit");
                        }
                        DB.rs.close();
                        DB.dbHandlerUpdates("UPDATE dealer SET available_credit="+(old_availableCredit+Float.parseFloat(sb.toString()))+" WHERE iddealer="+SalesOrder_ReturnForm.iddealer);
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                JOptionPane.showMessageDialog(null, "Return transaction done.");
            }
        }
         txt_ReturnSONo.setText("");
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
