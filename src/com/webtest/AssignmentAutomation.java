package com.webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutomation {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver =new ChromeDriver();
 driver.get("https://www.google.com");
 
Thread.sleep(1000);
driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
Thread.sleep(1500);
driver.navigate().to("https://www.amazon.in");
System.out.println(driver.getCurrentUrl());


 
 
 
 

	}

}
