package com.xworkz.jdbcrunner;
import java.sql.*;
public class Restaurants {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            String Url = "jdbc:mysql://localhost:3306/Restaurants";
            String UserName = "root";
            String Password = "8296434761";
            connection = DriverManager.getConnection(Url, UserName, Password);
            System.out.println("establish connection succesfull");
            String insert = "insert into Restaurants_Info values(0, 'Raddisionblu' , 'hyderabad')";
            String insert1 = "insert into Restaurants_Info values(1, 'JetLag' , 'Banglore')";
            String insert2 = "insert into Restaurants_Info values(2, 'OneAtriaCafe' , 'Chennai')";
            String insert3 = "insert into Restaurants_Info values(3, 'Ashoka', 'kerala')";
            String insert4 = "insert into Restaurants_Info values(4, 'sapthigiri', 'kerala')";
            Statement statement = connection.createStatement();
            statement.addBatch(insert);
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            int[] row = statement.executeBatch();
            System.out.println("no of row inserted"+row.length);
        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC driver not found"+classNotFoundException.getMessage());
        }finally {
            try {
                    connection.close();
                } catch(SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }

