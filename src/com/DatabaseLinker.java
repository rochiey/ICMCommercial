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
import com.DB;


public class DatabaseLinker {
    
    private static JTable varTable;
    
    public DatabaseLinker(JTable tableVar,String query)
    {
        varTable = tableVar;
	updateTable(varTable,query);
    }
    public static void updateTable(JTable tblData,String query)
    {
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery(query); //MODIFY THIS NOT_FINAL
            tblData.setModel(DbUtils.resultSetToTableModel(DB.rs));
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseLinker.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops. Something went wrong. Please try again later"
                   + "</font></center></html>", "Error Message", 0);
        }finally{
            try {
                DB.rs.close();
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
