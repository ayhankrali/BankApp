package db_objs;
/*
  User entity which is used to store user information (username, password and current balance)
*/

import java.math.BigDecimal;
import java.math.RoundingMode;

public class User {
    private final int id ;
    private final String username,password ;

    //The Current balance is not final because, it will be changing when deposited, withdraw and transfer.
    private BigDecimal currentBalance ;

    public User(int id,String username,String password,BigDecimal currentBalance){
        this.id = id ;
        this.username = username ;
        this.password = password ;
        this.currentBalance = currentBalance ;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal newBalance) {
        //store new value to the 2nd decimal place
        currentBalance = newBalance.setScale(2, RoundingMode.FLOOR);

    }
}


