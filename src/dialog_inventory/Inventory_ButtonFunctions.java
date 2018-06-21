package dialog_inventory;

import com.DB;
import static dialog_inventory.Inventory_Category.*;
import static dialog_inventory.Inventory_Color.*;
import static dialog_inventory.Inventory_Company.*;
import static dialog_inventory.Inventory_NewProduct.*;
import static dialog_inventory.Inventory_ProductMovement.txt_Qty;
import static dialog_inventory.Inventory_UpdateProduct.*;
import inventory.InventoryPnl_1stLayer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;

public class Inventory_ButtonFunctions {
    public static int clickedID_onTable = 0;
    
    
    private int getSupplierID(JComboBox cboSupplier)
    {
        DB.createDB();
        int idsupplier = 0;
        try {
            DB.rs = DB.stmt.executeQuery("SELECT idsupplier FROM supplier WHERE supplier_name ='"+cboSupplier.getSelectedItem().toString()+"'");
            while(DB.rs.next())
            {
                idsupplier = Integer.parseInt(DB.rs.getObject("idsupplier").toString());
            }
            DB.rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again."
                   + "</font></center></html>", "Error Message", 0);
            //System.exit(0);
        }
        return idsupplier;
    }
    private int getProductColor(JComboBox cboColor)
    {
        DB.createDB();
        int idcolor = 0;
        try {
            DB.rs= DB.stmt.executeQuery("SELECT idproduct_color FROM product_color WHERE color_code ='"+cboColor.getSelectedItem().toString()+"'");
            while(DB.rs.next())
            {
                idcolor = Integer.parseInt(DB.rs.getObject("idproduct_color").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again."
                   + "</font></center></html>", "Error Message", 0);
            //System.exit(0);
        }
        return idcolor;
    }
    private int getCategory(JComboBox cboCategory)
    {
        DB.createDB();
        int idcategory = 0;
        try {
            DB.rs= DB.stmt.executeQuery("SELECT idcategory FROM category WHERE category_name ='"+cboCategory.getSelectedItem().toString()+"'");
            while(DB.rs.next())
            {
                idcategory = Integer.parseInt(DB.rs.getObject("idcategory").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again."
                   + "</font></center></html>", "Error Message", 0);
            //System.exit(0);
        }
        return idcategory;
    }
    private int getCategoryType(JComboBox cboCatType)
    {
        int catTypeID = 0;
        if(cboCatType.getSelectedItem().equals("Expirable")) return 15; //expirable
        else return 16; //non expirable
    }
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
        }
        
    }
    private Vector getAllSizes()
    {
        Vector sizes = new Vector();
        int counter = tbl_NewProdSize.getModel().getColumnCount();
        int col = 0;
        for(int i=0;i<counter;i++)
        {
            if(!tbl_NewProdSize.getValueAt(0, i).equals("")) sizes.add(tbl_NewProdSize.getValueAt(0, i));
        }
        return sizes;
    }
    public static void disableUpdateRegDate()
    {
        ResultSet rs2 = null; int idcategory=0;
        DB.createDB();
        try {
                DB.rs = DB.stmt.executeQuery("SELECT category FROM product WHERE idproduct ="+clickedID_onTable);
                while(DB.rs.next())
                {
                    idcategory = Integer.parseInt(DB.rs.getObject("category").toString());
                }
                rs2 = DB.stmt.executeQuery("SELECT category_type FROM category WHERE idcategory ="+idcategory);
                while(rs2.next())
                {
                    if(rs2.getObject("category_type").equals(16))
                    {
                        date_UpdateProdExpiration.getEditor().disable();
                        date_UpdateProdExpiration.disable();
                    }
                    else
                    {
                        date_UpdateProdExpiration.getEditor().enable();
                        date_UpdateProdExpiration.enable();
                    }
                }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again."
                    + " (error:fetching sql data session:disableUpdateRegDate())"
                   + "</font></center></html>", "Error Message", 0);
        }
    }
    public static void disableUpdateRegDate(JComboBox cboCategory)
    {
        ResultSet rs2 = null; int idcategory=0;
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT category_type FROM category WHERE category_name ='"+cboCategory.getSelectedItem()+"'");
            while(DB.rs.next())
            {
                if(Integer.parseInt(DB.rs.getObject("category_type").toString()) == 16) 
                {
                    date_UpdateProdExpiration.getEditor().setText("");
                    date_UpdateProdExpiration.getEditor().disable();
                    date_UpdateProdExpiration.disable();
                }
                else{
                    date_UpdateProdExpiration.getEditor().enable();
                    date_UpdateProdExpiration.enable();
                }
            }    
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again."
                    + " (error:fetching sql data session:disableUpdateRegDate())"
                   + "</font></center></html>", "Error Message", 0);
        }
    }
    public static void disableNewRegDate(JComboBox cboCategory)
    {
        
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT category_type FROM category WHERE category_name ='"+cboCategory.getSelectedItem()+"'");
            while(DB.rs.next())
            {
                if(Integer.parseInt(DB.rs.getObject("category_type").toString()) == 16) 
                {
                    date_NewProdExpiration.getEditor().setText("");
                    date_NewProdExpiration.getEditor().disable();
                    date_NewProdExpiration.disable();
                }
                else{
                    date_NewProdExpiration.getEditor().enable();
                    date_NewProdExpiration.enable();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again."
                    + " (error:fetching sql data session:disableNewRegDate())"
                   + "</font></center></html>", "Error Message", 0);
        }
    }
    static int successEx;
    protected void addNewProduct(){
        if (date_NewProdExpiration.isEnabled()){ // if product is expirable
            if (txt_NewProdName.getText().equals("") || date_NewProdExpiration.getDate() == null || txt_NewBarcode.getText().equals("")){
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill-out the form before you "
                + "<br/>can add new product information.</font></center></html>", "Complete the form", 0);
            }
            else{
                Vector sizes = new Vector();
                sizes = getAllSizes();
                String expDate = date_NewProdExpiration.getEditor().getText();
                String dateFormat = "%Y-%m-%d";
                String barcode = txt_NewBarcode.getText();
                if(!sizes.isEmpty())
                {
                    for(int i=0;i<sizes.size();i++)
                    {
                        successEx = DB.dbHandlerUpdates("INSERT INTO product(barcode,supplier,product_name,category,product_size,product_color,expiration,selling_price,quantity) VALUES('"+barcode+"',"+getSupplierID(cbo_NewProdCompany)+",'"+txt_NewProdName.getText()+"',"+getCategory(cbo_NewProdCategory)+",'"+sizes.get(i)+"',"+getProductColor(cbo_NewProdColor)+",STR_TO_DATE('"+expDate+"','"+dateFormat+"'),"+txt_NewProdPrice.getText()+",0)");
                    }
                    InventoryPnl_1stLayer.updateTable();
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Product successfully added!"
                        + "</font></center></html>", "Information Message", 1);
                }
                else 
                {
                    successEx = DB.dbHandlerUpdates("INSERT INTO product(barcode,supplier,product_name,category,product_size,product_color,expiration,selling_price,quantity) VALUES('"+barcode+"',"+getSupplierID(cbo_NewProdCompany)+",'"+txt_NewProdName.getText()+"',"+getCategory(cbo_NewProdCategory)+",'-',"+getProductColor(cbo_NewProdColor)+",STR_TO_DATE('"+expDate+"','"+dateFormat+"'),"+txt_NewProdPrice.getText()+",0)");
                    InventoryPnl_1stLayer.updateTable();
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Product successfully added!"
                        + "</font></center></html>", "Information Message", 1);
                }
            }
        }
        else{
            if (txt_NewProdName.getText().equals("") || txt_NewBarcode.getText().equals("") || txt_NewProdPrice.getText().equals("") ){
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill-out the form before you "
                    + "<br/>can add new product information.</font></center></html>", "Complete the form", 0);
            }
            else{
                //INSERT SQL QUERY FOR ADDING PRODUCT
                Vector sizes = new Vector();
                sizes = getAllSizes();
                String expDate = date_NewProdExpiration.getEditor().getText();
                String dateFormat = "%Y-%m-%d";
                String barcode = txt_NewBarcode.getText();
                if(!sizes.isEmpty())
                {
                    for(int i=0;i<sizes.size();i++)
                    {
                        DB.dbHandlerUpdates("INSERT INTO product(barcode,supplier,product_name,category,product_size,product_color,selling_price,quantity) VALUES('"+barcode+"',"+getSupplierID(cbo_NewProdCompany)+",'"+txt_NewProdName.getText()+"',"+getCategory(cbo_NewProdCategory)+",'"+sizes.get(i)+"',"+getProductColor(cbo_NewProdColor)+","+txt_NewProdPrice.getText()+",0)");
                    }
                    InventoryPnl_1stLayer.updateTable();
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Product successfully added!"
                        + "</font></center></html>", "Information Message", 1);
                }
                else 
                {
                    DB.dbHandlerUpdates("INSERT INTO product(barcode,supplier,product_name,category,product_size,product_color,selling_price,quantity) VALUES('"+barcode+"',"+getSupplierID(cbo_NewProdCompany)+",'"+txt_NewProdName.getText()+"',"+getCategory(cbo_NewProdCategory)+",'-',"+getProductColor(cbo_NewProdColor)+","+txt_NewProdPrice.getText()+",0)");
                    InventoryPnl_1stLayer.updateTable();
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Product successfully added!"
                        + "</font></center></html>", "Information Message", 1);
                }
                
            }
        }
    }
    public static void generateUpdate()
    {
        DB.createDB();
        try {
        DB.rs = DB.stmt.executeQuery("SELECT supplier.supplier_name,product.product_name,category.category_name,product.product_size,product_color.color_code,product.expiration,product.selling_price FROM product,supplier,category,product_color WHERE product.supplier=supplier.idsupplier AND product.category=category.idcategory AND product.product_color = product_color.idproduct_color AND idproduct ="+clickedID_onTable);
        Vector row = new Vector();
            while(DB.rs.next())
            {
                for(int i=0;i<7;i++)
                {
                    row.addElement(DB.rs.getObject(i+1));
                }
                cbo_UpdateProdCompany.setSelectedItem(row.get(0));
                txt_UpdateProdName.setText(row.get(1).toString());
                cbo_UpdateProdCategory.setSelectedItem(row.get(2));
                if(row.get(3) != null) txt_UpdateProdSize.setText(row.get(3).toString());
                cbo_UpdateProdColor.setSelectedItem(row.get(4));
                if(row.get(5) != null) date_UpdateProdExpiration.getEditor().setText(row.get(5).toString());
                txt_UpdateProdPrice.setText(row.get(6).toString());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:generateUpdate()"
                   + "</font></center></html>", "Error Message", 0);
             
        }
    }
    protected void clearNewProduct(){
        txt_NewProdName.setText("");
        cbo_NewProdCompany.setSelectedIndex(0);
        cbo_NewProdCategory.setSelectedIndex(0);
        cbo_NewProdColor.setSelectedIndex(0);
        txt_NewBarcode.setText("");
        date_NewProdExpiration.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_NewProdExpiration.setDate(newDealerRegDate);
    }
    
    protected void updateNewProduct(){
        
        if (date_UpdateProdExpiration.isEnabled()){
            if (txt_UpdateProdName.getText().equals("") || txt_UpdateProdPrice.getText().equals("") || txt_UpdateProdSize.getText().equals("")
                   || date_UpdateProdExpiration.getEditor().getText().equals("")){
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill-in the form before you <font color=white>..</font>"
                + "<br/>can update the product information.</font></center></html>", "Complete the form", 0);
            }
            else{
                String expDate = date_UpdateProdExpiration.getEditor().getText();
                String dateFormat = "%Y-%m-%d";
                successEx = DB.dbHandlerUpdates("UPDATE product SET supplier = "+getSupplierID(cbo_UpdateProdCompany)+", product_name = '"+txt_UpdateProdName.getText()+"',category = "+getCategory(cbo_UpdateProdCategory)+", product_size = '"+txt_UpdateProdSize.getText()+"',product_color = "+getProductColor(cbo_UpdateProdColor)+",expiration = STR_TO_DATE('"+expDate+"','"+dateFormat+"'),selling_price = "+txt_UpdateProdPrice.getText()+" WHERE idproduct = "+clickedID_onTable);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Product information successfully updated!"
                        + "</font></center></html>", "Information Message", 1);
            }
        }
        else{
            if (txt_UpdateProdName.getText().equals("") || txt_UpdateProdPrice.getText().equals("") ||
                     txt_UpdateProdSize.getText().equals("")){
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill-out the form before you <font color=white>..</font>"
                + "<br/>can update the product information.</font></center></html>", "Complete the form", 0);
            }
            else{
                //INSERT SQL QUERY FOR UPDATING PRODUCT
                successEx = DB.dbHandlerUpdates("UPDATE product SET supplier = "+getSupplierID(cbo_UpdateProdCompany)+", product_name = '"+txt_UpdateProdName.getText()+"',category = "+getCategory(cbo_UpdateProdCategory)+", product_size = '"+txt_UpdateProdSize.getText()+"',product_color = "+getProductColor(cbo_UpdateProdColor)+",selling_price = "+txt_UpdateProdPrice.getText()+" WHERE idproduct = "+clickedID_onTable);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Product information successfully updated!"
                        + "</font></center></html>", "Information Message", 1);
            }
        }
       
    }
    
    protected void clearUpdateProduct(){
        txt_UpdateProdName.setText("");
        txt_UpdateProdPrice.setText("");
        txt_UpdateProdSize.setText("");
        cbo_UpdateProdCompany.setSelectedIndex(0);
        cbo_UpdateProdCategory.setSelectedIndex(0);
        cbo_UpdateProdColor.setSelectedIndex(0);
        
        date_UpdateProdExpiration.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_UpdateProdExpiration.setDate(newDealerRegDate);
    }
    
    protected void addNewCompany(int dialogclassification){
        if (btn_NewInventory.getText().equals("New")){
            btn_NewInventory.setText("Add");
            btn_CloseInventory.setText("Cancel");
            btn_EditInventory.setEnabled(false);
            btn_ClearInventory.setEnabled(true);
            txt_NewCompanyName.setEnabled(true);
            txt_NewCompanyContact.setEnabled(true);
            txt_NewCompanyDiscount.setEnabled(true);
            txt_NewCompanyContactPerson.setEnabled(true);
            lbl_NewCompanyName.setEnabled(true);
            lbl_NewDiscount.setEnabled(true);
            lbl_NewContactNumber.setEnabled(true);
            lbl_NewContactPerson.setEnabled(true);
            lbl_NewCompanyNote.setEnabled(true);
        }
        else{
            if (txt_NewCompanyName.getText().equals("") || txt_NewCompanyDiscount.getText().equals("")){
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please make sure that you fill-out all<font color=white>.         .</font>"
                + "<br/>the required information and try again.</font></center></html>", "Complete the form", 0);
            }
            else{
                if (btn_NewInventory.getText().equals("Add")){
                    //insert SQL query here for ADDING NEW SUPPLIER
                    DB.dbHandlerUpdates("INSERT INTO supplier(supplier_name,contact_number,contact_person,discount) VALUES('"+txt_NewCompanyName.getText()+"','"+txt_NewCompanyContact.getText()+"','"+txt_NewCompanyContactPerson.getText()+"',"+txt_NewCompanyDiscount.getText()+")");
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Company successfully added!"
                        + "</font></center></html>", "Information Message", 1);
                    if(dialogclassification == 1) Inventory_NewProduct.updateSupplierCBO();
                    else Inventory_UpdateProduct.updateSupplierCBO();
                    Inventory_Company.updateTable();
                }
                else{
                    //insert SQL query here for EDITING SUPPLIER
                    if(clickedID_onTable<0) JOptionPane.showMessageDialog(null,"Please click a record.");
                    else {
                        DB.dbHandlerUpdates("UPDATE supplier SET supplier_name = '"+txt_NewCompanyName.getText()+"',contact_number = '"+txt_NewCompanyContact.getText()+"',contact_person = '"+txt_NewCompanyContactPerson.getText()+"', discount = "+txt_NewCompanyDiscount.getText()+" WHERE idsupplier = "+clickedID_onTable);
                        JOptionPane.showMessageDialog(null, "<html><center><font size=4>Company successfully updated!"
                        + "</font></center></html>", "Information Message", 1);
                        if(dialogclassification == 1) Inventory_NewProduct.updateSupplierCBO();
                        else Inventory_UpdateProduct.updateSupplierCBO();
                        Inventory_Company.updateTable();
                    }
                }
            }

        }
    }
    private void generateCompanyUpdate()
    {
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT supplier_name,contact_number,contact_person,discount FROM supplier WHERE idsupplier ="+clickedID_onTable);
            while(DB.rs.next())
            {
                txt_NewCompanyName.setText(DB.rs.getObject("supplier_name").toString());
                txt_NewCompanyContact.setText(DB.rs.getObject("contact_number").toString());
                txt_NewCompanyContactPerson.setText(DB.rs.getObject("contact_person").toString());
                txt_NewCompanyDiscount.setText(DB.rs.getObject("discount").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill in the fields correctly."
                   + "</font></center></html>", "Error Message", 0);
        }
    }
    
    protected void editCompany(){
        if(clickedID_onTable > 0){
            generateCompanyUpdate();
            btn_NewInventory.setText("Save");
            btn_CloseInventory.setText("Cancel");
            btn_EditInventory.setEnabled(false);
            btn_ClearInventory.setEnabled(true);
            txt_NewCompanyName.setEnabled(true);
            txt_NewCompanyContact.setEnabled(true);
            txt_NewCompanyDiscount.setEnabled(true);
            txt_NewCompanyContactPerson.setEnabled(true);
            lbl_NewCompanyName.setEnabled(true);
            lbl_NewDiscount.setEnabled(true);
            lbl_NewContactNumber.setEnabled(true);
            lbl_NewContactPerson.setEnabled(true);
            lbl_NewCompanyNote.setEnabled(true);
        }
        else JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please select a record to edit."
                   + "</font></center></html>", "Information Message", 1);
        
    }
    
//   protected void purchaseOrderToSupplier(){
//        if(Inventory_ProductOrder.tbl_PMovementList.getRowCount() != 0)
//        {
//            dbHandlerUpdates("INSERT INTO invoice_supplier( date_of_order) VALUES((SELECT CURDATE()))");    
//            int rowCount = Inventory_ProductOrder.tbl_PMovementList.getRowCount();
//            for(int i=0;i<rowCount;i++)
//            {
//                dbHandlerUpdates("INSERT INTO purchase_order_supplier(productID,productName,quantity,salesOrderNo) VALUES("+Inventory_ProductOrder.tbl_PMovementList.getValueAt(i, 1)+",'"+Inventory_ProductOrder.tbl_PMovementList.getValueAt(i, 2)+"',"+Inventory_ProductOrder.tbl_PMovementList.getValueAt(i, 6)+","+Inventory_ProductMovement.getLastID("invoice_supplier")+")");
//            }
//            JOptionPane.showMessageDialog(null, "Transaction done");
//        }
//        else JOptionPane.showMessageDialog(null, "You need to make an order first.");
//    }
    private boolean isDuplicateColor(JTextField colorCode)
    {
        boolean flag = false;
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT color_code FROM product_color");
            
            while(DB.rs.next())
            {
                 if(DB.rs.getObject("color_code").equals(colorCode)) flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Something is wrong. (area:isDuplicateColor())"
                   + "</font></center></html>", "Error Message", 0);
        }
        return flag;
    }
    protected void addNewColor(int dialogclassification){
        if (btn_NewColor.getText().equals("New")){
            btn_NewColor.setText("Add");
            btn_CloseColor.setText("Cancel");
            btn_EditColor.setEnabled(false);
            btn_ClearColor.setEnabled(true);
            txt_ColorCode.setEnabled(true);
            txt_ColorName.setEnabled(true);
            lbl_ColorCode.setEnabled(true);
            lbl_ColorName.setEnabled(true);
        }
        else{
            if (btn_NewColor.getText().equals("Add")){
                if (txt_ColorCode.getText().equals("") || txt_ColorName.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill out the form before you<font color=white>.</font>"
                + "<br/>can add a new color and try again.</font></center></html>", "Complete the form", 0);
                }
                else{
                    //insert SQL query here for ADDING NEW COLOR
                    if(!isDuplicateColor(txt_ColorCode)){
                        DB.dbHandlerUpdates("INSERT INTO product_color(color_code,color_name) VALUES('"+txt_ColorCode.getText()+"','"+txt_ColorName.getText()+"')");
                        JOptionPane.showMessageDialog(null, "<html><center><font size=4>Color successfully added!"
                            + "</font></center></html>", "Information Message", 1);
                        Inventory_Color.updateTable();
                        if(dialogclassification == 1) Inventory_NewProduct.updateColorCBO();
                        else Inventory_UpdateProduct.updateColorCBO();
                        clearColor();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, you cant have duplicate color code at the same time. Please try again."
                             + "</font></center></html>", "Error Message", 0);
                        clearColor();
                    }
                }
                
            }
            else{
                if (txt_ColorCode.getText().equals("") || txt_ColorName.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please fill out the form before you can"
                    + "<br/>save the edited color and try again.<font color=white>....</font></font></center></html>", "Complete the form", 0);
                    }
                    else{
                        //insert SQL query here for EDITING NEW COLOR
                        if(!isDuplicateColor(txt_ColorCode)){
                            DB.dbHandlerUpdates("UPDATE product_color SET color_code = '"+txt_ColorCode.getText()+"',color_name = '"+txt_ColorName.getText()+"' WHERE idproduct_color = "+clickedID_onTable);
                            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Color information successfully updated!"
                                + "</font></center></html>", "Information Message", 1);
                            Inventory_Color.updateTable();
                            if(dialogclassification == 1) Inventory_NewProduct.updateColorCBO();
                            else Inventory_UpdateProduct.updateColorCBO();
                            clearColor();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, you cant have duplicate color code at the same time. Please try again."
                             + "</font></center></html>", "Error Message", 0);
                            clearColor();
                        }
                    }
            }
            
        }
        
    }
    
    protected void editColor(){
        populateColor();
        btn_NewColor.setText("Save");
        btn_CloseColor.setText("Cancel");
        btn_EditColor.setEnabled(false);
        btn_ClearColor.setEnabled(true);
        txt_ColorCode.setEnabled(true);
        txt_ColorName.setEnabled(true);
        lbl_ColorCode.setEnabled(true);
        lbl_ColorName.setEnabled(true);
    }
    
    protected void clearColor(){
        txt_ColorCode.setText("");
        txt_ColorName.setText("");
    }
    
    protected void addNewCategory(int dialogclassification){
        if (btn_NewCategory.getText().equals("New")){
            btn_NewCategory.setText("Add");
            btn_CloseCategory.setText("Cancel");
            btn_EditCategory.setEnabled(false);
            btn_ClearCategory.setEnabled(true);
            txt_CategoryName.setEnabled(true);
            cbo_CategoryType.setEnabled(true);
            lbl_CategoryName.setEnabled(true);
            lbl_CategoryType.setEnabled(true);
        }
        else{
            if (btn_NewCategory.getText().equals("Add")){
                if (txt_CategoryName.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please put a name first before you<font color=white>......</font>"
                        + "<br/>can add a new category and try again.</font></center></html>", "Complete the form", 0);
                }
                else{
                    //insert SQL query here for ADDING NEW CATEGORY
                    DB.dbHandlerUpdates("INSERT INTO category(category_name,category_type) VALUES('"+txt_CategoryName.getText()+"',"+getCategoryType(cbo_CategoryType)+")");
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Category successfully added!"
                        + "</font></center></html>", "Information Message", 1);
                    Inventory_Category.updateTable();
                    if(dialogclassification == 1) Inventory_NewProduct.updateCategoryCBO();
                    else Inventory_UpdateProduct.updateCategoryCBO();
                    clearCategory();
                }
                
            }
            else{
                if (txt_CategoryName.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please put a name first before you can "
                        + "<br/>save the edited category and try again.</font></center></html>", "Complete the form", 0);
                }
                else{
                    //insert SQL query here for EDITING CATEGORY
                    DB.dbHandlerUpdates("UPDATE category SET category_name = '"+txt_CategoryName.getText()+"',category_type = "+getCategoryType(cbo_CategoryType)+" WHERE idcategory ="+clickedID_onTable);
                    JOptionPane.showMessageDialog(null, "<html><center><font size=4>Category information successfully updated!"
                        + "</font></center></html>", "Information Message", 1);
                    Inventory_Category.updateTable();
                    if(dialogclassification == 1) Inventory_NewProduct.updateCategoryCBO();
                    else Inventory_UpdateProduct.updateCategoryCBO();
                    clearCategory();
                }
            }
           
        }
    }
    public static void populateCategory()
    {
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT category_name FROM category WHERE idcategory="+clickedID_onTable);
            while(DB.rs.next())
            {
                txt_CategoryName.setText(DB.rs.getObject("category_name").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error:updateCategory()");
        }
    }
    public static void populateColor()
    {
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT color_code,color_name FROM product_color where idproduct_color ="+clickedID_onTable);
            while(DB.rs.next())
            {
                txt_ColorCode.setText(DB.rs.getObject("color_code").toString());
                txt_ColorName.setText(DB.rs.getObject("color_name").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error:updateColor()");
        }
    }
    protected void editCategory(){
        populateCategory();
        btn_NewCategory.setText("Save");
        btn_CloseCategory.setText("Cancel");
        btn_EditCategory.setEnabled(false);
        btn_ClearCategory.setEnabled(true);
        txt_CategoryName.setEnabled(true);
        cbo_CategoryType.setEnabled(true);
        lbl_CategoryName.setEnabled(true);
        lbl_CategoryType.setEnabled(true);
    }
    
    protected void clearCategory(){
        txt_CategoryName.setText("");
        cbo_CategoryType.setSelectedIndex(0);
    }
    
    protected void expirationDateSort(){}
    
    protected void productMoveConfirm(int quantity,JXDatePicker dateTransaction){
        //NOTE: ERROR IF INPUT QUANTITY IS GREATER THAN QUANTITY IN DATABASE
        if(txt_Qty.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input quantity to confirm transaction."
                   + "</font></center></html>", "Error Message", 0);
        }
        else{
            try {
                //ADD OR DEDUCT STOCK DEPEND OF INVENTORY TYPE
                int existingQuantity = 0,totalQuantity = 0; String transactionType = "";
                DB.createDB();
                DB.rs = DB.stmt.executeQuery("SELECT quantity FROM product WHERE idproduct ="+clickedID_onTable);
                while(DB.rs.next())
                {
                    existingQuantity = (int) DB.rs.getObject("quantity");
                }
                if(Inventory_ProductMovement.cbo_InventoryType.getSelectedItem().equals("Inventory IN") && quantity >= 1)
                {   
                    totalQuantity = existingQuantity + quantity;
                    transactionType = "Inventory IN";
                }
                else if(Inventory_ProductMovement.cbo_InventoryType.getSelectedItem().equals("Inventory OUT") && quantity <= existingQuantity)
                {
                    totalQuantity = existingQuantity - quantity;
                    transactionType = "Inventory OUT";
                }
                String transDate = dateTransaction.getEditor().getText();
                String dateFormat = "%Y-%m-%d";
                DB.dbHandlerUpdates("UPDATE product SET quantity = "+totalQuantity+" WHERE idproduct="+clickedID_onTable);  
                DB.dbHandlerUpdates("INSERT INTO inventory_transactions(transact_date,transact_type,productID,product_name,quantity) VALUES((SELECT CURDATE()),'"+transactionType+"',"+clickedID_onTable+",(SELECT product_name FROM product WHERE idproduct="+clickedID_onTable+"),"+quantity+")");
                inventory.InventoryPnl_1stLayer.updateTable();
                //INVENTORY OUT
            } catch (SQLException ex) {
                Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error:productMoveConfirm()");
                
            }
                
        }
    }
    
    protected void invStocksSort(){}
}
