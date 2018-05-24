package inventory;

import com.DatabaseLinker;
import dialog_inventory.Inventory_NewProduct;
import dialog_inventory.Inventory_ProductMovement;
import dialog_inventory.Inventory_UpdateProduct;
import static inventory.InventoryPnl_1stLayer.txt_InventoryCode;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inventory_ButtonFunctions {
        public static void sortByStocks(javax.swing.JComboBox cboStocks)
        {
            if(cboStocks.getSelectedItem().equals("High - Low"))  {
                DatabaseLinker.updateTable(report.InventoryStatus.InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                + "category.category_name AS 'Category',REPLACE(product.product_size, '0', '-') AS 'Size',"
                + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',DATEDIFF(expiration,CURDATE()) AS 'Remain. Days' "
                + "FROM product,supplier,product_color,category WHERE product.supplier = supplier.idsupplier and product.category = category.idcategory and product.product_color = product_color.idproduct_color and quantity BETWEEN -1 AND 15 ORDER BY quantity DESC");
                report.InventoryStatus.InvStatus_1stLayer.getAllTotals();
            }
            else {
                DatabaseLinker.updateTable(report.InventoryStatus.InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                + "category.category_name AS 'Category',REPLACE(product.product_size, '0', '-') AS 'Size',"
                + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',DATEDIFF(expiration,CURDATE()) AS 'Remain. Days' "
                + "FROM product,supplier,product_color,category WHERE product.supplier = supplier.idsupplier and product.category = category.idcategory and product.product_color = product_color.idproduct_color and quantity BETWEEN -1 AND 15 ORDER BY quantity ASC");
                report.InventoryStatus.InvStatus_1stLayer.getAllTotals();
            }
        }
        public static void sortExpDate(String from, String to)
        {
            DatabaseLinker.updateTable(report.InventoryStatus.InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                + "category.category_name AS 'Category',REPLACE(product.product_size, '0', '-') AS 'Size',"
                + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',DATEDIFF(expiration,CURDATE()) AS 'Remain. Days' "
                + "FROM product,supplier,product_color,category WHERE product.supplier = supplier.idsupplier and product.category = category.idcategory and product.product_color = product_color.idproduct_color and quantity BETWEEN -1 AND 15 AND expiration BETWEEN '"+from+"' AND '"+to+"' ");
        }
    
    protected void inventoryNew(){
        dialog_inventory.Inventory_NewProduct inventory = new Inventory_NewProduct(null, true);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        inventory.setVisible(true);
        InventoryPnl_1stLayer.updateTable();
    }
    
    protected void inventoryUpdate(){
        dialog_inventory.Inventory_UpdateProduct inventory = new Inventory_UpdateProduct(null, true);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        if(dialog_inventory.Inventory_ButtonFunctions.clickedID_onTable > 0 )
        {
            dialog_inventory.Inventory_ButtonFunctions.generateUpdate();
            dialog_inventory.Inventory_ButtonFunctions.disableUpdateRegDate();
            inventory.setVisible(true);
            dialog_inventory.Inventory_ButtonFunctions.clickedID_onTable = 0;
        }
        else JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please select a record to update."
                   + "</font></center></html>", "Information Message", 1);
    }
    
    protected void inventoryStockMovement(){
        dialog_inventory.Inventory_ProductMovement inventory = new Inventory_ProductMovement(null, true);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        inventory.setVisible(true);
    }
    public static int countIncrementedID()
    {
        Integer theID = 0;
        inventory.InventoryPnl_1stLayer.createDB();
        try {
            inventory.InventoryPnl_1stLayer.rs = inventory.InventoryPnl_1stLayer.stmt.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = 'invoice_supplier' limit 1");
            while(inventory.InventoryPnl_1stLayer.rs.next())
            {
                theID = Integer.parseInt(inventory.InventoryPnl_1stLayer.rs.getObject("AUTO_INCREMENT").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventory_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return theID;
    }
    
    protected void searchInventory(){
        if (txt_InventoryCode.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input product code or name before"
                + "<br/>you can search a product and try again.</font><font color=white>.....</font></center></html>", 
                    "Error Message", 0);
        }
        else{
            //SEARCH PRODUCT
        }
    }
    
   
}
