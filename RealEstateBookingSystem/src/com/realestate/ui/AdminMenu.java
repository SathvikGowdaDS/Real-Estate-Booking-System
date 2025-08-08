package com.realestate.ui;

import com.realestate.model.Address;
import com.realestate.model.Property;
import com.realestate.model.User;
import com.realestate.service.PropertyService;
import com.realestate.util.InputUtil;

public class AdminMenu {
	 private PropertyService propertyService = new PropertyService();

	    public void show(User admin) {
	        while (true) {
	            System.out.println("\n*** Admin Menu ***");
	            System.out.println("1. Add Property");
	            System.out.println("2. Logout");

	            int choice = InputUtil.getInt("Enter choice: ");
	            switch (choice) {
	                case 1 : addProperty(admin.getId());
	                case 2 : {
	                    System.out.println("Logging out...");
	                    return;
	                }
	                default : System.out.println("Invalid choice!");
	            }
	        }
	    }

	    private void addProperty(int ownerId) {
	        String title = InputUtil.getString("Enter property title: ");
	        String desc = InputUtil.getString("Enter description: ");
	        double price = InputUtil.getDouble("Enter price: ");

	        String street = InputUtil.getString("Street: ");
	        String city = InputUtil.getString("City: ");
	        String state = InputUtil.getString("State: ");
	        String zip = InputUtil.getString("ZIP: ");

	        Address address = new Address(street, city, state, zip);
	        Property property = new Property(title, desc, price, address, ownerId);

	        try {
	            propertyService.addProperty(property);
	            System.out.println("Property added.");
	        } catch (Exception e) {
	            System.out.println("Failed to add property: " + e.getMessage());
	        }
	    }	
}
