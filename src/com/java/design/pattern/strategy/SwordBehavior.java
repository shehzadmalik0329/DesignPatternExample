package com.java.design.pattern.strategy;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Using sword");
	}

}
