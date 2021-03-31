package com.java.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate transaction_date = LocalDate.parse("2020-03-25", dtf);
		System.out.println(transaction_date);
	}

}
