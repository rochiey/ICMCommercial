package com;
import icm.ICMMainSystem;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.DB;


public class Session {
    public static String sessionType;
    public static boolean isRunning = false;
    public static String cashier = "";
    
    public static String currentDate(){
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(today);
    }
    public static float round(float d, int decimalPlace) {
         return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
    }
    public static void start()
    {
        isRunning = true;
    }
    public static boolean isAdmin(String user)
    {
        boolean privileged = false;
        int userType = 0;
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT userType FROM systemaccount WHERE username = '"+user+"'");
            while(DB.rs.next())
            {
                userType = DB.rs.getInt("usertype");
            }
            privileged = userType == 51;
            
            DB.rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
        return privileged;
    }
    public static void End()
    {
        Session.isRunning = false;
        Session.cashier = "";
        Session.sessionType = "";
    }
    public static String getCashierName(String user)
    {
        DB.createDB();
        String name = "";
        try {
            DB.rs = DB.stmt.executeQuery("SELECT CONCAT(first_name,' ',last_name) AS 'name' FROM systemaccount WHERE username = '"+user+"'");
           while(DB.rs.next())
                name = DB.rs.getString("name");
           
        } catch (SQLException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }
    public static void indicateSession(String user)
    {
        if(isAdmin(user)) 
        {
            start();
            Session.sessionType = "Admin";
            Session.cashier = getCashierName(user);
            ICMMainSystem main = new ICMMainSystem();
            main.pack();
            main.setLocationRelativeTo(null);
            dialog_salesOrder.SalesOrder_ButtonFunctions.generatePenalty();
            main.setVisible(true);
        }
        else
        {
            start();
            Session.sessionType = "user";
            ICMMainSystem main = new ICMMainSystem();
            main.pack();
            main.setLocationRelativeTo(null);
            main.Tab_Main.remove(ICMMainSystem.pnl_InventoryManagement);
            main.Tab_Main.remove(ICMMainSystem.pnl_DealerAccounts);
            main.Tab_Main.remove(ICMMainSystem.pnl_UserAccounts);
            dialog_salesOrder.SalesOrder_ButtonFunctions.generatePenalty();
            main.setVisible(true);
        }
    }
}
