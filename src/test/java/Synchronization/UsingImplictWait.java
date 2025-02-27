package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplictWait {
		public static void main(String[] args)  {
			// launching the browser
			WebDriver driver=new ChromeDriver();
			// maximize the window
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			//navigate the window
			driver.get("https://shoppersstack.com/");
			driver.findElement(By.id("loginBtn")).click();
			//validate
		String	tittle = driver.getTitle();
		//String url = driver.getCurrentUrl();
		if(tittle.contains("ShoppersStack")) {
			System.out.println("test PASS");
		} else {																																																			
			System.out.println("test FAIL");
		}
			// close the browser
			driver.quit();

}
}
