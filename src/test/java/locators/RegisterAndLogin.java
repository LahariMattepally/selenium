package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAndLogin {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver(); 
				
				//maximize the windows
				driver.manage().window().maximize();
				
				//navigate to an application
				driver.get("https://demoapps.qspiders.com/ui?scenario=1");        
			Thread.sleep(3000);
				// find the name textfeild and enter the name
				WebElement name=driver.findElement(By.id("name"));
				name.sendKeys("lahari");
				// find the email textfeild enter the email
				driver.findElement(By.id("email")).sendKeys("email@gmail.com");
				// find the password textfeild enter the password
				driver.findElement(By.id("password")).sendKeys("lahari)");
						// click on register
						driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
						Thread.sleep(3000);
						// in login page find email id textfeild and enter email id
						driver.findElement(By.name("email")).sendKeys("email@gmail.com");
						// find the pass and text feild and enter text
						driver.findElement(By.id("password")).sendKeys("lahari");
						// find login button and click on it
						driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}
}
						
				
				
				
			
				