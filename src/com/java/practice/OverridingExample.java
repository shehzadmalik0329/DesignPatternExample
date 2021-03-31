package com.java.practice;

import java.util.Collections;

class Parent {

	public void add(int num1, int num2){
		System.out.println("Parent add");
	}

	public static void addStatic(int num1, int num2){
		System.out.println("Parent addStatic");
	}
	
	private void addPrivate(int num1, int num2){
		System.out.println("Parent addPrivate");
	}

}
class Child1 extends Parent{

	public void add(int num1, int num2){
		System.out.println("Child1 add");
	}
	
	public static void addStatic(int num1, int num2){
		System.out.println("Child1 addStatic");
	}
	
	private void addPrivate(int num1, int num2){
		System.out.println("Child1 addPrivate");
	}

}
public class OverridingExample {

	public static void main(String[] args) {
		Parent p = new Child1();
		p.add(1, 2);
		p.addStatic(3, 4);
		
		Child1 c = new Child1();
		c.add(1, 2);
		c.addStatic(1, 2);
	
	}

}
