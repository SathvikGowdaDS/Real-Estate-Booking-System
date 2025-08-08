package com.realestate.dao;

import java.sql.SQLException;

import com.realestate.model.User;

public interface UserDAO {
	public void saveUser(User user) throws SQLException;

	public User findByEmail(String email) throws SQLException;
}
