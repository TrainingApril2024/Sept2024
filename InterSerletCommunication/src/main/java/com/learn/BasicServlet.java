package com.learn;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BasicServlet
 */
public class BasicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("homeServlet");
//		System.out.println("This is BasicServlet");
//		requestDispatcher.include(request, response);
		
		response.sendRedirect("homeServlet");
	}

}
