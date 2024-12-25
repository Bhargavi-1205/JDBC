package com.xworkz.jdbcRunner;
import java.sql.*;
public class UniversityRunner1 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/University";
            String userName = "root";
            String password = "8296434761";
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String query = "Select * from University_Info";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int University_Id = resultSet.getInt(1);
                String University_Name = resultSet.getString(2);
                String University_Address = resultSet.getString(3);
                System.out.println("University_Id :"+University_Id+"University_Name :"+University_Name+"University_Address"+University_Address);
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




