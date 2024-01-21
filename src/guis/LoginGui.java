package guis;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;

/*
    This gui will allow user to log in or launch the register gui
    This extends from the BaseFrame, which we will need to define our own addGuiComponent()
 */
public class LoginGui extends BaseFrame {

    public LoginGui() {
        super("Banking App Login");
    }

    @Override
    protected void addGuiComponents() {
        //create banking app label
        JLabel bankingAppLabel = new JLabel("Banking Application");

        //set the location and the size of the gui component
        bankingAppLabel.setBounds(0, 20, super.getWidth(), 40);

        //change the front size
        bankingAppLabel.setFont(new Font("Dialog", Font.BOLD, 32));

        //center text in JLabel
        bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);


        add(bankingAppLabel);

        //username label
        JLabel usernameLabel = new JLabel("Username :");

        //getWidth returns us the of our frame which is about 420
        usernameLabel.setBounds(20, 120, getWidth() - 30, 24);

        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(usernameLabel);

        //create username field
        JTextField usernameField = new JTextField();
        usernameField.setBounds(20, 160, getWidth() - 50, 40);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 28));
        add(usernameField);

        //create password label
        JLabel passwordLabel = new JLabel("Password : ");
        passwordLabel.setBounds(20, 280, getWidth() - 50, 24);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(passwordLabel);

        //create password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 320, getWidth() - 50, 40);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 28));
        add(passwordField);

        //create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(20, 460, getWidth() - 50, 40);
        loginButton.setFont(new Font("Dialog", Font.BOLD, 28));
        add(loginButton);

        //create register label






    }
}
