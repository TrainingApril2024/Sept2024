package com.learn.util;

import jakarta.servlet.http.HttpServletRequest;

public class UserUtil {

	public static String validateRequest(HttpServletRequest request) {
		String error = null;
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		if(userName.isEmpty() || password.isEmpty()) {
			error = "Username or password is empty";
		}
		return error;
	}

}
