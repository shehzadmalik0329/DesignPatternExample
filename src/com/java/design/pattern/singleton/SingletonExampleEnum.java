package com.java.design.pattern.singleton;

enum SingletonEnum{
	INSTANCE;
	
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
public class SingletonExampleEnum {

	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		singleton.setValue(1000);
		System.out.println(singleton.getValue());
		System.out.println(singleton1.getValue());
	}

}
