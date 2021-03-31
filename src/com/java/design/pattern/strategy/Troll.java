package com.java.design.pattern.strategy;

public class Troll extends Character{
	
	public Troll() {
		weapon = new BowAndArrowBehavior();
	}

	@Override
	void fight() {
		weapon.useWeapon();
	}

}
