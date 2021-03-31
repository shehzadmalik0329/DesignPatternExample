package com.java.design.pattern.singleton;

class Singleton01 {
	
	public static final Singleton01 INSTANCE = new Singleton01();
	
	private Singleton01(){}

}

public class SingletonExample01{
	
	public static void main(String[] args){
		Singleton01 object1 = Singleton01.INSTANCE;
		Singleton01 object2 = Singleton01.INSTANCE;
		Singleton01 object3 = Singleton01.INSTANCE;
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
	}
}
