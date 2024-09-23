package com.webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		//Create a driver session
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.facebook.com");
		
	}

}
