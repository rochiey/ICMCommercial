package report.InventoryTrans;

import com.DatabaseLinker;

public class InvTransactions_ButtonFunctions {
   //In table, Transaction type is either Sales Order, Credit, Pullout, Inv IN, Inv OUT
   
   public void generateInvTrans(){
       /*lbl_NewDealerMName.setForeground(Color.BLACK);
       lbl_InvTransactionsDate.setVisible(true);*/
       DatabaseLinker.updateTable(InvTransactions_1stLayer.tbl_InvTransactions, "SELECT transact_date AS 'Transaction Date', transact_type AS 'Transaction Type', POid AS 'Invoice ID', remarks AS 'Remarks' FROM inventory_transactions WHERE transact_date BETWEEN '"+Inv_TransactDate.date_InvTranstFrom.getEditor().getText()+"' AND '"+Inv_TransactDate.date_InvTransTo.getEditor().getText()+"'");
       //lbl_InvTransactionsDate.setText(Inv_TransactDate.date_InvTranstFrom.getEditor().getText()+"-to-"+Inv_TransactDate.date_InvTransTo.getEditor().getText());
   }
  
   protected void generateInvTransForm(){
       Inv_TransactDate inv = new Inv_TransactDate(null, true);
       inv.pack();
       inv.setLocationRelativeTo(null);
       inv.setVisible(true);
   }
   
   protected void refresh_InvTrans(){
       /*lbl_NewDealerMName.setForeground(Color.WHITE);
       lbl_InvTransactionsDate.setVisible(false);*/
       InvTransactions_1stLayer.generateUpdate();
   }
   
   protected void printInvTrans(){}
    
}
