package com.java.design.pattern.example;

public class MallardDuck extends Duck{
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}

}
