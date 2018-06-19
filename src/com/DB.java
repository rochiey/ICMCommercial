
package com;

import account_login.Account_Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author percival
 */
public class DB {
    
    public static Connection conn = null;
    public static Statement stmt = null;
    public static ResultSet rs = null;
    
    static String username = "root";
    static String password = "";
    static String server = "jdbc:mysql://127.0.0.1:3306/";
    static String dbName = "icm";
    
    public static void createDB()
    {
        try {
            Properties prop=new Properties();
            prop.setProperty("user",username);
            prop.setProperty("password",password);
            conn=DriverManager.getConnection(server+dbName,prop);
            stmt= conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    private static int dbHandlerUpdates(String query)
    {
        int success = 1;
        try{
        DB.createDB();
        stmt.executeUpdate(query);
         
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops. Something went wrong. Please try again."
                   + "</font></center></html>", "Error Message", 0);
        }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return success;
    }
}
