package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ByUsingActionsMethod {
	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//navigate the window
		driver.get("https://demowebshop.tricentis.com/");
		// identify search textfeild and pass  the text
		WebElement sTF = driver.findElement(By.id("small-searchterms"));
		sTF.sendKeys("SHOES");
		Thread.sleep(3000);
		// clear the text
		sTF.clear();
		Thread.sleep(3000);
		// pass the text
		sTF.sendKeys("MOBILES");
		//click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(3000);
		// click on register link
		driver.findElement(By.linkText("Register" )).click();
		Thread.sleep(3000);
		// close the browser
		driver.quit();
	}
}

