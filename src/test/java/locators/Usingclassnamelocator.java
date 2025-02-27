package locators;
			// navigate an application
			driver.get("https://www.flipkart.com/");
			// enter text in username textfield
			driver.findElement(By.className("Pke _ EE")).sendKeys("shoes");
}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingclassnamelocator {
public static void main(String[]args) {
	// launch the browser
			WebDriver driver=new ChromeDriver(); 
			// maximize the window
			driver.manage () .window().maximize();
