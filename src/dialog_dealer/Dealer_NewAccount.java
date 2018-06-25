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

public class Dealer_NewAccount extends javax.swing.JDialog {

    Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
    int xMouse, yMouse;
    
    public Dealer_NewAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBounds(328, 7, 729, 737);
        
        tbl_NewDealerDiscount.setModel(Dealer_ButtonFunctions.populateSupplierDiscountTable("SELECT supplier_name AS 'Company',discount AS 'Discount' FROM supplier"));
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
        txt_NewDealerID = new javax.swing.JTextField();
        lbl_NewDealerRegDate = new javax.swing.JLabel();
        date_NewDealerRegDate = new org.jdesktop.swingx.JXDatePicker();
        lbl_NewDealerCLine = new javax.swing.JLabel();
        lbl_NewDealerReturn = new javax.swing.JLabel();
        lbl_NewDealerSponsor = new javax.swing.JLabel();
        lbl_NewDealerDiscount = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_NewDealerDiscount = new javax.swing.JTable();
        txt_NewDealerSponsor = new javax.swing.JTextField();
        txt_NewDealerCredit = new javax.swing.JTextField();
        txt_NewDealerMaxReturn = new javax.swing.JTextField();
        btn_NewDealerView = new javax.swing.JButton();
        lbl_NewDealerDueDate = new javax.swing.JLabel();
        cbo_NewDealerDueDate = new javax.swing.JComboBox<>();
        lbl_NewDealerDueDate1 = new javax.swing.JLabel();
        txt_NewDealerACLine = new javax.swing.JTextField();
        lbl_NewDealerACLine = new javax.swing.JLabel();
        pnl_NewUserPersonal4 = new javax.swing.JPanel();
        lbl_NewDealerFName = new javax.swing.JLabel();
        txt_NewDealerFName = new javax.swing.JTextField();
        lbl_NewDealerLName = new javax.swing.JLabel();
        txt_NewDealerLName = new javax.swing.JTextField();
        lbl_NewDealerBDay = new javax.swing.JLabel();
        cbo_NewDealerCivil = new javax.swing.JComboBox<>();
        lbl_NewDealerMName = new javax.swing.JLabel();
        txt_NewDealerMName = new javax.swing.JTextField();
        lbl_NewDealerGender = new javax.swing.JLabel();
        cbo_NewDealerGender = new javax.swing.JComboBox<>();
        lbl_NewDealerStatus = new javax.swing.JLabel();
        lbl_NewDealerNationality = new javax.swing.JLabel();
        txt_NewDealerNationality = new javax.swing.JTextField();
        date_NewDealerBirthday = new org.jdesktop.swingx.JXDatePicker();
        lbl_NewDealerOccupation = new javax.swing.JLabel();
        txt_NewDealerOccupation = new javax.swing.JTextField();
        pnl_NewUserContact4 = new javax.swing.JPanel();
        lbl_NewDealerAddress = new javax.swing.JLabel();
        lbl_NewDealerEmail = new javax.swing.JLabel();
        lbl_NewDealerContact = new javax.swing.JLabel();
        txt_NewDealerEmail = new javax.swing.JTextField();
        txt_NewDealerAddress = new javax.swing.JTextField();
        txt_NewDealerContact = new javax.swing.JTextField();
        lbl_note2 = new javax.swing.JLabel();
        btn_NewDealerRegister = new javax.swing.JButton();
        btn_NewDealerClear = new javax.swing.JButton();
        btn_NewDealerClose = new javax.swing.JButton();

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

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_DealerNAccount.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Account Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NewDealerID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerID.setText("Dealer ID: *");
        lbl_NewDealerID.setText("<html>Dealer ID: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, -1, -1));

        txt_NewDealerID.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewDealerID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NewDealerID.setText("1");
        txt_NewDealerID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_NewDealerID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_NewDealerID.setEnabled(false);
        jPanel80.add(txt_NewDealerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 85, 35));

        lbl_NewDealerRegDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerRegDate.setText("Registration Date: *");
        lbl_NewDealerRegDate.setText("<html>Registration Date: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 31, -1, -1));

        date_NewDealerRegDate.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel80.add(date_NewDealerRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 24, 150, 35));
        date_NewDealerRegDate.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_NewDealerRegDate.setDate(newDealerRegDate);

        lbl_NewDealerCLine.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerCLine.setText("Credit Line: *");
        lbl_NewDealerCLine.setText("<html>Credit Line: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerCLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_NewDealerReturn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerReturn.setText("Max Return Days: *");
        lbl_NewDealerReturn.setText("<html>Max Return Days: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 109, -1, -1));

        lbl_NewDealerSponsor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerSponsor.setText("Sponsor ID/Name: ");
        lbl_NewDealerSponsor.setText("<html>Sponsor ID/Name: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 109, -1, -1));

        lbl_NewDealerDiscount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerDiscount.setText("Discounts: *");
        lbl_NewDealerDiscount.setText("<html>Discounts: <font color=red>*</font></html>");
        jPanel80.add(lbl_NewDealerDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        tbl_NewDealerDiscount.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_NewDealerDiscount.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_NewDealerDiscount.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbl_NewDealerDiscount.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_NewDealerDiscount.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tbl_NewDealerDiscount);
        tbl_NewDealerDiscount.setBackground(Color.WHITE);
        tbl_NewDealerDiscount.setShowGrid(true);
        tbl_NewDealerDiscount.setRowHeight(26);
        tbl_NewDealerDiscount.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 13));

        DefaultTableCellRenderer newDealerCenterRenderer = new DefaultTableCellRenderer();
        newDealerCenterRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer)tbl_NewDealerDiscount.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        jPanel80.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 220, 157));

        txt_NewDealerSponsor.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewDealerSponsor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel80.add(txt_NewDealerSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 102, 150, 35));

        txt_NewDealerCredit.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewDealerCredit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NewDealerCredit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel80.add(txt_NewDealerCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, 85, 35));

        txt_NewDealerMaxReturn.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewDealerMaxReturn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NewDealerMaxReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel80.add(txt_NewDealerMaxReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 102, 85, 35));

        btn_NewDealerView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Dealer New View.png"))); // NOI18N
        btn_NewDealerView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewDealerViewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewDealerViewFocusLost(evt);
            }
        });
        btn_NewDealerView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewDealerViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewDealerViewMouseExited(evt);
            }
        });
        btn_NewDealerView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewDealerViewActionPerformed(evt);
            }
        });
        jPanel80.add(btn_NewDealerView, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 102, 37, 35));
        btn_NewDealerView.registerKeyboardAction(btn_NewDealerView.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_NewDealerView.registerKeyboardAction(btn_NewDealerView.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    lbl_NewDealerDueDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerDueDate.setText("Due Date: *");
    lbl_NewDealerDueDate.setText("<html>Due Date:  <font color=red>*</font></html>");
    jPanel80.add(lbl_NewDealerDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 150, -1, -1));

    cbo_NewDealerDueDate.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    cbo_NewDealerDueDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "37", "45", "52" }));
    jPanel80.add(cbo_NewDealerDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 141, 65, 35));

    lbl_NewDealerDueDate1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerDueDate1.setText("days");
    jPanel80.add(lbl_NewDealerDueDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 150, -1, -1));

    txt_NewDealerACLine.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerACLine.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    jPanel80.add(txt_NewDealerACLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 63, 150, 35));

    lbl_NewDealerACLine.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerACLine.setText("Availbale Credit Line: *");
    lbl_NewDealerACLine.setText("<html>Available Credit Line: <font color=red>*</font></html>");
    jPanel80.add(lbl_NewDealerACLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

    pnl_NewUserPersonal4.setBackground(new java.awt.Color(255, 255, 255));
    pnl_NewUserPersonal4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Personal Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
    pnl_NewUserPersonal4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbl_NewDealerFName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerFName.setText("First Name: *");
    lbl_NewDealerFName.setText("<html>First Name: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, -1, -1));

    txt_NewDealerFName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerFName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_NewDealerFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 150, 35));

    lbl_NewDealerLName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerLName.setText("Last Name: *");
    lbl_NewDealerLName.setText("<html>Last Name: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

    txt_NewDealerLName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerLName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_NewDealerLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, 150, 35));

    lbl_NewDealerBDay.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerBDay.setText("Date of Birth: *");
    lbl_NewDealerBDay.setText("<html>Date of Birth: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerBDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 109, -1, -1));

    cbo_NewDealerCivil.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    cbo_NewDealerCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widow/Widower", "Divorce" }));
    pnl_NewUserPersonal4.add(cbo_NewDealerCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 102, 150, 35));

    lbl_NewDealerMName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerMName.setText("Middle Name:");
    //lbl_newUserMName.setText("<html>Middle Name: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 31, -1, -1));

    txt_NewDealerMName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerMName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_NewDealerMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 24, 150, 35));

    lbl_NewDealerGender.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerGender.setText("Gender: *");
    lbl_NewDealerGender.setText("<html>Gender: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 70, -1, -1));

    cbo_NewDealerGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    cbo_NewDealerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
    pnl_NewUserPersonal4.add(cbo_NewDealerGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 63, -1, 35));

    lbl_NewDealerStatus.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerStatus.setText("Civil Status: *");
    lbl_NewDealerStatus.setText("<html>Civil Status: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 109, -1, -1));

    lbl_NewDealerNationality.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerNationality.setText("Nationality:");
    pnl_NewUserPersonal4.add(lbl_NewDealerNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 148, -1, -1));

    txt_NewDealerNationality.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerNationality.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_NewDealerNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 141, 150, 35));

    date_NewDealerBirthday.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    pnl_NewUserPersonal4.add(date_NewDealerBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 102, 150, 35));
    date_NewDealerBirthday.setFormats("yyyy-MM-dd");
    String newDealerDateValue = "2016-01-01";  // must be in (yyyy- mm- dd ) format
    Date newDealerBDay = null;
    try {
        newDealerBDay = new SimpleDateFormat("yyyy-mm-dd").parse(newDealerDateValue);
    } catch (ParseException ex) {
        //Logger.getLogger(ICMSystem.class.getName()).log(Level.SEVERE, null, ex);
    }
    date_NewDealerBirthday.setDate(newDealerBDay);

    lbl_NewDealerOccupation.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
    lbl_NewDealerOccupation.setText("Occupation:");
    lbl_NewDealerStatus.setText("<html>Civil Status: <font color=red>*</font></html>");
    pnl_NewUserPersonal4.add(lbl_NewDealerOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 148, -1, -1));

    txt_NewDealerOccupation.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerOccupation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserPersonal4.add(txt_NewDealerOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 141, 150, 35));

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

    txt_NewDealerEmail.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserContact4.add(txt_NewDealerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, 210, 35));

    txt_NewDealerAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserContact4.add(txt_NewDealerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 476, 35));

    txt_NewDealerContact.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
    txt_NewDealerContact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    pnl_NewUserContact4.add(txt_NewDealerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 63, 150, 35));

    lbl_note2.setBackground(new java.awt.Color(255, 255, 255));
    lbl_note2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    lbl_note2.setText("Note: Please fill out the information that has * and the rest are optional.");
    lbl_note2.setText("<html><b>Note:</b> Please fill out the information that has <font color=red size=4>*</font> and the rest are optional.</html>");
    pnl_NewUserContact4.add(lbl_note2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 107, 491, 30));

    btn_NewDealerRegister.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_NewDealerRegister.setText("Register");
    btn_NewDealerRegister.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_NewDealerRegisterFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_NewDealerRegisterFocusLost(evt);
        }
    });
    btn_NewDealerRegister.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_NewDealerRegisterMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_NewDealerRegisterMouseExited(evt);
        }
    });
    btn_NewDealerRegister.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_NewDealerRegisterActionPerformed(evt);
        }
    });

    btn_NewDealerClear.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_NewDealerClear.setText("Clear");
    btn_NewDealerClear.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_NewDealerClearFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_NewDealerClearFocusLost(evt);
        }
    });
    btn_NewDealerClear.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_NewDealerClearMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_NewDealerClearMouseExited(evt);
        }
    });
    btn_NewDealerClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_NewDealerClearActionPerformed(evt);
        }
    });

    btn_NewDealerClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btn_NewDealerClose.setText("Close");
    btn_NewDealerClose.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            btn_NewDealerCloseFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            btn_NewDealerCloseFocusLost(evt);
        }
    });
    btn_NewDealerClose.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn_NewDealerCloseMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn_NewDealerCloseMouseExited(evt);
        }
    });
    btn_NewDealerClose.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_NewDealerCloseActionPerformed(evt);
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
                    .addComponent(btn_NewDealerRegister)
                    .addGap(0, 0, 0)
                    .addComponent(btn_NewDealerClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(btn_NewDealerClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_NewUserContact4, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_NewUserPersonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(6, 6, 6))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_NewDealerClear, btn_NewDealerClose, btn_NewDealerRegister});

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
                .addComponent(btn_NewDealerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_NewDealerClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_NewDealerClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(6, 6, 6))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_NewDealerClear, btn_NewDealerClose, btn_NewDealerRegister});

    btn_NewDealerRegister.registerKeyboardAction(btn_NewDealerRegister.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_NewDealerRegister.registerKeyboardAction(btn_NewDealerRegister.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_NewDealerClear.registerKeyboardAction(btn_NewDealerClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_NewDealerClear.registerKeyboardAction(btn_NewDealerClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_NewDealerClose.registerKeyboardAction(btn_NewDealerClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_NewDealerClose.registerKeyboardAction(btn_NewDealerClose.getActionForKeyStroke(
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
        .addGroup(layout.createSequentialGroup()
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
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

    private void btn_NewDealerViewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewDealerViewFocusGained
        btn_NewDealerView.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewDealerViewFocusGained

    private void btn_NewDealerViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewDealerViewFocusLost
        btn_NewDealerView.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewDealerViewFocusLost

    private void btn_NewDealerViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewDealerViewMouseEntered
        btn_NewDealerView.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewDealerViewMouseEntered

    private void btn_NewDealerViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewDealerViewMouseExited
        btn_NewDealerView.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewDealerViewMouseExited

    private void btn_NewDealerViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewDealerViewActionPerformed
        button.dealerViewAccount();
    }//GEN-LAST:event_btn_NewDealerViewActionPerformed

    private void btn_NewDealerRegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewDealerRegisterFocusGained
        btn_NewDealerRegister.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewDealerRegisterFocusGained

    private void btn_NewDealerRegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewDealerRegisterFocusLost
        btn_NewDealerRegister.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewDealerRegisterFocusLost

    private void btn_NewDealerRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewDealerRegisterMouseEntered
        btn_NewDealerRegister.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewDealerRegisterMouseEntered

    private void btn_NewDealerRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewDealerRegisterMouseExited
        btn_NewDealerRegister.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewDealerRegisterMouseExited

    private void btn_NewDealerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewDealerRegisterActionPerformed
        button.dealerNewAccount();
        if(Dealer_ButtonFunctions.successEx > 0 )this.dispose();
        DealerPnl_1stLayer.updateTable();
    }//GEN-LAST:event_btn_NewDealerRegisterActionPerformed

    private void btn_NewDealerClearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewDealerClearFocusGained
        btn_NewDealerClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewDealerClearFocusGained

    private void btn_NewDealerClearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewDealerClearFocusLost
        btn_NewDealerClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewDealerClearFocusLost

    private void btn_NewDealerClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewDealerClearMouseEntered
        btn_NewDealerClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewDealerClearMouseEntered

    private void btn_NewDealerClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewDealerClearMouseExited
        btn_NewDealerClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewDealerClearMouseExited

    private void btn_NewDealerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewDealerClearActionPerformed
        button.dealerClearNewAccount();
    }//GEN-LAST:event_btn_NewDealerClearActionPerformed

    private void btn_NewDealerCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewDealerCloseFocusGained
        btn_NewDealerClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewDealerCloseFocusGained

    private void btn_NewDealerCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewDealerCloseFocusLost
        btn_NewDealerClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewDealerCloseFocusLost

    private void btn_NewDealerCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewDealerCloseMouseEntered
        btn_NewDealerClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewDealerCloseMouseEntered

    private void btn_NewDealerCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewDealerCloseMouseExited
        btn_NewDealerClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewDealerCloseMouseExited

    private void btn_NewDealerCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewDealerCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_NewDealerCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Dealer_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dealer_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dealer_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dealer_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dealer_NewAccount dialog = new Dealer_NewAccount(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_NewDealerClear;
    protected static javax.swing.JButton btn_NewDealerClose;
    protected static javax.swing.JButton btn_NewDealerRegister;
    protected static javax.swing.JButton btn_NewDealerView;
    protected static javax.swing.JComboBox<String> cbo_NewDealerCivil;
    public static javax.swing.JComboBox<String> cbo_NewDealerDueDate;
    protected static javax.swing.JComboBox<String> cbo_NewDealerGender;
    protected static org.jdesktop.swingx.JXDatePicker date_NewDealerBirthday;
    protected static org.jdesktop.swingx.JXDatePicker date_NewDealerRegDate;
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
    protected static javax.swing.JTable tbl_NewDealerDiscount;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_NewDealerACLine;
    protected static javax.swing.JTextField txt_NewDealerAddress;
    protected static javax.swing.JTextField txt_NewDealerContact;
    protected static javax.swing.JTextField txt_NewDealerCredit;
    protected static javax.swing.JTextField txt_NewDealerEmail;
    protected static javax.swing.JTextField txt_NewDealerFName;
    protected static javax.swing.JTextField txt_NewDealerID;
    protected static javax.swing.JTextField txt_NewDealerLName;
    protected static javax.swing.JTextField txt_NewDealerMName;
    protected static javax.swing.JTextField txt_NewDealerMaxReturn;
    protected static javax.swing.JTextField txt_NewDealerNationality;
    protected static javax.swing.JTextField txt_NewDealerOccupation;
    protected static javax.swing.JTextField txt_NewDealerSponsor;
    // End of variables declaration//GEN-END:variables
}
