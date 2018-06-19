package dealer;

import com.DB;
import com.DatabaseLinker;
import static dealer.DealerPnl_1stLayer.*;
import dialog_dealer.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static report.DealerAccount.DealerAccount_1stLayer.setJTable;

public class Dealer_ButtonFunctions {
   
    public void handleEmptySupplier()
    {
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT COUNT(*) FROM supplier");
            while(DB.rs.next())
            {
                if(Integer.parseInt(DB.rs.getObject("count(*)").toString()) != 0) dealerNew();
                else JOptionPane.showMessageDialog(null, "<html><center><font size=4>Can't Add. No products/suppliers found."
                   + "</font></center></html>", "Error Message", 0);
                    //JOptionPane.showMessageDialog(null,"Can't add. No products/suppliers found.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dealer_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:session: handleEmptySupplier()"
                   + "</font></center></html>", "Error Message", 0);
            //JOptionPane.showMessageDialog(null,"error:session: handleEmptySupplier()");
        }
    }
    public static void sortByAvailableCredit(javax.swing.JComboBox cboOption)
    {
        if(cboOption.getSelectedItem().equals("Low - High")){
            DatabaseLinker.updateTable(report.DealerAccount.DealerAccount_1stLayer.tbl_Outstanding, "SELECT iddealer AS 'ID',CONCAT(first_name,' ',last_name) AS 'Dealer Name',sponsor AS 'Sponsor/Recruiter Name',"
            + "DATE_FORMAT(registration_date, '%b. %d, %Y') AS 'Registration Date',credit_limit AS 'Credit Line',available_credit AS 'Available Credit',"
            + "balance AS 'Balance' FROM dealer ORDER BY balance ASC");
            setJTable();
        }
        
        else {
            DatabaseLinker.updateTable(report.DealerAccount.DealerAccount_1stLayer.tbl_Outstanding, "SELECT iddealer AS 'ID',CONCAT(first_name,' ',last_name) AS 'Dealer Name',sponsor AS 'Sponsor/Recruiter Name',"
            + "DATE_FORMAT(registration_date, '%b. %d, %Y') AS 'Registration Date',credit_limit AS 'Credit Line',available_credit AS 'Available Credit',"
            + "balance AS 'Balance' FROM dealer ORDER BY balance DESC");
            setJTable();
        }
    }
    
    protected void dealerNew(){
        Dealer_NewAccount dealer = new Dealer_NewAccount(null, true);
        dealer.pack();
        //dealer.setLocationRelativeTo(null);
        dialog_dealer.Dealer_ButtonFunctions.countIncrementedID();
        dealer.setVisible(true);
    }
    
    protected void dealerUpdate(){
        Dealer_UpdateAccount dealer = new Dealer_UpdateAccount(null, true);
        dealer.pack();
        //dealer.setLocationRelativeTo(null);
        if(dialog_dealer.Dealer_ButtonFunctions.clickedID_onTable > 0)
        {
            dialog_dealer.Dealer_ButtonFunctions.generateUpdateDialog();
            dealer.setVisible(true);
            dialog_dealer.Dealer_ButtonFunctions.clickedID_onTable = 0;
        }
        else JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please select a record to update."
                   + "</font></center></html>", "Information Message", 1);
    }
    protected void dealerFullDiscounts(){
        Dealer_ViewDiscount dealer = new Dealer_ViewDiscount(null, true);
        dealer.pack();
        dealer.setLocationRelativeTo(null);
        dealer.setVisible(true);
    }
    
   
    protected void dealerSearch(){
        if(txt_DealerCode.getText().equals("")){
           JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input dealer id or name to search."
                   + "</font></center></html>", "Error Message", 0);
        }
        else{
           //SQL CODE FOR SEARCHING DEALER
        }      
    }
}
