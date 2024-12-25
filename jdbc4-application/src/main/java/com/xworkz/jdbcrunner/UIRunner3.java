package com.xworkz.jdbcrunner;
import java.sql.*;
public class UIRunner3 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/UI";
            String userName = "root";
            String password = "8296434761";
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String query = "Select * from UI_Info";
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            System.out.println("UI_Id :"+resultSet.getInt(1)+
                    "UI_Name :"+resultSet.getString(2)+
                    "UI_Address :"+resultSet.getString(3));
            resultSet.next();
            System.out.println(resultSet.getInt(1));
            resultSet.next();
            System.out.println(resultSet.getInt(2));
            resultSet.next();
            System.out.println(resultSet.getInt(3));

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

