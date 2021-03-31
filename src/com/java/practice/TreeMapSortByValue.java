package com.java.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreeMapSortByValue {
	public static void main(String args[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("3 IN", 100);
		map.put("1 US", 200);
		map.put("4 UUA", 400);
		map.put("5 PAK", 80);
		map.put("4 UUK", 400);

		System.out.println("Treemap before sorting : " + map);
		favouriteRestaurant(map);
		// sort treemap by values
//		Map<String, Integer> sortedMap = map.entrySet().stream()
//				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
//						(oldVal, newVal) -> oldVal , LinkedHashMap::new ));
//
//		Optional<Map.Entry<String,Integer>> firstRestaurant = sortedMap.entrySet().stream().findFirst();
//		Map.Entry<String,Integer> favouriteRestaurant = firstRestaurant.get();
//		System.out.println("Treemap after sorting : " + favouriteRestaurant.getKey());

	}
	
	private static void favouriteRestaurant(Map<String, Integer> map){
		String prev = "";
		Integer prevVal = 0;
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			if(prev == ""){
				prev = entry.getKey();
				prevVal = entry.getValue();
			} else {
				String newRestaurant = entry.getKey();
				Integer newVal = entry.getValue();
				if((newVal > prevVal) || 
						(newVal.compareTo(prevVal) == 0 && newRestaurant.compareTo(prev) < 0)){
					prev = newRestaurant;
					prevVal = newVal;
				}
			}
		}
		
		System.out.println(prev+"----"+prevVal);
	}


}
