package com.java.design.pattern.strategy;

public class King extends Character{
	
	public King() {
		weapon = new SwordBehavior();
	}

	@Override
	void fight() {
		weapon.useWeapon();
	}

}
