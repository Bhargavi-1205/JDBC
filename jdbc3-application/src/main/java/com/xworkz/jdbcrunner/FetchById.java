package com.xworkz.jdbcrunner;
import java.sql.*;
public class FetchById {
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
            String findById = "Select * from Restaurants_Info where Restaurants_Id = 2";
            ResultSet resultSet =statement.executeQuery(findById);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String RestaurantsName = resultSet.getString(2);
                String RestaurantsAddress = resultSet.getString(3);
                System.out.println(id+" "+RestaurantsName+" "+RestaurantsAddress+" ");

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

    }
}
