package com.xworkz.jdbcrunner;
import java.sql.*;
public class JetLag {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
            String Url = "jdbc:mysql://localhost:3306/JetLag";
            String UserName = "root";
            String Password = "8296434761";
            connection = DriverManager.getConnection(Url, UserName, Password);
            System.out.println("Establish connection succesfull");
            String insert1 = "insert into JetLag_Info values(100, 'south-indian meals' 'banglore')";
            String insert2 = "insert into JetLag_Info values(120, 'North-indian meals' 'Andhrapradesh')";
            String insert3 = "insert into JetLag_Info values(140, 'Meals' 'hyderbad')";
            String insert4 = "insert into JetLag_Info values(90, 'Tiffin' 'chennai')";
            String insert5 = "insert into JetLag_Info values(130, 'indian meals' 'kuppam')";

            Statement statement = connection.createStatement();
            statement.addBatch(insert1);
            int[] row = statement.executeBatch();
            System.out.println("no of row inserted"+row.length);

        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC driver not found"+classNotFoundException);
        }finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
        }
    }
}
