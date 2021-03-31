package com.java.practice;

public class Main {
	public static void main(String args[]) {  
		System.out.println(getValue(getValue(0)));
	}

	static int getValue()
	{
		return 35;
	}
	private static int getValue(int num)
	{
		return 30 + num;
	}
}
