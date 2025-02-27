package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class swigy {

	
		 @Parameters("BROWSER")
		   @Test
		   public void launchFb(String browser) {
			   WebDriver driver=null;
			   
			   if(browser.equals("chrome")) {
				   driver = new ChromeDriver();
				    }
			   else if(browser.equals("edge")) {
				   driver=new EdgeDriver();
			   }
			   else {
				   driver = new ChromeDriver();
			   }
			   driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  driver.get("https://www.swiggy.com/");
	}
	}




