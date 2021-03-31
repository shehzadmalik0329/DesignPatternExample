package com.java.design.pattern.singleton;

class Singleton02 {
	private static final Singleton02 INSTANCE = new Singleton02();
	
	private Singleton02() {}
	
	public static Singleton02 getInstance(){
		return INSTANCE;
	}
}
public class SingletonExample02 {

	public static void main(String[] args) {
		Singleton02 object1 = Singleton02.getInstance();
		Singleton02 object2 = Singleton02.getInstance();
		Singleton02 object3 = Singleton02.getInstance();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
	}

}
