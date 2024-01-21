package guis;

import db_objs.User;

import javax.swing.*;

//creating an abstract class that help us set up the blueprint that our guis
public abstract class BaseFrame extends JFrame {
    //store user info
    protected User user ;

    public BaseFrame(String title){
        initialize(title);
    }
    public BaseFrame(String title,User user){
        //initialize user
        this.user = user ;

        initialize(title);
    }

    public void initialize(String title){
        //instantiate frane properties and add a title to the bar
        setTitle(title);

        //set size
        setSize(420,600);

        //terminate program when qui is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set layout to null
        setLayout(null);

        //prevent qui from being resized

        setResizable(false);

        //launch the gui in the center
        setLocationRelativeTo(null);

        //call on the subclass
        addGuiComponents();

    }

    protected abstract void addGuiComponents();
}
