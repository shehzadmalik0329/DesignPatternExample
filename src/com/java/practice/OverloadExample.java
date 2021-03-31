package com.java.practice;

public class OverloadExample {
	
	public void print(String s){
		System.out.println("In String");
	}
	
	public void print(Object o){
		System.out.println("In Object");
	}
	
	public static void main(String[] args){
		OverloadExample obj = new OverloadExample();
		obj.print("Shehzad");
		obj.print(new String("Shehzad"));
		obj.print(null);
	}

}
