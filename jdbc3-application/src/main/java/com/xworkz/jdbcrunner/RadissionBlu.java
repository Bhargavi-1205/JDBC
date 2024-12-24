package com.xworkz.jdbcrunner;
import java.sql.*;
public class RadissionBlu {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            String Url = "jdbc:mysql://localhost:3306/RadissionBlu";
            String UserName = "root";
            String Password = "8296434761";
            connection = DriverManager.getConnection(Url, UserName, Password);
            System.out.println("Establish connection succesfull");
            String insert1 = "insert into RadissionBlu_Info values(25, 'dosa', 'raju')";
            String insert2 = "insert into RadissionBlu_Info values(15, 'idli', 'teju')";
            String insert3= "insert into RadissionBlu_Info values(21, 'puri', 'jaan')";
            String insert4 = "insert into RadissionBlu_Info values(35, 'ricebath', 'rahu')";
            String insert5 = "insert into RadissionBlu_Info values(12, 'vegrice', 'mythri')";
            String insert6 = "insert into RadissionBlu_Info values(17, 'Mushroomrice', 'sudu')";
            String insert7 = "insert into RadissionBlu_Info values(9, 'friedrice', 'pavi')";
            String insert8 = "insert into RadissionBlu_Info values(5, 'Bisibelebath', 'nani')";
            String insert9= "insert into RadissionBlu_Info values(18, 'chapathi', 'sharu')";
            String insert10 = "insert into RadissionBlu_Info values(28, 'jeerarice', 'roy')";
            Statement statement = connection.createStatement();
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            statement.addBatch(insert5);
            statement.addBatch(insert6);
            statement.addBatch(insert7);
            statement.addBatch(insert8);
            statement.addBatch(insert9);
            statement.addBatch(insert10);
            int[] row = statement.executeBatch();
            System.out.println("no of row inserted"+row.length);
        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC driver found"+classNotFoundException);
        }finally {
            try{
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
        }

    }
}
