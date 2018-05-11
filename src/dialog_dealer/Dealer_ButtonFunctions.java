package dialog_dealer;


import com.DbUtils;
import static dialog_dealer.Dealer_NewAccount.*;
import static dialog_dealer.Dealer_UpdateAccount.*;
import static dialog_dealer.Dealer_ViewAccount.txt_ViewDealerID;
import static dialog_dealer.Dealer_ViewDiscount.txt_DealerDCode;
import java.sql.*;
import java.text.*;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Dealer_ButtonFunctions {
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
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Error:Code:Sql Command"
                   + "</font></center></html>", "Error Message", 0);
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbUtils.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:session:connectionCloseDbHandlerUpdates(query)"
                   + "</font></center></html>", "Error Message", 0);
            }
        }
    }
    private int getSponsorID(String name)
    {
        int id =0;
        createDB();
         try {
             rs = stmt.executeQuery("SELECT iddealer FROM dealer WHERE first_name = '"+name+"'");
             while(rs.next())
             {
                 id = Integer.parseInt(rs.getObject(1).toString());
             }
         } catch (SQLException ex) {
             Logger.getLogger(Dealer_ViewAccount.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "<html><center><font size=4>Error:getdealerID()"
                   + "</font></center></html>", "Error Message", 0);
         }
         return id;
    }
    public static void countIncrementedID()
    {
        Integer theID = 0;
        createDB();
        try {
            rs = stmt.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = 'dealer' limit 1");
            while(rs.next())
            {
                theID = Integer.parseInt(rs.getObject("AUTO_INCREMENT").toString());
            }
            txt_NewDealerID.setText(theID.toString());
        } catch (SQLException ex) {
            Logger.getLogger(Dealer_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private int getGenderID(JComboBox cbogender)
    {
        if(cbogender.getSelectedItem().toString().equals("Male")) return 15;
        else return 16; //female 16 - male 15
    }
    private int getC_StatusID(JComboBox cbostatus)
    {
        int civilID = 0;
        switch(cbostatus.getSelectedIndex())
        {
            case 0: //single - 91
                civilID = 91;
            break;
            case 1: //married - 92
                civilID = 92;
            break;
            case 2: //widower - 93
                civilID = 93;
            break;
            case 3: //divorce - 94
                civilID = 94;
            break;
        }
        return civilID;
    }
    public static TableModel populateSupplierDiscountTable(String query)
    {
        createDB();
        try {
            rs = stmt.executeQuery(query);
            
            ResultSetMetaData metaData = rs.getMetaData();
	    int numberOfColumns = metaData.getColumnCount();
	    Vector<String> columnNames = new Vector<String>();
	    // Get the column names
	    for (int column = 0; column < numberOfColumns; column++) {
		columnNames.addElement(metaData.getColumnLabel(column + 1));
	    }
	    // Get all rows.
	    Vector<Vector<Object>> rows = new Vector<Vector<Object>>();

	    while (rs.next()) {
		Vector<Object> newRow = new Vector<Object>();
			for (int i = 1; i <= numberOfColumns; i++) {
				newRow.addElement(rs.getObject(i));
			}
			rows.addElement(newRow);
	    }
	    return new DefaultTableModel(rows, columnNames)
            {
                boolean[] canEdit = new boolean [] {
                    false, true
                };
                @Override
                public boolean isCellEditable(int row, int column) {
                    return canEdit[column];
                }
            };
        } catch (SQLException ex) {
            Logger.getLogger(Dealer_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Error: session:populateTable()"
                   + "</font></center></html>", "Error Message", 0);
            return null;
        }
    }
    protected void dealerNewAccount(){
        if(txt_NewDealerCredit.getText().equals("") || txt_NewDealerACLine.getText().equals("") || txt_NewDealerMaxReturn.getText().equals("") ||
            txt_NewDealerSponsor.getText().equals("") || txt_NewDealerFName.getText().equals("")||
            txt_NewDealerLName.getText().equals("") || txt_NewDealerAddress.getText().equals("") || txt_NewDealerContact.getText().equals("") ||
            date_NewDealerRegDate.getDate() == null || date_NewDealerBirthday.getDate() == null){

            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please make sure that you fill-out all<font color=white>.         .</font>"
                + "<br/>the required information and try again.</font></center></html>", "Error Message", 0);

        }
        else{
            //SQL Code for adding New Dealer Account
            String regDate = date_NewDealerRegDate.getEditor().getText();
            String bDate = date_NewDealerBirthday.getEditor().getText();
            String dateFormat = "%Y-%m-%d";
            dbHandlerUpdates("INSERT INTO dealer(registration_date,first_name,middle_name,last_name,"
                    + "gender,birthday,civil_status,nationality,address,email_address,contact_number,"
                    + "occupation,credit_limit,available_credit,max_return_days,sponsor,balance,due_date) "
                    + "VALUES(STR_TO_DATE('"+regDate+"','"+dateFormat+"'),'"+txt_NewDealerFName.getText()+"',"
                    + "'"+txt_NewDealerMName.getText()+"','"+txt_NewDealerLName.getText()+"',"
                    + ""+getGenderID(cbo_NewDealerGender)+",STR_TO_DATE('"+bDate+"','"+dateFormat+"'),"
                    + ""+getC_StatusID(cbo_NewDealerCivil)+",'"+txt_NewDealerNationality.getText()+"',"
                    + "'"+txt_NewDealerAddress.getText()+"','"+txt_NewDealerEmail.getText()+"','"+txt_NewDealerContact.getText()+"',"
                    + "'"+txt_NewDealerOccupation.getText()+"',"+txt_NewDealerCredit.getText()+","+txt_NewDealerACLine.getText()+","
                    + ""+txt_NewDealerMaxReturn.getText()+",'"+txt_NewDealerSponsor.getText()+"',0,"+cbo_NewDealerDueDate.getSelectedItem().toString()+")");
            dealer.DealerPnl_1stLayer.updateTable();
            toNewEntityBridge();
            
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Dealer successfully added!"
                + "</font></center></html>", "Information Message", 1);
            
        }
    }
    private static String getSponsorName(int id)
    {
        String name = "";
        createDB();
        try {
            rs = stmt.executeQuery("SELECT first_name FROM dealer WHERE iddealer ="+id);
            while(rs.next())
            {
                name = rs.getObject("first_name").toString();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dealer_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:getSponsorName()"
                   + "</font></center></html>", "Error Message", 0);
        }
        return name;
    }
    public static void generateUpdateDialog()
    {
        createDB();
        try {
            rs = stmt.executeQuery("SELECT * FROM dealer WHERE iddealer ="+clickedID_onTable);
            while(rs.next())
            {
                txt_UpdateDealerID.setText(rs.getObject("iddealer").toString());
                date_UpdateDealerRegDate.getEditor().setText(rs.getObject("registration_date").toString());
                txt_UpdateDealerFName.setText(rs.getObject("first_name").toString());
                if(rs.getObject("middle_name") != null) txt_UpdateDealerMName.setText(rs.getObject("middle_name").toString());
                txt_UpdateDealerLName.setText(rs.getObject("last_name").toString());
                if (Integer.parseInt(rs.getObject("gender").toString()) == 15) cbo_UpdateDealerGender.setSelectedItem("Male");
                else cbo_UpdateDealerGender.setSelectedItem("Female");
                date_UpdateDealerBirthday.getEditor().setText(rs.getObject("birthday").toString());
                cbo_UpdateDealerDueDate.setSelectedItem(rs.getObject("due_date"));
                switch(Integer.parseInt(rs.getObject("civil_status").toString()))
                {
                    case 91:
                        cbo_UpdateDealerCivil.setSelectedItem("Single");
                    break;
                    case 92:
                        cbo_UpdateDealerCivil.setSelectedItem("Married");
                    break;
                    case 93:
                        cbo_UpdateDealerCivil.setSelectedItem("Widower");
                    break;
                    case 94:
                        cbo_UpdateDealerCivil.setSelectedItem("Divorce");
                    break;
                }
                if(rs.getObject("nationality") != null) txt_UpdateDealerNationality.setText(rs.getObject("nationality").toString());
                txt_UpdateDealerAddress.setText(rs.getObject("address").toString());
                if(rs.getObject("email_address") != null) txt_UpdateDealerEmail.setText(rs.getObject("email_address").toString());
                txt_UpdateDealerContact.setText(rs.getObject("contact_number").toString());
                if(rs.getObject("occupation") != null) txt_UpdateDealerOccupation.setText(rs.getObject("occupation").toString());
                txt_UpdateDealerCredit.setText(rs.getObject("credit_limit").toString());
                txt_UpdateDealerACLine.setText(rs.getObject("available_credit").toString());
                txt_UpdateDealerMaxReturn.setText(rs.getObject("max_return_days").toString());
                txt_UpdateDealerSponsor.setText( rs.getObject("sponsor").toString());
            }
            tbl_UpdateDealerDiscount.setModel(populateSupplierDiscountTable("SELECT supplier.supplier_name AS 'Company',dealer_supplier_bridge.discount AS 'Discount' From supplier,dealer_supplier_bridge WHERE dealer_supplier_bridge.supplierID = supplier.idsupplier AND dealer_supplier_bridge.dealerID ="+clickedID_onTable));
        } catch (SQLException ex) {
            Logger.getLogger(Dealer_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:generateUpdateDialog()"
                   + "</font></center></html>", "Error Message", 0);
        }
    }
    private void toNewEntityBridge()
    {
        Vector supplierID = new Vector();
        Vector supplierName = new Vector();
        Vector supplierDiscount = new Vector();
        int rowCount = tbl_NewDealerDiscount.getRowCount();
        createDB();
        try {
            for(int i=0;i<rowCount;i++)
            {
                supplierName.add(tbl_NewDealerDiscount.getValueAt(i, 0));
                supplierDiscount.add(tbl_NewDealerDiscount.getValueAt(i, 1));
                rs = stmt.executeQuery("SELECT idsupplier FROM supplier where supplier_name = '"+supplierName.get(i)+"'");
                while(rs.next())
                {
                    supplierID.add(rs.getObject("idsupplier"));
                }
            }
            for(int k=0;k<rowCount;k++)
            {
                dbHandlerUpdates("INSERT INTO dealer_supplier_bridge(supplierID,discount,dealerID) VALUES("+supplierID.get(k)+","+supplierDiscount.get(k)+","+txt_NewDealerID.getText()+")");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dealer_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error: toEntityBridge()"
                   + "</font></center></html>", "Error Message", 0);
        }
    }
    private void toUpdateEntityBridge()
    {
        createDB();
        Vector supplierID = new Vector();
        Vector supplierName = new Vector();
        Vector supplierDiscount = new Vector();
        int rowCount = tbl_UpdateDealerDiscount.getRowCount();
        
        for(int i=0;i<rowCount;i++)
        {
            try {
                supplierName.add(tbl_UpdateDealerDiscount.getValueAt(i, 0));
                supplierDiscount.add(tbl_UpdateDealerDiscount.getValueAt(i, 1));
                rs = stmt.executeQuery("SELECT idsupplier FROM supplier where supplier_name = '"+supplierName.get(i)+"'");
                while(rs.next())
                {
                    supplierID.add(rs.getObject("idsupplier"));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Dealer_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(supplierDiscount);
        for(int k=0;k<rowCount;k++)
        {
            dbHandlerUpdates("UPDATE dealer_supplier_bridge SET discount = "+supplierDiscount.get(k)+" WHERE dealerID ="+txt_UpdateDealerID.getText()+" AND supplierID ="+supplierID.get(k));
        }
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
    protected void dealerClearNewAccount(){
        date_NewDealerRegDate.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_NewDealerRegDate.setDate(newDealerRegDate);
        
        date_NewDealerBirthday.setFormats("yyyy-MM-dd");
        String newDealerDateValue = "2016-01-01";  // must be in (yyyy- mm- dd ) format
                Date newDealerBDay = null;
                try {
                    newDealerBDay = new SimpleDateFormat("yyyy-mm-dd").parse(newDealerDateValue);
                } catch (ParseException ex) {}
            date_NewDealerBirthday.setDate(newDealerBDay);
            
        txt_NewDealerCredit.setText("");
        txt_NewDealerMaxReturn.setText("");
        txt_NewDealerSponsor.setText("");
        txt_NewDealerFName.setText("");
        txt_NewDealerMName.setText("");
        txt_NewDealerLName.setText("");
        txt_NewDealerNationality.setText("");
        txt_NewDealerOccupation.setText("");
        txt_NewDealerAddress.setText("");
        txt_NewDealerEmail.setText("");
        txt_NewDealerContact.setText("");
        cbo_NewDealerGender.setSelectedIndex(0);
        cbo_NewDealerCivil.setSelectedIndex(0);
    }
    
    protected void dealerUpdateAccount(){
        if(txt_UpdateDealerCredit.getText().equals("") || txt_UpdateDealerACLine.getText().equals("") ||
                txt_UpdateDealerMaxReturn.getText().equals("") || txt_UpdateDealerSponsor.getText().equals("") || 
                txt_UpdateDealerFName.getText().equals("")|| txt_UpdateDealerLName.getText().equals("") || 
                txt_UpdateDealerAddress.getText().equals("") || txt_UpdateDealerContact.getText().equals("") ||
                date_UpdateDealerRegDate.getDate() == null || date_UpdateDealerBirthday.getDate() == null){

            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please make sure that you fill-out all<font color=white>.         .</font>"
                + "<br/>the required information and try again.</font></center></html>", "Error Message", 0);

        }
        else{
            String regDate = date_UpdateDealerRegDate.getEditor().getText();
            String bDate = date_UpdateDealerBirthday.getEditor().getText();
            String dateFormat = "%Y-%m-%d";
            dbHandlerUpdates("UPDATE dealer SET registration_date = STR_TO_DATE('"+regDate+"','"+dateFormat+"')"
                    + ",first_name = '"+txt_UpdateDealerFName.getText()+"'"
                    + ",middle_name ='"+txt_UpdateDealerMName.getText()+"'"
                    + ", last_name = '"+txt_UpdateDealerLName.getText()+"'"
                    + ", gender = "+getGenderID(cbo_UpdateDealerGender)+""
                    + ", birthday = STR_TO_DATE('"+bDate+"','"+dateFormat+"')"
                    + ", Civil_Status = "+getC_StatusID(cbo_UpdateDealerCivil)+""
                    + ", Nationality = '"+txt_UpdateDealerNationality.getText()+"'"
                    + ",Address = '"+txt_UpdateDealerAddress.getText()+"'"
                    + ",Email_Address = '"+txt_UpdateDealerAddress.getText()+"'"
                    + ",contact_number = '"+txt_UpdateDealerContact.getText()+"'"
                    + ",occupation = '"+txt_UpdateDealerOccupation.getText()+"'"
                    + ",credit_limit = "+txt_UpdateDealerCredit.getText()+""
                    + ",available_credit = "+txt_UpdateDealerACLine.getText()+""
                    + ",max_return_days = "+txt_UpdateDealerMaxReturn.getText()+""
                    + ",sponsor = '"+txt_UpdateDealerSponsor.getText()+"'"
                    + ",due_date= "+cbo_UpdateDealerDueDate.getSelectedItem()+""
                    + " WHERE iddealer ="+clickedID_onTable);
            toUpdateEntityBridge();
            dealer.DealerPnl_1stLayer.updateTable();
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Dealer information successfully updated!"
                + "</font></center></html>", "Information Message", 1);
            
        }
    }
    protected void dealerClearUpdateAccount(){
        date_UpdateDealerRegDate.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_UpdateDealerRegDate.setDate(newDealerRegDate);
        
        date_UpdateDealerBirthday.setFormats("yyyy-MM-dd");
        String newDealerDateValue = "2016-01-01";  // must be in (yyyy- mm- dd ) format
                Date newDealerBDay = null;
                try {
                    newDealerBDay = new SimpleDateFormat("yyyy-mm-dd").parse(newDealerDateValue);
                } catch (ParseException ex) {}
            date_UpdateDealerBirthday.setDate(newDealerBDay);
            
        txt_UpdateDealerCredit.setText("");
        txt_UpdateDealerMaxReturn.setText("");
        txt_UpdateDealerSponsor.setText("");
        txt_UpdateDealerFName.setText("");
        txt_UpdateDealerMName.setText("");
        txt_UpdateDealerLName.setText("");
        txt_UpdateDealerNationality.setText("");
        txt_UpdateDealerOccupation.setText("");
        txt_UpdateDealerAddress.setText("");
        txt_UpdateDealerEmail.setText("");
        txt_UpdateDealerContact.setText("");
        cbo_UpdateDealerGender.setSelectedIndex(0);
        cbo_UpdateDealerCivil.setSelectedIndex(0);
    }
    
    public void dealerViewAccount(){
        Dealer_ViewAccount dealer = new Dealer_ViewAccount(null, true);
        dealer.pack();
        dealer.setLocationRelativeTo(null);
        dealer.setVisible(true);
    }
    
    protected void dealerSearchVAccount(){
       if(txt_ViewDealerID.getText().equals("")){
           JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input dealer id or name to search."
                   + "</font></center></html>", "Error Message", 0);
        }
        else{
           //SQL CODE FOR SEARCHING DEALER
        }      
    }
    
    protected void dealerVAccountSelect(){
         if(txt_ViewDealerID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input dealer id or name to select."
                   + "</font></center></html>", "Error Message", 0);
        }
        else{
           //SQL CODE FOR SELECTING DEALER
        }      
     }
     
     protected void dealerSearchVDiscount(){
       if(txt_DealerDCode.getText().equals("")){
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please input dealer id or name to search."
                   + "</font></center></html>", "Error Message", 0);
        }
        else{
           //SQL CODE FOR SEARCHING DEALER
        }      
    }
     
}
