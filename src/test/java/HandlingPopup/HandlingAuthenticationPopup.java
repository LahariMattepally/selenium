package HandlingPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver=new ChromeDriver();
			//maximize the browser
		driver.manage().window().maximize();
		//Navigate to an application
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		//close the browser
		driver.quit();
		

	}

}
