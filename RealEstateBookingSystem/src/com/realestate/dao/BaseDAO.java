package com.realestate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface BaseDAO {
	public void closeResources(Connection conn, PreparedStatement stmt, ResultSet rs);
}
