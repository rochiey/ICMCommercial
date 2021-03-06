
package salesOrder;

import dialog_dealer.Dealer_ViewAccount;
import dialog_salesOrder.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import com.DB;

public class SalesOrder_ButtonFunctions {
    
    public static int invoiceID = countIncrementedID();
    public static int countIncrementedID()
    {
        Integer theID = 0;
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = 'invoice' limit 1");
            while(DB.rs.next())
            {
                theID = Integer.parseInt(DB.rs.getObject("AUTO_INCREMENT").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return theID;
    }
    public static Object[][]customerInfo = new Object[5][5];
    public static void cleanCustomerInfo()
    {
        customerInfo[0][0]="Customer Type:";
        customerInfo[1][0]="Customer Name:";
        customerInfo[2][0]="Credit Limit:";
        customerInfo[3][0]="Available Credits:";
        customerInfo[4][0]="Balance:";
        for(int i=0;i<5;i++)
        {
            customerInfo[i][1]="";
        }
        updateCustomerInfo();
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
    private static String getproductName(String barcode)
    {
        DB.createDB(); String name = "";
        try {
            DB.rs = DB.stmt.executeQuery("SELECT product_name FROM product WHERE product.barcode='"+barcode+"'");
            while(DB.rs.next())
            {
                name = DB.rs.getObject("product_name").toString();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }
    public static void setTblSales()
    {
        SalesPnl_2ndLayer.tbl_SalesCart.setBackground(Color.WHITE);
        SalesPnl_2ndLayer.tbl_SalesCart.setRowHeight(27);
        SalesPnl_2ndLayer.tbl_SalesCart.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)SalesPnl_2ndLayer.tbl_SalesCart.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        //tbl_SalesCart.setShowGrid(true);
        SalesPnl_2ndLayer.tbl_SalesCart.setShowVerticalLines(true);
    }
    static Vector<Vector<Object>> poListRows = new Vector<Vector<Object>>();
    private static boolean isQuantityZero(String barcode)
    {
        boolean flag = false;
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT quantity FROM product WHERE barcode='"+barcode+"'");
            while(DB.rs.next())
            {
                if(DB.rs.getInt("quantity") == 0) flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    public static void setProduct_toCart(String barcode)
    {
        if(!isQuantityZero(barcode))
        {
            DecimalFormat formatter = new DecimalFormat ("#, ###.00");
            Vector<Object>newRow = new Vector<Object>();
            newRow.add(SalesPnl_2ndLayer.tbl_SalesCart.getRowCount()+1);
            newRow.add(barcode);
            newRow.add(getproductName(barcode));
            newRow.add(getColorCode(barcode));
            newRow.add(getSize(barcode));
            newRow.add(1); //default quantity when scanning barcode. modify later using change quantity btn
            newRow.add("₱"+formatter.format(Float.parseFloat(String.format("%.2f", getSellingPrice(barcode)))));
            newRow.add(getDiscount(barcode));
            newRow.add("₱"+formatter.format(Float.parseFloat(String.format("%.2f", getDiscountedPrice(barcode)))));
            newRow.add("₱"+formatter.format(Float.parseFloat(String.format("%.2f", getTotalPrice(1+"", barcode)))));
            poListRows.add(newRow);
            SalesPnl_2ndLayer.tbl_SalesCart.setModel(SalesPnl_2ndLayer.tblModel = new DefaultTableModel(poListRows,SalesPnl_2ndLayer.colNames));
        }
        else JOptionPane.showMessageDialog(null, "Quantity is zero. Please try again later.");
    }
    private static Object getSize(String barcode)
    {
        DB.createDB(); Object size=0;
        try {
            DB.rs = DB.stmt.executeQuery("SELECT product_size FROM product WHERE product.barcode='"+barcode+"'");
            while(DB.rs.next())
            {
                size = DB.rs.getObject("product_size");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return size;
    }
    private static Object getColorCode(String barcode)
    {
        DB.createDB(); Object color="";
        try {
            DB.rs = DB.stmt.executeQuery("SELECT product_color.color_code FROM product_color,product WHERE product_color.idproduct_color=(SELECT product.product_color FROM product WHERE product.barcode = '"+barcode+"') limit 1");
            while(DB.rs.next())
            {
                color = DB.rs.getObject("color_code");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return color;
    }
    public static boolean isHigherQuantity(String barcode,javax.swing.JTextField txtQuantity)
    {
        DB.createDB(); int quantity = Integer.parseInt(txtQuantity.getText());
        int dbQuantity = 0;
        try {
            DB.rs = DB.stmt.executeQuery("SELECT quantity FROM product WHERE barcode='"+barcode+"'");
            while(DB.rs.next())
            {
                if(DB.rs.getObject("quantity") != null)dbQuantity = Integer.parseInt(DB.rs.getObject("quantity").toString());
                //else JOptionPane.showMessageDialog(null, "The quantity is empty. Please try again later.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(quantity>dbQuantity) return true;
        else return false;
    }
    private static float getSellingPrice(String barcode)
    {
        DB.createDB(); float sellingprice= 0;
        try {
            DB.rs = DB.stmt.executeQuery("SELECT selling_price FROM product WHERE product.barcode='"+barcode+"'");
            while(DB.rs.next())
            {
                sellingprice = Float.parseFloat(DB.rs.getObject("selling_price").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sellingprice;
    }
    private static int getDiscount(String barcode) 
    {
        DB.createDB(); int discount=0;
        try {
            DB.rs = DB.stmt.executeQuery("SELECT discount FROM dealer_supplier_bridge WHERE supplierID=(SELECT supplier FROM product WHERE product.barcode = '"+barcode+"') AND dealerID ="+iddealer);//For dealers only
            while(DB.rs.next())
            {
                discount= Integer.parseInt(DB.rs.getObject("discount").toString());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(iddealer != 0)return discount;
        else return 0;
    }
    private static float getDiscountedPrice(String barcode)
    {
        Float num = new Float(100);
        float tominusSellingprice = (getDiscount(barcode)/num) * getSellingPrice(barcode);
        float discountedPrice = getSellingPrice(barcode)-tominusSellingprice;
        discountedPrice = Float.parseFloat(String.format("%.2f",discountedPrice));
        return discountedPrice;
    }
    public static float getTotalDiscountedPrice(String discount,String barcode)
    {
        Float num = new Float(100);
        Float newDiscount = Float.parseFloat(discount);
        float tominusSellingprice = (newDiscount/num) * getSellingPrice(barcode);
        float discountedPrice = getSellingPrice(barcode)-tominusSellingprice;
        discountedPrice = Float.parseFloat(String.format("%.2f",discountedPrice));
        return discountedPrice;
    }
    public static float getTotalPrice(String discount,String quantity,String barcode)
    {
        int newquantity = Integer.parseInt(quantity);
        float totalPrice =0;
        totalPrice = getTotalDiscountedPrice(discount,barcode)*newquantity;
        totalPrice = Float.parseFloat(String.format("%.2f", totalPrice));
        return totalPrice;
    }
    private static float getTotalPrice(String txtquantity,String barcode)
    {
        int quantity = Integer.parseInt(txtquantity);
        float totalPrice =0;
        totalPrice = getDiscountedPrice(barcode)*quantity;
        totalPrice = Float.parseFloat(String.format("%.2f", totalPrice));
        return totalPrice;
    }
    public static void updateCustomerInfo()
    {
        SalesPnl_1stLayer.tbl_SalesCustomerDetails.setModel(new javax.swing.table.DefaultTableModel(customerInfo, new String[]
        {
            "",""
        }));
        SalesPnl_1stLayer.tbl_SalesCustomerDetails.setBackground(Color.WHITE);
        SalesPnl_1stLayer.tbl_SalesCustomerDetails.setShowGrid(true);
        SalesPnl_1stLayer.tbl_SalesCustomerDetails.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        SalesPnl_1stLayer.tbl_SalesCustomerDetails.getColumnModel().getColumn(0).setPreferredWidth(140);
        SalesPnl_1stLayer.tbl_SalesCustomerDetails.getColumnModel().getColumn(1).setPreferredWidth(200);
        SalesPnl_1stLayer.tbl_SalesCustomerDetails.setRowHeight(27);
        SalesPnl_1stLayer.tbl_SalesCustomerDetails.setTableHeader(null);
    }
    public static void generateDealerInfo(int ID)
    {
        DB.createDB();
        customerInfo[0][1]="Dealer";
        try {
            DB.rs = DB.stmt.executeQuery("SELECT CONCAT(dealer.first_name,' ',dealer.last_name),credit_limit,available_credit,balance FROM dealer WHERE iddealer = "+ID);
            while(DB.rs.next())
            {
                customerInfo[1][1] = DB.rs.getObject(1);
                customerInfo[2][1] = "₱"+String.format("%,.2f",DB.rs.getFloat("credit_limit"));
                customerInfo[3][1] = "₱"+String.format("%,.2f",DB.rs.getFloat("available_credit"));
                customerInfo[4][1] = "₱"+String.format("%,.2f",DB.rs.getFloat("balance"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        invoiceID = countIncrementedID();
        //dbHandlerUpdates("INSERT INTO invoice(customerDealer,date_of_transaction) VALUES("+ID+",(SELECT CURDATE()))");
        updateCustomerInfo();
    }
    public static int iddealer =0;
    public static void getDealerDetails(int ID)
    {
        cleanCustomerInfo();
        generateDealerInfo(ID);
    }
    public static int clickedID_onTable = 0;
    public static void SalesOrderNew(){
        salesOrder.SalesOrder_ButtonFunctions.cleanCustomerInfo();
        SalesPnl_2ndLayer.tblModel.setRowCount(0);
        SalesPnl_2ndLayer.lbl_SalesTotal.setText("₱0.00");
        SalesPnl_1stLayer.txt_SalesInput.setText("");
        salesOrder.SalesOrder_ButtonFunctions.iddealer=0;
        salesOrder.SalesOrder_ButtonFunctions.clickedID_onTable=0;
    }
    public static String trigger ="product";
//    protected void SalesOrderInput(){
//        if (SalesPnl_1stLayer.lbl_SalesProductCode.getText().equals("Article Code:")){
//            lbl_SalesProductCode.setText("Customer Name/Code:");
//            txt_SalesInput.setText("");
//            btn_SalesInput.setText("<html><center><font color=blue>F3</font><br/>Product Input</center></html>");
//            btn_SalesInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice inv.png")));
//            btn_SalesView.setText("<html><center><font color=blue>F4</font><center>View<br/>Dealers</html>");
//            btn_SalesView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice_View Dealer.png")));
//            trigger = "customer";
//        }
//        else{
//            lbl_SalesProductCode.setText("Article Code:");
//            txt_SalesInput.setText("");
//            btn_SalesInput.setText("<html><center><font color=blue>F3</font><br/>Customer<br/>Input</center></html>");
//            btn_SalesInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Customer 2.png")));
//            btn_SalesView.setText("<html><center><font color=blue>F4</font><center>View<br/>Inventory</html>");
//            btn_SalesView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice_View Inventory.png")));
//            trigger="product";
//        }
//    }
    protected void viewDealers()
    {
        Dealer_ViewAccount dealer = new Dealer_ViewAccount(null, true);
        dealer.flag=2;
        dealer.pack();
        dealer.setLocationRelativeTo(null);
        dealer.setVisible(true);
    }
     
    protected void SalesOrderView(){
        if (SalesPnl_1stLayer.lbl_SalesProductCode.getText().equals("Article Code:")){
            dialog_salesOrder.SalesOrder_ButtonFunctions.inventoryView=0;
            SalesOrder_ViewInventory sales = new SalesOrder_ViewInventory(null, true);
            sales.pack();
            sales.setLocationRelativeTo(null);
            sales.setVisible(true);
        }
    }
    
    protected void SalesOrderDiscount(){
        if(customerInfo[0][1]=="Walk-in")
        {
            SalesOrder_Discount sales = new SalesOrder_Discount(null, true);
            sales.pack();
            sales.setLocationRelativeTo(null);
            sales.setVisible(true);
            sales.dispose();
        }
        else if(customerInfo[0][1]=="Dealer")
        {
            DecimalFormat df = new DecimalFormat("#,###.00");
            int discount = Integer.parseInt(JOptionPane.showInputDialog("Enter new discount"));
            salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(discount, SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7);
            SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(getTotalDiscountedPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 1).toString())), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 8);
            salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(getTotalPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 5).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 1).toString())), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 9);
            salesOrder.SalesPnl_2ndLayer.getTotalNet();
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No transaction on going.");
        }
    }
    
    protected void SalesOrderEdit(){
        SalesOrder_Edit sales = new SalesOrder_Edit(null, true);
        sales.pack();
        sales.setLocationRelativeTo(null);
        sales.setVisible(true);
    }
    
    protected void SalesOrderRemove(){
        SalesOrder_Void sales = new SalesOrder_Void(null, true);
        sales.pack();
        sales.setLocationRelativeTo(null);
        sales.setVisible(true);
    }
    protected void SalesOrderTender(){

        SalesOrder_Tender sales = new SalesOrder_Tender(null, true);
        sales.pack();
        sales.setLocationRelativeTo(null);
         if(customerInfo[0][1] != "")
        {
            SalesOrder_Tender.lbl_CashTotal.setText(SalesPnl_2ndLayer.lbl_SalesTotal.getText());
            SalesOrder_Tender.lbl_CreditTotal.setText(SalesPnl_2ndLayer.lbl_SalesTotal.getText());
            sales.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null, "<html><center><font size=4>No customers present. Please try again."
                   + "</font></center></html>", "Information Message", 1);
       
    }

    public void SalesOrder_CDateSort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static boolean checkDuplicate(String barcode)
    {
        boolean result = false;
        
        int counter = salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getRowCount();
        for(int i=0;i<counter;i++)
        {
            String comparator = salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString();
            if(comparator.equals(barcode)) result = true;
        }
       return result;
    }
    public String salesBarcode = "";
    public void addSalesCart(){
        //ADD TO CART
        try{
            String TRAP = this.salesBarcode;
            DB.createDB();
            try {
                int cartQuantity=0;
                boolean found = false;
                DB.rs = DB.stmt.executeQuery("SELECT barcode FROM product");
                while(DB.rs.next())
                {
                    if(DB.rs.getString("barcode").equals(TRAP.toString()))
                    {
                        found = true;
                    }
                }
                if(found)
                {
                    if(!checkDuplicate(this.salesBarcode)){ //for not duplicated
                        if(customerInfo[0][1] == "Dealer")
                        {
                            updateCustomerInfo();
                            setProduct_toCart(this.salesBarcode);
                            SalesPnl_2ndLayer.getTotalNet();
                            SalesPnl_1stLayer.txt_SalesInput.setText("");
                        }else{
                            setProduct_toCart(this.salesBarcode);
                            customerInfo[0][1] = "Walk-in";
                            customerInfo[1][1] = "Walk-in";
                            customerInfo[2][1]="₱0.00";
                            customerInfo[3][1]="₱0.00";
                            customerInfo[4][1]="₱0.00";
                            updateCustomerInfo();
                            SalesPnl_2ndLayer.getTotalNet();
                            SalesPnl_1stLayer.txt_SalesInput.setText("");
                            }
                    }
                    else{ //if found duplicate barcode
                        
                        for(int i=0;i<salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getRowCount();i++)
                        {
                            DecimalFormat df = new DecimalFormat("#,###.00");
                            if(this.salesBarcode.equals(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString()))
                            {
                                cartQuantity = Integer.parseInt(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 5).toString());
                                DB.createDB();
                                int currentQuantity=0;
                                DB.rs = DB.stmt.executeQuery("SELECT quantity FROM product WHERE barcode='"+this.salesBarcode+"'");
                                while(DB.rs.next())
                                {
                                    currentQuantity = DB.rs.getInt("quantity");
                                }
                                if(cartQuantity<currentQuantity && cartQuantity>0)
                                {
                                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(++cartQuantity, i, 5);
                                    StringBuilder sb = new StringBuilder(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 8).toString());
                                    sb.deleteCharAt(0); //take peso sign
                                    Float discountedPrice = Float.parseFloat(sb.toString()); //cast to float
                                    discountedPrice*=(cartQuantity);
                                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(discountedPrice), i, 9);
                                    salesOrder.SalesPnl_2ndLayer.getTotalNet();
                                }
                                else JOptionPane.showMessageDialog(null, "Quantity of selected product is reach of limit.");
                            }
                        }
                       // JOptionPane.showMessageDialog(null, "You can't add the same product again. You might want to edit the quantity?");
                    }
                }
                else JOptionPane.showMessageDialog(null, "Article not found");
            } catch (SQLException ex) {
                Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter Product ID/Quantity correctly");
        }
        this.salesBarcode = ""; //revert to init
    }
    
    protected void SalesOrderReturn(){
        SalesOrder_ReturnForm sales = new SalesOrder_ReturnForm(null, true);
        sales.pack();
        sales.setLocationRelativeTo(null);
        sales.setVisible(true);
    }
    
}
