package com.java.design.pattern.strategy;

public class GameApplication {

	public static void main(String[] args) {
		Character king = new King();
		king.fight();
		
		Character queen = new Queen();
		queen.setWeapon(new AxeBehavior());
		queen.fight();

	}

}
