package com.java.practice;

import java.util.Scanner;

class ReverseString{
	public static void main(String[] args){
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = src.nextLine();
		if(input.trim().length() > 0){
			System.out.println("Reversed string is");
			for(int i=input.length(); i>0; i--){
				System.out.print(input.charAt(i-1));
			}
		} else {
			System.out.println("Input is blank/null");
		}

	}
}
