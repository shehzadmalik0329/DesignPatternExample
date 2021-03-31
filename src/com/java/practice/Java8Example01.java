package com.java.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Example01 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Shehzad", "Ashley", "Rahul");
		
		Collections.sort(names);
		System.out.println(names);
		
		names.sort((name1, name2) -> name1.length() - name2.length());
		System.out.println(names);
	}

}
