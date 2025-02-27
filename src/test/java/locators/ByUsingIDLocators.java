package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingIDLocators {
	public static void main(String[]args) {
		//launch the browser
		WebDriver driver=new ChromeDriver(); 
		// maximize the window
		driver.manage () .window().maximize();
		// navigate to FB application
		driver.get("https://www.facebook.com/");
		//identify the username textfield
		WebElement user=driver.findElement(By.id("email"));
		// pass the text in username textfield
		user.sendKeys("username");
		// identify the password textfield
		WebElement pass = driver.findElement(By.id("pass"));
		// pass the text in password textfeild
		pass.sendKeys("password");
		// identify the login button
		WebElement  login  = driver.findElement(By.name("login"));
		// click on login button
		login.click();
	}
}
		
	
