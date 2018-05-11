package salesOrder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SalesPnl_1stLayer extends javax.swing.JPanel {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    public SalesPnl_1stLayer() {
        initComponents();
        SalesOrder_ButtonFunctions.cleanCustomerInfo();
        barcodeListener();  
    }
    private void barcodeListener()
    {
        txt_SalesInput.getDocument().addDocumentListener(new DocumentListener() {
            Timer timer;
            {
                this.timer = new Timer(100, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Barcode found :"+txt_SalesInput.getText());
                        txt_SalesInput.setText("");
                    }
                });
                timer.setRepeats(false);
            }
            
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (timer.isRunning()) {
                    timer.restart();
                } else {    
                    timer.start();
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        
    }
    public void disableButtonSalesCart(boolean flag){
        btn_SalesAddCart.setEnabled(flag);
    }
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    public static void createDB()
    {
        rs = null;
        stmt = null;
        conn = null;
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
            JOptionPane.showMessageDialog(null, "<html><center><font size=4>error:code:sql command()"
                   + "</font></center></html>", "Error Message", 0);
            }
        finally{
            try {
               conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(SalesPnl_1stLayer.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "<html><center><font size=4>error: session: sql commands"
                   + "</font></center></html>", "Error Message", 0);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane16 = new javax.swing.JScrollPane();
        tbl_SalesCustomerDetails = new javax.swing.JTable();
        lbl_SalesProductCode = new javax.swing.JLabel();
        txt_SalesInput = new javax.swing.JTextField();
        txt_SalesQuantity = new javax.swing.JTextField();
        lbl_SalesQty = new javax.swing.JLabel();
        btn_SalesAddCart = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_SalesCustomerDetails.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_SalesCustomerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Customer Type:", "Dealer"},
                {"Customer Name:", "Manuel Cagatin"},
                {"Credit Limit:", "₱1500.00"},
                {"Available Credits:", "₱1000.00"},
                {"Balance:", "₱500.00"}
            },
            new String [] {
                "", ""
            }
        ));
        tbl_SalesCustomerDetails.setEnabled(false);
        tbl_SalesCustomerDetails.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_SalesCustomerDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane16.setViewportView(tbl_SalesCustomerDetails);
        tbl_SalesCustomerDetails.setBackground(Color.WHITE);
        tbl_SalesCustomerDetails.setShowGrid(true);
        tbl_SalesCustomerDetails.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbl_SalesCustomerDetails.getColumnModel().getColumn(0).setPreferredWidth(140);
        tbl_SalesCustomerDetails.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_SalesCustomerDetails.setRowHeight(27);
        tbl_SalesCustomerDetails.setTableHeader(null);

        lbl_SalesProductCode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_SalesProductCode.setText("Article Code:");

        txt_SalesInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_SalesInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SalesInputActionPerformed(evt);
            }
        });

        txt_SalesQuantity.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_SalesQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_SalesQty.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_SalesQty.setText("Qty:");

        btn_SalesAddCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Add Cart.png"))); // NOI18N
        btn_SalesAddCart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_SalesAddCartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_SalesAddCartFocusLost(evt);
            }
        });
        btn_SalesAddCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalesAddCartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalesAddCartMouseExited(evt);
            }
        });
        btn_SalesAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesAddCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SalesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SalesProductCode))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_SalesQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_SalesAddCart))
                    .addComponent(lbl_SalesQty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_SalesProductCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SalesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_SalesQty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_SalesQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SalesAddCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_SalesAddCart, txt_SalesInput, txt_SalesQuantity});

        btn_SalesAddCart.registerKeyboardAction(btn_SalesAddCart.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_SalesAddCart.registerKeyboardAction(btn_SalesAddCart.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalesAddCartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesAddCartFocusGained
        btn_SalesAddCart.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesAddCartFocusGained

    private void btn_SalesAddCartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_SalesAddCartFocusLost
        btn_SalesAddCart.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesAddCartFocusLost

    private void btn_SalesAddCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesAddCartMouseEntered
        btn_SalesAddCart.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_SalesAddCartMouseEntered

    private void btn_SalesAddCartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalesAddCartMouseExited
        btn_SalesAddCart.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_SalesAddCartMouseExited

    private void btn_SalesAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesAddCartActionPerformed
        button.addSalesCart();
    }//GEN-LAST:event_btn_SalesAddCartActionPerformed

    private void txt_SalesInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SalesInputActionPerformed
        //SalesOrder_ButtonFunctions.trigger -> is the object that holds the value of F3 changing
        //if customer input else product input
        if(SalesOrder_ButtonFunctions.trigger.equals("customer")){
            if(SalesPnl_2ndLayer.tbl_SalesCart.getRowCount() == 0){
                try
                {
                    int dealer = Integer.parseInt(txt_SalesInput.getText());
                    SalesOrder_ButtonFunctions.customerInfo[0][1]="Dealer";
                    SalesOrder_ButtonFunctions.getCustomerName();
                }catch(NumberFormatException e)
                {
                    SalesOrder_ButtonFunctions.customerInfo[0][1]="Walk-in";
                    SalesOrder_ButtonFunctions.getCustomerName();
                }
            }
            else JOptionPane.showMessageDialog(null, "There is ongoing transaction. Cannot modify customer.");
        }
       
    }//GEN-LAST:event_txt_SalesInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_SalesAddCart;
    private javax.swing.JScrollPane jScrollPane16;
    public static javax.swing.JLabel lbl_SalesProductCode;
    public static javax.swing.JLabel lbl_SalesQty;
    public static javax.swing.JTable tbl_SalesCustomerDetails;
    public static javax.swing.JTextField txt_SalesInput;
    public static javax.swing.JTextField txt_SalesQuantity;
    // End of variables declaration//GEN-END:variables
}
