🏠 Real Estate Booking System – Project Overview
1. Introduction
💥The Real Estate Booking System is a Java-based console application that allows users to search, view, and book properties for sale or rent, while giving administrators tools to manage listings and oversee booking activities.
💥It is built using Java + JDBC + MySQL, following a clean modular architecture for maintainability and scalability.

2. Objective
The main goal is to digitize the property booking process by replacing manual, paper-based methods with a fast, reliable, and easy-to-use software solution.
It serves two primary user roles:
👉 Admin: Can manage properties, view bookings, and track user activity.
👉 User: Can search for properties, make bookings, and view their booking history.

3. Key Features
👤 For Users:
✅ User Registration & Login – Secure login for personalized experience.
✅ Property Search – Find properties by location, price, or size.
✅ View Property Details – Get full details including address and price.
✅ Book a Property – Reserve a property with real-time availability check.
✅ View My Bookings – See all current and past bookings.

👨‍💻 For Admins:
✅ Admin Login – Secure access for management tasks.
✅ Add/Edit/Delete Properties – Manage the property listings database.
✅ View All Bookings – Check the bookings made by all users.
✅ Audit Logs – Track login and booking activities for accountability.

5. Technology Stack
💥Programming Language: Java (JDK 17+)
💥Database: MySQL
💥JDBC Driver: MySQL Connector/J
💥Architecture Pattern: Layered architecture (Config → DAO → Service → UI)
💥Build Tool: Manual compile/run or IDE (Eclipse/IntelliJ)

6. System Modules
a) Authentication Module
🔹Handles login and registration for users and admins.
🔹Validates credentials against the database.
🔹Uses role-based navigation to load either Admin Menu or User Menu.

b) Property Management Module
🔹Admin can add, update, or delete properties.
🔹Stores property details including address, size, price, and availability.
🔹Accessible via PropertyService and PropertyDAO.

c) Booking Management Module
🔹Users can book available properties.
🔹Booking dates and user details are stored in the database.
🔹Prevents double booking of the same property.

d) Audit Logging Module
🔹Records key events such as logins, bookings, and property updates.
🔹Useful for admin monitoring and reporting.

6. Database Schema
Key tables include:
📌 users – Stores user and admin information.
📌 properties – Contains property listings.
📌 bookings – Tracks user bookings.
📌 audit_logs – Logs significant actions.

7. Advantages
 💥Easy to Use: Console-based menus are straightforward and fast.
 💥Secure: Uses role-based authentication to protect admin functions.
 💥Maintainable: Modular file structure separates concerns.
 💥Scalable: Can be extended into a GUI or web-based app in the future.

8. Possible Enhancements
👉 Add password hashing for security.
👉 Implement search filters (by price range, property type).
👉 Add payment gateway integration.
👉 Create a GUI using JavaFX or a web UI using Spring Boot.

