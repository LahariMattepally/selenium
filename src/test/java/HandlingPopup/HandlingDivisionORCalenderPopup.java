package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDivisionORCalenderPopup {

	public static void main(String[] args) {
		// launch the browser
		WebDriver driver=new ChromeDriver();
			//maximize the browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	             // navigate to an application
               driver.get("https://www.makemytrip.com/");
               driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
               driver.findElement(By.id("fromCity")).click();
               driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyder");
               driver.findElement(By.xpath("//span[text()-'Hyderabad']")).click();
               driver.findElement(By.id("toCity")).click();
               driver.findElement(By.xpath("//"))
               

	}

}
