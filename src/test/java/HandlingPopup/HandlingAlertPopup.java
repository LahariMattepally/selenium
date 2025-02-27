package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
			// launch the browser
			WebDriver driver=new ChromeDriver();
				//maximize the browser
					driver.manage().window().maximize();
					// implicit wait
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		             // navigate to an application
					driver.get("https://the-internet.herokuapp.com/javascript_alerts");
					// click om alert button
					driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
					Thread.sleep(3000);
					//switch the control to alert popup
					Alert al=driver.switchTo().alert();
					System.out.println(al.getText());
					al.accept();
					Thread.sleep(3000);
					//driver.switchTo().alert().accept();
					System.out.println(driver.findElement(By.id("result")).getText());
					Thread.sleep(3000);
					//close the browser
					driver.quit();
					
					
					
	}

}
