package com.realestate.service;

import java.sql.SQLException;

import com.realestate.dao.UserDAOImpl;
import com.realestate.exception.UserNotFoundException;
import com.realestate.model.User;

public class AuthService {
	private UserDAOImpl userDAO = new UserDAOImpl();

	public User login(String email, String password) throws SQLException {
		User user = userDAO.findByEmail(email);
		if (user == null || !user.getPassword().equals(password)) {
			throw new UserNotFoundException("Invalid email or password.");
		}
		return user;
	}

	public void register(User user) throws SQLException {
		userDAO.saveUser(user);
	}
}
