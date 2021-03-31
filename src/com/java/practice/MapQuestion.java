package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapQuestion {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 1);
		map.put(3, 1);
		map.put(4, 2);
		map.put(5, 1);
		map.put(6, 3);

		Map<Integer,Integer> duplicateMap = map.entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

		Integer sum = duplicateMap.entrySet().stream()
				.map(entry -> entry.getValue()-1)
				.reduce(0, Integer::sum);
		
		System.out.println("Sum="+ sum);


	}

}
