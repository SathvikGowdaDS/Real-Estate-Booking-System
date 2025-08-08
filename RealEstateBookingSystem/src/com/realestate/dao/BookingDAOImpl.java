package com.realestate.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.realestate.constants.QueryConstants;
import com.realestate.db.DBConnection;
import com.realestate.model.Booking;

public class BookingDAOImpl extends BaseDAOImpl implements BookingDAO{
	public void createBooking(Booking booking) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(QueryConstants.INSERT_BOOKING);
            stmt.setInt(1, booking.getUserId());
            stmt.setInt(2, booking.getPropertyId());
            stmt.setDate(3, Date.valueOf(booking.getBookingDate()));
            stmt.executeUpdate();
        } finally {
            closeResources(conn, stmt, null);
        }
    }

    public List<Booking> getBookingsByUser(int userId) throws SQLException {
        List<Booking> bookings = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(QueryConstants.SELECT_BOOKINGS_BY_USER);
            stmt.setInt(1, userId);
            rs = stmt.executeQuery();

            while (rs.next()) {
                bookings.add(new Booking(
                    rs.getInt("id"),
                    rs.getInt("user_id"),
                    rs.getInt("property_id"),
                    rs.getDate("booking_date").toLocalDate()
                ));
            }
        } finally {
            closeResources(conn, stmt, rs);
        }

        return bookings;
    }
}
