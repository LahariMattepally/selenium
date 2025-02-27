package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingCssLocator {

	public static void main(String[] args) {
	
		// launching the browser
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("user");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("user");
		driver.findElement(By.cssSelector("button[type='submit']"));
		

	}

}
