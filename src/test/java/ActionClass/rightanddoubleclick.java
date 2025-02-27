package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightanddoubleclick {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclick= driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions rct=new Actions(driver);
		rct.contextClick(rightclick).perform();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
	
		Actions dc=new Actions(driver);
		dc.doubleClick(doubleclick).perform();
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
	}

}
