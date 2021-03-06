package com.java.design.pattern.example;

public class ModelDuck extends Duck{
	
	public ModelDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
