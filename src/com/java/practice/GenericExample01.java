package com.java.practice;

import java.util.ArrayList;

public class GenericExample01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Shehzad");
		list.add("Vaibhav");
		//		list.add(10);	-->CE
		m1(list);
		System.out.println(list);
		//		list.add(10.5);	-->CE
	}

	public static void m1(ArrayList list){
		list.add(10);
		list.add(10.5);
		list.add(true);
	}

	public void m2(ArrayList<String> list){

	}

//	public void m2(ArrayList<Integer> list){
//
//	}

}
