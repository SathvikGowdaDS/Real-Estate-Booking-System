package com.realestate.constants;

public class QueryConstants {
	public static final String INSERT_USER = "INSERT INTO users (name, email, password, role) VALUES (?, ?, ?, ?)";
	public static final String SELECT_USER_BY_EMAIL = "SELECT * FROM users WHERE email = ?";

	public static final String INSERT_PROPERTY = "INSERT INTO properties (title, description, price, address_id, owner_id) VALUES (?, ?, ?, ?, ?)";
	public static final String SELECT_ALL_PROPERTIES = "SELECT * FROM properties";

	public static final String INSERT_BOOKING = "INSERT INTO bookings (user_id, property_id, booking_date) VALUES (?, ?, ?)";
	public static final String SELECT_BOOKINGS_BY_USER = "SELECT * FROM bookings WHERE user_id = ?";

}
