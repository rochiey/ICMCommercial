
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class DbUtils {
    public static TableModel resultSetToTableModel(ResultSet rs) {
	try {
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
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
	} catch (Exception e) {
	    e.printStackTrace();
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>Oops, something went wrong. Please try again (sql to table error)"
                   + "</font></center></html>", "Error Message", 0);
	    return null;
	}
    }
    private static boolean isObjectInteger(Object o)
    {
        return o instanceof Integer;
    }
    public static List<List<Object>> resultSetToNestedList(ResultSet rs, boolean includeColumnNames) {
	try {
	    // To contain all rows.
	    List<List<Object>> rows = new ArrayList<List<Object>>();
	    ResultSetMetaData metaData = rs.getMetaData();
	    int numberOfColumns = metaData.getColumnCount();

	    // Include column headers as first row if required
	    if (includeColumnNames) {
		List<Object> columnNames = new ArrayList<Object>();

		// Get the column names
		for (int column = 0; column < numberOfColumns; column++) {
		    columnNames.add(metaData.getColumnLabel(column + 1));
		}
		rows.add(columnNames);
	    }

	    // Get the data
	    while (rs.next()) {
		List<Object> newRow = new ArrayList<Object>();

		for (int i = 1; i <= numberOfColumns; i++) {
		    newRow.add(rs.getObject(i));
		}

		rows.add(newRow);
	    }
	    return rows;
	} catch (Exception e) {
	    e.printStackTrace();

	    return null;
	}
    }

    public static List<List<Object>> resultSetToNestedList(ResultSet rs) {
	try {
	    // To contain all rows.
	    List<List<Object>> rows = new ArrayList<List<Object>>();
	    ResultSetMetaData metaData = rs.getMetaData();
	    int numberOfColumns = metaData.getColumnCount();

	    // Get the data
	    while (rs.next()) {
		List<Object> newRow = new ArrayList<Object>();

		for (int i = 1; i <= numberOfColumns; i++) {
		    newRow.add(rs.getObject(i));
		}

		rows.add(newRow);
	    }
	    return rows;
	} catch (Exception e) {
	    e.printStackTrace();

	    return null;
	}
    }
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
        createDB();
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
                Logger.getLogger(DbUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private static Object getValue(Integer ID,String tableName)
    {
        createDB();
        try {
            rs = stmt.executeQuery("SELECT "+tableName+"_name FROM "+tableName+" WHERE id"+tableName+" = "+ID);
            while(rs.next())
                return rs.getObject(tableName+"_name");
        } catch (SQLException ex) {
            Logger.getLogger(DbUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;

    /**
     * @param args
     
    public static void main(String[] args) {
//	ResultSet rs = new DummySimplestPlusMetaData();
	//TableModel tm = DbUtils.resultSetToTableModel(rs);
	//System.out.println(tm.getValueAt(0, 0));
    }*/
}
