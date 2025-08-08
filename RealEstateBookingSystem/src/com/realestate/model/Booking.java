package com.realestate.model;

import java.time.LocalDate;

public class Booking {
	private int id;
	private int userId;
	private int propertyId;
	private LocalDate bookingDate;

	public Booking(int userId, int propertyId, LocalDate bookingDate) {
		this.userId = userId;
		this.propertyId = propertyId;
		this.bookingDate = bookingDate;
	}

	public Booking(int id, int userId, int propertyId, LocalDate bookingDate) {
		this(userId, propertyId, bookingDate);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int getUserId() {
		return userId;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}
}
