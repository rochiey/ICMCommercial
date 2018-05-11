package report.DealerAccount;

import com.DatabaseLinker;
import static report.DealerAccount.CLTransact_Generate.btn_CLView;
import static report.DealerAccount.CLTransact_Generate.date_CLFrom;
import static report.DealerAccount.CLTransact_Generate.date_CLTo;
import static report.DealerAccount.CLTransact_Generate.jLabel152;
import static report.DealerAccount.CLTransact_Generate.jLabel153;
import static report.DealerAccount.CLTransact_Generate.radio_CLAll;
import static report.DealerAccount.CLTransact_Generate.radio_CLCustom;
import static report.DealerAccount.CLTransact_Generate.radio_CLDealer;
import static report.DealerAccount.CLTransact_Generate.radio_CLIncoming;
import static report.DealerAccount.CLTransact_Generate.txt_CLDealID;
import static report.DealerAccount.DealerAccount_1stLayer.cbo_OutstandingSort;


public class DealerAccount_ButtonFunctions {
   
    
    protected void dealerSort(){
        if(cbo_OutstandingSort.getSelectedItem().equals("Default")){
            DatabaseLinker.updateTable(DealerAccount_1stLayer.tbl_Outstanding, "SELECT iddealer AS 'Dealer ID',CONCAT(first_name,' ',last_name) AS 'Dealer Name',sponsor AS 'Sponsor',registration_date AS 'Date Registered',credit_limit AS 'Credit Line',available_credit AS 'Available Credit',balance AS 'Balance' FROM dealer");
        }

        else if(cbo_OutstandingSort.getSelectedItem().equals("Balance Amount")){
            Dealer_CreditAmount dealer = new Dealer_CreditAmount(null, true);
            dealer.pack();
            dealer.setLocationRelativeTo(null);
            dealer.setVisible(true);    
        }
    }
    protected void generateCLForm(){
       CLTransact_Generate cl = new CLTransact_Generate(null, true);
       cl.pack();
       cl.setLocationRelativeTo(null);
       cl.setVisible(true);
   }
   
    protected void IncomingSelectedCL(){
       if(radio_CLIncoming.isSelected()){
            date_CLFrom.setEnabled(false);
            date_CLTo.setEnabled(false);
            jLabel152.setEnabled(false);
            jLabel153.setEnabled(false);
        }
   }
   
    protected void CustomSelectedCL(){
       if(radio_CLCustom.isSelected()){
            date_CLFrom.setEnabled(true);
            date_CLTo.setEnabled(true);
            jLabel152.setEnabled(true);
            jLabel153.setEnabled(true);
        }
   }
   protected void allSelectedCL(){
       if(radio_CLAll.isSelected()){
            txt_CLDealID.setEnabled(false);
            btn_CLView.setEnabled(false);
            CLTransact_Generate.txt_CLDealID.setText("");
        }
   }
   
   
   protected void dealerSelectedCL(){
       if(radio_CLDealer.isSelected()){
            txt_CLDealID.setEnabled(true);
            btn_CLView.setEnabled(true);
        }
   }
    protected void refresh_Outstanding(){
        //lbl_status.setVisible(false);
        cbo_OutstandingSort.setSelectedIndex(0);
        DealerAccount_1stLayer.getTotals();
   }
    protected void printBalance(){}
    
}
