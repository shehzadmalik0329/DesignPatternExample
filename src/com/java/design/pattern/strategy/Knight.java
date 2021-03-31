package com.java.design.pattern.strategy;

public class Knight extends Character{
	
	public Knight() {
		weapon = new AxeBehavior();
	}

	@Override
	void fight() {
		weapon.useWeapon();
	}

}
