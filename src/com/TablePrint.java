/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.text.MessageFormat;

/**
 * Demo of the basic features of {@code JTable} printing.
 * Allows the user to configure a couple of options and print
 * a table of student grades.
 * <p>
 * Requires the following other files:
 * <ul>
 *     <li>images/passed.png
 *     <li>images/failed.png
 * </ul>
 *
 * @author Shannon Hickey
 */
public class TablePrint extends JFrame {

    /* Check mark and x mark items to render the "Passed" column 
    private static final ImageIcon passedIcon
        = new ImageIcon(TablePrint.class.getResource("images/passed.png"));
    private static final ImageIcon failedIcon
*/
    private JPanel contentPane;
    private JLabel gradesLabel;
    private JTable gradesTable;
    private JScrollPane scroll;
    private JCheckBox showPrintDialogBox;
    private JCheckBox interactiveBox;
    private JCheckBox fitWidthBox;
    private JButton printButton;
    private JButton btnClose;

    /* Protected so that they can be modified/disabled by subclasses */
    protected JCheckBox headerBox;
    protected JCheckBox footerBox;
    protected JTextField headerField;
    protected JTextField footerField;

    /**
     * Constructs an instance of the demo.
     */
    JTable tblModel;
    public TablePrint(JTable tblModel) {
        super("ICM Commercial");

        this.tblModel = tblModel;
        gradesLabel = new JLabel("ICM Commercial");
        gradesLabel.setFont(new Font("Dialog", Font.BOLD, 16));

        gradesTable = createTable(tblModel.getModel());
        gradesTable.setFillsViewportHeight(true);
        gradesTable.setRowHeight(24);


        scroll = new JScrollPane(gradesTable);

        String tooltipText;

        tooltipText = "Include a page header";
        headerBox = new JCheckBox("Header:", true);
        headerBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                headerField.setEnabled(headerBox.isSelected());
            }
        });
        headerBox.setToolTipText(tooltipText);
        tooltipText = "Page Header (Use {0} to include page number)";
        headerField = new JTextField("Final Grades - CSC 101");
        headerField.setToolTipText(tooltipText);

        tooltipText = "Include a page footer";
        footerBox = new JCheckBox("Footer:", true);
        footerBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                footerField.setEnabled(footerBox.isSelected());
            }
        });
        footerBox.setToolTipText(tooltipText);
        tooltipText = "Page Footer (Use {0} to Include Page Number)";
        footerField = new JTextField("Page {0}");
        footerField.setToolTipText(tooltipText);

        tooltipText = "Show the Print Dialog Before Printing";
        showPrintDialogBox = new JCheckBox("Show print dialog", true);
        showPrintDialogBox.setToolTipText(tooltipText);
        showPrintDialogBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (!showPrintDialogBox.isSelected()) {
                    JOptionPane.showMessageDialog(TablePrint.this,
                        "If the Print Dialog is not shown,"
                            + " the default printer is used.",
                        "Printing Message",
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        
        tooltipText = "Keep the GUI Responsive and Show a Status Dialog During Printing";
        interactiveBox = new JCheckBox("Interactive (Show status dialog)", true);
        interactiveBox.setToolTipText(tooltipText);
        interactiveBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (!interactiveBox.isSelected()) {
                    JOptionPane.showMessageDialog(TablePrint.this,
                        "If non-interactive, the GUI is fully blocked"
                            + " during printing.",
                        "Printing Message",
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        tooltipText = "Shrink the Table to Fit the Entire Width on a Page";
        fitWidthBox = new JCheckBox("Fit width to printed page", true);
        fitWidthBox.setToolTipText(tooltipText);
        
        btnClose = new JButton("Close");
        
        btnClose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCancel(e);
            }
        });
        
        tooltipText = "Print the Table";
        printButton = new JButton("Print");
        printButton.setToolTipText(tooltipText);
        
        printButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                printGradesTable();
            }
        });

        contentPane = new JPanel();
        addComponentsToContentPane();
        setContentPane(contentPane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 600);
        setLocationRelativeTo(null);
    }

    /**
     * Adds to and lays out all GUI components on the {@code contentPane} panel.
     * <p>
     * It is recommended that you <b>NOT</b> try to understand this code. It was
     * automatically generated by the NetBeans GUI builder.
     * 
     */
    private void addComponentsToContentPane() {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createTitledBorder("Printing"));

        GroupLayout bottomPanelLayout = new GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(headerBox)
                    .addComponent(footerBox))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bottomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(footerField)
                    .addComponent(headerField, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bottomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(fitWidthBox)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printButton)
                        .addComponent(btnClose))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(showPrintDialogBox)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(interactiveBox)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGroup(bottomPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(headerBox)
                    .addComponent(headerField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(interactiveBox)
                    .addComponent(showPrintDialogBox))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bottomPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(footerBox)
                    .addComponent(footerField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fitWidthBox)
                    .addComponent(printButton)
                    .addComponent(btnClose))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(contentPane);
        contentPane.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(gradesLabel)
                    .addComponent(bottomPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradesLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }
    private void btnCancel(ActionEvent e)
    {
        this.dispose();
    }
    /**
     * Create and return a table for the given model.
     * <p>
     * This is protected so that a subclass can return an instance
     * of a different {@code JTable} subclass. This is interesting
     * only for {@code TablePrintDemo3} where we want to return a
     * subclass that overrides {@code getPrintable} to return a
     * custom {@code Printable} implementation.
     */
    protected JTable createTable(TableModel model) {
        return new JTable(model);
    }

    /**
     * Create and return a cell renderer for rendering the pass/fail column.
     * This is protected so that a subclass can further customize it.
     */

    /**
     * Print the grades table.
     */
    private void printGradesTable() {
        /* Fetch printing properties from the GUI components */

        MessageFormat header = null;
        
        /* if we should print a header */
        if (headerBox.isSelected()) {
            /* create a MessageFormat around the header text */
            header = new MessageFormat(headerField.getText());
        }

        MessageFormat footer = null;
        
        /* if we should print a footer */
        if (footerBox.isSelected()) {
            /* create a MessageFormat around the footer text */
            footer = new MessageFormat(footerField.getText());
        }

        boolean fitWidth = fitWidthBox.isSelected();
        boolean showPrintDialog = showPrintDialogBox.isSelected();
        boolean interactive = interactiveBox.isSelected();

        /* determine the print mode */
        JTable.PrintMode mode = fitWidth ? JTable.PrintMode.FIT_WIDTH
                                         : JTable.PrintMode.NORMAL;

        try {
            /* print the table */
            boolean complete = gradesTable.print(mode, header, footer,
                                                 showPrintDialog, null,
                                                 interactive, null);

            /* if printing completes */
            if (complete) {
                /* show a success message */
                JOptionPane.showMessageDialog(this,
                                              "Printing Complete",
                                              "Printing Result",
                                              JOptionPane.INFORMATION_MESSAGE);
            } else {
                /* show a message indicating that printing was cancelled */
                JOptionPane.showMessageDialog(this,
                                              "Printing Cancelled",
                                              "Printing Result",
                                              JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (PrinterException pe) {
            /* Printing failed, report to the user */
            JOptionPane.showMessageDialog(this,
                                          "Printing Failed: " + pe.getMessage(),
                                          "Printing Result",
                                          JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
