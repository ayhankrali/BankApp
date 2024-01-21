package guis;

import db_objs.User;

/*Performs banking such as depositing, withdrawing, seeing past transaction and transferring
this extends from the BaseFrame
*/
public class BankingAppGui extends BaseFrame {
    public BankingAppGui(User user) {
        super("Banking App",user);

    }

    @Override
    protected void addGuiComponents() {
       //create a welcome message

    }
}
