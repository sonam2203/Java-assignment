package com.webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleTitleValidation {

	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	String actTitle=driver.getTitle();
	System.out.println("Title is : '=actTitle");
	
	if(actTitle.equals("Google"));
	{
	System.out.println("Test Pass...Title matched!");
	
	}
	
	{
		System.out.println("Test Fail....Title not matched!");
		
	}
	
		

	}

}
