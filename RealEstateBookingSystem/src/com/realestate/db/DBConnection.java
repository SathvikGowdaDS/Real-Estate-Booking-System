package com.realestate.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.realestate.config.DBConfig;

public class DBConnection {
	 public static Connection getConnection() throws SQLException {
	        try {
	            Class.forName(DBConfig.DRIVER);
	            return DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PASSWORD);
	        } catch (ClassNotFoundException e) {
	            throw new SQLException("JDBC Driver not found", e);
	        }
	    }

	    public static void closeConnection(Connection conn) {
	        try {
	            if (conn != null && !conn.isClosed()) {
	                conn.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
