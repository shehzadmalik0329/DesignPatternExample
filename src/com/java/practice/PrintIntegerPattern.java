package com.java.practice;

public class PrintIntegerPattern {

	public static void main(String[] args) {
		int input = 1;
		int pow = 0;
		while(input<8){
			input++;
			int sum = 0;
			for(int i=pow; i>0; i--){
				int result = power(10,i);
				sum += (input*result);
			}
			System.out.println(sum+input);
			pow++;
		}
	}
	public static int power(int number, int pow){
		if(pow==0)
			return 1;
		return number*power(number, pow-1);
	}
}
