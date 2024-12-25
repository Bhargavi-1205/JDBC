package com.xworkz.jdbcRunner;
import java.sql.*;
public class FetchByField {
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
            String findById = "Select * from University_Info where University_Name = City";
            ResultSet resultSet =statement.executeQuery(findById);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String UniversityName = resultSet.getString(2);
                String UniversityAddress = resultSet.getString(3);
                System.out.println(id+" "+UniversityName+" "+UniversityAddress+" ");

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

