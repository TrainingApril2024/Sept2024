package com.learn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.learn.bean.UserBean;

public class UserDAO {

	public UserBean getUserBean(UserBean userBean) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2024", "root",
					"admin");
					PreparedStatement preparedStatement = connection
							.prepareStatement("select * from user where username = ? and password = ?")) {

				preparedStatement.setString(1, userBean.getUsername());
				preparedStatement.setString(2, userBean.getPassword());

				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					userBean.setFirstName(resultSet.getString(1));
					userBean.setLastName(resultSet.getString(2));
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userBean;
	}

}
