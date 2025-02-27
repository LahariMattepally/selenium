package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctions {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver(); 
				//maximize the windows
				driver.manage().window().maximize();
				// navigate to an application
	         driver.get("https://www.flipkart.com/");
				driver.findElement(By.name("q")).sendKeys("toys");
				driver.findElement(By.xpath("//*[name()='svg'] [@width='24']")).click();
				Thread.sleep(3000);
				//close the browser
				driver.quit();
				

}
}
