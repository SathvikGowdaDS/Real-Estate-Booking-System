package com.realestate.dao;

import java.sql.SQLException;
import java.util.List;

import com.realestate.model.Property;

public interface PropertyDAO {
	public void addProperty(Property property) throws SQLException;

	public List<Property> getAllProperties() throws SQLException;
}
