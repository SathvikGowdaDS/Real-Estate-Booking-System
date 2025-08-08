package com.realestate.model;

public class Property {
	private int id;
	private String title;
	private String description;
	private double price;
	private Address address;
	private int ownerId;

	public Property(int id, String title, String description, double price, Address address, int ownerId) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.address = address;
		this.ownerId = ownerId;
	}

	public Property(String title, String description, double price, Address address, int ownerId) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.address = address;
		this.ownerId = ownerId;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public Address getAddress() {
		return address;
	}

	public int getOwnerId() {
		return ownerId;
	}
}
