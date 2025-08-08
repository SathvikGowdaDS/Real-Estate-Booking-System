package com.realestate.ui;

import java.time.LocalDate;
import java.util.List;

import com.realestate.model.Booking;
import com.realestate.model.Property;
import com.realestate.model.User;
import com.realestate.service.BookingService;
import com.realestate.service.PropertyService;
import com.realestate.util.DateUtil;
import com.realestate.util.InputUtil;

public class UserMenu {
	private PropertyService propertyService = new PropertyService();
    private BookingService bookingService = new BookingService();

    public void show(User user) {
        while (true) {
            System.out.println("\n*** User Menu ***");
            System.out.println("1. View All Properties");
            System.out.println("2. Book Property");
            System.out.println("3. Logout");

            int choice = InputUtil.getInt("Enter choice: ");
            switch (choice) {
                case 1 : viewProperties();
                case 2 : bookProperty(user.getId());
                case 3 : {
                    System.out.println("Logging out...");
                    return;
                }
                default : System.out.println("Invalid choice!");
            }
        }
    }

    private void viewProperties() {
        try {
            List<Property> properties = propertyService.viewAllProperties();
            for (Property p : properties) {
                System.out.println("ID: " + p.getId() +
                        ", Title: " + p.getTitle() +
                        ", Price: " + p.getPrice());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void bookProperty(int userId) {
        int propertyId = InputUtil.getInt("Enter Property ID: ");
        String dateStr = InputUtil.getString("Enter booking date (yyyy-MM-dd): ");
        LocalDate date = DateUtil.parse(dateStr);

        Booking booking = new Booking(userId, propertyId, date);
        try {
            bookingService.bookProperty(booking);
            System.out.println("Booking successful.");
        } catch (Exception e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
