package com.java.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert {

	public static void main(String[] args) {
		// System.out.println(Double.parseDouble("11.1"));
		// DateTimeFormatter formatter =
		// DateTimeFormatter.ofPattern("yyyy-m-d");
		LocalDate localDate = LocalDate.of(2019, 1, 2);

		String startDate = localDate.toString();
		System.out.println("Start Date:" + startDate);

		String userDate = "2100-01-01";

		LocalDate userInputDate = LocalDate.parse(userDate);

		System.out.println("Leap or not:" + userInputDate.isLeapYear());

		// a Map with string keys and integer values
//		Map<String, Integer> budget = new HashMap<>();
//		budget.put("clothes", 120);
//		budget.put("grocery", 150);
//		budget.put("transportation", 100);
//		budget.put("utility", 130);
//		budget.put("rent", 1150);
//		budget.put("miscellneous", 90);
//		System.out.println("map before sorting: " + budget);
//		// let's sort this map by values first
//		Map<String, Integer> sorted = budget.entrySet()
//				.stream()
//				.sorted(Map.Entry.comparingByValue())
//				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
//		System.out.println("map after sorting by values: " + sorted);
//		
//		List<String> sortedList = budget.entrySet()
//				.stream()
//				.sorted(Map.Entry.comparingByValue())
//				.map(e -> e.getKey())
//				.collect(Collectors.toCollection(LinkedList::new));
//		System.out.println("map after sorting by values: " + sortedList);
		
		String userDate1 = "2100-02-24";

		LocalDate userInputDate1 = LocalDate.parse(userDate1);

		System.out.println(userInputDate1.plusDays(5));
		
		System.out.println("Minus:"+userInputDate1.minusDays(1));
		
		System.out.println("Total days:"+Period.between(LocalDate.parse("2019-01-02"), LocalDate.parse("2019-12-12")).getDays());
		
		System.out.println("Total days:"+ChronoUnit.DAYS.between(LocalDate.parse("2019-01-02"), LocalDate.parse("2019-12-12")));

	}

}
