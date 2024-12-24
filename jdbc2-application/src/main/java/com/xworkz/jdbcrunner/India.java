package com.xworkz.jdbcrunner;
import java.sql.*;
public class India {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            String Url = "jdbc:mysql://localhost:3306/Country1";
            String UserName = "root";
            String Password = "8296434761";
            DriverManager.getConnection(Url, UserName, Password);
            connection = DriverManager.getConnection(Url, UserName, Password);
            System.out.println("Establish connection succesfully");
            String insert ="insert into Country1_info values(1,'China','Beijing')";
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(insert);
            System.out.println("no of row inserted"+row);
        }catch(ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC Driver not found"+ classNotFoundException.getMessage());
        }
        finally{
            try{
                if(connection != null)
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
