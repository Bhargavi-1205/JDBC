package com.xworkz.jdbcRunner;
import java.sql.*;
public class University {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            String url="jdbc:mysql://localhost:3306";
            String UserName="root";
            String password="8296434761";
            DriverManager.getConnection(url,UserName,password);
            System.out.println("establish connection succesfull");
        } catch (ClassNotFoundException  | SQLException classNotFoundException) {
            System.out.println("JDBC Driver not found" + classNotFoundException);
        }
    }
}
