package com.realestate.dao;

import java.sql.SQLException;
import java.util.List;

import com.realestate.model.Booking;

public interface BookingDAO {
	public void createBooking(Booking booking) throws SQLException;
	public List<Booking> getBookingsByUser(int userId) throws SQLException;
}
