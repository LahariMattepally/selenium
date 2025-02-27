package RelativeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ByUsingRelativeLocators {

	public static void main(String[] args) throws InterruptedException {
			//Launching the Browser
			WebDriver driver = new ChromeDriver();
			//maximize the window
			driver.manage().window().maximize();
			//navigate to an application
			driver.get("https://www.facebook.com/");
			//Identify the pswd Tf
			WebElement pswd =driver.findElement(By.id("pass"));
			//Identify username Tf using above method
		    WebElement user = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
			user.sendKeys("selenium");
			//Identify the password Tf
			pswd.sendKeys("156515");
			//Identify login button using below method
			WebElement login= driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd));
			login.click();
			Thread.sleep(3000);
			// close the browser
			driver.quit();
			
		}

	}
	
