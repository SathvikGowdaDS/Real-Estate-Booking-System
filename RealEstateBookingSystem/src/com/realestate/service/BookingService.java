package com.realestate.service;

import java.sql.SQLException;
import java.util.List;

import com.realestate.dao.BookingDAO;
import com.realestate.dao.BookingDAOImpl;
import com.realestate.model.Booking;

public class BookingService {
	private BookingDAO bookingDAO = new BookingDAOImpl();

    public void bookProperty(Booking booking) throws SQLException {
        bookingDAO.createBooking(booking);
    }

    public List<Booking> viewUserBookings(int userId) throws SQLException {
        return bookingDAO.getBookingsByUser(userId);
    }
}
