package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver=new ChromeDriver();
			//maximize the browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	             // navigate to an application
				driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
				WebElement ele = driver.findElement(By.name("A"));
				Actions act = new Actions(driver);
				act.clickAndHold(ele).perform();
				Thread.sleep(3000);
				WebElement share=driver.findElement(By.xpath("//(button[@aria-label='Share']) [2]"));
				act.moveToElement(share).perform();
				Thread.sleep(3000);
				act.release(ele).perform();
				Thread.sleep(3000);
				// close the browser
				driver.quit();
	}
}
				
				
				
		
