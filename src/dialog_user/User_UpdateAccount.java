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

public class User_UpdateAccount extends javax.swing.JDialog {

    User_ButtonFunctions button = new User_ButtonFunctions();
    int xMouse, yMouse;
    
    public User_UpdateAccount(java.awt.Frame parent, boolean modal) {
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
        txt_UpdateUserID = new javax.swing.JTextField();
        lbl_newUserRegDate = new javax.swing.JLabel();
        date_UpdateUserRegDate = new org.jdesktop.swingx.JXDatePicker();
        lbl_newUserType = new javax.swing.JLabel();
        lbl_newUserName = new javax.swing.JLabel();
        lbl_newUserPass = new javax.swing.JLabel();
        lbl_newUserConPass = new javax.swing.JLabel();
        cbo_UpdateUserType = new javax.swing.JComboBox<>();
        txt_UpdateUserPassword = new javax.swing.JPasswordField();
        txt_UpdateUsername = new javax.swing.JTextField();
        txt_UpdateUserConPassword = new javax.swing.JPasswordField();
        pnl_NewUserPersonal4 = new javax.swing.JPanel();
        lbl_newUserFName = new javax.swing.JLabel();
        txt_UpdateUserFName = new javax.swing.JTextField();
        lbl_newUserLName = new javax.swing.JLabel();
        txt_UpdateUserLName = new javax.swing.JTextField();
        lbl_newUserBDay = new javax.swing.JLabel();
        cbo_UpdateUserCivil = new javax.swing.JComboBox<>();
        lbl_NewDealerMName = new javax.swing.JLabel();
        txt_UpdateUserMName = new javax.swing.JTextField();
        lbl_newUserGender = new javax.swing.JLabel();
        cbo_UpdateUserGender = new javax.swing.JComboBox<>();
        lbl_newUserStatus = new javax.swing.JLabel();
        lbl_newUserNationality3 = new javax.swing.JLabel();
        txt_UpdateUserNationality = new javax.swing.JTextField();
        date_UpdateUserBirthday = new org.jdesktop.swingx.JXDatePicker();
        lbl_NewDealerOccupation = new javax.swing.JLabel();
        txt_UpdateUserOccupation = new javax.swing.JTextField();
        pnl_NewUserContact4 = new javax.swing.JPanel();
        lbl_newUserAddress = new javax.swing.JLabel();
        lbl_NewDealerEmail = new javax.swing.JLabel();
        lbl_newUserCel = new javax.swing.JLabel();
        txt_UpdateUserEmail = new javax.swing.JTextField();
        txt_UpdateUserAddress = new javax.swing.JTextField();
        txt_UpdateUserContact = new javax.swing.JTextField();
        lbl_note2 = new javax.swing.JLabel();
        btn_UpdateUserRegister = new javax.swing.JButton();
        btn_UpdateUserClear = new javax.swing.JButton();
        btn_UpdateUserClose = new javax.swing.JButton();

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

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_UserUAccount.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Account Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_newUserID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserID.setText("User ID: *");
        lbl_newUserID.setText("<html>User ID: <font color=red>*</font></html>");
        jPanel80.add(lbl_newUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, -1, -1));

        txt_UpdateUserID.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_UpdateUserID.setText("1");
        txt_UpdateUserID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_UpdateUserID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_UpdateUserID.setEnabled(false);
        jPanel80.add(txt_UpdateUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 29, 77, 35));

        lbl_newUserRegDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserRegDate.setText("Registration Date: *");
        lbl_newUserRegDate.setText("<html>Registration Date: <font color=red>*</font></html>");
        jPanel80.add(lbl_newUserRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 29, -1, 33));

        date_UpdateUserRegDate.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel80.add(date_UpdateUserRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 29, 150, 35));
        date_UpdateUserRegDate.setFormats("yyyy-MM-dd");
        Date newDealerRegDate = new Date();
        date_UpdateUserRegDate.setDate(newDealerRegDate);

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

        cbo_UpdateUserType.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_UpdateUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin Account", "User Account" }));
        jPanel80.add(cbo_UpdateUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 68, 150, 35));

        txt_UpdateUserPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel80.add(txt_UpdateUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 107, 150, 35));

        txt_UpdateUsername.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel80.add(txt_UpdateUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 68, 150, 35));

        txt_UpdateUserConPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jPanel80.add(txt_UpdateUserConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 107, 150, 35));

        pnl_NewUserPersonal4.setBackground(new java.awt.Color(255, 255, 255));
        pnl_NewUserPersonal4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "[ Personal Information ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_NewUserPersonal4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_newUserFName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserFName.setText("First Name: *");
        lbl_newUserFName.setText("<html>First Name: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, -1, -1));

        txt_UpdateUserFName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserFName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_UpdateUserFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 29, 150, 35));

        lbl_newUserLName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserLName.setText("Last Name: *");
        lbl_newUserLName.setText("<html>Last Name: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, -1, -1));

        txt_UpdateUserLName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserLName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_UpdateUserLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 68, 150, 35));

        lbl_newUserBDay.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserBDay.setText("Date of Birth: *");
        lbl_newUserBDay.setText("<html>Date of Birth: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserBDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 114, -1, -1));

        cbo_UpdateUserCivil.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_UpdateUserCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widow/Widower", "Divorce" }));
        pnl_NewUserPersonal4.add(cbo_UpdateUserCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 107, 150, 35));

        lbl_NewDealerMName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerMName.setText("Middle Name:");
        //lbl_newUserMName.setText("<html>Middle Name: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_NewDealerMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 36, -1, -1));

        txt_UpdateUserMName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserMName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_UpdateUserMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 29, 150, 35));

        lbl_newUserGender.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserGender.setText("Gender: *");
        lbl_newUserGender.setText("<html>Gender: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 75, -1, -1));

        cbo_UpdateUserGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_UpdateUserGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        pnl_NewUserPersonal4.add(cbo_UpdateUserGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 68, -1, 35));

        lbl_newUserStatus.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserStatus.setText("Civil Status: *");
        lbl_newUserStatus.setText("<html>Civil Status: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_newUserStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 114, -1, -1));

        lbl_newUserNationality3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_newUserNationality3.setText("Nationality:");
        pnl_NewUserPersonal4.add(lbl_newUserNationality3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 153, -1, -1));

        txt_UpdateUserNationality.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserNationality.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_UpdateUserNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 146, 150, 35));

        date_UpdateUserBirthday.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        pnl_NewUserPersonal4.add(date_UpdateUserBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 107, 150, 35));
        date_UpdateUserBirthday.setFormats("yyyy-MM-dd");
        String newDealerDateValue = "2016-01-01";  // must be in (yyyy- mm- dd ) format
        Date newDealerBDay = null;
        try {
            newDealerBDay = new SimpleDateFormat("yyyy-mm-dd").parse(newDealerDateValue);
        } catch (ParseException ex) {
            //Logger.getLogger(ICMSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        date_UpdateUserBirthday.setDate(newDealerBDay);

        lbl_NewDealerOccupation.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_NewDealerOccupation.setText("Occupation:");
        lbl_newUserStatus.setText("<html>Civil Status: <font color=red>*</font></html>");
        pnl_NewUserPersonal4.add(lbl_NewDealerOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 153, -1, -1));

        txt_UpdateUserOccupation.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserOccupation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserPersonal4.add(txt_UpdateUserOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 146, 150, 35));

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

        txt_UpdateUserEmail.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserContact4.add(txt_UpdateUserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 69, 210, 35));

        txt_UpdateUserAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserContact4.add(txt_UpdateUserAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 30, 476, 35));

        txt_UpdateUserContact.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_UpdateUserContact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_NewUserContact4.add(txt_UpdateUserContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 69, 150, 35));

        lbl_note2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_note2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_note2.setText("Note: Please fill out the information that has * and the rest are optional.");
        lbl_note2.setText("<html><b>Note:</b> Please fill out the information that has <font color=red size=4>*</font> and the rest are optional.</html>");
        pnl_NewUserContact4.add(lbl_note2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 491, 30));

        btn_UpdateUserRegister.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_UpdateUserRegister.setText("Update");
        btn_UpdateUserRegister.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateUserRegisterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateUserRegisterFocusLost(evt);
            }
        });
        btn_UpdateUserRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateUserRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateUserRegisterMouseExited(evt);
            }
        });
        btn_UpdateUserRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateUserRegisterActionPerformed(evt);
            }
        });

        btn_UpdateUserClear.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_UpdateUserClear.setText("Clear");
        btn_UpdateUserClear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateUserClearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateUserClearFocusLost(evt);
            }
        });
        btn_UpdateUserClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateUserClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateUserClearMouseExited(evt);
            }
        });
        btn_UpdateUserClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateUserClearActionPerformed(evt);
            }
        });

        btn_UpdateUserClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_UpdateUserClose.setText("Close");
        btn_UpdateUserClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_UpdateUserCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_UpdateUserCloseFocusLost(evt);
            }
        });
        btn_UpdateUserClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateUserCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateUserCloseMouseExited(evt);
            }
        });
        btn_UpdateUserClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateUserCloseActionPerformed(evt);
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
                        .addComponent(btn_UpdateUserRegister)
                        .addGap(0, 0, 0)
                        .addComponent(btn_UpdateUserClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_UpdateUserClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_NewUserContact4, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addComponent(pnl_NewUserPersonal4, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_UpdateUserClear, btn_UpdateUserClose, btn_UpdateUserRegister});

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
                    .addComponent(btn_UpdateUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UpdateUserClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UpdateUserClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_UpdateUserClear, btn_UpdateUserClose, btn_UpdateUserRegister});

        btn_UpdateUserRegister.registerKeyboardAction(btn_UpdateUserRegister.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_UpdateUserRegister.registerKeyboardAction(btn_UpdateUserRegister.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UpdateUserClear.registerKeyboardAction(btn_UpdateUserClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateUserClear.registerKeyboardAction(btn_UpdateUserClear.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_UpdateUserClose.registerKeyboardAction(btn_UpdateUserClose.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_UpdateUserClose.registerKeyboardAction(btn_UpdateUserClose.getActionForKeyStroke(
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

    private void btn_UpdateUserRegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateUserRegisterFocusGained
        btn_UpdateUserRegister.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateUserRegisterFocusGained

    private void btn_UpdateUserRegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateUserRegisterFocusLost
        btn_UpdateUserRegister.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateUserRegisterFocusLost

    private void btn_UpdateUserRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateUserRegisterMouseEntered
        btn_UpdateUserRegister.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateUserRegisterMouseEntered

    private void btn_UpdateUserRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateUserRegisterMouseExited
        btn_UpdateUserRegister.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateUserRegisterMouseExited

    private void btn_UpdateUserRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateUserRegisterActionPerformed
        button.userUpdateAccount();
        user.UserPnl_1stLayer.tbl_UserAccounts.clearSelection();
        this.dispose();
        UserPnl_1stLayer.updateTable();
    }//GEN-LAST:event_btn_UpdateUserRegisterActionPerformed

    private void btn_UpdateUserClearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateUserClearFocusGained
        btn_UpdateUserClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateUserClearFocusGained

    private void btn_UpdateUserClearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateUserClearFocusLost
        btn_UpdateUserClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateUserClearFocusLost

    private void btn_UpdateUserClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateUserClearMouseEntered
        btn_UpdateUserClear.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateUserClearMouseEntered

    private void btn_UpdateUserClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateUserClearMouseExited
        btn_UpdateUserClear.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateUserClearMouseExited

    private void btn_UpdateUserClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateUserClearActionPerformed
         button.userClearUpdateAccount();
    }//GEN-LAST:event_btn_UpdateUserClearActionPerformed

    private void btn_UpdateUserCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateUserCloseFocusGained
        btn_UpdateUserClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateUserCloseFocusGained

    private void btn_UpdateUserCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_UpdateUserCloseFocusLost
        btn_UpdateUserClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateUserCloseFocusLost

    private void btn_UpdateUserCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateUserCloseMouseEntered
        btn_UpdateUserClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_UpdateUserCloseMouseEntered

    private void btn_UpdateUserCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateUserCloseMouseExited
        btn_UpdateUserClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_UpdateUserCloseMouseExited

    private void btn_UpdateUserCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateUserCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_UpdateUserCloseActionPerformed

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
            java.util.logging.Logger.getLogger(User_UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User_UpdateAccount dialog = new User_UpdateAccount(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_UpdateUserClear;
    protected static javax.swing.JButton btn_UpdateUserClose;
    protected static javax.swing.JButton btn_UpdateUserRegister;
    protected static javax.swing.JComboBox<String> cbo_UpdateUserCivil;
    protected static javax.swing.JComboBox<String> cbo_UpdateUserGender;
    protected static javax.swing.JComboBox<String> cbo_UpdateUserType;
    protected static org.jdesktop.swingx.JXDatePicker date_UpdateUserBirthday;
    protected static org.jdesktop.swingx.JXDatePicker date_UpdateUserRegDate;
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
    protected static javax.swing.JTextField txt_UpdateUserAddress;
    protected static javax.swing.JPasswordField txt_UpdateUserConPassword;
    protected static javax.swing.JTextField txt_UpdateUserContact;
    protected static javax.swing.JTextField txt_UpdateUserEmail;
    protected static javax.swing.JTextField txt_UpdateUserFName;
    protected static javax.swing.JTextField txt_UpdateUserID;
    protected static javax.swing.JTextField txt_UpdateUserLName;
    protected static javax.swing.JTextField txt_UpdateUserMName;
    protected static javax.swing.JTextField txt_UpdateUserNationality;
    protected static javax.swing.JTextField txt_UpdateUserOccupation;
    protected static javax.swing.JPasswordField txt_UpdateUserPassword;
    protected static javax.swing.JTextField txt_UpdateUsername;
    // End of variables declaration//GEN-END:variables
}
