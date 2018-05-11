package report.InventoryStatus;

import com.DatabaseLinker;
import dialog_inventory.Inventory_ExpirationDate;
import dialog_inventory.Inventory_Stocks;
import static report.InventoryStatus.Generate_InvStatus.*;
import static report.InventoryStatus.InvStatus_1stLayer.*;

public class InvStatus_ButtonFunctions {
   
    protected void generateInvStatus(){
       if(cbo_GenInvCompany.getSelectedItem().equals("ALL"))
       {
            if (radio_LSProducts.isSelected()){
            DatabaseLinker.updateTable(InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                    + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                    + "category.category_name AS 'Category',REPLACE(product.product_size, 'NULL', '-') AS 'Size',"
                    + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                    + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',"
                    + "IFNULL(DATEDIFF(expiration,CURDATE()),'-') AS 'Remain. Days' FROM product,supplier,"
                    + "product_color,category WHERE product.supplier = supplier.idsupplier and "
                    + "product.category = category.idcategory and product.product_color = product_color.idproduct_color and "
                    + "quantity BETWEEN -1 AND 15");
            lbl_InvStatTotal1.setVisible(false);
            lbl_InvStatNExProd.setVisible(false);
            lbl_InvStatTotal2.setVisible(false);
            lbl_InvStatExProd.setVisible(false);    
            //lbl_InvStatusType.setText(radio_LSProducts.getText());  
            lbl_InvStatTotal.setText("Total No. of Low Stock Products:");
            lbl_InvStatLStock.setText(InvStatus_1stLayer.tbl_InvStatus.getRowCount()+"");//total number
            setJTable();
            }
            else if (radio_NEProducts.isSelected()){
                DatabaseLinker.updateTable(InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                        + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                        + "category.category_name AS 'Category',REPLACE(product.product_size, 'NULL', '-') AS 'Size',"
                        + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                        + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',"
                        + "IFNULL(DATEDIFF(expiration,CURDATE()),'-') AS 'Remain. Days' FROM product,supplier,product_color,"
                        + "category WHERE product.supplier = supplier.idsupplier and "
                        + "product.category = category.idcategory and product.product_color = product_color.idproduct_color "
                        + "and DATEDIFF(expiration,CURDATE()) BETWEEN 0 AND 90");
                lbl_InvStatTotal1.setVisible(false);
                lbl_InvStatNExProd.setVisible(false);
                lbl_InvStatTotal2.setVisible(false);
                lbl_InvStatExProd.setVisible(false);    
                //lbl_InvStatusType.setText(radio_NEProducts.getText());
                lbl_InvStatTotal.setText("Total No. of Nearly Expire Products:");
                lbl_InvStatLStock.setText(InvStatus_1stLayer.tbl_InvStatus.getRowCount()+"");//total number
                setJTable();
            }
            else{
                DatabaseLinker.updateTable(InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                        + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                        + "category.category_name AS 'Category',REPLACE(product.product_size, 'NULL', '-') AS 'Size',"
                        + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                        + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',"
                        + "IFNULL(DATEDIFF(expiration,CURDATE()),'-') AS 'Remain. Days' FROM product,supplier,product_color,"
                        + "category WHERE product.supplier = supplier.idsupplier and "
                        + "product.category = category.idcategory and product.product_color = product_color.idproduct_color "
                        + "and DATEDIFF(expiration,CURDATE())<=0");
                lbl_InvStatTotal1.setVisible(false);
                lbl_InvStatNExProd.setVisible(false);
                lbl_InvStatTotal2.setVisible(false);
                lbl_InvStatExProd.setVisible(false);    
                //lbl_InvStatusType.setText(radio_EProducts.getText());
                lbl_InvStatTotal.setText("Total No. of Expire Products:");
                lbl_InvStatLStock.setText(InvStatus_1stLayer.tbl_InvStatus.getRowCount()+"");//total number
                setJTable();
            }
       }
       else
       {
           if (radio_LSProducts.isSelected()){
            DatabaseLinker.updateTable(InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                    + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                    + "category.category_name AS 'Category',REPLACE(product.product_size, 'NULL', '-') AS 'Size',"
                    + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                    + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',"
                    + "IFNULL(DATEDIFF(expiration,CURDATE()),'-') AS 'Remain. Days' FROM product,supplier,"
                    + "product_color,category WHERE product.supplier = supplier.idsupplier and "
                    + "product.category = category.idcategory and product.product_color = product_color.idproduct_color and "
                    + "quantity BETWEEN -1 AND 15 AND supplier.supplier_name='"+cbo_GenInvCompany.getSelectedItem().toString()+"'");
            lbl_InvStatTotal1.setVisible(false);
            lbl_InvStatNExProd.setVisible(false);
            lbl_InvStatTotal2.setVisible(false);
            lbl_InvStatExProd.setVisible(false);    
            //lbl_InvStatusType.setText(radio_LSProducts.getText());  
            lbl_InvStatTotal.setText("Total No. of Low Stock Products:");
            lbl_InvStatLStock.setText(InvStatus_1stLayer.tbl_InvStatus.getRowCount()+"");//total number
            setJTable();
            }
            else if (radio_NEProducts.isSelected()){
                DatabaseLinker.updateTable(InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                        + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                        + "category.category_name AS 'Category',REPLACE(product.product_size, 'NULL', '-') AS 'Size',"
                        + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                        + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',"
                        + "IFNULL(DATEDIFF(expiration,CURDATE()),'-') AS 'Remain. Days' FROM product,supplier,product_color,"
                        + "category WHERE product.supplier = supplier.idsupplier and "
                        + "product.category = category.idcategory and product.product_color = product_color.idproduct_color "
                        + "and DATEDIFF(expiration,CURDATE()) BETWEEN -1 AND 90 AND supplier.supplier_name='"+cbo_GenInvCompany.getSelectedItem().toString()+"'");
                lbl_InvStatTotal1.setVisible(false);
                lbl_InvStatNExProd.setVisible(false);
                lbl_InvStatTotal2.setVisible(false);
                lbl_InvStatExProd.setVisible(false);    
                //lbl_InvStatusType.setText(radio_NEProducts.getText());
                lbl_InvStatTotal.setText("Total No. of Nearly Expire Products:");
                lbl_InvStatLStock.setText(InvStatus_1stLayer.tbl_InvStatus.getRowCount()+"");//total number
                setJTable();
            }
            else{
                DatabaseLinker.updateTable(InvStatus_1stLayer.tbl_InvStatus, "SELECT product.idproduct AS 'Code',"
                        + "product.product_name AS 'Article Name',supplier.supplier_name AS 'Company Name',"
                        + "category.category_name AS 'Category',REPLACE(product.product_size, 'NULL', '-') AS 'Size',"
                        + "product_color.color_code AS 'Color Code',product.quantity AS 'Quantity',"
                        + "product.selling_price AS 'Retail Price',IFNULL(DATE_FORMAT(product.expiration, '%b. %d, %Y'),'-') AS 'Expiration Date',"
                        + "IFNULL(DATEDIFF(expiration,CURDATE()),'-') AS 'Remain. Days' FROM product,supplier,product_color,"
                        + "category WHERE product.supplier = supplier.idsupplier and "
                        + "product.category = category.idcategory and product.product_color = product_color.idproduct_color "
                        + "and DATEDIFF(expiration,CURDATE())<=-1 AND supplier.supplier_name='"+cbo_GenInvCompany.getSelectedItem().toString()+"'");
                lbl_InvStatTotal1.setVisible(false);
                lbl_InvStatNExProd.setVisible(false);
                lbl_InvStatTotal2.setVisible(false);
                lbl_InvStatExProd.setVisible(false);    
                //lbl_InvStatusType.setText(radio_EProducts.getText());
                lbl_InvStatTotal.setText("Total No. of Expire Products:");
                lbl_InvStatLStock.setText(InvStatus_1stLayer.tbl_InvStatus.getRowCount()+"");//total number
                setJTable();
            }
       }
    }
    
    protected void generateInvStatusForm(){
       Generate_InvStatus invS = new Generate_InvStatus(null, true);
       invS.pack();
       invS.setLocationRelativeTo(null);
       invS.setVisible(true);
    }
   
    
    protected void refresh_InvStatus(){
       lbl_InvStatTotal.setText("Total No. of Low Stock Products:");
       lbl_InvStatTotal1.setVisible(true);
       lbl_InvStatLStock.setText(0+"");
       lbl_InvStatTotal1.setText("Total No. of Nearly Expire Products:");
       lbl_InvStatNExProd.setVisible(true);
       lbl_InvStatNExProd.setText(0+"");
       lbl_InvStatTotal2.setText("Total No. of Expire Products:");  
       lbl_InvStatTotal2.setVisible(true);
       lbl_InvStatExProd.setText(0+"");
       lbl_InvStatExProd.setVisible(true); 
       InvStatus_1stLayer.generateUpdate();
       InvStatus_1stLayer.getAllTotals();
    }
   
    protected void printInvTrans(){}
    
}
