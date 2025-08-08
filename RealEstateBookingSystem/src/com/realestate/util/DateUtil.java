package com.realestate.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static LocalDate parse(String dateStr) {// parse() converts String to LocalDate
		return LocalDate.parse(dateStr, formatter);
	}

	public static String format(LocalDate date) {//format() converts LocalDate to String
		return formatter.format(date);
	}

}
