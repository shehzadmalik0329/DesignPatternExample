package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = src.nextLine();
		System.out.println(getUniqueCharacterSubstring(input));
	}
	
	static String getUniqueCharacterSubstring(String input) {
	    Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	    }
	    return output;
	}

}
