package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfunctionstartswith {
	public static void main(String[] args) throws InterruptedException {
	//launch the browser
			WebDriver driver=new ChromeDriver(); 
					//maximize the windows
			driver.manage().window().maximize();
					// navigate to an application
		         driver.get("https://www.facebook.com/");
		         //identify username textfeild
		         driver.findElement(By.xpath("//input[starts-with(@data-testid, 'royal_email')]")).sendKeys("lahari");
		         driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("156515");
		         driver.findElement(By.xpath("//button[normalize-space(text()='Log in')]")).click();
		         Thread.sleep(3000);
		         // close the browser
		         driver.quit();
		         
		         

}
}
