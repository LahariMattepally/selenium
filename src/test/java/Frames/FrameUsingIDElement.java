package Frames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FrameUsingIDElement {
public static void main(String[] args) throws InterruptedException {
	//Lauch the browser
	WebDriver driver=new ChromeDriver();
	// maximize the browser
	         driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Navigate URL
			driver.get("https://www.zomato.com/");
			
			//Click on login Link
			driver.findElement(By.linkText("Log in")).click();
			
			//Switch the driver control to the Frames by using ID
			//driver.switchTo().frame("auth-login-ui");
			//Thread.sleep(3000);
			
			//Switch to the Frames using frame element
			WebElement frameEle=driver.findElement(By.id("auth-login-ui"));
			driver.switchTo().frame(frameEle);
			Thread.sleep(3000);
			
			//Enter the mobile number
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876543210");
			Thread.sleep(3000);
			
			//close the Login Frame
			driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
			
			//Switch the driver control to the main webpage
			driver.switchTo().defaultContent();
			
			//pass the text in the search TF
			driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Chocolate Pastry");
			Thread.sleep(3000);
			
			//Close the Browser 
			driver.quit();


	}

}
