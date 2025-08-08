package com.realestate.ui;

import com.realestate.exception.UserNotFoundException;
import com.realestate.model.User;
import com.realestate.service.AuthService;
import com.realestate.util.InputUtil;
import com.realestate.util.LoggerUtil;

public class MainMenu {

	private AuthService authService = new AuthService();

	public void open() {
		while (true) {
			System.out.println("\n*****Real Estate Booking System***** ");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");

			int choice = InputUtil.getInt("Enter Option: ");

			switch (choice) {
			case 1:
				register();
			case 2:
				login();
			case 3: {
				System.out.println("Thank you for using this Application.....");
				return;
			}
			default:
				System.out.println("Invalid Choice...");
			}
		}
	}

	private void login() {
		String email = InputUtil.getString("Enter Email: ");
		String password = InputUtil.getString("Enter Password: ");
		try {
			User user = authService.login(email, password);
			LoggerUtil.log(user.getRole() + " logged in: " + user.getName());
			if (user.getRole().equalsIgnoreCase("ADMIN")) {
				new AdminMenu().show(user);
			} else {
				new UserMenu().show(user);
			}
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Login failed: 👎" + e.getMessage());
		}
	}

	private void register() {
		String name = InputUtil.getString("Enter name: ");
		String email = InputUtil.getString("Enter email: ");
		String password = InputUtil.getString("Enter password: ");
		String role = "USER";

		try {
			authService.register(new User(name, email, password, role));
			System.out.println("User registered successfully 👍.");
		} catch (Exception e) {
			System.out.println("Registration failed: 👎" + e.getMessage());
		}
	}
}
