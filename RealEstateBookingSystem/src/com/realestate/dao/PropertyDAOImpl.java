package com.realestate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.realestate.constants.QueryConstants;
import com.realestate.db.DBConnection;
import com.realestate.model.Address;
import com.realestate.model.Property;

public class PropertyDAOImpl extends BaseDAOImpl implements PropertyDAO {
	public void addProperty(Property property) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(QueryConstants.INSERT_PROPERTY);
            stmt.setString(1, property.getTitle());
            stmt.setString(2, property.getDescription());
            stmt.setDouble(3, property.getPrice());
            stmt.setInt(4, property.getAddress().getId());
            stmt.setInt(5, property.getOwnerId());
            stmt.executeUpdate();
        } finally {
            closeResources(conn, stmt, null);
        }
    }

    public List<Property> getAllProperties() throws SQLException {
        List<Property> properties = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(QueryConstants.SELECT_ALL_PROPERTIES);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Address address = new Address(
                    rs.getInt("address_id"),
                    rs.getString("street"),
                    rs.getString("city"),
                    rs.getString("state"),
                    rs.getString("zip")
                );

                Property property = new Property(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getDouble("price"),
                    address,
                    rs.getInt("owner_id")
                );

                properties.add(property);
            }
        } finally {
            closeResources(conn, stmt, rs);
        }

        return properties;
    }
}
