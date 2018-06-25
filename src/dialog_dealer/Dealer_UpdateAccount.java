package dialog_dealer;

import dealer.DealerPnl_1stLayer;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class Dealer_UpdateAccount extends javax.swing.JDialog {

    Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
    int xMouse, yMouse;
    
    public Dealer_UpdateAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBounds(328, 7, 729, 737);
        
        dialog_dealer.Dealer_ButtonFunctions.populateSupplierDiscountTable("SELECT supplier.supplier_name AS 'Company', dealer_supplier_bridge.discount AS 'Discount' FROM dealer_supplier_bridge,supplier WHERE dealer_supplier_bridge.supplierID = supplier.idsupplier");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        lbl_NewDealerID = new javax.swing.JLabel();
        txt_UpdateDealerID = new javax.swing.JTextField();
        lbl_NewDealerRegDate = new javax.swing.JLabel();
        date_UpdateDealerRegDate = new org.jdesktop.swingx.JXDatePicker();
        lbl_NewDealerCLine = new javax.swing.JLabel();
        lbl_NewDealerReturn = new javax.swing.JLabel();
        lbl_NewDealerSponsor = new javax.swing.JLabel();
        lbl_NewDealerDiscount = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_UpdateDealerDiscount = new javax.swing.JTable();
        txt_UpdateDealerSponsor = new javax.swing.JTextField();
        txt_UpdateDealerCredit = new javax.swing.JTextField();
        txt_UpdateDealerMaxReturn = new javax.swing.JTextField();
        btn_UpdateDealerView = new javax.swing.JButton();
        lbl_NewDealerDueDate = new javax.swing.JLabel();
        cbo_UpdateDealerDueDate = new javax.swing.JComboBox<>();
        lbl_NewDealerDueDate1 = new javax.swing.JLabel();
        lbl_NewDealerACLine = new javax.swing.JLabel();
        txt_UpdateDealerACLine = new javax.swing.JTextField();
        pnl_NewUserPersonal4 = new javax.swing.JPanel();
        lbl_NewDealerFName = new javax.swing.JLabel();
        txt_UpdateDealerFName = new javax.swing.JTextField();
        lbl_NewDealerLName = new javax.swing.JLabel();
        txt_UpdateDealerLName = new javax.swing.JTextField();
        lbl_NewDealerBDay = new javax.swing.JLabel();
        cbo_UpdateDealerCivil = new javax.swing.JComboBox<>();
        lbl_NewDealerMName = new javax.swing.JLabel();
        txt_UpdateDealerMName = new javax.swing.JTextField();
        lbl_NewDealerGender = new javax.swing.JLabel();
        cbo_UpdateDealerGender = new javax.swing.JComboBox<>();
        lbl_NewDealerStatus = new javax.swing.JLabel();
        lbl_NewDealerNationality = new javax.swing.JLabel();
        txt_UpdateDealerNationality = new javax.swing.JTextField();
        date_UpdateDealerBirthday = new org.jdesktop.swingx.JXDatePicker();
        lbl_NewDealerOccupation = new javax.swing.JLabel();
        txt_UpdateDealerOccupation = new javax.swing.JTextField();
        pnl_NewUserContact4 = new javax.swing.JPanel();
        lbl_NewDealerAddress = new javax.swing.JLabel();
        lbl_NewDealerEmail = new javax.swing.JLabel();
        lbl_NewDealerContact = new javax.swing.JLabel();
        txt_UpdateDealerEmail = new javax.swing.JTextField();
        txt_UpdateDealerAddress = new javax.swing.JTextField();
        txt_UpdateDealerContact = new javax.swing.JTextField();
        lbl_note2 = new javax.swing.JLabel();
        btn_UpdateDealerRegister = new javax.swing.JButton();
        btn_UpdateDealerClear = new javax.swing.JButton();
        btn_UpdateDealerClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dealer's Credit Amount");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_DealerUAccount.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Account Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NewDealerID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerID.setText("Dealer ID: *");
        lbl_NewDealerID.setText("<html>Dealer ID: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, -1, -1));

        txt_UpdateDealerID.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateDealerID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_UpdateDealerID.setText("1");
        txt_UpdateDealerID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_UpdateDealerID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_UpdateDealerID.setEnabled(false);
        jPanel80.add(txt_UpdateDealerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 85, 35));

        lbl_NewDealerRegDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerRegDate.setText("Registration Date: *");
        lbl_NewDealerRegDate.setText("<html>Registration Date: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 31, -1, -1));

        date_UpdateDealerRegDate.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel80.add(date_UpdateDealerRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 24, 150, 35));
        date_UpdateDealerRegDate.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_UpdateDealerRegDate.setDate(newDealerRegDate);

        lbl_NewDealerCLine.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerCLine.setText("Credit Line: *");
        lbl_NewDealerCLine.setText("<html>Credit Line: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerCLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_NewDealerReturn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerReturn.setText("Max Return Days: *");
        lbl_NewDealerReturn.setText("<html>Max Return Days: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 109, -1, -1));

        lbl_NewDealerSponsor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerSponsor.setText("Sponsor ID/Name: *");
        lbl_NewDealerSponsor.setText("<html>Sponsor ID/Name: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 109, -1, -1));

        lbl_NewDealerDiscount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerDiscount.setText("Discounts: *");
        lbl_NewDealerDiscount.setText("<html>Discounts: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        tbl_UpdateDealerDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_UpdateDealerDiscount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Avon", null},
                {"Ever Belina", null},
                {"Red Logo", null},
                {"DAKI", null},
                {"Aim Global", null},
                {"Royale", null},
                {"Natasha", null},
                {"MSE", null},
                {"Personal Collection", null},
                {"Tupperware", null}
            },
            new String [] {
                "Company", "Discount"
            }
        ));
        tbl_UpdateDealerDiscount.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbl_UpdateDealerDiscount.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_UpdateDealerDiscount.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tbl_UpdateDealerDiscount);
        tbl_UpdateDealerDiscount.setBackground(Color.WHITE);
        tbl_UpdateDealerDiscount.setShowGrid(true);
        tbl_UpdateDealerDiscount.setRowHeight(26);
        tbl_UpdateDealerDiscount.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 13));

        DefaultTableCellRenderer newDealerCenterRenderer = new DefaultTableCellRenderer();
        newDealerCenterRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer)tbl_UpdateDealerDiscount.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        jPanel80.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 220, 157));

        txt_UpdateDealerSponsor.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateDealerSponsor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel80.add(txt_UpdateDealerSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 102, 150, 35));

        txt_UpdateDealerCredit.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateDealerCredit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_UpdateDealerCredit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel80.add(txt_UpdateDealerCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, 85, 35));

        txt_UpdateDealerMaxReturn.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateDealerMaxReturn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_UpdateDealerMaxReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel80.add(txt_UpdateDealerMaxReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 102, 85, 35));

        btn_UpdateDealerView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Dealer New View.png"))); // NOI18N
        btn_UpdateDealerView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateDealerViewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateDealerViewFocusLost(evt);
            }
        });
        btn_UpdateDealerView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateDealerViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateDealerViewMouseExited(evt);
            }
        });
        btn_UpdateDealerView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateDealerViewActionPerformed(evt);
            }
        });
        jPanel80.add(btn_UpdateDealerView, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 102, 37, 35));
        btn_UpdateDealerView.registerKeyboardAction(btn_UpdateDealerView.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_UpdateDealerView.registerKeyboardAction(btn_UpdateDealerView.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    lbl_NewDealerDueDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerDueDate.setText("Due Date: *");
    lbl_NewDealerDueDate.setText("<html>Due Date:  <font color=red>*</font></html>");
    jPanel80.add(lbl_NewDealerDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 150, -1, -1));

    cbo_UpdateDealerDueDate.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    cbo_UpdateDealerDueDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "37", "45", "52" }));
    jPanel80.add(cbo_UpdateDealerDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 141, 65, 35));

    lbl_NewDealerDueDate1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerDueDate1.setText("days");
    jPanel80.add(lbl_NewDealerDueDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 150, -1, -1));

    lbl_NewDealerACLine.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerACLine.setText("Availbale Credit Line: *");
    lbl_NewDealerACLine.setText("<html>Available Credit Line: <font color=red>*</font></html>");
    jPanel80.add(lbl_NewDealerACLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

    txt_UpdateDealerACLine.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerACLine.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    jPanel80.add(txt_UpdateDealerACLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 63, 150, 35));

    pnl_NewUserPersonal4.setBackground(new java.awt.Color(255, 255, 255));
    pnl_NewUserPersonal4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Personal Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
    pnl_NewUserPersonal4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbl_NewDealerFName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerFName.setText("First Name: *");
    lbl_NewDealerFName.setText("<html>First Name: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, -1, -1));

    txt_UpdateDealerFName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerFName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_UpdateDealerFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 150, 35));

    lbl_NewDealerLName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerLName.setText("Last Name: *");
    lbl_NewDealerLName.setText("<html>Last Name: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

    txt_UpdateDealerLName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerLName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_UpdateDealerLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, 150, 35));

    lbl_NewDealerBDay.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerBDay.setText("Date of Birth: *");
    lbl_NewDealerBDay.setText("<html>Date of Birth: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerBDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 109, -1, -1));

    cbo_UpdateDealerCivil.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    cbo_UpdateDealerCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widow/Widower", "Divorce" }));
    pnl_NewUserPersonal4.add(cbo_UpdateDealerCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 102, 150, 35));

    lbl_NewDealerMName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerMName.setText("Middle Name:");
    //lbl_newUserMName.setText("<html>Middle Name: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 31, -1, -1));

    txt_UpdateDealerMName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerMName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_UpdateDealerMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 24, 150, 35));

    lbl_NewDealerGender.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerGender.setText("Gender: *");
    lbl_NewDealerGender.setText("<html>Gender: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 70, -1, -1));

    cbo_UpdateDealerGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    cbo_UpdateDealerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
    pnl_NewUserPersonal4.add(cbo_UpdateDealerGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 63, -1, 35));

    lbl_NewDealerStatus.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerStatus.setText("Civil Status: *");
    lbl_NewDealerStatus.setText("<html>Civil Status: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 109, -1, -1));

    lbl_NewDealerNationality.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerNationality.setText("Nationality:");
    pnl_NewUserPersonal4.add(lbl_NewDealerNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 148, -1, -1));

    txt_UpdateDealerNationality.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerNationality.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_UpdateDealerNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 141, 150, 35));

    date_UpdateDealerBirthday.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    pnl_NewUserPersonal4.add(date_UpdateDealerBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 102, 150, 35));
    date_UpdateDealerBirthday.setFormats("yyyy-MM-dd");
    String newDealerDateValue = "2016-01-01";  // must be in (yyyy- mm- dd ) format
    Date newDealerBDay = null;
    try {
        newDealerBDay = new SimpleDateFormat("yyyy-mm-dd").parse(newDealerDateValue);
    } catch (ParseException ex) {
        //Logger.getLogger(ICMSystem.class.getName()).log(Level.SEVERE, null, ex);
    }
    date_UpdateDealerBirthday.setDate(newDealerBDay);

    lbl_NewDealerOccupation.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerOccupation.setText("Occupation:");
    lbl_NewDealerStatus.setText("<html>Civil Status: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 148, -1, -1));

    txt_UpdateDealerOccupation.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerOccupation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_UpdateDealerOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 141, 150, 35));

    pnl_NewUserContact4.setBackground(new java.awt.Color(255, 255, 255));
    pnl_NewUserContact4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Contact Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
    pnl_NewUserContact4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbl_NewDealerAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerAddress.setText("Address: *");
    lbl_NewDealerAddress.setText("<html>Address: <font color=red>*</font></html>");
    pnl_NewUserContact4.add(lbl_NewDealerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, -1, -1));

    lbl_NewDealerEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerEmail.setText("Email Address:");
    pnl_NewUserContact4.add(lbl_NewDealerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

    lbl_NewDealerContact.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerContact.setText("Contact No. : *");
    lbl_NewDealerContact.setText("<html>Contact No. : <font color=red>*</font></html>");
    pnl_NewUserContact4.add(lbl_NewDealerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 70, -1, -1));

    txt_UpdateDealerEmail.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserContact4.add(txt_UpdateDealerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, 210, 35));

    txt_UpdateDealerAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserContact4.add(txt_UpdateDealerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 476, 35));

    txt_UpdateDealerContact.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_UpdateDealerContact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserContact4.add(txt_UpdateDealerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 63, 150, 35));

    lbl_note2.setBackground(new java.awt.Color(255, 255, 255));
    lbl_note2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    lbl_note2.setText("Note: Please fill out the information that has * and the rest are optional.");
    lbl_note2.setText("<html><b>Note:</b> Please fill out the information that has <font color=red size=4>*</font> and the rest are optional.</html>");
    pnl_NewUserContact4.add(lbl_note2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 107, 491, 30));

    btn_UpdateDealerRegister.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_UpdateDealerRegister.setText("Update");
    btn_UpdateDealerRegister.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_UpdateDealerRegisterFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_UpdateDealerRegisterFocusLost(evt);
        }
    });
    btn_UpdateDealerRegister.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_UpdateDealerRegisterMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_UpdateDealerRegisterMouseExited(evt);
        }
    });
    btn_UpdateDealerRegister.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_UpdateDealerRegisterActionPerformed(evt);
        }
    });

    btn_UpdateDealerClear.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_UpdateDealerClear.setText("Clear");
    btn_UpdateDealerClear.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_UpdateDealerClearFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_UpdateDealerClearFocusLost(evt);
        }
    });
    btn_UpdateDealerClear.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_UpdateDealerClearMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_UpdateDealerClearMouseExited(evt);
        }
    });
    btn_UpdateDealerClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_UpdateDealerClearActionPerformed(evt);
        }
    });

    btn_UpdateDealerClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_UpdateDealerClose.setText("Close");
    btn_UpdateDealerClose.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_UpdateDealerCloseFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_UpdateDealerCloseFocusLost(evt);
        }
    });
    btn_UpdateDealerClose.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_UpdateDealerCloseMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_UpdateDealerCloseMouseExited(evt);
        }
    });
    btn_UpdateDealerClose.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_UpdateDealerCloseActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btn_UpdateDealerRegister)
                    .addGap(0, 0, 0)
                    .addComponent(btn_UpdateDealerClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btn_UpdateDealerClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_NewUserContact4, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_NewUserPersonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(6, 6, 6))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_UpdateDealerClear, btn_UpdateDealerClose, btn_UpdateDealerRegister});

    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(pnl_NewUserPersonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(pnl_NewUserContact4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_UpdateDealerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_UpdateDealerClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_UpdateDealerClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(6, 6, 6))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_UpdateDealerClear, btn_UpdateDealerClose, btn_UpdateDealerRegister});

    btn_UpdateDealerRegister.registerKeyboardAction(btn_UpdateDealerRegister.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateDealerRegister.registerKeyboardAction(btn_UpdateDealerRegister.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UpdateDealerClear.registerKeyboardAction(btn_UpdateDealerClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateDealerClear.registerKeyboardAction(btn_UpdateDealerClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UpdateDealerClose.registerKeyboardAction(btn_UpdateDealerClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateDealerClose.registerKeyboardAction(btn_UpdateDealerClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
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

    private void btn_UpdateDealerViewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateDealerViewFocusGained
        btn_UpdateDealerView.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateDealerViewFocusGained

    private void btn_UpdateDealerViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateDealerViewFocusLost
        btn_UpdateDealerView.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateDealerViewFocusLost

    private void btn_UpdateDealerViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateDealerViewMouseEntered
        btn_UpdateDealerView.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateDealerViewMouseEntered

    private void btn_UpdateDealerViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateDealerViewMouseExited
        btn_UpdateDealerView.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateDealerViewMouseExited

    private void btn_UpdateDealerViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateDealerViewActionPerformed
        button.dealerViewAccount();
    }//GEN-LAST:event_btn_UpdateDealerViewActionPerformed

    private void btn_UpdateDealerRegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateDealerRegisterFocusGained
        btn_UpdateDealerRegister.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateDealerRegisterFocusGained

    private void btn_UpdateDealerRegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateDealerRegisterFocusLost
        btn_UpdateDealerRegister.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateDealerRegisterFocusLost

    private void btn_UpdateDealerRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateDealerRegisterMouseEntered
        btn_UpdateDealerRegister.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateDealerRegisterMouseEntered

    private void btn_UpdateDealerRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateDealerRegisterMouseExited
        btn_UpdateDealerRegister.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateDealerRegisterMouseExited

    private void btn_UpdateDealerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateDealerRegisterActionPerformed
        button.dealerUpdateAccount();
        if(Dealer_ButtonFunctions.successEx > 0 ){
            dealer.DealerPnl_1stLayer.tbl_DealerAccounts.clearSelection();
            this.dispose();
        }
        DealerPnl_1stLayer.updateTable();
    }//GEN-LAST:event_btn_UpdateDealerRegisterActionPerformed

    private void btn_UpdateDealerClearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateDealerClearFocusGained
        btn_UpdateDealerClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateDealerClearFocusGained

    private void btn_UpdateDealerClearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateDealerClearFocusLost
        btn_UpdateDealerClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateDealerClearFocusLost

    private void btn_UpdateDealerClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateDealerClearMouseEntered
        btn_UpdateDealerClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateDealerClearMouseEntered

    private void btn_UpdateDealerClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateDealerClearMouseExited
        btn_UpdateDealerClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateDealerClearMouseExited

    private void btn_UpdateDealerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateDealerClearActionPerformed
        button.dealerClearUpdateAccount();
    }//GEN-LAST:event_btn_UpdateDealerClearActionPerformed

    private void btn_UpdateDealerCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateDealerCloseFocusGained
        btn_UpdateDealerClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateDealerCloseFocusGained

    private void btn_UpdateDealerCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateDealerCloseFocusLost
        btn_UpdateDealerClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateDealerCloseFocusLost

    private void btn_UpdateDealerCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateDealerCloseMouseEntered
        btn_UpdateDealerClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateDealerCloseMouseEntered

    private void btn_UpdateDealerCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateDealerCloseMouseExited
        btn_UpdateDealerClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateDealerCloseMouseExited

    private void btn_UpdateDealerCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateDealerCloseActionPerformed
        this.dispose();
        DealerPnl_1stLayer.tbl_DealerAccounts.clearSelection();
    }//GEN-LAST:event_btn_UpdateDealerCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Dealer_UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dealer_UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dealer_UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dealer_UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dealer_UpdateAccount dialog = new Dealer_UpdateAccount(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_UpdateDealerClear;
    protected static javax.swing.JButton btn_UpdateDealerClose;
    protected static javax.swing.JButton btn_UpdateDealerRegister;
    protected static javax.swing.JButton btn_UpdateDealerView;
    protected static javax.swing.JComboBox<String> cbo_UpdateDealerCivil;
    protected static javax.swing.JComboBox<String> cbo_UpdateDealerDueDate;
    protected static javax.swing.JComboBox<String> cbo_UpdateDealerGender;
    protected static org.jdesktop.swingx.JXDatePicker date_UpdateDealerBirthday;
    protected static org.jdesktop.swingx.JXDatePicker date_UpdateDealerRegDate;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JScrollPane jScrollPane9;
    protected static javax.swing.JLabel lbl_NewDealerACLine;
    protected static javax.swing.JLabel lbl_NewDealerAddress;
    protected static javax.swing.JLabel lbl_NewDealerBDay;
    protected static javax.swing.JLabel lbl_NewDealerCLine;
    protected static javax.swing.JLabel lbl_NewDealerContact;
    protected static javax.swing.JLabel lbl_NewDealerDiscount;
    protected static javax.swing.JLabel lbl_NewDealerDueDate;
    protected static javax.swing.JLabel lbl_NewDealerDueDate1;
    protected static javax.swing.JLabel lbl_NewDealerEmail;
    protected static javax.swing.JLabel lbl_NewDealerFName;
    protected static javax.swing.JLabel lbl_NewDealerGender;
    protected static javax.swing.JLabel lbl_NewDealerID;
    protected static javax.swing.JLabel lbl_NewDealerLName;
    protected static javax.swing.JLabel lbl_NewDealerMName;
    protected static javax.swing.JLabel lbl_NewDealerNationality;
    protected static javax.swing.JLabel lbl_NewDealerOccupation;
    protected static javax.swing.JLabel lbl_NewDealerRegDate;
    protected static javax.swing.JLabel lbl_NewDealerReturn;
    protected static javax.swing.JLabel lbl_NewDealerSponsor;
    protected static javax.swing.JLabel lbl_NewDealerStatus;
    private javax.swing.JLabel lbl_note2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnl_NewUserContact4;
    private javax.swing.JPanel pnl_NewUserPersonal4;
    protected static javax.swing.JTable tbl_UpdateDealerDiscount;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_UpdateDealerACLine;
    protected static javax.swing.JTextField txt_UpdateDealerAddress;
    protected static javax.swing.JTextField txt_UpdateDealerContact;
    protected static javax.swing.JTextField txt_UpdateDealerCredit;
    protected static javax.swing.JTextField txt_UpdateDealerEmail;
    protected static javax.swing.JTextField txt_UpdateDealerFName;
    protected static javax.swing.JTextField txt_UpdateDealerID;
    protected static javax.swing.JTextField txt_UpdateDealerLName;
    protected static javax.swing.JTextField txt_UpdateDealerMName;
    protected static javax.swing.JTextField txt_UpdateDealerMaxReturn;
    protected static javax.swing.JTextField txt_UpdateDealerNationality;
    protected static javax.swing.JTextField txt_UpdateDealerOccupation;
    protected static javax.swing.JTextField txt_UpdateDealerSponsor;
    // End of variables declaration//GEN-END:variables
}
