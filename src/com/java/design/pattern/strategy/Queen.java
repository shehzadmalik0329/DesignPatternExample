package com.java.design.pattern.strategy;

public class Queen extends Character{
	
	public Queen() {
		weapon = new KnifeBehavior();
	}

	@Override
	void fight() {
		weapon.useWeapon();
	}

}
