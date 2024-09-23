package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://automationplayground.com/back-office/pages/login.html");

		 // email
		 driver.findElement(By.name ("email")).sendKeys("test@gmail.com");
		//
		 driver.findElement(By.name("password")).sendKeys("test1234");
		 driver.findElement(By.name("remember")).click();
		 
	}

}
