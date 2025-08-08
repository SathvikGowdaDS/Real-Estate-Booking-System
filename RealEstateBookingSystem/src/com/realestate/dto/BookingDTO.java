package com.realestate.dto;

import java.time.LocalDate;

public class BookingDTO {
	private int id;
	private String propertyTitle;
	private String userName;
	private LocalDate bookingDate;

	public BookingDTO(int id, String propertyTitle, String userName, LocalDate bookingDate) {
		this.id = id;
		this.propertyTitle = propertyTitle;
		this.userName = userName;
		this.bookingDate = bookingDate;
	}

	public int getId() {
		return id;
	}

	public String getPropertyTitle() {
		return propertyTitle;
	}

	public String getUserName() {
		return userName;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}
}
