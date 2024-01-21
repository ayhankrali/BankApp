package db_objs;
/*
    JDBC class is used to interact with  MySQL Database to perform activities such as retrieving and updating the db
 */

import java.math.BigDecimal;
import java.sql.*;

public class MyJDBC {
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/bankapp";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "qqqq";


    // if valid, return an object with the user's information
    public static User validateLogin(String username, String password){
        try{
            // establish a connection to the database using configurations
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // create sql query
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM users WHERE username = ? AND password = ?"
            );

            // replace the ? with value
            // parameter index referring to the iteration of the ? so 1 is the first ? and 2 is the second ?
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            // execute a query and store into a result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // next() returns true or false
            // true - query returned data and result set now points to the first row
            // false - query returned no data, and a result set equals to null
            if(resultSet.next()){
                // success
                // get id
                int userId = resultSet.getInt("id");

                // get current balance
                BigDecimal currentBalance = resultSet.getBigDecimal("current_balance");

                // return a user object
                return new User(userId, username, password, currentBalance);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        // not valid user
        return null;
    }
}