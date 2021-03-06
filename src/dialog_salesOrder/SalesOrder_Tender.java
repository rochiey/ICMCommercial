package dialog_salesOrder;

import com.PrinterService;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import com.DB;

public class SalesOrder_Tender extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    
    public SalesOrder_Tender(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        if(salesOrder.SalesOrder_ButtonFunctions.customerInfo[0][1]=="Walk-in")
        {
            initComponents();
            jTabbedPane1.remove(pnl_Credit);
            jTabbedPane1.remove(pnl_Pull_out);
        }
        else if(salesOrder.SalesOrder_ButtonFunctions.customerInfo[0][1]=="Dealer")
        { 
            initComponents();
            generateDueDate();
            setTotalPenaltyForEveryDealer();
            generateBalance(); //plus penalty
            invoiceID = 0;
        }
    }
    public static boolean isCreditDue()
    {
        boolean flag=false;
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT due_date,CURDATE() AS 'date today' FROM credit_transaction WHERE due_date IS NOT NULL AND paymentTypeID=243 AND dealer_ID="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
            while(DB.rs.next())
            {
                Date duedate = DB.rs.getDate("due_date");
                Date today = DB.rs.getDate("date today");
                if(today.after(duedate)) flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    private static void setTotalPenaltyForEveryDealer()
    {
        Vector id = new Vector();
        try {
            DB.createDB();
            DB.rs = DB.stmt.executeQuery("SELECT DISTINCT dealer_ID FROM credit_transaction");
            while(DB.rs.next())
            {
                id.add(DB.rs.getObject("dealer_ID"));
            }
            DB.rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_ButtonFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<id.size();i++)
        {
            float totalPenalty=0;
            try
            {
                DB.createDB();
                DB.rs = DB.stmt.executeQuery("SELECT penalty FROM credit_transaction WHERE paymentTypeID=243 AND dealer_ID="+id.get(i));
                while(DB.rs.next())
                {
                    totalPenalty+=round(DB.rs.getFloat("penalty"), 2);
                }
                totalPenalty=round(totalPenalty, 2);
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
            DB.dbHandlerUpdates("UPDATE dealer SET total_penalty="+totalPenalty+" WHERE iddealer="+id.get(i));
        }
    }
    public static void generateBalance()
    {
        DB.createDB();
        try {
            DB.rs = DB.stmt.executeQuery("SELECT balance+total_penalty FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
           
            while(DB.rs.next())
            {
                lbl_CPullBalance.setText("₱"+DB.rs.getFloat("balance+total_penalty"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static float round(float d, int decimalPlace) {
         return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
    }
   
    public static boolean hasAvailableCredit()
    {
        DB.createDB(); float availableCredit = 0;
        try {
            DB.rs = DB.stmt.executeQuery("SELECT available_credit FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
            while(DB.rs.next())
            {
                availableCredit=DB.rs.getFloat("available_credit");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return availableCredit>0;
    }
    public static void generateDueDate()
    {
        DB.createDB();  int days =0; Date newDate = null;
        try {
            DB.rs = DB.stmt.executeQuery("SELECT due_date FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
            while(DB.rs.next()) days = DB.rs.getInt("due_date");
            DB.rs.close();
            DB.rs = DB.stmt.executeQuery("SELECT DATE_ADD((SELECT CURDATE()),INTERVAL "+days+" DAY) AS 'Due Date' FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer+"");
            while(DB.rs.next())
            {
                newDate = DB.rs.getDate("Due Date");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
        }
        date_CreditDue.getEditor().setText(newDate.toString());
    }
    public static boolean isHugeThanLimit(Float totalNet)
    {
        DB.createDB(); float availableCredit = 0;
        try {
            DB.rs = DB.stmt.executeQuery("SELECT available_credit FROM dealer WHERE iddealer="+salesOrder.SalesOrder_ButtonFunctions.iddealer);
            while(DB.rs.next())
            {
                availableCredit=DB.rs.getFloat("available_credit");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder_Tender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return availableCredit>totalNet; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnl_CashPayment = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        lbl_InvoiceCompany21 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        lbl_CashTotal = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        lbl_InvoiceCompany23 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        txt_CashAmount = new javax.swing.JTextField();
        jPanel61 = new javax.swing.JPanel();
        lbl_InvoiceCompany24 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        lbl_CashChange = new javax.swing.JLabel();
        btn_CashClose = new javax.swing.JButton();
        btn_CashAccept = new javax.swing.JButton();
        pnl_Credit = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        lbl_InvoiceCompany20 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        lbl_CreditTotal = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        lbl_InvoiceCompany22 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        date_CreditDue = new org.jdesktop.swingx.JXDatePicker();
        btn_CreditClose = new javax.swing.JButton();
        btn_CreditAccept = new javax.swing.JButton();
        pnl_Pull_out = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        lbl_InvoiceCompany14 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        lbl_CPullBalance = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        lbl_InvoiceCompany15 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        txt_CPullCash = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        lbl_InvoiceCompany16 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        lbl_CPullChange = new javax.swing.JLabel();
        btn_CPullClose = new javax.swing.JButton();
        btn_CPullViewCredit = new javax.swing.JButton();
        btn_CPullAccept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dealer's Credit Amount");
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        background.setBackground(new java.awt.Color(65, 105, 225));
        background.setMinimumSize(new java.awt.Dimension(613, 390));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frameGrabber.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameGrabberMouseDragged(evt);
            }
        });
        frameGrabber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameGrabberMousePressed(evt);
            }
        });
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesPayment.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N

        pnl_CashPayment.setBackground(new java.awt.Color(255, 255, 255));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        jPanel41.setBackground(new java.awt.Color(0, 0, 0));

        lbl_InvoiceCompany21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_InvoiceCompany21.setForeground(new java.awt.Color(255, 255, 255));
        lbl_InvoiceCompany21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_InvoiceCompany21.setText("Total Net Amount");

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jPanel55.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel58.setBackground(new java.awt.Color(0, 0, 0));

        lbl_CashTotal.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
        lbl_CashTotal.setForeground(new java.awt.Color(0, 204, 0));
        lbl_CashTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_CashTotal.setText("₱0.00");
        lbl_CashTotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_CashTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addComponent(lbl_CashTotal)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_InvoiceCompany21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(jPanel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_InvoiceCompany21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel59.setBackground(new java.awt.Color(0, 0, 0));

        lbl_InvoiceCompany23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_InvoiceCompany23.setForeground(new java.awt.Color(255, 255, 255));
        lbl_InvoiceCompany23.setText("Cash Payment");

        jPanel60.setBackground(new java.awt.Color(0, 0, 0));

        txt_CashAmount.setBackground(new java.awt.Color(0, 0, 0));
        txt_CashAmount.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        txt_CashAmount.setForeground(new java.awt.Color(0, 0, 255));
        txt_CashAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_CashAmount.setBorder(null);
        txt_CashAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CashAmountActionPerformed(evt);
            }
        });
        txt_CashAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CashAmountKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_CashAmount)
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addComponent(txt_CashAmount)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(jPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(lbl_InvoiceCompany23, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addGap(80, 80, 80))))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_InvoiceCompany23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel61.setBackground(new java.awt.Color(0, 0, 0));

        lbl_InvoiceCompany24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_InvoiceCompany24.setForeground(new java.awt.Color(255, 255, 255));
        lbl_InvoiceCompany24.setText("Change");

        jPanel62.setBackground(new java.awt.Color(0, 0, 0));

        lbl_CashChange.setBackground(new java.awt.Color(0, 0, 0));
        lbl_CashChange.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        lbl_CashChange.setForeground(new java.awt.Color(0, 204, 0));
        lbl_CashChange.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CashChange.setText("₱0.00");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_CashChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addComponent(lbl_CashChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(lbl_InvoiceCompany24, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addGap(80, 80, 80))))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_InvoiceCompany24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_CashClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CashClose.setText("Close");
        btn_CashClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CashCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CashCloseFocusLost(evt);
            }
        });
        btn_CashClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CashCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CashCloseMouseExited(evt);
            }
        });
        btn_CashClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CashCloseActionPerformed(evt);
            }
        });

        btn_CashAccept.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CashAccept.setText("Accept Cash");
        btn_CashAccept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CashAcceptFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CashAcceptFocusLost(evt);
            }
        });
        btn_CashAccept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CashAcceptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CashAcceptMouseExited(evt);
            }
        });
        btn_CashAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CashAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_CashPaymentLayout = new javax.swing.GroupLayout(pnl_CashPayment);
        pnl_CashPayment.setLayout(pnl_CashPaymentLayout);
        pnl_CashPaymentLayout.setHorizontalGroup(
            pnl_CashPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CashPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_CashAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_CashClose, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        pnl_CashPaymentLayout.setVerticalGroup(
            pnl_CashPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CashPaymentLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(pnl_CashPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CashClose, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CashAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        btn_CashClose.registerKeyboardAction(btn_CashClose.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_CashClose.registerKeyboardAction(btn_CashClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_CashAccept.registerKeyboardAction(btn_CashAccept.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CashAccept.registerKeyboardAction(btn_CashAccept.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    jTabbedPane1.addTab("Cash", pnl_CashPayment);

    pnl_Credit.setBackground(new java.awt.Color(255, 255, 255));

    jPanel51.setBackground(new java.awt.Color(255, 255, 255));

    jPanel52.setBackground(new java.awt.Color(0, 0, 0));

    lbl_InvoiceCompany20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
    lbl_InvoiceCompany20.setForeground(new java.awt.Color(255, 255, 255));
    lbl_InvoiceCompany20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbl_InvoiceCompany20.setText("Total Net Amount");

    jPanel53.setBackground(new java.awt.Color(255, 255, 255));
    jPanel53.setPreferredSize(new java.awt.Dimension(0, 5));

    javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
    jPanel53.setLayout(jPanel53Layout);
    jPanel53Layout.setHorizontalGroup(
        jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );
    jPanel53Layout.setVerticalGroup(
        jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 5, Short.MAX_VALUE)
    );

    jPanel54.setBackground(new java.awt.Color(0, 0, 0));

    lbl_CreditTotal.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
    lbl_CreditTotal.setForeground(new java.awt.Color(0, 204, 0));
    lbl_CreditTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbl_CreditTotal.setText("₱0.00");
    lbl_CreditTotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

    javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
    jPanel54.setLayout(jPanel54Layout);
    jPanel54Layout.setHorizontalGroup(
        jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_CreditTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel54Layout.setVerticalGroup(
        jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel54Layout.createSequentialGroup()
            .addComponent(lbl_CreditTotal)
            .addGap(0, 7, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
    jPanel52.setLayout(jPanel52Layout);
    jPanel52Layout.setHorizontalGroup(
        jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lbl_InvoiceCompany20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addComponent(jPanel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel52Layout.setVerticalGroup(
        jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_InvoiceCompany20)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    jPanel56.setBackground(new java.awt.Color(0, 0, 0));

    lbl_InvoiceCompany22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
    lbl_InvoiceCompany22.setForeground(new java.awt.Color(255, 255, 255));
    lbl_InvoiceCompany22.setText("Due Date:");

    jPanel57.setBackground(new java.awt.Color(0, 0, 0));

    date_CreditDue.setEditable(false);
    date_CreditDue.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N

    javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
    jPanel57.setLayout(jPanel57Layout);
    jPanel57Layout.setHorizontalGroup(
        jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
            .addContainerGap(157, Short.MAX_VALUE)
            .addComponent(date_CreditDue, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(119, 119, 119))
    );
    jPanel57Layout.setVerticalGroup(
        jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(date_CreditDue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    date_CreditDue.setFormats("yyyy-MM-dd");
    /*Date inventoryExFrom = new Date();
    date_CreditDue.setDate(inventoryExFrom);*/

    javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
    jPanel56.setLayout(jPanel56Layout);
    jPanel56Layout.setHorizontalGroup(
        jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel56Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel56Layout.createSequentialGroup()
                    .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(jPanel56Layout.createSequentialGroup()
                    .addComponent(lbl_InvoiceCompany22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(80, 80, 80))))
    );
    jPanel56Layout.setVerticalGroup(
        jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_InvoiceCompany22)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
    jPanel51.setLayout(jPanel51Layout);
    jPanel51Layout.setHorizontalGroup(
        jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel51Layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(0, 0, 0))
    );
    jPanel51Layout.setVerticalGroup(
        jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel51Layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0))
    );

    btn_CreditClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_CreditClose.setText("Close");
    btn_CreditClose.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_CreditCloseFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_CreditCloseFocusLost(evt);
        }
    });
    btn_CreditClose.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_CreditCloseMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_CreditCloseMouseExited(evt);
        }
    });
    btn_CreditClose.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_CreditCloseActionPerformed(evt);
        }
    });

    btn_CreditAccept.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_CreditAccept.setText("Accept Credit");
    btn_CreditAccept.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_CreditAcceptFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_CreditAcceptFocusLost(evt);
        }
    });
    btn_CreditAccept.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_CreditAcceptMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_CreditAcceptMouseExited(evt);
        }
    });
    btn_CreditAccept.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_CreditAcceptActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout pnl_CreditLayout = new javax.swing.GroupLayout(pnl_Credit);
    pnl_Credit.setLayout(pnl_CreditLayout);
    pnl_CreditLayout.setHorizontalGroup(
        pnl_CreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_CreditLayout.createSequentialGroup()
            .addGroup(pnl_CreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CreditLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_CreditAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btn_CreditClose, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pnl_CreditLayout.setVerticalGroup(
        pnl_CreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_CreditLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addGroup(pnl_CreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_CreditClose, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_CreditAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    btn_CreditClose.registerKeyboardAction(btn_CreditClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CreditClose.registerKeyboardAction(btn_CreditClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_CreditAccept.registerKeyboardAction(btn_CreditAccept.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CreditAccept.registerKeyboardAction(btn_CreditAccept.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    jTabbedPane1.addTab("Credit", pnl_Credit);

    pnl_Pull_out.setBackground(new java.awt.Color(255, 255, 255));

    jPanel32.setBackground(new java.awt.Color(255, 255, 255));

    jPanel33.setBackground(new java.awt.Color(0, 0, 0));

    lbl_InvoiceCompany14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
    lbl_InvoiceCompany14.setForeground(new java.awt.Color(255, 255, 255));
    lbl_InvoiceCompany14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbl_InvoiceCompany14.setText("Total Credit Amount");

    jPanel34.setBackground(new java.awt.Color(255, 255, 255));
    jPanel34.setPreferredSize(new java.awt.Dimension(0, 5));

    javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
    jPanel34.setLayout(jPanel34Layout);
    jPanel34Layout.setHorizontalGroup(
        jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );
    jPanel34Layout.setVerticalGroup(
        jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 5, Short.MAX_VALUE)
    );

    jPanel36.setBackground(new java.awt.Color(0, 0, 0));

    lbl_CPullBalance.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
    lbl_CPullBalance.setForeground(new java.awt.Color(255, 0, 0));
    lbl_CPullBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbl_CPullBalance.setText("₱0.00");
    lbl_CPullBalance.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

    javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
    jPanel36.setLayout(jPanel36Layout);
    jPanel36Layout.setHorizontalGroup(
        jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_CPullBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel36Layout.setVerticalGroup(
        jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel36Layout.createSequentialGroup()
            .addComponent(lbl_CPullBalance)
            .addGap(0, 7, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
    jPanel33.setLayout(jPanel33Layout);
    jPanel33Layout.setHorizontalGroup(
        jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lbl_InvoiceCompany14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel33Layout.setVerticalGroup(
        jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_InvoiceCompany14)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    jPanel37.setBackground(new java.awt.Color(0, 0, 0));

    lbl_InvoiceCompany15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
    lbl_InvoiceCompany15.setForeground(new java.awt.Color(255, 255, 255));
    lbl_InvoiceCompany15.setText("Cash Payment");

    jPanel38.setBackground(new java.awt.Color(0, 0, 0));

    txt_CPullCash.setBackground(new java.awt.Color(0, 0, 0));
    txt_CPullCash.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
    txt_CPullCash.setForeground(new java.awt.Color(0, 0, 255));
    txt_CPullCash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txt_CPullCash.setBorder(null);
    txt_CPullCash.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_CPullCashActionPerformed(evt);
        }
    });
    txt_CPullCash.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_CPullCashKeyReleased(evt);
        }
    });

    javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
    jPanel38.setLayout(jPanel38Layout);
    jPanel38Layout.setHorizontalGroup(
        jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel38Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(txt_CPullCash)
            .addContainerGap())
    );
    jPanel38Layout.setVerticalGroup(
        jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel38Layout.createSequentialGroup()
            .addComponent(txt_CPullCash)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
    jPanel37.setLayout(jPanel37Layout);
    jPanel37Layout.setHorizontalGroup(
        jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel37Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel37Layout.createSequentialGroup()
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(jPanel37Layout.createSequentialGroup()
                    .addComponent(lbl_InvoiceCompany15, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addGap(80, 80, 80))))
    );
    jPanel37Layout.setVerticalGroup(
        jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_InvoiceCompany15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel39.setBackground(new java.awt.Color(0, 0, 0));

    lbl_InvoiceCompany16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
    lbl_InvoiceCompany16.setForeground(new java.awt.Color(255, 255, 255));
    lbl_InvoiceCompany16.setText("Change");

    jPanel40.setBackground(new java.awt.Color(0, 0, 0));

    lbl_CPullChange.setBackground(new java.awt.Color(0, 0, 0));
    lbl_CPullChange.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
    lbl_CPullChange.setForeground(new java.awt.Color(0, 204, 0));
    lbl_CPullChange.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lbl_CPullChange.setText("₱0.00");

    javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
    jPanel40.setLayout(jPanel40Layout);
    jPanel40Layout.setHorizontalGroup(
        jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_CPullChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel40Layout.setVerticalGroup(
        jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
            .addComponent(lbl_CPullChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
    jPanel39.setLayout(jPanel39Layout);
    jPanel39Layout.setHorizontalGroup(
        jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel39Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addComponent(lbl_InvoiceCompany16, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addGap(80, 80, 80))))
    );
    jPanel39Layout.setVerticalGroup(
        jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_InvoiceCompany16)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
    jPanel32.setLayout(jPanel32Layout);
    jPanel32Layout.setHorizontalGroup(
        jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createSequentialGroup()
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, 0))
    );
    jPanel32Layout.setVerticalGroup(
        jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel32Layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))
    );

    btn_CPullClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_CPullClose.setText("Close");
    btn_CPullClose.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_CPullCloseFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_CPullCloseFocusLost(evt);
        }
    });
    btn_CPullClose.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_CPullCloseMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_CPullCloseMouseExited(evt);
        }
    });
    btn_CPullClose.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_CPullCloseActionPerformed(evt);
        }
    });

    btn_CPullViewCredit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_CPullViewCredit.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_CPullViewCreditFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_CPullViewCreditFocusLost(evt);
        }
    });
    btn_CPullViewCredit.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_CPullViewCreditMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_CPullViewCreditMouseExited(evt);
        }
    });
    btn_CPullViewCredit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_CPullViewCreditActionPerformed(evt);
        }
    });

    btn_CPullAccept.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_CPullAccept.setText("Accept Cash");
    btn_CPullAccept.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_CPullAcceptFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_CPullAcceptFocusLost(evt);
        }
    });
    btn_CPullAccept.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_CPullAcceptMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_CPullAcceptMouseExited(evt);
        }
    });
    btn_CPullAccept.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_CPullAcceptActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout pnl_Pull_outLayout = new javax.swing.GroupLayout(pnl_Pull_out);
    pnl_Pull_out.setLayout(pnl_Pull_outLayout);
    pnl_Pull_outLayout.setHorizontalGroup(
        pnl_Pull_outLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_Pull_outLayout.createSequentialGroup()
            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(2, 2, 2))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Pull_outLayout.createSequentialGroup()
            .addComponent(btn_CPullAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(btn_CPullViewCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(btn_CPullClose, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );
    pnl_Pull_outLayout.setVerticalGroup(
        pnl_Pull_outLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_Pull_outLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addGroup(pnl_Pull_outLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btn_CPullClose, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_CPullViewCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_CPullAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    btn_CPullClose.registerKeyboardAction(btn_CPullClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CPullClose.registerKeyboardAction(btn_CPullClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_CPullViewCredit.setText("<html><center>View<br/>Credit History</center></html>");
    btn_CPullViewCredit.registerKeyboardAction(btn_CPullViewCredit.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CPullViewCredit.registerKeyboardAction(btn_CPullViewCredit.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_CPullAccept.registerKeyboardAction(btn_CPullAccept.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CPullAccept.registerKeyboardAction(btn_CPullAccept.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    jTabbedPane1.addTab("Credit Pull-out", pnl_Pull_out);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0))
    );

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frameGrabberMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameGrabberMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameGrabberMouseDragged

    private void frameGrabberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameGrabberMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameGrabberMousePressed

    private void btn_CreditAcceptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditAcceptFocusGained
        btn_CreditAccept.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditAcceptFocusGained

    private void btn_CreditAcceptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditAcceptFocusLost
        btn_CreditAccept.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditAcceptFocusLost

    private void btn_CreditAcceptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditAcceptMouseEntered
        btn_CreditAccept.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditAcceptMouseEntered

    private void btn_CreditAcceptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditAcceptMouseExited
        btn_CreditAccept.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditAcceptMouseExited

    private void btn_CreditCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditCloseFocusGained
        btn_CreditClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditCloseFocusGained

    private void btn_CreditCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CreditCloseFocusLost
        btn_CreditClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditCloseFocusLost

    private void btn_CreditCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditCloseMouseEntered
        btn_CreditClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CreditCloseMouseEntered

    private void btn_CreditCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditCloseMouseExited
        btn_CreditClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CreditCloseMouseExited

    private void btn_CreditCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreditCloseActionPerformed
        this.dispose();
        jTabbedPane1.setSelectedIndex(0);
        lbl_CashTotal.setText("0.00");
        lbl_CashChange.setText("0.00");
        lbl_CreditTotal.setText("0.00");
        lbl_CPullBalance.setText("0.00");
        lbl_CPullChange.setText("0.00");
        txt_CashAmount.setText("");
        txt_CPullCash.setText("");
    }//GEN-LAST:event_btn_CreditCloseActionPerformed

    private void btn_CPullAcceptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CPullAcceptFocusGained
        btn_CPullAccept.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CPullAcceptFocusGained

    private void btn_CPullAcceptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CPullAcceptFocusLost
        btn_CPullAccept.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CPullAcceptFocusLost

    private void btn_CPullAcceptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CPullAcceptMouseEntered
        btn_CPullAccept.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CPullAcceptMouseEntered

    private void btn_CPullAcceptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CPullAcceptMouseExited
        btn_CPullAccept.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CPullAcceptMouseExited

    private void btn_CPullCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CPullCloseFocusGained
        btn_CPullClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CPullCloseFocusGained

    private void btn_CPullCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CPullCloseFocusLost
        btn_CPullClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CPullCloseFocusLost

    private void btn_CPullCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CPullCloseMouseEntered
        btn_CPullClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CPullCloseMouseEntered

    private void btn_CPullCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CPullCloseMouseExited
        btn_CPullClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CPullCloseMouseExited

    private void btn_CPullCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CPullCloseActionPerformed
        this.dispose();
        jTabbedPane1.setSelectedIndex(0);
        lbl_CashTotal.setText("0.00");
        lbl_CashChange.setText("0.00");
        lbl_CreditTotal.setText("0.00");
        lbl_CPullBalance.setText("0.00");
        lbl_CPullChange.setText("0.00");
        txt_CashAmount.setText("");
        txt_CPullCash.setText("");
    }//GEN-LAST:event_btn_CPullCloseActionPerformed

    private void btn_CPullViewCreditFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CPullViewCreditFocusGained
        btn_CPullViewCredit.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CPullViewCreditFocusGained

    private void btn_CPullViewCreditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CPullViewCreditFocusLost
        btn_CPullViewCredit.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CPullViewCreditFocusLost

    private void btn_CPullViewCreditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CPullViewCreditMouseEntered
        btn_CPullViewCredit.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CPullViewCreditMouseEntered

    private void btn_CPullViewCreditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CPullViewCreditMouseExited
        btn_CPullViewCredit.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CPullViewCreditMouseExited

    private void btn_CPullViewCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CPullViewCreditActionPerformed
        button.pullViewCredit();
    }//GEN-LAST:event_btn_CPullViewCreditActionPerformed

    private void btn_CashCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CashCloseFocusGained
        btn_CashClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CashCloseFocusGained

    private void btn_CashCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CashCloseFocusLost
        btn_CashClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CashCloseFocusLost

    private void btn_CashCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CashCloseMouseEntered
        btn_CashClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CashCloseMouseEntered

    private void btn_CashCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CashCloseMouseExited
        btn_CashClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CashCloseMouseExited

    private void btn_CashCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CashCloseActionPerformed
        this.dispose();
        jTabbedPane1.setSelectedIndex(0);
        lbl_CashTotal.setText("0.00");
        lbl_CashChange.setText("0.00");
        lbl_CreditTotal.setText("0.00");
        lbl_CPullBalance.setText("0.00");
        lbl_CPullChange.setText("0.00");
        txt_CashAmount.setText("");
        txt_CashAmount.setText("");
    }//GEN-LAST:event_btn_CashCloseActionPerformed

    private void btn_CashAcceptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CashAcceptFocusGained
        btn_CashAccept.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CashAcceptFocusGained

    private void btn_CashAcceptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CashAcceptFocusLost
        btn_CashAccept.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CashAcceptFocusLost

    private void btn_CashAcceptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CashAcceptMouseEntered
        btn_CashAccept.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CashAcceptMouseEntered

    private void btn_CashAcceptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CashAcceptMouseExited
        btn_CashAccept.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CashAcceptMouseExited

    private void btn_CPullAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CPullAcceptActionPerformed
        button.pullOutAccept();
        this.dispose();
    }//GEN-LAST:event_btn_CPullAcceptActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txt_CashAmount.requestFocusInWindow();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        jTabbedPane1.setSelectedIndex(0);
        lbl_CashTotal.setText("0.00");
        lbl_CashChange.setText("0.00");
        lbl_CreditTotal.setText("0.00");
        lbl_CPullBalance.setText("0.00");
        lbl_CPullChange.setText("0.00");
        txt_CashAmount.setText("");
        txt_CPullCash.setText("");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txt_CashAmount.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        background.setBackground(new Color(65, 105, 225));
        text.setVisible(true);
        logo.setVisible(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        background.setBackground(new Color(235, 235, 235));
        text.setVisible(false);
        logo.setVisible(false);
    }//GEN-LAST:event_formWindowLostFocus

    private void btn_CashAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CashAcceptActionPerformed
        //Print here
        PrinterService printerService = new PrinterService();
        //table, cashier, customer, 1 - cash
        printerService.setPrinterData(salesOrder.SalesPnl_2ndLayer.tbl_SalesCart, com.Session.cashier, salesOrder.SalesOrder_ButtonFunctions.customerInfo[1][1].toString(), 1);
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(printerService,PrinterService.getPageFormat(pj));
        try {
            pj.print();
        }
        catch (PrinterException ex) {
            ex.printStackTrace();
        }
        //close
        button.cashTenderAccept();
        this.dispose();
    }//GEN-LAST:event_btn_CashAcceptActionPerformed

    private void btn_CreditAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreditAcceptActionPerformed
        if( isCreditDue()) JOptionPane.showMessageDialog(null, "Dealer has 1 or more pending credit due. Can't transact anymore");
        else if(lbl_CreditTotal.equals("₱0.00")) JOptionPane.showMessageDialog(null, "Please select product");
        else button.creditAccept();
        this.dispose();
    }//GEN-LAST:event_btn_CreditAcceptActionPerformed

    private void txt_CashAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CashAmountKeyReleased
        StringBuilder sb = new StringBuilder(SalesOrder_Tender.lbl_CashTotal.getText());
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        sb.deleteCharAt(0);
        Float totalNet = getRealFloat(sb.toString());
        Float amountoPurchase=null;
        if(!txt_CashAmount.getText().equals("")) {
             amountoPurchase = Float.parseFloat(txt_CashAmount.getText());
        }
        if(txt_CashAmount.getText().equals("") || amountoPurchase < totalNet) lbl_CashChange.setText("₱0.00");
        else {
            Float change = amountoPurchase - totalNet;
            change = Float.parseFloat(String.format("%.2f", change));
            lbl_CashChange.setText("₱"+formatter.format(Float.parseFloat(String.format("%.2f", change))));
        }
        
    }//GEN-LAST:event_txt_CashAmountKeyReleased
    public static float getRealFloat(String floatNum)
    {
        StringBuilder sb = new StringBuilder(floatNum);
        for(int i=0;i<floatNum.length();i++)
        {
            if(floatNum.charAt(i) == ',') sb.deleteCharAt(i);
        }
        float result = Float.parseFloat(sb.toString());
        return result;
    }
    private void txt_CashAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CashAmountActionPerformed
        btn_CashAcceptActionPerformed(evt);
    }//GEN-LAST:event_txt_CashAmountActionPerformed

    private void txt_CPullCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CPullCashActionPerformed
        button.pullOutAccept();
        this.dispose();
    }//GEN-LAST:event_txt_CPullCashActionPerformed
    public static int invoiceID = 0;
    private void txt_CPullCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CPullCashKeyReleased
        StringBuilder sb = new StringBuilder(SalesOrder_Tender.lbl_CPullBalance.getText());
        sb.deleteCharAt(0);
        Float totalNet = Float.parseFloat(sb.toString());
        Float amountoPurchase = null;
        if(!txt_CPullCash.getText().equals("")) amountoPurchase = Float.parseFloat(txt_CPullCash.getText());
        if(txt_CPullCash.getText().equals("") || amountoPurchase < totalNet) lbl_CPullChange.setText("₱0.00");
        else {
            Float change = amountoPurchase - totalNet;
            change = Float.parseFloat(String.format("%.2f", change));
            lbl_CPullChange.setText("₱"+change);
        }
    }//GEN-LAST:event_txt_CPullCashKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Tender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Tender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Tender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_Tender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_Tender dialog = new SalesOrder_Tender(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    protected static javax.swing.JButton btn_CPullAccept;
    protected static javax.swing.JButton btn_CPullClose;
    protected static javax.swing.JButton btn_CPullViewCredit;
    protected static javax.swing.JButton btn_CashAccept;
    protected static javax.swing.JButton btn_CashClose;
    protected static javax.swing.JButton btn_CreditAccept;
    protected static javax.swing.JButton btn_CreditClose;
    protected static org.jdesktop.swingx.JXDatePicker date_CreditDue;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JTabbedPane jTabbedPane1;
    protected static javax.swing.JLabel lbl_CPullBalance;
    protected static javax.swing.JLabel lbl_CPullChange;
    public static javax.swing.JLabel lbl_CashChange;
    public static javax.swing.JLabel lbl_CashTotal;
    public static javax.swing.JLabel lbl_CreditTotal;
    protected static javax.swing.JLabel lbl_InvoiceCompany14;
    protected static javax.swing.JLabel lbl_InvoiceCompany15;
    protected static javax.swing.JLabel lbl_InvoiceCompany16;
    protected static javax.swing.JLabel lbl_InvoiceCompany20;
    protected static javax.swing.JLabel lbl_InvoiceCompany21;
    protected static javax.swing.JLabel lbl_InvoiceCompany22;
    protected static javax.swing.JLabel lbl_InvoiceCompany23;
    protected static javax.swing.JLabel lbl_InvoiceCompany24;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnl_CashPayment;
    private javax.swing.JPanel pnl_Credit;
    private javax.swing.JPanel pnl_Pull_out;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_CPullCash;
    public static javax.swing.JTextField txt_CashAmount;
    // End of variables declaration//GEN-END:variables
}
