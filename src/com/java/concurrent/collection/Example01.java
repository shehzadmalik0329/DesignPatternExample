package com.java.concurrent.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Example01 {

	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
			if(entry.getKey() == 3){
				map.remove(entry.getKey());
			}
		}
	}

}
