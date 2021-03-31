package com.java.practice;

import java.util.Date;
import java.util.TimerTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimerExample extends TimerTask{

	private String name;

	public TimerExample(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name+" has been executed successfully at:"+new Date());
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  

		// Launch website  
		driver.navigate().to("http://www.google.com/"); 
		try {
			Thread.sleep(1000*60*3);
			driver.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
