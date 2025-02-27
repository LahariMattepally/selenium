package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingGetLocationPopup {

	public static void main(String[] args) {
		
			
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-geolocation");
			
			
			
				// launch the browser
							WebDriver driver=new ChromeDriver(opt);
								//maximize the browser
									driver.manage().window().maximize();
									// implicit wait
									driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						             // navigate to an application
		                    driver.get("https://the-internet.herokuapp.com/geolocation");
		                   driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
		                    

	}

}
