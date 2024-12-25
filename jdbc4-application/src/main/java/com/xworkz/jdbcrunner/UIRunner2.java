package com.xworkz.jdbcrunner;
import java.sql.*;
public class UIRunner2 {
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
            while (resultSet.next()){
                int UI_Id = resultSet.getInt(1);
                String UI_Name = resultSet.getString(2);
                String UI_Address = resultSet.getString(3);
                System.out.println("University_Id :"+UI_Id+"University_Name :"+UI_Name+"University_Address"+UI_Address);
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

