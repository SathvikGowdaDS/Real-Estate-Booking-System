package com.realestate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.realestate.constants.QueryConstants;
import com.realestate.db.DBConnection;
import com.realestate.model.User;

public class UserDAOImpl extends BaseDAOImpl {

    public void saveUser(User user) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(QueryConstants.INSERT_USER);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getRole());
            stmt.executeUpdate();
        } finally {
            closeResources(conn, stmt, null);
        }
    }

    public User findByEmail(String email) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(QueryConstants.SELECT_USER_BY_EMAIL);
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password"),
                    rs.getString("role")
                );
            }
            return null;
        } finally {
            closeResources(conn, stmt, rs);
        }
    }
}
