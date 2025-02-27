package Synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
public class UsingExplictWait {
	public static void main(String[] args)  {
		// launching the browser
		WebDriver driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait  wait = new WebDriverWait (driver,Duration.ofSeconds(50));
	driver.get("https://www.shoppersstack.com/");
		// creating instance of webdriverwait
		WebElement login = driver.findElement(By.id("loginbtn"));
		// verify whether the login button is displayed
		wait.until(ExpectedConditions.visibilityOf(login));
		// verify whether the login button is clickable
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		String tittle =  driver.getTitle();
		//verify the tittle of the login webpage
		System.out.println(wait.until(ExpectedConditions.titleContains(tittle)));
		driver.quit();
		

}
}

