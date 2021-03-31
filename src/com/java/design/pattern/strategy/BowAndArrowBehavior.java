package com.java.design.pattern.strategy;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Using bow & arrow");
	}

}
