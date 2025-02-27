  package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsUsingAttributes {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver(); 
				
				//maximize the windows
				driver.manage().window().maximize();
				
				//navigate to an application
				driver.get("https://www.amazon.in/");
				// identify search textfeild
				driver.findElement(By.xpath("//input[contains(@placeholder,'search']")).sendKeys("shoes");
				// identify search button and click
				driver.findElement(By.xpath("//input[contains(@id,'submit']")).click();
	}
}
