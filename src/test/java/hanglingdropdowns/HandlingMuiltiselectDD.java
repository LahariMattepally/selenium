package hanglingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMuiltiselectDD {
	
		public static void main(String[]args) throws InterruptedException  {
		// launching the browser
		WebDriver driver=new ChromeDriver(); 
		//maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate the 
      driver.get("https://demoapp.skillrary.com/");
    WebElement multisdd= driver.findElement(By.id("cars"));
    Select s= new Select(multisdd);
    s.selectByIndex(1);
    Thread.sleep(3000);
    s.selectByValue("90");
    Thread.sleep(3000);
    s.selectByVisibleText("INR 300 - INR 399 (1) ");
    Thread.sleep(3000);
    
    
    s.deselectByIndex(1);
    Thread.sleep(3000);
    s.deselectByValue("90");
    Thread.sleep(3000);
    s.deselectByVisibleText("INR 300 - INR 399 (1)");
    Thread.sleep(3000);
       
    
    
   s.deselectAll();
   Thread.sleep(3000);
   // close the browser
   driver.quit();
    
    
    
    
      
}
	}
