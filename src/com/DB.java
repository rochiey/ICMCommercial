
package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        rs = null;
        stmt = null;
        conn = null;
        
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
    public static int dbHandlerUpdates(String query)
    {
        int success = 0;
        try{
            DB.createDB();
            writeFile(query);   //writes query to the file
            success = stmt.executeUpdate(query); 
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops. Something went wrong in handling updating database. Please try again."
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
    private static void writeFile(String sql) //writes the sql into file
    {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter out = null;
        System.out.println("writes file");
        try
        {
            
            fw = new FileWriter("sql.txt", true);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
                    
            out.println(sql);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            out.close();
        }
    }
    public static void updateDBOnline()
    {
        //read sql.txt
        //put every sql query in a vector
        //initialize database server address
        //then update db online through java
    }
}
