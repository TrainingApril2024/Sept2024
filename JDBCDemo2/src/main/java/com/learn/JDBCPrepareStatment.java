package com.learn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Servlet implementation class JDBCPrepareStatment
 */
public class JDBCPrepareStatment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCPrepareStatment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2024","root","admin");
//			
//			PreparedStatement preparedStatement = connection.prepareStatement("select * from person where personid = ? and firstName = ?");
//			
//			preparedStatement.setInt(1, 1);
//			preparedStatement.setString(2, "Ram");
//			
//			ResultSet resultSet = preparedStatement.executeQuery();
//			
//			while (resultSet.next()) {
//				String firstName = resultSet.getString(3);
//				response.getWriter().append("FirstName : "+firstName);
//			}
			
			/// Callable Statement
			
//			CallableStatement callableStatement = connection.prepareCall("call getUserName()"); 
			
			
			// Using try-with-resource 
			
			try(Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2024","root","admin");
					PreparedStatement preparedStatement1 = connection1.prepareStatement("select * from person where personid = ? and firstName = ?")){
				
				preparedStatement1.setInt(1, 1);
				preparedStatement1.setString(2, "Rahul");
				
				ResultSet resultSet = preparedStatement1.executeQuery();
				
				while (resultSet.next()) {
					String firstName = resultSet.getString(3);
					response.getWriter().append("FirstName : "+firstName);
				}
				
			}
			
//			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
