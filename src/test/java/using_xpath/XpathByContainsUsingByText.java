package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsUsingByText {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver(); 
				//maximize the windows
				driver.manage().window().maximize();
				//navigate to an application
				driver.get("https://www.facebook.com/");
						// Identify the username text feild
			driver.findElement(By.xpath("// input[contains(@placeholder,'Email address ')]") ).sendKeys("selenium");
			// Identify the password text feild
			driver.findElement(By.xpath("// input[contains(@type,'password')]")).sendKeys("abc@123");
			// Identify login button
			driver.findElement(By.xpath("//button[contains(text() ,'Log in')]")).click();
			
			Thread.sleep(3000);
			
			driver.quit();
			
	}

}
