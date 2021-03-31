package com.java.design.pattern.singleton;

class Singleton03 {
	private static Singleton03 INSTANCE = null;
	
	private Singleton03() {}
	
	public static Singleton03 getInstance(){
		if(INSTANCE == null){
			synchronized(Singleton03.class){
				if(INSTANCE == null){
					INSTANCE = new Singleton03();
				}
			}
		}
		return INSTANCE;
	}
}
public class SingletonExample03 {

	public static void main(String[] args) {
		Singleton03 object1 = Singleton03.getInstance();
		Singleton03 object2 = Singleton03.getInstance();
		Singleton03 object3 = Singleton03.getInstance();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
	}

}
