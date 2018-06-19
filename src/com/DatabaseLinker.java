package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class DatabaseLinker {
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    private static JTable varTable;
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
    private static void dbHandlerUpdates(String query)
    {
        try{
        DB.createDB();
         stmt.executeUpdate(query);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseLinker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public DatabaseLinker(JTable tableVar,String query)
    {
        varTable = tableVar;
	updateTable(varTable,query);
    }
    public static void updateTable(JTable tblData,String query)
    {
        DB.createDB();
        try {
            rs = stmt.executeQuery(query); //MODIFY THIS NOT_FINAL
            tblData.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseLinker.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops. Something went wrong. Please try again later"
                   + "</font></center></html>", "Error Message", 0);
        }finally{
            try {
                rs.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again."
                   + "</font></center></html>", "Error Message", 0);
                Logger.getLogger(DatabaseLinker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void updateTable(ResultSet rs,JTable tblData)
    {
        tblData.setModel(DbUtils.resultSetToTableModel(rs));
    }
}
