
package salesOrder;

import dialog_dealer.Dealer_ViewAccount;
import static dialog_dealer.Dealer_ViewAccount.setJTable;
import dialog_salesOrder.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static salesOrder.SalesPnl_1stLayer.*;
import static salesOrder.SalesPnl_3rdLayer.*;

public class SalesOrder_ButtonFunctions {
    
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
    public static int invoiceID = countIncrementedID();
    public static int countIncrementedID()
    {
        Integer theID = 0;
        createDB();
        try {
            rs = stmt.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = 'invoice' limit 1");
            while(rs.next())
            {
                theID = Integer.parseInt(rs.getObject("AUTO_INCREMENT").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return theID;
    }
    private static void dbHandlerUpdates(String query)
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
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again."
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
        createDB();
        try {
            rs = stmt.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = '"+tblName+"'");
            while(rs.next())
            {
                theID = Integer.parseInt(rs.getObject("AUTO_INCREMENT").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return theID-1;
    }
    private static String getproductName(String barcode)
    {
        createDB(); String name = "";
        try {
            rs = stmt.executeQuery("SELECT product_name FROM product WHERE product.barcode='"+barcode+"'");
            while(rs.next())
            {
                name = rs.getObject("product_name").toString();
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
    public static void setProduct_toCart(String barcode)
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
    private static Object getSize(String barcode)
    {
        createDB(); Object size=0;
        try {
            rs = stmt.executeQuery("SELECT product_size FROM product WHERE product.barcode='"+barcode+"'");
            while(rs.next())
            {
                size = rs.getObject("product_size");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return size;
    }
    private static Object getColorCode(String barcode)
    {
        createDB(); Object color="";
        try {
            rs = stmt.executeQuery("SELECT product_color.color_code FROM product_color,product WHERE product_color.idproduct_color=(SELECT product.product_color FROM product WHERE product.barcode = '"+barcode+"') limit 1");
            while(rs.next())
            {
                color = rs.getObject("color_code");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return color;
    }
    public static boolean isHigherQuantity(String barcode,javax.swing.JTextField txtQuantity)
    {
        createDB(); int quantity = Integer.parseInt(txtQuantity.getText());
        int dbQuantity = 0;
        try {
            rs = stmt.executeQuery("SELECT quantity FROM product WHERE barcode='"+barcode+"'");
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
    private static float getSellingPrice(String barcode)
    {
        createDB(); float sellingprice= 0;
        try {
            rs = stmt.executeQuery("SELECT selling_price FROM product WHERE product.barcode='"+barcode+"'");
            while(rs.next())
            {
                sellingprice = Float.parseFloat(rs.getObject("selling_price").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sellingprice;
    }
    private static int getDiscount(String barcode) 
    {
        createDB(); int discount=0;
        try {
            rs = stmt.executeQuery("SELECT discount FROM dealer_supplier_bridge WHERE supplierID=(SELECT supplier FROM product WHERE product.barcode = '"+barcode+"') AND dealerID ="+iddealer);//For dealers only
            while(rs.next())
            {
                discount= Integer.parseInt(rs.getObject("discount").toString());
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
        tbl_SalesCustomerDetails.setModel(new javax.swing.table.DefaultTableModel(customerInfo, new String[]
        {
            "",""
        }));
        tbl_SalesCustomerDetails.setBackground(Color.WHITE);
        tbl_SalesCustomerDetails.setShowGrid(true);
        tbl_SalesCustomerDetails.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbl_SalesCustomerDetails.getColumnModel().getColumn(0).setPreferredWidth(140);
        tbl_SalesCustomerDetails.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_SalesCustomerDetails.setRowHeight(27);
        tbl_SalesCustomerDetails.setTableHeader(null);
    }
    public static void generateCustomerInfo(int ID)
    {
        createDB();
        customerInfo[0][1]="Dealer";
        try {
            rs = stmt.executeQuery("SELECT CONCAT(dealer.first_name,' ',dealer.last_name),credit_limit,available_credit,balance FROM dealer WHERE iddealer = "+ID);
            while(rs.next())
            {
                customerInfo[1][1] = rs.getObject(1);
                customerInfo[2][1] = "₱"+String.format("%,.2f",rs.getFloat("credit_limit"));
                customerInfo[3][1] = "₱"+String.format("%,.2f",rs.getFloat("available_credit"));
                customerInfo[4][1] = "₱"+String.format("%,.2f",rs.getFloat("balance"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        invoiceID = countIncrementedID();
        dbHandlerUpdates("INSERT INTO invoice(customerDealer,date_of_transaction) VALUES("+ID+",(SELECT CURDATE()))");
        updateCustomerInfo();
    }
    public static int iddealer =0;
    public static void getCustomerName()
    {
      //  dbHandlerUpdates(" DELETE FROM invoice WHERE total_net IS NULL");
        try{
            int ID = Integer.parseInt(txt_SalesInput.getText());
            createDB();
            boolean found = false;
            try {
                rs = stmt.executeQuery("SELECT iddealer FROM dealer");
                while(rs.next())
                {
                    if(rs.getInt("iddealer") == ID) found = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(found)
            {
                if(customerInfo[0][1]=="Dealer")
                {
                    cleanCustomerInfo();
                    generateCustomerInfo(ID); //for dealers man
                    iddealer = ID;
                }
            }
            else if(!found)
            {
               cleanCustomerInfo();
                Object idwalkin =0;
                customerInfo[0][1] = "Walk-in";
                customerInfo[1][1] = " ";
                customerInfo[2][1]="₱0.00";
                customerInfo[3][1]="₱0.00";
                customerInfo[4][1]="₱0.00";
                iddealer=0;
                createDB();
                invoiceID = countIncrementedID();
                dbHandlerUpdates("INSERT INTO invoice(date_of_transaction) VALUES((SELECT CURDATE()))");
            updateCustomerInfo();
            }
        }catch(NumberFormatException e) //walk in here
        {
            cleanCustomerInfo();
            Object idwalkin =0;
                customerInfo[0][1] = "Walk-in";
                customerInfo[1][1] = txt_SalesInput.getText();
                customerInfo[2][1]="₱0.00";
                customerInfo[3][1]="₱0.00";
                customerInfo[4][1]="₱0.00";
            iddealer=0;
            createDB();
            invoiceID = countIncrementedID();
            dbHandlerUpdates("INSERT INTO invoice(date_of_transaction) VALUES((SELECT CURDATE()))");
            updateCustomerInfo();
        }
    }
    public static void getCustomerName(int ID)
    {
        cleanCustomerInfo();
        generateCustomerInfo(ID);
    }
    public static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
        }
    }
    public static void SalesOrderNew(){
        salesOrder.SalesOrder_ButtonFunctions.cleanCustomerInfo();
        SalesPnl_2ndLayer.tblModel.setRowCount(0);
        SalesPnl_2ndLayer.lbl_SalesTotal.setText("₱0.00");
        txt_SalesInput.setText("");
        salesOrder.SalesOrder_ButtonFunctions.iddealer=0;
        salesOrder.SalesOrder_ButtonFunctions.clickedID_onTable=0;
    }
    public static String trigger ="product";
    protected void SalesOrderInput(){
        if (SalesPnl_1stLayer.lbl_SalesProductCode.getText().equals("Article Code:")){
            lbl_SalesProductCode.setText("Customer Name/Code:");
            txt_SalesInput.setText("");
            btn_SalesInput.setText("<html><center><font color=blue>F3</font><br/>Product Input</center></html>");
            btn_SalesInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice inv.png")));
            btn_SalesView.setText("<html><center><font color=blue>F4</font><center>View<br/>Dealers</html>");
            btn_SalesView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice_View Dealer.png")));
            trigger = "customer";
        }
        else{
            lbl_SalesProductCode.setText("Article Code:");
            txt_SalesInput.setText("");
            btn_SalesInput.setText("<html><center><font color=blue>F3</font><br/>Customer<br/>Input</center></html>");
            btn_SalesInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice Customer 2.png")));
            btn_SalesView.setText("<html><center><font color=blue>F4</font><center>View<br/>Inventory</html>");
            btn_SalesView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Invoice_View Inventory.png")));
            trigger="product";
        }
    }
     
    protected void SalesOrderView(){
        if (lbl_SalesProductCode.getText().equals("Article Code:")){
            dialog_salesOrder.SalesOrder_ButtonFunctions.inventoryView=0;
            SalesOrder_ViewInventory sales = new SalesOrder_ViewInventory(null, true);
            sales.pack();
            sales.setLocationRelativeTo(null);
            sales.setVisible(true);
        }
        else{
            Dealer_ViewAccount dealer = new Dealer_ViewAccount(null, true);
            dealer.flag=2;
            dealer.pack();
            dealer.setLocationRelativeTo(null);
            dealer.setVisible(true);
            
        }
    }
    
    protected void SalesOrderDiscount(){
        if(customerInfo[0][1]=="Walk-in")
        {
            SalesOrder_Discount sales = new SalesOrder_Discount(null, true);
            sales.pack();
            sales.setLocationRelativeTo(null);
            sales.setVisible(true);
        }
        else if(customerInfo[0][1]=="Dealer")
        {
            int discount = Integer.parseInt(JOptionPane.showInputDialog("Enter new discount"));
            salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(discount, SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7);
            salesOrder.SalesPnl_1stLayer.txt_SalesInput.setText(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(0, 1).toString());
            SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(getTotalDiscountedPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 1).toString()), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 8);
            salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+getTotalPrice(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 7).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 5).toString(), SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 1).toString()), SalesPnl_2ndLayer.tbl_SalesCart.getSelectedRow(), 9);
            salesOrder.SalesPnl_2ndLayer.getTotalNet();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Press F1 to renew transaction. You forgot to input customer");
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
    public static String addSalesCartBarcode()
    {
        String barcode = "";
        
        return barcode;
    }
    public static String salesBarcode = "";
    protected void addSalesCart(){
        //ADD TO CART
        try{
            String TRAP = this.salesBarcode;
            createDB();
            try {
                int cartQuantity=0;
                boolean found = false;
                rs = stmt.executeQuery("SELECT barcode FROM product");
                while(rs.next())
                {
                    if(rs.getString("barcode").equals(TRAP.toString()))
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
                            txt_SalesInput.setText("");
                        }else{
                            setProduct_toCart(this.salesBarcode);
                            customerInfo[0][1] = "Walk-in";
                            customerInfo[1][1] = " ";
                            customerInfo[2][1]="₱0.00";
                            customerInfo[3][1]="₱0.00";
                            customerInfo[4][1]="₱0.00";
                            updateCustomerInfo();
                            getCustomerName();
                            SalesPnl_2ndLayer.getTotalNet();
                            txt_SalesInput.setText("");
                            }
                    }
                    else{ //if found duplicate barcode
                        
                        for(int i=0;i<salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getRowCount();i++)
                        {
                            DecimalFormat df = new DecimalFormat("#,###.00");
                            if(this.salesBarcode.equals(SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 1).toString()))
                            {
                                cartQuantity = Integer.parseInt(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 5).toString());
                                createDB();
                                int currentQuantity=0;
                                rs = stmt.executeQuery("SELECT quantity FROM product WHERE barcode='"+this.salesBarcode+"'");
                                while(rs.next())
                                {
                                    currentQuantity = rs.getInt("quantity");
                                }
                                if(cartQuantity<=currentQuantity && cartQuantity>0)
                                {
                                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt(++cartQuantity, i, 5);
                                    StringBuilder sb = new StringBuilder(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.getValueAt(i, 8).toString());
                                    sb.deleteCharAt(0); //take peso sign
                                    Float discountedPrice = Float.parseFloat(sb.toString()); //cast to float
                                    discountedPrice*=(cartQuantity);
                                    salesOrder.SalesPnl_2ndLayer.tbl_SalesCart.setValueAt("₱"+df.format(discountedPrice), i, 9);
                                    salesOrder.SalesPnl_2ndLayer.getTotalNet();
                                }
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
