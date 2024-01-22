package guis;
/*
  Display a custom for BankingAppGui
*/

import db_objs.User;

import javax.swing.*;
import java.awt.*;


public class BankingAppDialog extends JDialog {
    private User user;
    private BankingAppGui bankingAppGui;
    private JLabel balanceLabel, enterAmountLabel, enterUserLabel;
    private JTextField enterAmountField, enterUserField;
    private JButton actionButton;
    //private JPanel pastTransactionPanel;
    // private ArrayList<Transaction> pastTransactions;

    public BankingAppDialog(BankingAppGui bankingAppGui, User user) {
        // set the size
        setSize(400, 400);

        // add focus to the dialog (can't interact with anything else until dialog is closed)
        setModal(true);

        // loads in the center of our banking gui
        setLocationRelativeTo(bankingAppGui);

        // when suer closes the dialog, it releases its resources that are being used
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // prevents dialog from being resized
        setResizable(false);

        // allows us to manually specify the size and position of each component
        setLayout(null);

        // we will need reference to our gui so that we can update the current balance
        this.bankingAppGui = bankingAppGui;

        // we will need access to the user info to make updates to our db or retrieve data about the user
        this.user = user;


    }


    public void addCurrentBalanceAndAmount() {
        // balance label
        balanceLabel = new JLabel("Balance: $" + user.getCurrentBalance());
        balanceLabel.setBounds(0, 10, getWidth() - 20, 20);
        balanceLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(balanceLabel);

        // enter amount label
        enterAmountLabel = new JLabel("Enter Amount:");
        enterAmountLabel.setBounds(0, 50, getWidth() - 20, 20);
        enterAmountLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        enterAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(enterAmountLabel);

        // enter amount field
        enterAmountField = new JTextField();
        enterAmountField.setBounds(15, 80, getWidth() - 50, 40);
        enterAmountField.setFont(new Font("Dialog", Font.BOLD, 20));
        enterAmountField.setHorizontalAlignment(SwingConstants.CENTER);
        add(enterAmountField);
    }


    public void addActionButton(String actionButtonType) {
        actionButton = new JButton(actionButtonType);
        actionButton.setBounds(15, 300, getWidth() - 50, 40);
        actionButton.setFont(new Font("Dialog", Font.BOLD, 20));
        actionButton.setHorizontalAlignment(SwingConstants.RIGHT);
        add(actionButton);

    }

    public void addUserField(){
        //enter user label
        enterUserLabel = new JLabel("Enter User:");
        enterUserLabel.setBounds(0, 160, getWidth() - 20, 20);
        enterUserLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        enterUserLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(enterUserLabel);

        //enter user field
        enterUserField = new JTextField();
        enterUserField.setBounds(15, 190, getWidth() - 50, 40);
        enterUserField.setFont(new Font("Dialog", Font.BOLD, 20));
        enterUserField.setHorizontalAlignment(SwingConstants.CENTER);
        add(enterUserField);

    }
}
