package com.java.design.pattern.strategy;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Using knife");
	}

}
