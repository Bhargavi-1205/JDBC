package com.xworkz.jdbcrunner;
import java.sql.*;
public class RetriveRunner1 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Restaurants";
            String userName = "root";
            String password = "8296434761";
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String query = "Select * from Restaurants_Info";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int Restaurants_Id = resultSet.getInt(1);
                String Restaurants_Name = resultSet.getString(2);
                String Restaurants_Address = resultSet.getString(3);
                System.out.println("Restaurants_Id :"+Restaurants_Id+"Restaurants_Name :"+Restaurants_Name+"Restaurants_Address"+Restaurants_Address);
            }

        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(connection != null){
                    connection.close();
                }
                if(connection != null){
                    statement.close();

                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}


