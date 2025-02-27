package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton {

	public static void main(String[] args) throws InterruptedException {
	
			// launching the browser
			WebDriver driver=new ChromeDriver(); 
			//maximize the window
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// navigate to an application
			driver.get("https://www.facebook.com/");
			WebElement login =driver.findElement(By.name("login"));
			
			
			//click on login button using java script executor
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",login);
			
			
			//To Handle Disabled button
			//js.executeScript("arguments[0].checked=true",login);
			
			
			
			Thread.sleep(3000);
			// close the browser
			driver.quit();
			

	}

}
