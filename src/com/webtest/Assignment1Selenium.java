package com.webtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Selenium {
	
//	1. Write a WebDriver script to navigate to a website and click on a specific link.

	public static void main(String[] args) {
		//Creating a session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		System.out.println("Title of  Page 1:"+driver.getTitle());
		
		//Navigating to different a different website
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("Title of Page 2:"+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Clicking on a specific link-
		driver.findElement(By.linkText("Mobiles")).click();
			

	}

}
