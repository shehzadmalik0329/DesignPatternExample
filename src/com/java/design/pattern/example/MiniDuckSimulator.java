package com.java.design.pattern.example;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performQuack();
		model.performFly();
	}

}
