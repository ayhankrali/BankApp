package guis;

import javax.swing.*;
import java.awt.*;

/*
    This gui will allow user to log in or launch the register gui
    This extends from the BaseFrame, which we will need to define our own addGuiComponent()
 */
public class LoginGui extends BaseFrame{

    public LoginGui() {
        super("Banking App Login");
    }

    @Override
    protected void addGuiComponents() {
        //create banking app label
        JLabel bankingAppLabel = new JLabel("Banking Application");

        //set the location and the size of the gui component
        bankingAppLabel.setBounds(0,20,super.getWidth(),40);

        //change the front size
        bankingAppLabel.setFont(new Font("Dialog",Font.BOLD,32));

        //center text in JLabel
        bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);


        add(bankingAppLabel);
    }
}
