package report.DealerAccount;

import com.DatabaseLinker;
import dialog_dealer.Dealer_ButtonFunctions;
import dialog_dealer.Dealer_ViewAccount;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class CLTransact_Generate extends javax.swing.JDialog {
    
    DealerAccount_ButtonFunctions button = new DealerAccount_ButtonFunctions();
    int xMouse, yMouse;
    
    public CLTransact_Generate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioBtnGroup2 = new javax.swing.ButtonGroup();
        radioBtnGroup1 = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_GenerateCL = new javax.swing.JButton();
        btn_CloseCL = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        date_CLFrom = new org.jdesktop.swingx.JXDatePicker();
        jLabel153 = new javax.swing.JLabel();
        date_CLTo = new org.jdesktop.swingx.JXDatePicker();
        radio_CLIncoming = new javax.swing.JRadioButton();
        radio_CLCustom = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btn_CLView = new javax.swing.JButton();
        radio_CLAll = new javax.swing.JRadioButton();
        radio_CLDealer = new javax.swing.JRadioButton();
        txt_CLDealID = new javax.swing.JTextField();

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
        background.setMinimumSize(new java.awt.Dimension(350, 390));
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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_CLTransactions.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_GenerateCL.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_GenerateCL.setText("Generate");
        btn_GenerateCL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_GenerateCLFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_GenerateCLFocusLost(evt);
            }
        });
        btn_GenerateCL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GenerateCLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GenerateCLMouseExited(evt);
            }
        });
        btn_GenerateCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerateCLActionPerformed(evt);
            }
        });

        btn_CloseCL.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_CloseCL.setText("Close");
        btn_CloseCL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CloseCLFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CloseCLFocusLost(evt);
            }
        });
        btn_CloseCL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CloseCLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CloseCLMouseExited(evt);
            }
        });
        btn_CloseCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseCLActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Select Credit Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 15))); // NOI18N

        jLabel152.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel152.setText("From:");
        jLabel152.setEnabled(false);

        date_CLFrom.setEnabled(false);
        date_CLFrom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel153.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel153.setText("To:");
        jLabel153.setEnabled(false);

        date_CLTo.setEnabled(false);
        date_CLTo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        radioBtnGroup1.add(radio_CLIncoming);
        radio_CLIncoming.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_CLIncoming.setSelected(true);
        radio_CLIncoming.setText("Incoming Due Date");
        radio_CLIncoming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_CLIncomingActionPerformed(evt);
            }
        });

        radioBtnGroup1.add(radio_CLCustom);
        radio_CLCustom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_CLCustom.setText("Custom Date:");
        radio_CLCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_CLCustomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_CLCustom)
                    .addComponent(radio_CLIncoming)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel153)
                            .addComponent(jLabel152))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_CLFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_CLTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(radio_CLIncoming)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_CLCustom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(date_CLFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_CLTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel153))
                .addGap(6, 6, 6))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date_CLFrom, date_CLTo});

        date_CLFrom.setFormats("yyyy-MM-dd");
        Date inventoryExFrom = new Date();
        date_CLFrom.setDate(inventoryExFrom);
        date_CLTo.setFormats("yyyy-MM-dd");
        Date inventoryExTo = new Date();
        date_CLTo.setDate(inventoryExTo);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Select Dealer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 15))); // NOI18N

        btn_CLView.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_CLView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Dealer New View.png"))); // NOI18N
        btn_CLView.setEnabled(false);
        btn_CLView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_CLViewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_CLViewFocusLost(evt);
            }
        });
        btn_CLView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CLViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CLViewMouseExited(evt);
            }
        });
        btn_CLView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CLViewActionPerformed(evt);
            }
        });

        radioBtnGroup2.add(radio_CLAll);
        radio_CLAll.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_CLAll.setSelected(true);
        radio_CLAll.setText("All Dealers");
        radio_CLAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_CLAllActionPerformed(evt);
            }
        });

        radioBtnGroup2.add(radio_CLDealer);
        radio_CLDealer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_CLDealer.setText("By Dealer ID:");
        radio_CLDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_CLDealerActionPerformed(evt);
            }
        });

        txt_CLDealID.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_CLDealID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CLDealID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_CLDealID.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_CLAll)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radio_CLDealer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CLDealID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_CLView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(radio_CLAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radio_CLDealer)
                        .addComponent(txt_CLDealID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_CLView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_CLView, txt_CLDealID});

        btn_CLView.registerKeyboardAction(btn_CLView.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_CLView.registerKeyboardAction(btn_CLView.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(3, 3, 3)
            .addComponent(btn_GenerateCL)
            .addGap(0, 0, 0)
            .addComponent(btn_CloseCL, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_CloseCL, btn_GenerateCL});

    jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3});

    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_GenerateCL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_CloseCL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7))))
    );

    btn_GenerateCL.registerKeyboardAction(btn_GenerateCL.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_GenerateCL.registerKeyboardAction(btn_GenerateCL.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_CloseCL.registerKeyboardAction(btn_CloseCL.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_CloseCL.registerKeyboardAction(btn_CloseCL.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_GenerateCLFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateCLFocusGained
        btn_GenerateCL.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateCLFocusGained

    private void btn_GenerateCLFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_GenerateCLFocusLost
        btn_GenerateCL.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateCLFocusLost

    private void btn_GenerateCLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateCLMouseEntered
        btn_GenerateCL.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_GenerateCLMouseEntered

    private void btn_GenerateCLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GenerateCLMouseExited
        btn_GenerateCL.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_GenerateCLMouseExited

    private void btn_GenerateCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateCLActionPerformed
        this.dispose();
        if(radio_CLIncoming.isSelected() && radio_CLAll.isSelected()){
            DealerAccount_1stLayer.generateIncomingDue();
            DealerAccount_1stLayer.generateDueAndPenalty();
        }
        else if(radio_CLCustom.isSelected() && radio_CLAll.isSelected())
        {
            DatabaseLinker.updateTable(DealerAccount_1stLayer.tbl_OutstandingDetails, "SELECT invoice_ID AS 'SO No.',transaction_date AS 'Transaction Date',dealer_ID AS 'Dealer ID', total_net AS 'Total Net',amount AS 'Cash Paid',payment_type.payment_type_name AS 'Payment Type', due_date AS 'Due Date',DATEDIFF(due_date,CURDATE()) AS 'Days Left',penalty AS 'Penalty' FROM credit_transaction,payment_type WHERE paymentTypeID = payment_type.idpayment_type AND paymentTypeID = 243 AND due_date BETWEEN '"+date_CLFrom.getEditor().getText()+"' AND '"+date_CLTo.getEditor().getText()+"'");
            DealerAccount_1stLayer.generateDueAndPenalty();
        }
        else if(radio_CLIncoming.isSelected() && radio_CLDealer.isSelected()){
            DatabaseLinker.updateTable(DealerAccount_1stLayer.tbl_OutstandingDetails, "SELECT invoice_ID AS 'SO No.',transaction_date AS 'Transaction Date',dealer_ID AS 'Dealer ID', total_net AS 'Total Net',amount AS 'Cash Paid',payment_type.payment_type_name AS 'Payment Type', due_date AS 'Due Date',DATEDIFF(due_date,CURDATE()) AS 'Days Left',penalty AS 'Penalty' FROM credit_transaction,payment_type WHERE paymentTypeID = payment_type.idpayment_type AND paymentTypeID = 243 AND due_date BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 14 DAY) AND dealer_ID="+txt_CLDealID.getText());
            DealerAccount_1stLayer.generateDueAndPenalty();
        }
        else {
            DatabaseLinker.updateTable(DealerAccount_1stLayer.tbl_OutstandingDetails, "SELECT invoice_ID AS 'SO No.',transaction_date AS 'Transaction Date',dealer_ID AS 'Dealer ID', total_net AS 'Total Net',amount AS 'Cash Paid',payment_type.payment_type_name AS 'Payment Type', due_date AS 'Due Date',DATEDIFF(due_date,CURDATE()) AS 'Days Left',penalty AS 'Penalty' FROM credit_transaction,payment_type WHERE paymentTypeID = payment_type.idpayment_type AND paymentTypeID = 243 AND (due_date BETWEEN '"+date_CLFrom.getEditor().getText()+"' AND '"+date_CLTo.getEditor().getText()+"') AND dealer_ID="+txt_CLDealID.getText());
            DealerAccount_1stLayer.generateDueAndPenalty();
        }
        if(DealerAccount_1stLayer.tbl_OutstandingDetails.getRowCount() == 0) JOptionPane.showMessageDialog(null, "No due dates detected");
    }//GEN-LAST:event_btn_GenerateCLActionPerformed

    private void btn_CloseCLFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseCLFocusGained
        btn_CloseCL.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseCLFocusGained

    private void btn_CloseCLFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CloseCLFocusLost
        btn_CloseCL.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseCLFocusLost

    private void btn_CloseCLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseCLMouseEntered
        btn_CloseCL.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CloseCLMouseEntered

    private void btn_CloseCLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseCLMouseExited
        btn_CloseCL.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CloseCLMouseExited

    private void btn_CloseCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseCLActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CloseCLActionPerformed

    private void btn_CLViewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CLViewFocusGained
        btn_CLView.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CLViewFocusGained

    private void btn_CLViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_CLViewFocusLost
        btn_CLView.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CLViewFocusLost

    private void btn_CLViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CLViewMouseEntered
        btn_CLView.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_CLViewMouseEntered

    private void btn_CLViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CLViewMouseExited
        btn_CLView.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_CLViewMouseExited

    private void btn_CLViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CLViewActionPerformed
        Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
        Dealer_ViewAccount.flag=4;
        button.dealerViewAccount();
    }//GEN-LAST:event_btn_CLViewActionPerformed

    private void radio_CLAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_CLAllActionPerformed
        button.allSelectedCL();
    }//GEN-LAST:event_radio_CLAllActionPerformed

    private void radio_CLDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_CLDealerActionPerformed
       button.dealerSelectedCL();
    }//GEN-LAST:event_radio_CLDealerActionPerformed

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

    private void radio_CLIncomingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_CLIncomingActionPerformed
        button.IncomingSelectedCL();
    }//GEN-LAST:event_radio_CLIncomingActionPerformed

    private void radio_CLCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_CLCustomActionPerformed
        button.CustomSelectedCL();
    }//GEN-LAST:event_radio_CLCustomActionPerformed

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
            java.util.logging.Logger.getLogger(CLTransact_Generate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLTransact_Generate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLTransact_Generate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLTransact_Generate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CLTransact_Generate dialog = new CLTransact_Generate(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_CLView;
    protected static javax.swing.JButton btn_CloseCL;
    protected static javax.swing.JButton btn_GenerateCL;
    protected static org.jdesktop.swingx.JXDatePicker date_CLFrom;
    protected static org.jdesktop.swingx.JXDatePicker date_CLTo;
    private javax.swing.JLabel frameGrabber;
    protected static javax.swing.JLabel jLabel152;
    protected static javax.swing.JLabel jLabel153;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.ButtonGroup radioBtnGroup1;
    private javax.swing.ButtonGroup radioBtnGroup2;
    protected static javax.swing.JRadioButton radio_CLAll;
    protected static javax.swing.JRadioButton radio_CLCustom;
    protected static javax.swing.JRadioButton radio_CLDealer;
    protected static javax.swing.JRadioButton radio_CLIncoming;
    private javax.swing.JLabel text;
    public static javax.swing.JTextField txt_CLDealID;
    // End of variables declaration//GEN-END:variables
}
