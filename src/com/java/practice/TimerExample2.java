package com.java.practice;

import java.util.Date;
import java.util.TimerTask;

public class TimerExample2 extends TimerTask{

	private String name;

	public TimerExample2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+" has been executed successfully at:"+new Date());
	}

}
