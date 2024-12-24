package com.xworkz.jdbcrunner;
import java.sql.*;
public class Japan {
    public static void main(String[] args) {
        try {
            Class.forName("com.sql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            String Url = "com.sql.cj.jdbc.Driver";
            String UserName = "root";
            String Password = "8296434761";
            DriverManager.getConnection(Url, UserName, Password);
            System.out.println("Establish connection succesfully");
        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC driver not found");
        }
    }
}
