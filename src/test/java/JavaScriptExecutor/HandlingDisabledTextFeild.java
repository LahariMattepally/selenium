package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledTextFeild {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver=new ChromeDriver(); 
		//maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to an application
		driver.get("https://demoapp.skillrary.com/");
		//Handle Disabled TextFeild
		WebElement dis_ele = driver.findElement(By.xpath("//input[@type='text' and @class='form-control']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",dis_ele,"selenium");
		Thread.sleep(3000);
		
		
		//close the browser
		driver.quit();
			}
	}
