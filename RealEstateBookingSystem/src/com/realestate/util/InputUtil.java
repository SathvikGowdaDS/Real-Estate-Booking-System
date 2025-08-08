package com.realestate.util;

import java.util.Scanner;

public class InputUtil {
	private static final Scanner scan = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.println(prompt);
		return scan.nextLine().trim();
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		return Integer.parseInt(scan.nextLine().trim());
	}
	
	public static double getDouble(String prompt) {
		System.out.println(prompt);
		return Double.parseDouble(scan.nextLine().trim());
	}
}
