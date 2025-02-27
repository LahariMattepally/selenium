package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartSenario {
	@Test
	public void  flipkart()
	{

	// launch the browser
	WebDriver driver=new ChromeDriver(); 
	//maximize the window
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//navigate to an url
	driver.get("https://www.flipkart.com/");
	
	}

}
