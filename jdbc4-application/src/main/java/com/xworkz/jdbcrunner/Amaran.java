package com.xworkz.jdbcrunner;
import java.sql.*;
public class Amaran {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded succesfully");
            String Url = "jdbc:mysql://localhost:3306";
            String UserName = "root";
            String Password = "8296434761";
            DriverManager.getConnection(Url, UserName, Password);
            System.out.println("Establish connection succesfull");
        }catch(ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC Driver not found");
        }

    }
}
