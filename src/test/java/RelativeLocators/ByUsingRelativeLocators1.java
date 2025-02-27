package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class ByUsingRelativeLocators1 {

public static void main(String[] args) throws InterruptedException{
		//Launching the Browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to an application
		driver.get("https://demowebshop.tricentis.com/");
		//UsingRlToRightOf Method
		WebElement searchTf = driver.findElement(By.id("small-searchterms"));
		searchTf.sendKeys("shoes");
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(searchTf)).click();	
		Thread.sleep(3000);
		//Using RlToLeftOf Method
		WebElement login = driver.findElement(By.linkText("Log in"));
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(login)).click();
		Thread.sleep(3000);
		//Using gender label RlNear Method clicking on male radio button
		WebElement label = driver.findElement(By.xpath("//label[text()='Gender:']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(label)).click();
		Thread.sleep(3000);
		// close the browser
		driver.quit();	
	}
}



