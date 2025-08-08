package com.realestate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDAOImpl implements BaseDAO{
	public void closeResources(Connection conn, PreparedStatement stmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (Exception ignored) {
		}
		try {
			if (stmt != null)
				stmt.close();
		} catch (Exception ignored) {
		}
		try {
			if (conn != null)
				conn.close();
		} catch (Exception ignored) {
		}
	}
}
