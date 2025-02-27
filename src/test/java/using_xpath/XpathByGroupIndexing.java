package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndexing {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
				WebDriver driver=new ChromeDriver(); 
						
						//maximize the windows
						driver.manage().window().maximize();
						
						//navigate to an application
						driver.get("https://demoapp.skillrary.com/");
						// identify username textfield
						driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles"+Keys.ENTER);
						Thread.sleep(3000);
						driver.quit();
					
						

	}

}



