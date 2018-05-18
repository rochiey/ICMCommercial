package dialog_salesOrder;

import com.DatabaseLinker;
import com.JTableFixer;
import static com.JTableFixer.setJTableColumnsWidth;
import dialog_dealer.Dealer_ButtonFunctions;
import dialog_dealer.Dealer_ViewAccount;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class SalesOrder_ReturnForm extends javax.swing.JDialog {

    SalesOrder_ButtonFunctions button = new SalesOrder_ButtonFunctions();
    int xMouse, yMouse;
    DatabaseLinker returnForm;
    public static String query="";
    public static int idwalkin=0;
    
    public SalesOrder_ReturnForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        idwalkin=0;
        iddealer=0;
        setJTable();
       // returnForm = new DatabaseLinker(tbl_ReturnList, query);
    }
    public static void updateTable()
    {
        DatabaseLinker.updateTable(tbl_ReturnList, query);
        setJTable();
    }
    public static int clickedID_onTable = 0;
    public static void tableclicked(java.awt.event.MouseEvent evt,javax.swing.JTable tbl_data)
    {
        if(evt.getClickCount() >= 1 )
        {
            int row = tbl_data.getSelectedRow();
            clickedID_onTable = (Integer) tbl_data.getModel().getValueAt(row, 0);
        }
    }
    public static int row = 0;
    public static void clickedRow(java.awt.event.MouseEvent evt,JTable tbl_data) 
    {
        if(evt.getClickCount() >= 1 )
        {
            row = tbl_data.getSelectedRow();
        }
    }
    public static void setJTable()
    {
        setJTableColumnsWidth(tbl_ReturnList, 769, 6, 6, 13, 6, 6, 6, 10, 10, 10);
        JTableFixer.setReturnFormTableField(tbl_ReturnList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        frameGrabber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_ReturnList = new javax.swing.JTable();
        lbl_ReturnCustomer = new javax.swing.JLabel();
        btn_ReturnClose = new javax.swing.JButton();
        cbo_ReturnCType = new javax.swing.JComboBox<>();
        lbl_NewDiscount1 = new javax.swing.JLabel();
        txt_ReturnCustName = new javax.swing.JTextField();
        btn_ReturnAccept = new javax.swing.JButton();
        btn_ReturnCName = new javax.swing.JButton();
        lbl_ReturnCustomer1 = new javax.swing.JLabel();
        txt_ReturnSONo = new javax.swing.JTextField();
        btn_ReturnSONo = new javax.swing.JButton();
        lbl_ReturnCustomer2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_SalesTotalNetAmount = new javax.swing.JLabel();
        lbl_ReturnSalesTotal = new javax.swing.JLabel();
        btn_ReturnEditQty = new javax.swing.JButton();
        cbo_ReturnReason = new javax.swing.JComboBox();

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
        background.add(frameGrabber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 38));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/Image_logo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, -1));

        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zImages/ImageText_SalesOrderReturn.png"))); // NOI18N
        background.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_ReturnList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tbl_ReturnList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SO No.", "Code", "Name", "Color", "Size", "Qty", "Price", "% Price", "Net"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ReturnList.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ReturnList.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbl_ReturnList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_ReturnListMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_ReturnList);
        tbl_ReturnList.setBackground(Color.WHITE);
        tbl_ReturnList.setRowHeight(27);
        tbl_ReturnList.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 15));
        ((DefaultTableCellRenderer)tbl_ReturnList.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tbl_ReturnList.setShowGrid(true);

        lbl_ReturnCustomer.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_ReturnCustomer.setText("Dealer ID/Name:");

        btn_ReturnClose.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ReturnClose.setText("Close");
        btn_ReturnClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnCloseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnCloseFocusLost(evt);
            }
        });
        btn_ReturnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnCloseMouseExited(evt);
            }
        });
        btn_ReturnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnCloseActionPerformed(evt);
            }
        });

        cbo_ReturnCType.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_ReturnCType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dealer", "Walk-in" }));
        cbo_ReturnCType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ReturnCTypeActionPerformed(evt);
            }
        });

        lbl_NewDiscount1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_NewDiscount1.setText("Customer Type:");

        txt_ReturnCustName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ReturnCustName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ReturnCustName.setEnabled(false);

        btn_ReturnAccept.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ReturnAccept.setText("Accept Return");
        btn_ReturnAccept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnAcceptFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnAcceptFocusLost(evt);
            }
        });
        btn_ReturnAccept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnAcceptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnAcceptMouseExited(evt);
            }
        });
        btn_ReturnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnAcceptActionPerformed(evt);
            }
        });

        btn_ReturnCName.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_ReturnCName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Dealer New View.png"))); // NOI18N
        btn_ReturnCName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnCNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnCNameFocusLost(evt);
            }
        });
        btn_ReturnCName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnCNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnCNameMouseExited(evt);
            }
        });
        btn_ReturnCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnCNameActionPerformed(evt);
            }
        });

        lbl_ReturnCustomer1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_ReturnCustomer1.setText("SO No.:");
        //lbl_ReturnCustomer1.setText("<html>SO No.: <font color=red>*</font></html>");

        txt_ReturnSONo.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txt_ReturnSONo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ReturnSONo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ReturnSONo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ReturnSONoActionPerformed(evt);
            }
        });

        btn_ReturnSONo.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        btn_ReturnSONo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zIcons/Dealer New View.png"))); // NOI18N
        btn_ReturnSONo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnSONoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnSONoFocusLost(evt);
            }
        });
        btn_ReturnSONo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnSONoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnSONoMouseExited(evt);
            }
        });
        btn_ReturnSONo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnSONoActionPerformed(evt);
            }
        });

        lbl_ReturnCustomer2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbl_ReturnCustomer2.setText("Return Reason:");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        txt_SalesTotalNetAmount.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txt_SalesTotalNetAmount.setForeground(new java.awt.Color(255, 255, 255));
        txt_SalesTotalNetAmount.setText("Total Net Refund:");

        lbl_ReturnSalesTotal.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_ReturnSalesTotal.setForeground(new java.awt.Color(0, 204, 0));
        lbl_ReturnSalesTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ReturnSalesTotal.setText("₱0.00");
        lbl_ReturnSalesTotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addComponent(txt_SalesTotalNetAmount)
                .addGap(0, 0, 0)
                .addComponent(lbl_ReturnSalesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ReturnSalesTotal)
                    .addComponent(txt_SalesTotalNetAmount))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_ReturnEditQty.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btn_ReturnEditQty.setText("Edit Quantity");
        btn_ReturnEditQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ReturnEditQtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_ReturnEditQtyFocusLost(evt);
            }
        });
        btn_ReturnEditQty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ReturnEditQtyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReturnEditQtyMouseExited(evt);
            }
        });
        btn_ReturnEditQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnEditQtyActionPerformed(evt);
            }
        });

        cbo_ReturnReason.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        cbo_ReturnReason.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Damaged", "Change Size", "Expired", "Other.." }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ReturnCustomer1)
                    .addComponent(lbl_NewDiscount1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbo_ReturnCType, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ReturnCustomer2)
                            .addComponent(lbl_ReturnCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_ReturnReason, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_ReturnCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_ReturnCName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_ReturnSONo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_ReturnSONo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ReturnAccept)
                        .addGap(0, 0, 0)
                        .addComponent(btn_ReturnEditQty)
                        .addGap(0, 0, 0)
                        .addComponent(btn_ReturnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_ReturnAccept, btn_ReturnClose, btn_ReturnEditQty});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_NewDiscount1)
                        .addComponent(cbo_ReturnCType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ReturnCustomer)
                        .addComponent(txt_ReturnCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_ReturnCName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ReturnSONo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ReturnSONo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ReturnCustomer1)
                        .addComponent(lbl_ReturnCustomer2)
                        .addComponent(cbo_ReturnReason, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ReturnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ReturnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ReturnEditQty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_ReturnAccept, btn_ReturnClose});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_ReturnSONo, cbo_ReturnCType, cbo_ReturnReason, txt_ReturnSONo});

        btn_ReturnCName.registerKeyboardAction(btn_ReturnCName.getActionForKeyStroke(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
        JComponent.WHEN_FOCUSED);

    btn_ReturnCName.registerKeyboardAction(btn_ReturnCName.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);
    btn_ReturnSONo.registerKeyboardAction(btn_ReturnSONo.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
    JComponent.WHEN_FOCUSED);

    btn_ReturnSONo.registerKeyboardAction(btn_ReturnSONo.getActionForKeyStroke(
        KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
    KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
    JComponent.WHEN_FOCUSED);

    background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 38, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_ReturnCloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnCloseFocusGained
        btn_ReturnClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnCloseFocusGained

    private void btn_ReturnCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnCloseFocusLost
        btn_ReturnClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnCloseFocusLost

    private void btn_ReturnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnCloseMouseEntered
        btn_ReturnClose.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnCloseMouseEntered

    private void btn_ReturnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnCloseMouseExited
        btn_ReturnClose.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnCloseMouseExited

    private void btn_ReturnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ReturnCloseActionPerformed

    private void cbo_ReturnCTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ReturnCTypeActionPerformed
        button.customerType();
    }//GEN-LAST:event_cbo_ReturnCTypeActionPerformed

    private void btn_ReturnAcceptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnAcceptFocusGained
        btn_ReturnAccept.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnAcceptFocusGained

    private void btn_ReturnAcceptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnAcceptFocusLost
        btn_ReturnAccept.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnAcceptFocusLost

    private void btn_ReturnAcceptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnAcceptMouseEntered
        btn_ReturnAccept.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnAcceptMouseEntered

    private void btn_ReturnAcceptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnAcceptMouseExited
        btn_ReturnAccept.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnAcceptMouseExited

    private void btn_ReturnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnAcceptActionPerformed
        button.returnAccept();
        this.dispose();
    }//GEN-LAST:event_btn_ReturnAcceptActionPerformed

    private void btn_ReturnCNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnCNameFocusGained
        btn_ReturnCName.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnCNameFocusGained

    private void btn_ReturnCNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnCNameFocusLost
        btn_ReturnCName.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnCNameFocusLost

    private void btn_ReturnCNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnCNameMouseEntered
        btn_ReturnCName.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnCNameMouseEntered

    private void btn_ReturnCNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnCNameMouseExited
        btn_ReturnCName.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnCNameMouseExited

    private void btn_ReturnCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnCNameActionPerformed
        Dealer_ButtonFunctions button = new Dealer_ButtonFunctions();
        Dealer_ViewAccount.flag = 3;
        button.dealerViewAccount();
    }//GEN-LAST:event_btn_ReturnCNameActionPerformed

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

    private void btn_ReturnSONoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnSONoFocusGained
        btn_ReturnSONo.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnSONoFocusGained

    private void btn_ReturnSONoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnSONoFocusLost
        btn_ReturnSONo.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnSONoFocusLost

    private void btn_ReturnSONoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnSONoMouseEntered
        btn_ReturnSONo.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnSONoMouseEntered

    private void btn_ReturnSONoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnSONoMouseExited
        btn_ReturnSONo.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnSONoMouseExited

    private void btn_ReturnSONoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnSONoActionPerformed
        button.SOHistory();
        SalesOrder_ReturnForm.txt_ReturnSONo.setText("");
    }//GEN-LAST:event_btn_ReturnSONoActionPerformed

    private void btn_ReturnEditQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnEditQtyFocusGained
        btn_ReturnEditQty.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnEditQtyFocusGained

    private void btn_ReturnEditQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ReturnEditQtyFocusLost
        btn_ReturnEditQty.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnEditQtyFocusLost

    private void btn_ReturnEditQtyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnEditQtyMouseEntered
        btn_ReturnEditQty.setBackground(Color.decode("#8fc6f8"));
    }//GEN-LAST:event_btn_ReturnEditQtyMouseEntered

    private void btn_ReturnEditQtyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnEditQtyMouseExited
        btn_ReturnEditQty.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btn_ReturnEditQtyMouseExited
    public static int iddealer=0;
    private void btn_ReturnEditQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnEditQtyActionPerformed
        if(clickedID_onTable > 0)button.ReturnEditForm();
        else JOptionPane.showMessageDialog(null, "No invoice selected please try again.");
    }//GEN-LAST:event_btn_ReturnEditQtyActionPerformed

    private void tbl_ReturnListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ReturnListMousePressed
        tableclicked(evt, tbl_ReturnList);
        clickedRow(evt, tbl_ReturnList);
    }//GEN-LAST:event_tbl_ReturnListMousePressed

    private void txt_ReturnSONoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ReturnSONoActionPerformed
        try
        {
            int trap =Integer.parseInt(txt_ReturnSONo.getText());
            DatabaseLinker.updateTable(tbl_ReturnList, "SELECT idinvoice AS 'SO No.',idproduct AS 'Code',item_name as 'Name'"
            + ", product_color.color_code AS 'Color',REPLACE(product.product_size, 'NULL', '-') AS 'Size'"
            + ",purchase_order_list.quantity AS 'Qty', unit_price AS 'Price'"
            + ", discounted_price AS '% Price',purchase_order_list.total_price AS 'Net' FROM purchase_order_list,product_color,product "
            + "WHERE product.product_color=product_color.idproduct_color "
            + "AND product.idproduct = purchase_order_list.item_code AND idinvoice="+trap);
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter correct SO No.");
        }
    }//GEN-LAST:event_txt_ReturnSONoActionPerformed

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
            java.util.logging.Logger.getLogger(SalesOrder_ReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrder_ReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SalesOrder_ReturnForm dialog = new SalesOrder_ReturnForm(new javax.swing.JFrame(), true);
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
    protected static javax.swing.JButton btn_ReturnAccept;
    protected static javax.swing.JButton btn_ReturnCName;
    protected static javax.swing.JButton btn_ReturnClose;
    protected static javax.swing.JButton btn_ReturnEditQty;
    protected static javax.swing.JButton btn_ReturnSONo;
    public static javax.swing.JComboBox<String> cbo_ReturnCType;
    public static javax.swing.JComboBox cbo_ReturnReason;
    private javax.swing.JLabel frameGrabber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    protected static javax.swing.JLabel lbl_NewDiscount1;
    protected static javax.swing.JLabel lbl_ReturnCustomer;
    protected static javax.swing.JLabel lbl_ReturnCustomer1;
    protected static javax.swing.JLabel lbl_ReturnCustomer2;
    public static javax.swing.JLabel lbl_ReturnSalesTotal;
    private javax.swing.JLabel logo;
    protected static javax.swing.JTable tbl_ReturnList;
    private javax.swing.JLabel text;
    public static javax.swing.JTextField txt_ReturnCustName;
    protected static javax.swing.JTextField txt_ReturnSONo;
    private javax.swing.JLabel txt_SalesTotalNetAmount;
    // End of variables declaration//GEN-END:variables
}
