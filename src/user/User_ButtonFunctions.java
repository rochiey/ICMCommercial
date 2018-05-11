package user;

import com.DatabaseLinker;
import dialog_user.User_NewAccount;
import dialog_user.User_UpdateAccount;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class User_ButtonFunctions {
    
    protected void userNewAccount (){
        dialog_user.User_NewAccount user = new User_NewAccount(null, true);
        user.pack();
        user.setLocationRelativeTo(null);
        dialog_user.User_ButtonFunctions.countIncrementedID();
        user.setVisible(true);
    }
    public static void sortByUserType(JComboBox cboUType)
    {
        int typeID = 0;
        if(cboUType.getSelectedItem().equals("Admin")) typeID = 51;
        else typeID = 21;
        DatabaseLinker.updateTable(UserPnl_1stLayer.tbl_UserAccounts, "SELECT systemaccount.ID AS 'ID',systemaccount.first_name AS 'First Name',systemaccount.last_name AS 'Last Name',systemaccount.middle_name AS 'Middle Name',systemaccount.address AS 'Address',systemaccount.contact_number 'Contact No.',gender.gender_name AS Gender,systemaccount.registration_date AS 'Reg. Date',usertype.usertype_name AS 'User Type' FROM systemaccount,gender,usertype WHERE systemaccount.gender = gender.idgender AND systemaccount.usertype = usertype.idusertype AND systemaccount.usertype ="+typeID);
    }
    public static void sortByRegDate(String from,String to)
    {
        try{
        DatabaseLinker.updateTable(UserPnl_1stLayer.tbl_UserAccounts, "SELECT systemaccount.ID AS 'ID',systemaccount.first_name AS 'First Name',systemaccount.last_name AS 'Last Name',systemaccount.middle_name AS 'Middle Name',systemaccount.address AS 'Address',systemaccount.contact_number 'Contact No.',gender.gender_name AS Gender,systemaccount.registration_date AS 'Reg. Date',usertype.usertype_name AS 'User Type' FROM systemaccount,gender,usertype WHERE systemaccount.gender = gender.idgender AND systemaccount.usertype = usertype.idusertype AND (registration_date BETWEEN '"+from+"' AND '"+to+"')");
        }catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please enter dates correctly"
                   + "</font></center></html>", "Error Message", 0);
        }
    }
    protected void userUpdateAccount (){
        dialog_user.User_UpdateAccount user = new User_UpdateAccount(null, true);
        user.pack();
        user.setLocationRelativeTo(null);
        if(dialog_user.User_ButtonFunctions.clickedID_onTable >= 1){
            
            dialog_user.User_ButtonFunctions.generateUpdateDialog();
            user.setVisible(true);
            dialog_user.User_ButtonFunctions.clickedID_onTable = 0;
        }
        else JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please select a record to update."
                   + "</font></center></html>", "Information Message", 1);
    }
}
