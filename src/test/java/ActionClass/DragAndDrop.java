package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
	WebDriver driver=new ChromeDriver();
		//maximize the browser
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             // navigate to an application
			driver.get("https://testkru.com/Interactions/DragAndDrop");
			// Drag And Drop Actions for box1
	WebElement element1 = driver.findElement(By.id("box1"));
	WebElement element2 = driver.findElement(By.id("box2"));
	WebElement element3= driver.findElement(By.id("box3"));
	// drag and drop Actions for drop box1
	WebElement targetLoc=driver.findElement(By.id("dropZone1"));
	Actions act = new Actions(driver);
	act.dragAndDrop(element1, targetLoc).perform();
	Thread.sleep(10000);
	WebElement target =driver.findElement(By.id("dropZone3"));
	act.scrollToElement(target).perform();
	act.dragAndDrop(element3, target).perform();
	Thread.sleep(3000);
	// close the browser
	driver.quit();
	
	
	
	
	// close the browser
	driver.quit();
}
}
