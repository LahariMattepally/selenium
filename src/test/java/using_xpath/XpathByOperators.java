package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByOperators {

	public static void main(String[] args) throws InterruptedException {
			//launch the browser
			WebDriver driver=new ChromeDriver(); 
					//maximize the windows
					driver.manage().window().maximize();
					// navigate to an application
					driver.get("https://www.facebook.com/");
					driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("selenium");
					driver.findElement(By.xpath("//input[@type='password'or @class='inputtext']")).sendKeys("abc123");
					driver.findElement(By.xpath("//button[@name='login' and text()='Log in']")).click();
					Thread.sleep(3000);
					// close the browser
					driver.quit();
							
	}

}
