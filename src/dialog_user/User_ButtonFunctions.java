package dialog_user;

import com.Session;
import static dialog_user.User_NewAccount.*;
import static dialog_user.User_UpdateAccount.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import user.UserPnl_1stLayer;
import com.DB;

public class User_ButtonFunctions {
    
    public static void countIncrementedID()
    {
        Integer theID = 0;
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = 'systemaccount'");
            while(DB.rs.next())
            {
                theID = Integer.parseInt(DB.rs.getObject("AUTO_INCREMENT").toString());
            }
            txt_NewUserID.setText(theID.toString());
        } catch (SQLException ex) {
            Logger.getLogger(User_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static String decodeCaesar(String enc, int offset) {
        return encodeCaesar(enc, 26-offset);
    }
    private static String encodeCaesar(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
    private int getGenderID(JComboBox cbogender)
    {
        if(cbogender.getSelectedItem().toString().equals("Male")) return 15;
        else return 16; //female 16 - male 15
    }
    public static Integer clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
        }
        
    }
    public static void generateUpdateDialog()
    {
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT * FROM systemaccount WHERE ID = "+clickedID_onTable);
            ResultSetMetaData meta = DB.rs.getMetaData();
            Object []data = new Object[meta.getColumnCount()];
            while(DB.rs.next())
            {
                for (int index = 1; index <= meta.getColumnCount(); index++) 
                {
                        data[index - 1] = DB.rs.getObject(meta.getColumnName(index));
                }
                txt_UpdateUserID.setText(data[0].toString());
                txt_UpdateUserFName.setText(data[1].toString());
                if(data[2] != null) txt_UpdateUserMName.setText(data[2].toString());
                txt_UpdateUserLName.setText(data[3].toString());
                if(Integer.parseInt(data[4].toString()) == 15) cbo_UpdateUserGender.setSelectedItem("Male");
                else cbo_UpdateUserGender.setSelectedItem("Female");
                date_UpdateUserBirthday.getEditor().setText(data[5].toString());
                switch(Integer.parseInt(data[6].toString()))
                {
                    case 91:
                        cbo_UpdateUserCivil.setSelectedItem("Single");
                    break;
                    case 92:
                        cbo_UpdateUserCivil.setSelectedItem("Married");
                    break;
                    case 93:
                        cbo_UpdateUserCivil.setSelectedItem("Widower");
                    break;
                    case 94:
                        cbo_UpdateUserCivil.setSelectedItem("Divorce");
                    break;
                }
                if(data[7] != null) txt_UpdateUserNationality.setText(data[7].toString());
                txt_UpdateUserAddress.setText(data[8].toString());
                if(data[9] != null) txt_UpdateUserEmail.setText(data[9].toString());
                txt_UpdateUserContact.setText(data[10].toString());
                date_UpdateUserRegDate.getEditor().setText(data[11].toString());
                if(data[12] != null) txt_UpdateUserOccupation.setText(data[12].toString());
                txt_UpdateUsername.setText(data[13].toString());
                txt_UpdateUserPassword.setText(decodeCaesar(data[14].toString(), 5)); // 5 offset
                txt_UpdateUserConPassword.setText(decodeCaesar(data[14].toString(), 5));
                if(Integer.parseInt(data[15].toString()) == 51) cbo_UpdateUserType.setSelectedItem("Admin Account");
                else cbo_UpdateUserType.setSelectedItem("User Account");
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:generatingUpdateDialog()"
                   + "</font></center></html>", "Error Message", 0);
        }
        
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
    private int getUserTypeID(JComboBox cbousertype)
    {
        if(cbousertype.getSelectedItem().toString().equals("Admin Account")) return 51;
        else return 21; //21 user - 51 admin
    }
    protected void userNewAccount(){
        if(txt_NewUsername.getText().equals("") || txt_NewUserPassword.getText().equals("") || txt_NewUserConPassword.getText().equals("") ||
            txt_NewUserFName.getText().equals("") || txt_NewUserLName.getText().equals("")||
            txt_NewUserAddress.getText().equals("") || txt_NewUserContact.getText().equals("") ||
            date_NewUserRegDate.getDate() == null || date_NewUserBirthday.getDate() == null){

            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please make sure that you fill-out all<font color=white>.         .</font>"
                + "<br/>the required information and try again.</font></center></html>", "Error Message", 0);

        }
        else{
            if (txt_NewUserPassword.getText().equals(txt_NewUserConPassword.getText())){
                
                //SQL Code for adding New User Account
                // other needed details
                    int idgender, idcivilstatus, idusertype;
                    idgender = getGenderID(cbo_NewUserGender);
                    idcivilstatus = getC_StatusID(cbo_NewUserCivil);
                    idusertype = getUserTypeID(cbo_NewUserType);
                    String bday = date_NewUserBirthday.getEditor().getText();
                    String regDate = date_NewUserRegDate.getEditor().getText();
                    String dateFormat = "%Y-%m-%d";
                    String ciphered = encodeCaesar(txt_NewUserPassword.getText(), 5); //5 caesar key
                //SQL Code for adding New User Account
                int success = DB.dbHandlerUpdates("INSERT INTO systemaccount(First_Name,Middle_Name,Last_Name,gender,birthday,civil_status,nationality,address,email_address,contact_number,registration_date,occupation,username,password,usertype)"
                                + " VALUES('"+txt_NewUserFName.getText()+"','"+txt_NewUserMName.getText()+"','"+txt_NewUserLName.getText()+"',"+idgender+",STR_TO_DATE('"+bday+"','"+dateFormat+"'),"+idcivilstatus+",'"+txt_NewUserNationality.getText()+"','"+txt_NewUserAddress.getText()+"','"+txt_NewUserEmail.getText()+"','"+txt_NewUserContact.getText()+"',STR_TO_DATE('"+regDate+"','"+dateFormat+"'),'"+txt_NewUserOccupation.getText()+"','"+txt_NewUsername.getText()+"','"+ciphered+"',"+idusertype+")");
                UserPnl_1stLayer.updateTable();
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>User account successfully added!"
                    + "</font></center></html>", "Information Message", 1);
                UserPnl_1stLayer.updateTable();
            }
            else{
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Password did not match. Please<font color=white>. ..        .</font>"
                    + "<br/>check your password and try again.</font></center></html>", "Error Message", 0);
            }
        }
    }
    
    protected void userClearNewAccount(){
        txt_NewUsername.setText("");
        txt_NewUserPassword.setText("");
        txt_NewUserConPassword.setText("");
        txt_NewUserFName.setText("");
        txt_NewUserLName.setText("");
        txt_NewUserMName.setText("");
        txt_NewUserNationality.setText("");
        txt_NewUserOccupation.setText("");
        txt_NewUserAddress.setText("");
        txt_NewUserEmail.setText("");
        txt_NewUserContact.setText("");
        cbo_NewUserType.setSelectedIndex(0);
        cbo_NewUserGender.setSelectedIndex(0);
        cbo_NewUserCivil.setSelectedIndex(0);
        
        date_NewUserRegDate.setFormats("yyyy-MM-dd");
        Date userRegDate = new Date();
        date_NewUserRegDate.setDate(userRegDate);
        
        date_NewUserBirthday.setFormats("yyyy-MM-dd");
        String dateValue = "2016-01-01";  // must be in (yyyy- mm- dd ) format
                Date userBDay = null;
                try {userBDay = new SimpleDateFormat("yyyy-mm-dd").parse(dateValue);} 
                catch (ParseException ex) {}
                date_NewUserBirthday.setDate(userBDay);

    }
    
    protected void userUpdateAccount(){
        if(txt_UpdateUsername.getText().equals("") || txt_UpdateUserPassword.getText().equals("") || txt_UpdateUserConPassword.getText().equals("") ||
            txt_UpdateUserFName.getText().equals("") || txt_UpdateUserLName.getText().equals("")||
            txt_UpdateUserAddress.getText().equals("") || txt_UpdateUserContact.getText().equals("") ||
            date_UpdateUserRegDate.getDate() == null || date_UpdateUserBirthday.getDate() == null){

            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Please make sure that you fill-out all<font color=white>.         .</font>"
                + "<br/>the required information and try again.</font></center></html>", "Error Message", 0);
            

        }
        else{
            if (txt_UpdateUserPassword.getText().equals(txt_UpdateUserConPassword.getText())){
                    int idgender, idcivilstatus, idusertype;
                    idgender = getGenderID(cbo_UpdateUserGender);
                    idcivilstatus = getC_StatusID(cbo_UpdateUserCivil);
                    idusertype = getUserTypeID(cbo_UpdateUserType);
                    String bday = date_UpdateUserBirthday.getEditor().getText();
                    String regDate = date_UpdateUserRegDate.getEditor().getText();
                    String dateFormat = "%Y-%m-%d";
                    String ciphered = encodeCaesar(txt_UpdateUserPassword.getText(), 5);
                DB.dbHandlerUpdates("UPDATE systemaccount SET First_Name = '"+txt_UpdateUserFName.getText()+"',Middle_Name = '"+txt_UpdateUserMName.getText()+"',Last_Name = '"+txt_UpdateUserLName.getText()+"',gender = "+idgender+",birthday = STR_TO_DATE('"+bday+"','"+dateFormat+"'),Civil_Status = "+idcivilstatus+",Nationality = '"+txt_UpdateUserNationality.getText()+"',Address = '"+txt_UpdateUserAddress.getText()+"',Email_Address = '"+txt_UpdateUserEmail.getText()+"',Contact_Number = '"+txt_UpdateUserContact.getText()+"',registration_date = STR_TO_DATE('"+regDate+"','"+dateFormat+"'),Occupation = '"+txt_UpdateUserOccupation.getText()+"',Username = '"+txt_UpdateUsername.getText()+"',password = '"+ciphered+"',usertype = "+idusertype+" WHERE ID = "+clickedID_onTable);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>User account information successfully updated!"
                    + "</font></center></html>", "Information Message", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Password did not match. Please<font color=white>. ..        .</font>"
                    + "<br/>check your password and try again.</font></center></html>", "Error Message", 0);
            }
        }
    }
    
    protected void userClearUpdateAccount(){
        txt_UpdateUsername.setText("");
        txt_UpdateUserPassword.setText("");
        txt_UpdateUserConPassword.setText("");
        txt_UpdateUserFName.setText("");
        txt_UpdateUserLName.setText("");
        txt_UpdateUserMName.setText("");
        txt_UpdateUserNationality.setText("");
        txt_UpdateUserOccupation.setText("");
        txt_UpdateUserAddress.setText("");
        txt_UpdateUserEmail.setText("");
        txt_UpdateUserContact.setText("");
        cbo_UpdateUserType.setSelectedIndex(0);
        cbo_UpdateUserGender.setSelectedIndex(0);
        cbo_UpdateUserCivil.setSelectedIndex(0);
        
        date_UpdateUserRegDate.setFormats("yyyy-MM-dd");
        Date userRegDate = new Date();
        date_UpdateUserRegDate.setDate(userRegDate);
        
        date_UpdateUserBirthday.setFormats("yyyy-MM-dd");
        String dateValue = "2016-01-01";  // must be in (yyyy- mm- dd ) format
                Date userBDay = null;
                try {userBDay = new SimpleDateFormat("yyyy-mm-dd").parse(dateValue);} 
                catch (ParseException ex) {}
                date_UpdateUserBirthday.setDate(userBDay);

    }
    
    
}
