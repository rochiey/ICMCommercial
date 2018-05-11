package com;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class JTableFixer {
    
    public static void setJTableColumnsWidth(JTable table, int tablePreferredWidth, double... percentages) {
        double total = 0;
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            total += percentages[i];
        }

        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth((int)
                    (tablePreferredWidth * (percentages[i] / total)));
        }
    }
    
    public static void setSalesOrderTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 5:
                case 7:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 6:
                case 8:
                case 9:
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    //table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
            }
            
        }
    }
    
    public static void setInventoryTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 4:
                case 5:
                case 6:
                case 8:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 7:
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
           
        }
    }
    
    public static void setDealerTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 6:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                default:
                    break;
            }
           
        }
    }
    
    public static void setUserTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 5:
                case 6:
                case 7:    
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                default:
                    break;
            }
           
        }
    }
    
    public static void setReturnFormTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 5:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 6:  
                case 7:  
                case 8:  
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void setInvStatusTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 4:    
                case 5:
                case 6:
                case 8:
                case 9:    
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 7:
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void setDealerReportTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 3: 
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 4:
                case 5:    
                case 6:
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void setDealerReportDetailsTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 1:
                case 2: 
                case 5:
                case 6:
                case 7:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 4:
                case 3:  
                case 8: 
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void setSalesReportTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 1:
                case 5: 
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 3:
                case 4:    
                case 6:
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void setSalesReportDetailsTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 6:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 5:  
                case 7:  
                case 8:  
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void setReturnReportTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 1:
                case 3:
                case 6:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 4:  
                case 5:
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void setReturnReportDetailsTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 5:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 6:  
                case 7:
                case 8:
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void setPOTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:  
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                
                default:
                    break;
            }
        }
    }
    
    public static void setPMTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 2: 
                case 3:
                case 4:
                case 5:
                 
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                
                default:
                    break;
            }
        }
    }
    
    public static void setViewDealerTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                
                default:
                    break;
            }
        }
    }
    
    public static void setViewInventoryTableField(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
       
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            switch (i) {
                case 0:
                case 2: 
                case 3:
                case 4:
                    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    break;
                case 5:
                    table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
                    break;
                default:
                    break;
            }
        }
    }
}
