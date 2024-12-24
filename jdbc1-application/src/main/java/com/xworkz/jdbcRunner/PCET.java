package com.xworkz.jdbcRunner;
import java.sql.*;
public class PCET {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            String Url = "jdbc:mysql://localhost:3306/University";
            String UserName = "root";
            String Password = "8296434761";
            DriverManager.getConnection(Url, UserName, Password);
            System.out.println("Establish connection succesfull");
            String insert1 = "insert into"
        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC Driver not found"+classNotFoundException.getMessage());
        }

    }
}
    
