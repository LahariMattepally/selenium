package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewWindow {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver=new ChromeDriver();
			//maximize the browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	             // navigate to an application
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);
				// create an new empty window
				driver.switchTo().newWindow(WindowType.WINDOW);
				Thread.sleep(3000);
				
				
				//create a new  empty tap
				driver.switchTo().newWindow(WindowType.TAB);
				
				
				

	}

}
