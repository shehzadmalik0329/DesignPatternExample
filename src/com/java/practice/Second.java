package com.java.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;

public class Second {

	public static void main(String[] args) {
		TimerExample2 timerExample2 = new TimerExample2("Timer-2");
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(timerExample2, 0, 1000*60);
		
		Map<String, String> map = new HashMap<>();
		Map<String, String> linkedMap = new LinkedHashMap<>();
		
		linkedMap.put("A", "B");
		
		String name = new String("Shehzad");

	}

}
