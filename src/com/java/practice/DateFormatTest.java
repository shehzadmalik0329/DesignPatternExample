package com.java.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) throws ParseException {
		String pattern = "ddmmyyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("10012021");
		System.out.println(date);
		
		String patternNew = "hh:mm:ss";
		SimpleDateFormat simpleDateFormatNew = new SimpleDateFormat(patternNew);
		Date dateNew = simpleDateFormatNew.parse("00:00:00");
		System.out.println(dateNew);

	}

}
