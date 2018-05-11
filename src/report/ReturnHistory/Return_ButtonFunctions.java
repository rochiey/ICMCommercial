package report.ReturnHistory;

import com.DatabaseLinker;
import static report.ReturnHistory.Return_CustomDate.*;
import static report.ReturnHistory.ReturntPnl_1stLayer.setJTable;

public class Return_ButtonFunctions {
   
   protected void generateReturn(){
       if(radio_All.isSelected()) {
           DatabaseLinker.updateTable(ReturntPnl_1stLayer.tbl_ReturnReport, "SELECT idreturn_history AS 'RF No.',DATE_FORMAT(return_date, '%b. %d, %Y') AS 'Return Date', customer_name AS 'Customer Name',return_reason AS 'Reason',invoice.total_net AS 'Original Amount',refund AS 'Refund', invoiceID AS 'For SO No.' FROM return_history,invoice WHERE invoiceID=idinvoice AND return_date BETWEEN '"+Return_CustomDate.date_ReturnFrom.getEditor().getText()+"' AND '"+Return_CustomDate.date_ReturnTo.getEditor().getText()+"'");
           ReturntPnl_1stLayer.getTotals();
           setJTable();
       }
       else if(radio_customer.isSelected() && Return_CustomDate.cbo_ReturnCType.getSelectedItem().equals("Dealer")){
           DatabaseLinker.updateTable(ReturntPnl_1stLayer.tbl_ReturnReport, "SELECT idreturn_history AS 'RF No.',DATE_FORMAT(return_date, '%b. %d, %Y') AS 'Return Date', customer_name AS 'Customer Name',return_reason AS 'Reason',invoice.total_net AS 'Original Amount',refund AS 'Refund', invoiceID AS 'For SO No.' FROM return_history,invoice WHERE invoiceID=idinvoice AND return_date BETWEEN '"+Return_CustomDate.date_ReturnFrom.getEditor().getText()+"' AND '"+Return_CustomDate.date_ReturnTo.getEditor().getText()+"' AND customer_name='"+txt_ReturnCustName.getText()+"'");
           ReturntPnl_1stLayer.getTotals();
           setJTable();
       }
       else if(radio_customer.isSelected() && Return_CustomDate.cbo_ReturnCType.getSelectedItem().equals("Walk-in")){
           DatabaseLinker.updateTable(ReturntPnl_1stLayer.tbl_ReturnReport, "SELECT idreturn_history AS 'RF No.',DATE_FORMAT(return_date, '%b. %d, %Y') AS 'Return Date', customer_name AS 'Customer Name',return_reason AS 'Reason',invoice.total_net AS 'Original Amount',refund AS 'Refund', invoiceID AS 'For SO No.' FROM return_history,invoice WHEREinvoiceID=idinvoice AND return_date BETWEEN '"+Return_CustomDate.date_ReturnFrom.getEditor().getText()+"' AND '"+Return_CustomDate.date_ReturnTo.getEditor().getText()+"' AND customer_name=' '");
           ReturntPnl_1stLayer.getTotals();
           setJTable();
       }
   }
   protected void customerType(){
        if(cbo_ReturnCType.getSelectedItem().equals("Dealer")){
            lblCustomer.setText("Dealer Name/ID:");
            btn_ReturnCName.setEnabled(true);
        }
        else{
           lblCustomer.setText("Customer Name:");
           btn_ReturnCName.setEnabled(false);
        }
    }
   
   protected void radioAllSelected(){
       if(radio_All.isSelected()){
            cbo_ReturnCType.setEnabled(false);
            lblCustomer.setEnabled(false);
            txt_ReturnCustName.setEnabled(false);
            btn_ReturnCName.setEnabled(false);
        }
   }
   
   protected void radioCustomerSelected(){
       if(radio_customer.isSelected()){
            cbo_ReturnCType.setEnabled(true);
            lblCustomer.setEnabled(true);
            txt_ReturnCustName.setEnabled(true);
            
            if(cbo_ReturnCType.getSelectedItem().equals("Dealer")){
               btn_ReturnCName.setEnabled(true);
            }
            else{
               btn_ReturnCName.setEnabled(false);
               txt_ReturnCustName.setEnabled(false);
            }
            
        }
   }
   
   protected void generateReturnForm(){
       Return_CustomDate returnC = new Return_CustomDate(null, true);
       returnC.pack();
       returnC.setLocationRelativeTo(null);
       returnC.setVisible(true);
   }
   
   protected void refresh_Return(){
       ReturntPnl_1stLayer.generateUpdate();
    }
   protected void printReturn(){}
    
}
