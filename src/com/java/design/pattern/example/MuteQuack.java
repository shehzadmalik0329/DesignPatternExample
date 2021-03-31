package com.java.design.pattern.example;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< silence >>");
	}

}
