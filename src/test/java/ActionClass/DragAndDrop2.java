package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
			// launch the browser
		WebDriver driver=new ChromeDriver();
			//maximize the browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	             // navigate to an application
				driver.get("https://testkru.com/Interactions/DragAndDrop");

		        // Find the draggable and droppable elements
		        WebElement box1 = driver.findElement(By.id("box1"));
		        WebElement box2 = driver.findElement(By.id("box2"));
		        WebElement box3 = driver.findElement(By.id("box3"));
		        WebElement dropbox1 = driver.findElement(By.id("dropZone1"));
		        WebElement dropbox2 = driver.findElement(By.id("dropZone2"));
		        WebElement dropbox3 = driver.findElement(By.id("dropZone3"));

		        // Create Actions object for drag and drop
		        Actions act = new Actions(driver);
		        act.dragAndDrop(box1, dropbox1).perform();

		        // Check if drop2 is enabled before attempting to drag and drop
		        if (dropbox2.isEnabled()) {
		           // act.dragAndDrop(box1, drop1).perform();
		            act.dragAndDrop(box2, dropbox2).perform(); 
		            System.out.println("drop2 is enabled");
		        } else {
		            System.out.println("drop2 is not enabled");
		        }

		        Thread.sleep(3000);
		 

		        // Scroll to drop3 before dragging and dropping box3
		        act.scrollToElement(dropbox3).perform();
		        act.dragAndDrop(box3, dropbox3).perform();

		        Thread.sleep(2000);

		        driver.quit();
		    }
		}
		
		
	
