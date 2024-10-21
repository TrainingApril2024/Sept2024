package com.learn.service;

import com.learn.bean.UserBean;
import com.learn.dao.UserDAO;

public class UserService {

	UserDAO userDAO = new UserDAO();
	
	public String authenticateAndPopulateUser(UserBean userBean) {
		String error = null;
		
		userBean = userDAO.getUserBean(userBean);
		
		if(userBean.getFirstName() == null) {
			error = "Invalid User Credentials";
		}

		return error;
	}

}
