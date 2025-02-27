package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
	
			// launch the browser
			WebDriver driver=new ChromeDriver();
				//maximize the browser
					driver.manage().window().maximize();
					// implicit wait
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		             // navigate to an application
					driver.get("https://www.flipkart.com/");
					driver.findElement(By.name("q")).sendKeys("mobiles");
					Actions act =new Actions(driver);
					act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
					// close the browser
					driver.quit();
					

	}

}
