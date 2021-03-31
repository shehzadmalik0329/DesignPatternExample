package com.java.practice;

import java.io.IOException;
import java.util.Timer;

public class First {

	public static void main(String[] args) throws IOException{

		TimerExample timerExample = new TimerExample("Timer-1");
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(timerExample, 0, 1000*60*4);
		
		
	}

}
