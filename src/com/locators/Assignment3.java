package com.locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are:"+allLinks.size());
		
		
				
		

	}

}
