package report.SalesReport;

import com.DatabaseLinker;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import static report.SalesReport.Generate_SalesReport.*;
import static report.SalesReport.ReportPnl_1stLayer.*;
import com.DB;

public class SalesReport_ButtonFunctions {

    protected void generateSReport(){
       /*lbl_NewDealerMName.setForeground(Color.BLACK);
       lbl_SalesReportDate.setVisible(true);*/
       DecimalFormat df = new DecimalFormat("#,###.00");
       lbl_NewDealerMName1.setVisible(true);
       lbl_SalesReportTotal.setVisible(true);
       if(radio_SReportCurrent.isSelected()){
           //lbl_SalesReportDate.setText("Today");
           DatabaseLinker.updateTable(tbl_ReportSales, "SELECT idinvoice AS 'SO No.',DATE_FORMAT(date_of_transaction, '%b. %d, %Y') AS 'Transaction Date',(SELECT CONCAT(dealer.first_name,' ',dealer.last_name) FROM dealer WHERE iddealer=customerDealer) AS 'Customer Name',total_net AS 'Total Net', amount_paid AS 'Amount Paid',payment_type.payment_type_name AS 'Payment Type',total_refund AS 'Refund Amount' FROM payment_type,invoice WHERE payment_type=payment_type.idpayment_type AND date_of_transaction=(SELECT CURDATE())");
           setJTable();
           getAllTotal("date_of_transaction=(SELECT CURDATE())");
       }
       else{
           //lbl_SalesReportDate.setText(date_SReportFrom.getEditor().getText()+" - "+date_SReportTo.getEditor().getText());
           DatabaseLinker.updateTable(tbl_ReportSales, "SELECT idinvoice AS 'SO No.',DATE_FORMAT(date_of_transaction, '%b. %d, %Y') AS 'Transaction Date',(SELECT CONCAT(dealer.first_name,' ',dealer.last_name) FROM dealer WHERE iddealer=customerDealer) AS 'Customer Name',total_net AS 'Total Net', amount_paid AS 'Amount Paid',payment_type.payment_type_name AS 'Payment Type',total_refund AS 'Refund Amount' FROM payment_type,invoice WHERE payment_type=payment_type.idpayment_type AND date_of_transaction BETWEEN '"+date_SReportFrom.getEditor().getText()+"' AND '"+date_SReportTo.getEditor().getText()+"'");
           setJTable();
           getAllTotal("date_of_transaction BETWEEN '"+date_SReportFrom.getEditor().getText()+"' AND '"+date_SReportTo.getEditor().getText()+"'");
       }
       StringBuilder sb1 =new StringBuilder(lbl_TNet.getText());
       StringBuilder sb2 = new StringBuilder(lbl_RefundAmount.getText());
       sb1.deleteCharAt(0);
       sb2.deleteCharAt(0);
       Float result = getRealFloat(sb1.toString())-getRealFloat(sb2.toString());
       lbl_SalesReportTotal.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", result))));
    }
    public static void getAllTotal(String where)
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        DB.createDB();
        float totalNet=0,amountPaid=0,refundAmount=0;
        try {
            DB.rs=DB.stmt.executeQuery("SELECT SUM(total_net) AS 'totalnet',SUM(amount_paid) AS 'amountpaid',SUM(total_refund) AS 'totalrefund' FROM invoice WHERE "+where);
            while(DB.rs.next())
            {
                totalNet = DB.rs.getFloat("totalnet");
                amountPaid = DB.rs.getFloat("amountpaid");
                refundAmount = DB.rs.getFloat("totalrefund");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportPnl_1stLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbl_TNet.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", totalNet))));
        lbl_CPaid.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", amountPaid))));
        lbl_RefundAmount.setText("₱"+df.format(Float.parseFloat(String.format("%.2f", refundAmount))));
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
    protected void generateSReportForm(){
        Generate_SalesReport report = new Generate_SalesReport(null, true);
        report.pack();
        report.setLocationRelativeTo(null);
        report.setVisible(true);
    }

    protected void radioCurrentDate(){
       if(radio_SReportCurrent.isSelected()){
            lbl_FromDList.setEnabled(false);
            lbl_ToDList.setEnabled(false);
            date_SReportFrom.setEnabled(false);
            date_SReportTo.setEnabled(false);
        }
   }

   protected void radioCustomDate(){
       if(radio_SReportCustom.isSelected()){
            lbl_FromDList.setEnabled(true);
            lbl_ToDList.setEnabled(true);
            date_SReportFrom.setEnabled(true);
            date_SReportTo.setEnabled(true);
        }
   }

    protected void salesReport_Refresh(){
       /*lbl_NewDealerMName.setForeground(Color.WHITE);
       lbl_SalesReportDate.setVisible(false);*/
       ReportPnl_1stLayer.getAllTotal();
       DatabaseLinker.updateTable(tbl_ReportSales, "SELECT idinvoice AS 'SO No.',DATE_FORMAT(date_of_transaction, '%b. %d, %Y') AS 'Transaction Date',(SELECT CONCAT(dealer.first_name,' ',dealer.last_name) FROM dealer WHERE dealer.iddealer=invoice.customerDealer) AS 'Customer Name',total_net AS 'Total Net', amount_paid AS 'Amount Paid',payment_type.payment_type_name AS 'Payment Type',total_refund AS 'Return/Refund Amount' FROM payment_type,invoice WHERE payment_type=payment_type.idpayment_type");
       setJTable();
       /*lbl_NewDealerMName1.setVisible(false);
       lbl_SalesReportTotal.setVisible(false);*/
       //Remove all the data in the table and other texts
    }

    protected void salesReport_Print(){

    }


}
