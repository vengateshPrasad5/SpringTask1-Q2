package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedbackServlet extends HttpServlet {
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ServletException("JDBC Driver not found", e);
        }
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name = req.getParameter("name");
         String bookName = req.getParameter("bookname");
         String feedback =  req.getParameter("feedback");

        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/feedbackdb";
        String username = "root";
        String password = "Vengat5796!";

        // SQL query to insert data into the database
        String sql = "INSERT INTO feedback (cname,bookname,feedback) VALUES ( ?, ?, ?)";
         try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, bookName);
            statement.setString(3, feedback);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0){
                resp.sendRedirect("success.jsp");
            }
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
