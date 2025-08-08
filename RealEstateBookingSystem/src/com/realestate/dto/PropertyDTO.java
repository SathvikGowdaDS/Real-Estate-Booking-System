package com.realestate.dto;

import com.realestate.model.Address;

public class PropertyDTO {
	private int id;
	private String title;
	private String description;
	private double price;
	private Address address;
	private String ownerName;

	public PropertyDTO(int id, String title, String description, double price, Address address, String ownerName) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.address = address;
		this.ownerName = ownerName;
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

	public String getOwnerName() {
		return ownerName;
	}
}
