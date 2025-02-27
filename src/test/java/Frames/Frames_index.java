package Frames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_index {

	public static void main(String[] args) throws InterruptedException {
		
			// TODO Auto-generated method stub

			WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Navigate to the application
			driver.get("https://www.snapdeal.com/");
			
			//Mouse hover on sigin link
			WebElement signin=driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
			Actions act=new Actions(driver);
			act.moveToElement(signin).perform();
			Thread.sleep(3000);
			
			//Click on Login link
			driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
			Thread.sleep(3000);
			
			//Switch the driver control to the Frames by using index
			driver.switchTo().frame(0);
			
			//Enter the mobile number
			driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("9786711556");
			Thread.sleep(3000);
			//close the Login Frame
			driver.findElement(By.id("close-pop"));
			
			//Switch the driver control to the main webpage
			driver.switchTo().defaultContent();
			
			//pass the text in the search TF
			driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Beauty"+Keys.ENTER);
			Thread.sleep(3000);
					
			driver.quit();
		}

	}

