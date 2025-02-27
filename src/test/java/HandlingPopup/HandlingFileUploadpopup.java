package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadpopup {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
					WebDriver driver=new ChromeDriver();
						//maximize the browser
							driver.manage().window().maximize();
							// implicit wait
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				             // navigate to an application
                          driver.get("https://the-internet.herokuapp.com/upload");
                          //File upload using sendkeys
                          driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\MATTEPALLY LAHARI\\OneDrive\\Desktop");
                          Thread.sleep(3000);
                          //close the browser
                          driver.quit();
                          
                          
	}

}
