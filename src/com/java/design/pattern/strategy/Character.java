package com.java.design.pattern.strategy;

public abstract class Character {
	
	WeaponBehavior weapon;
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	abstract void fight();

}
