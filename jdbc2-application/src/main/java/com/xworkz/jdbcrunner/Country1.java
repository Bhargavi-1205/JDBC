package com.xworkz.jdbcrunner;
import java.sql.*;
public class Country1 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            String Url = "jdbc:mysql://localhost:3306";
            String UserName = "root";
            String Password = "8296434761";
            connection = DriverManager.getConnection(Url, UserName, Password);
            statement =
            System.out.println("Establish connection succesfull");
        } catch (ClassNotFoundException | SQLException ClassNotFoundException) {
            System.out.println("JDBC Driver not found");
        }
    }

}
