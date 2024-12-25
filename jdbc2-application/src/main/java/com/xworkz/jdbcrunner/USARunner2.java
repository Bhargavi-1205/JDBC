package com.xworkz.jdbcrunner;
import java.sql.*;
public class USARunner2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/USA";
            String userName = "root";
            String password = "8296434761";
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String query = "Select * from USA_Info";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int USA_Id = resultSet.getInt(1);
                String USA_Name = resultSet.getString(2);
                String USA_Address = resultSet.getString(3);
                System.out.println("USA_Id :"+USA_Id+"University_Name :"+USA_Name+"USA_Address"+USA_Address);
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






