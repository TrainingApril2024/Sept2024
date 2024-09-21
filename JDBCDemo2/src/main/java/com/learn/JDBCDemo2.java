package com.learn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class JDBCDemo2
 */
public class JDBCDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// Load Drive Class
			Class.forName("com.mysql.jdbc.Driver");
			
			// Get the Connection from DriverManager
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2024","root","admin");
			
			// Create Statement using connection object
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from person");
			
			// Iterate through resultSet
			while(resultSet.next()) {
				
				String personID = resultSet.getString(1);
				String lastName = resultSet.getString(2);
				String firstName = resultSet.getString(3);
				String city = resultSet.getString(4);
				
				response.getWriter().append("PersonID : "+personID+ " lastName : "+lastName);
			}
			
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
