package com.java.design.pattern.strategy;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Using axe");
	}

}
