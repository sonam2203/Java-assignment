package webScenarios;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	// Implement a test case using WebDriver to validate the functionality of a registration form.

	public static void main(String[] args) {
		
		// Creating a session
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");

		// Opening Signup page of Instagram
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();

		// Check if Facebook login button is enabled
		WebElement fbBtn = driver.findElement(By.xpath("//button[@type='button']"));
		System.out.println("Is Login with Facebook button enabled: " + fbBtn.isEnabled());

		// Check email/phone field
		WebElement email = driver.findElement(By.name("emailOrPhone"));
		System.out.println("Is Email box enabled? :" + email.isEnabled());
		email.sendKeys("PoojaSaxena007@gmail.com");

		// Check full name field
		WebElement fullname = driver.findElement(By.name("fullName"));
		System.out.println("Is Fullname box enabled? " + fullname.isEnabled());
		fullname.sendKeys("Pooja Saxena");

		// Check username field
		WebElement user = driver.findElement(By.name("username"));
		System.out.println("Is Username box enabled? :" + user.isEnabled());
		user.sendKeys("poojasaxena07");

		// Check password field
		WebElement password = driver.findElement(By.name("password"));
		System.out.println("Is Password box enabled? " + password.isEnabled());
		password.sendKeys("dreamgirl123");

		// Check signup button
		WebElement signup = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Is Signup button enabled: " + signup.isEnabled());

		// Close the browser
		driver.quit();
	}
}
