package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingmouseactions {
	public static void main(String[]args) throws InterruptedException  {
		// launch the browser
		WebDriver driver =new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to an application
		driver.get("https://www.flipkart.com/");
		// identify search textfeild
		//driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
		System.out.println(driver.manage().window().getPosition());
		// scroll the webpage based on coordinates
		Actions act=new Actions(driver);
	act.scrollByAmount(100, 500).perform();
	Thread.sleep(3000);
	//scroll the webpage based on webelement
	WebElement ele=driver.findElement(By.xpath("//a[text()='Cleartrip']"));
	act.scrollToElement(ele).moveToElement(ele).click().build().perform();
	Thread.sleep(5000);
	//close the browser
	driver.quit();

}
}
