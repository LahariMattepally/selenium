package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {

	public static void main(String[] args) throws InterruptedException {

			// launch the browser
			WebDriver driver=new ChromeDriver();
				//maximize the browser
					driver.manage().window().maximize();
					// implicit wait
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		             // navigate to an application
					driver.get("https://the-internet.herokuapp.com/javascript_alerts");
					driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
					Thread.sleep(3000);
					driver.switchTo().alert().dismiss();
					WebElement result=driver.findElement(By.id("result"));
					System.out.println();
					// close the browser
					driver.quit();

	}

}
