package com.learn;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/annotation")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.print("Hello");
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Request is what is sent to us by User (Brower)
		String var1 = request.getParameter("var1");
		String var2 = request.getParameter("var2");
		
		response.setContentType("text/html");
		
		// Response is what is we send back to User (Browser)
		PrintWriter writer = response.getWriter();
		writer.append("Welcome " + var1);
		writer.close();
	}

	@Override
	public void destroy() {
		System.out.print("I am ending");
	}
}
