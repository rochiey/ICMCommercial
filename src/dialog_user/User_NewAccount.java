package dialog_user;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import user.UserPnl_1stLayer;

public class User_NewAccount extends javax.swing.JDialog {

    User_ButtonFunctions button = new User_ButtonFunctions();
    int xMouse, yMouse;
    
    public User_NewAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        lbl_newUserID = new javax.swing.JLabel();
        txt_NewUserID = new javax.swing.JTextField();
        lbl_newUserRegDate = new javax.swing.JLabel();
        date_NewUserRegDate = new org.jdesktop.swingx.JXDatePicker();
        lbl_newUserType = new javax.swing.JLabel();
        lbl_newUserName = new javax.swing.JLabel();
        lbl_newUserPass = new javax.swing.JLabel();
        lbl_newUserConPass = new javax.swing.JLabel();
        cbo_NewUserType = new javax.swing.JComboBox<>();
        txt_NewUserPassword = new javax.swing.JPasswordField();
        txt_NewUsername = new javax.swing.JTextField();
        txt_NewUserConPassword = new javax.swing.JPasswordField();
        pnl_NewUserPersonal4 = new javax.swing.JPanel();
        lbl_newUserFName = new javax.swing.JLabel();
        txt_NewUserFName = new javax.swing.JTextField();
        lbl_newUserLName = new javax.swing.JLabel();
        txt_NewUserLName = new javax.swing.JTextField();
        lbl_newUserBDay = new javax.swing.JLabel();
        cbo_NewUserCivil = new javax.swing.JComboBox<>();
        lbl_NewDealerMName = new javax.swing.JLabel();
        txt_NewUserMName = new javax.swing.JTextField();
        lbl_newUserGender = new javax.swing.JLabel();
        cbo_NewUserGender = new javax.swing.JComboBox<>();
        lbl_newUserStatus = new javax.swing.JLabel();
        lbl_newUserNationality3 = new javax.swing.JLabel();
        txt_NewUserNationality = new javax.swing.JTextField();
        date_NewUserBirthday = new org.jdesktop.swingx.JXDatePicker();
        lbl_NewDealerOccupation = new javax.swing.JLabel();
        txt_NewUserOccupation = new javax.swing.JTextField();
        pnl_NewUserContact4 = new javax.swing.JPanel();
        lbl_newUserAddress = new javax.swing.JLabel();
        lbl_NewDealerEmail = new javax.swing.JLabel();
        lbl_newUserCel = new javax.swing.JLabel();
        txt_NewUserEmail = new javax.swing.JTextField();
        txt_NewUserAddress = new javax.swing.JTextField();
        txt_NewUserContact = new javax.swing.JTextField();
        lbl_note2 = new javax.swing.JLabel();
        btn_NewUserRegister = new javax.swing.JButton();
        btn_NewUserClear = new javax.swing.JButton();
        btn_NewUserClose = new javax.swing.JButton();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_UserNAccount.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Account Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_newUserID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserID.setText("User ID: *");
        lbl_newUserID.setText("<html>User ID: <font color=red>*</font></html>");
        jPanel80.add(lbl_newUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, -1, -1));

        txt_NewUserID.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NewUserID.setText("1");
        txt_NewUserID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_NewUserID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_NewUserID.setEnabled(false);
        jPanel80.add(txt_NewUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 29, 77, 35));

        lbl_newUserRegDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserRegDate.setText("Registration Date: *");
        lbl_newUserRegDate.setText("<html>Registration Date: <font color=red>*</font></html>");
        jPanel80.add(lbl_newUserRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 29, -1, 33));

        date_NewUserRegDate.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel80.add(date_NewUserRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 29, 150, 35));
        date_NewUserRegDate.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_NewUserRegDate.setDate(newDealerRegDate);

        lbl_newUserType.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserType.setText("User Type: *");
        lbl_newUserType.setText("<html>User Type: <font color=red>*</font></html>");
        jPanel80.add(lbl_newUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, -1, -1));

        lbl_newUserName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserName.setText("Username: *");
        lbl_newUserName.setText("<html>Username: <font color=red>*</font></html>");
        jPanel80.add(lbl_newUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 68, -1, 33));

        lbl_newUserPass.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserPass.setText("Password: *");
        lbl_newUserPass.setText("<html>Password: <font color=red>*</font></html>");
        jPanel80.add(lbl_newUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 114, -1, -1));

        lbl_newUserConPass.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserConPass.setText("Confirm Password: *");
        lbl_newUserConPass.setText("<html>Confirm Password: <font color=red>*</font></html>");
        jPanel80.add(lbl_newUserConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 107, -1, 33));

        cbo_NewUserType.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_NewUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin Account", "User Account" }));
        jPanel80.add(cbo_NewUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 68, 150, 35));

        txt_NewUserPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel80.add(txt_NewUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 107, 150, 35));

        txt_NewUsername.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel80.add(txt_NewUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 68, 150, 35));

        txt_NewUserConPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel80.add(txt_NewUserConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 107, 150, 35));

        pnl_NewUserPersonal4.setBackground(new java.awt.Color(255, 255, 255));
        pnl_NewUserPersonal4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Personal Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_NewUserPersonal4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_newUserFName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserFName.setText("First Name: *");
        lbl_newUserFName.setText("<html>First Name: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, -1, -1));

        txt_NewUserFName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserFName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_NewUserFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 29, 150, 35));

        lbl_newUserLName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserLName.setText("Last Name: *");
        lbl_newUserLName.setText("<html>Last Name: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, -1, -1));

        txt_NewUserLName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserLName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_NewUserLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 68, 150, 35));

        lbl_newUserBDay.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserBDay.setText("Date of Birth: *");
        lbl_newUserBDay.setText("<html>Date of Birth: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserBDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 114, -1, -1));

        cbo_NewUserCivil.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_NewUserCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widow/Widower", "Divorce" }));
        pnl_NewUserPersonal4.add(cbo_NewUserCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 107, 150, 35));

        lbl_NewDealerMName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerMName.setText("Middle Name:");
        //lbl_newUserMName.setText("<html>Middle Name: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_NewDealerMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 36, -1, -1));

        txt_NewUserMName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserMName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_NewUserMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 29, 150, 35));

        lbl_newUserGender.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserGender.setText("Gender: *");
        lbl_newUserGender.setText("<html>Gender: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 75, -1, -1));

        cbo_NewUserGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_NewUserGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        pnl_NewUserPersonal4.add(cbo_NewUserGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 68, -1, 35));

        lbl_newUserStatus.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserStatus.setText("Civil Status: *");
        lbl_newUserStatus.setText("<html>Civil Status: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 114, -1, -1));

        lbl_newUserNationality3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserNationality3.setText("Nationality:");
        pnl_NewUserPersonal4.add(lbl_newUserNationality3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 153, -1, -1));

        txt_NewUserNationality.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserNationality.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_NewUserNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 146, 150, 35));

        date_NewUserBirthday.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        pnl_NewUserPersonal4.add(date_NewUserBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 107, 150, 35));
        date_NewUserBirthday.setFormats("yyyy-MM-dd");
        String newDealerDateValue = "2016-01-01";  // must be in (yyyy- mm- dd ) format
        Date newDealerBDay = null;
        try {
            newDealerBDay = new SimpleDateFormat("yyyy-mm-dd").parse(newDealerDateValue);
        } catch (ParseException ex) {
            //Logger.getLogger(ICMSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        date_NewUserBirthday.setDate(newDealerBDay);

        lbl_NewDealerOccupation.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerOccupation.setText("Occupation:");
        lbl_newUserStatus.setText("<html>Civil Status: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_NewDealerOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 153, -1, -1));

        txt_NewUserOccupation.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserOccupation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_NewUserOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 146, 150, 35));

        pnl_NewUserContact4.setBackground(new java.awt.Color(255, 255, 255));
        pnl_NewUserContact4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Contact Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_NewUserContact4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_newUserAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserAddress.setText("Address: *");
        lbl_newUserAddress.setText("<html>Address: <font color=red>*</font></html>");
        pnl_NewUserContact4.add(lbl_newUserAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 37, -1, -1));

        lbl_NewDealerEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerEmail.setText("Email Address:");
        pnl_NewUserContact4.add(lbl_NewDealerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 76, -1, -1));

        lbl_newUserCel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserCel.setText("Contact No. : *");
        lbl_newUserCel.setText("<html>Contact No. : <font color=red>*</font></html>");
        pnl_NewUserContact4.add(lbl_newUserCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 76, -1, -1));

        txt_NewUserEmail.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserContact4.add(txt_NewUserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 69, 210, 35));

        txt_NewUserAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserContact4.add(txt_NewUserAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 30, 476, 35));

        txt_NewUserContact.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_NewUserContact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserContact4.add(txt_NewUserContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 69, 150, 35));

        lbl_note2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_note2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_note2.setText("Note: Please fill out the information that has * and the rest are optional.");
        lbl_note2.setText("<html><b>Note:</b> Please fill out the information that has <font color=red size=4>*</font> and the rest are optional.</html>");
        pnl_NewUserContact4.add(lbl_note2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 491, 30));

        btn_NewUserRegister.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewUserRegister.setText("Register");
        btn_NewUserRegister.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewUserRegisterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewUserRegisterFocusLost(evt);
            }
        });
        btn_NewUserRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewUserRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewUserRegisterMouseExited(evt);
            }
        });
        btn_NewUserRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewUserRegisterActionPerformed(evt);
            }
        });

        btn_NewUserClear.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewUserClear.setText("Clear");
        btn_NewUserClear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewUserClearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewUserClearFocusLost(evt);
            }
        });
        btn_NewUserClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewUserClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewUserClearMouseExited(evt);
            }
        });
        btn_NewUserClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewUserClearActionPerformed(evt);
            }
        });

        btn_NewUserClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_NewUserClose.setText("Close");
        btn_NewUserClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_NewUserCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_NewUserCloseFocusLost(evt);
            }
        });
        btn_NewUserClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewUserCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewUserCloseMouseExited(evt);
            }
        });
        btn_NewUserClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewUserCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_NewUserRegister)
                        .addGap(0, 0, 0)
                        .addComponent(btn_NewUserClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_NewUserClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_NewUserContact4, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addComponent(pnl_NewUserPersonal4, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_NewUserClear, btn_NewUserClose, btn_NewUserRegister});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_NewUserPersonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_NewUserContact4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NewUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewUserClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewUserClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_NewUserClear, btn_NewUserClose, btn_NewUserRegister});

        btn_NewUserRegister.registerKeyboardAction(btn_NewUserRegister.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_NewUserRegister.registerKeyboardAction(btn_NewUserRegister.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_NewUserClear.registerKeyboardAction(btn_NewUserClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_NewUserClear.registerKeyboardAction(btn_NewUserClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_NewUserClose.registerKeyboardAction(btn_NewUserClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_NewUserClose.registerKeyboardAction(btn_NewUserClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_NewUserRegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewUserRegisterFocusGained
        btn_NewUserRegister.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewUserRegisterFocusGained

    private void btn_NewUserRegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewUserRegisterFocusLost
        btn_NewUserRegister.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewUserRegisterFocusLost

    private void btn_NewUserRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewUserRegisterMouseEntered
        btn_NewUserRegister.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewUserRegisterMouseEntered

    private void btn_NewUserRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewUserRegisterMouseExited
        btn_NewUserRegister.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewUserRegisterMouseExited

    private void btn_NewUserRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewUserRegisterActionPerformed
        button.userNewAccount();
        if(User_ButtonFunctions.successEx > 0) this.dispose();
        UserPnl_1stLayer.updateTable();
    }//GEN-LAST:event_btn_NewUserRegisterActionPerformed

    private void btn_NewUserClearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewUserClearFocusGained
        btn_NewUserClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewUserClearFocusGained

    private void btn_NewUserClearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewUserClearFocusLost
        btn_NewUserClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewUserClearFocusLost

    private void btn_NewUserClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewUserClearMouseEntered
        btn_NewUserClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewUserClearMouseEntered

    private void btn_NewUserClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewUserClearMouseExited
        btn_NewUserClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewUserClearMouseExited

    private void btn_NewUserClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewUserClearActionPerformed
        button.userClearNewAccount();
    }//GEN-LAST:event_btn_NewUserClearActionPerformed

    private void btn_NewUserCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewUserCloseFocusGained
        btn_NewUserClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewUserCloseFocusGained

    private void btn_NewUserCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_NewUserCloseFocusLost
        btn_NewUserClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewUserCloseFocusLost

    private void btn_NewUserCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewUserCloseMouseEntered
        btn_NewUserClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_NewUserCloseMouseEntered

    private void btn_NewUserCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewUserCloseMouseExited
        btn_NewUserClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_NewUserCloseMouseExited

    private void btn_NewUserCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewUserCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_NewUserCloseActionPerformed

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
            java.util.logging.Logger.getLogger(User_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User_NewAccount dialog = new User_NewAccount(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_NewUserClear;
    protected static javax.swing.JButton btn_NewUserClose;
    protected static javax.swing.JButton btn_NewUserRegister;
    protected static javax.swing.JComboBox<String> cbo_NewUserCivil;
    protected static javax.swing.JComboBox<String> cbo_NewUserGender;
    protected static javax.swing.JComboBox<String> cbo_NewUserType;
    protected static org.jdesktop.swingx.JXDatePicker date_NewUserBirthday;
    protected static org.jdesktop.swingx.JXDatePicker date_NewUserRegDate;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel80;
    protected static javax.swing.JLabel lbl_NewDealerEmail;
    protected static javax.swing.JLabel lbl_NewDealerMName;
    protected static javax.swing.JLabel lbl_NewDealerOccupation;
    protected static javax.swing.JLabel lbl_newUserAddress;
    protected static javax.swing.JLabel lbl_newUserBDay;
    protected static javax.swing.JLabel lbl_newUserCel;
    protected static javax.swing.JLabel lbl_newUserConPass;
    protected static javax.swing.JLabel lbl_newUserFName;
    protected static javax.swing.JLabel lbl_newUserGender;
    protected static javax.swing.JLabel lbl_newUserID;
    protected static javax.swing.JLabel lbl_newUserLName;
    protected static javax.swing.JLabel lbl_newUserName;
    protected static javax.swing.JLabel lbl_newUserNationality3;
    protected static javax.swing.JLabel lbl_newUserPass;
    protected static javax.swing.JLabel lbl_newUserRegDate;
    protected static javax.swing.JLabel lbl_newUserStatus;
    protected static javax.swing.JLabel lbl_newUserType;
    private javax.swing.JLabel lbl_note2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnl_NewUserContact4;
    private javax.swing.JPanel pnl_NewUserPersonal4;
    private javax.swing.JLabel text;
    protected static javax.swing.JTextField txt_NewUserAddress;
    protected static javax.swing.JPasswordField txt_NewUserConPassword;
    protected static javax.swing.JTextField txt_NewUserContact;
    protected static javax.swing.JTextField txt_NewUserEmail;
    protected static javax.swing.JTextField txt_NewUserFName;
    protected static javax.swing.JTextField txt_NewUserID;
    protected static javax.swing.JTextField txt_NewUserLName;
    protected static javax.swing.JTextField txt_NewUserMName;
    protected static javax.swing.JTextField txt_NewUserNationality;
    protected static javax.swing.JTextField txt_NewUserOccupation;
    protected static javax.swing.JPasswordField txt_NewUserPassword;
    protected static javax.swing.JTextField txt_NewUsername;
    // End of variables declaration//GEN-END:variables
}
