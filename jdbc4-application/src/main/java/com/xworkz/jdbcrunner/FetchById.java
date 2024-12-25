package com.xworkz.jdbcrunner;
import java.sql.*;
public class FetchById {
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
            String findById = "Select * from UI_Info where ticket_Cost = 100";
            ResultSet resultSet = statement.executeQuery(findById);
            while (resultSet.next()) {
                int ticketCost = resultSet.getInt(1);
                String languageName = resultSet.getString(2);
                String TheatreName = resultSet.getString(3);
                System.out.println(ticketCost + " " + languageName + " " + TheatreName+ " ");

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (connection != null) {
                    statement.close();

                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
