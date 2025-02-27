package HandlingPopup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver=new ChromeDriver();
			//maximize the browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	             // navigate to an application
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
				Thread.sleep(3000);
				
				
				//Fetch the parent window id
				String pwid = driver.getWindowHandle();
				driver.findElement(By.xpath("//div[text()='MOTOROLA g05 (Plum Red, 64 GB)']")).click();
				Thread.sleep(3000);
				
				//Fetching all the window id's
			 Set<String> Wids = driver.getWindowHandles();
			 
			 //Iterating all the window ids
			 for(String s: Wids) {
				 
				 // switch the driver control
				 driver.switchTo().window(s);
				 if(driver.getTitle().contains("MOTOROLA g05 ( 64 GB Storage, 4 GB RAM ) ")) {
					 driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
				 Thread.sleep(5000);
				 }
			 }
			 //switching back to the parent window
			 driver.switchTo().window(pwid);
			 //close the browser
			 driver.quit();
	}
}
				 
			
				
				
				

	


