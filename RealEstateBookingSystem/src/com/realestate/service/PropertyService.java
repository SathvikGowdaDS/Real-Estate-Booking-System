package com.realestate.service;

import java.sql.SQLException;
import java.util.List;

import com.realestate.dao.PropertyDAO;
import com.realestate.dao.PropertyDAOImpl;
import com.realestate.model.Property;

public class PropertyService {
	private PropertyDAO propertyDAO = new PropertyDAOImpl();

    public void addProperty(Property property) throws SQLException {
        propertyDAO.addProperty(property);
    }

    public List<Property> viewAllProperties() throws SQLException {
        return propertyDAO.getAllProperties();
    }	
}
