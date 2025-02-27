package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
	
			// launching the browser
			WebDriver driver=new ChromeDriver(); 
			//maximize the window
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// navigate to an application
			driver.get("https://www.ajio.com/");
			// scroll the webpage using hardcoded coordinates
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(100,1700)");
			Thread.sleep(3000);
			
			
			// scroll the webpage using element reference
			WebElement ele  =driver.findElement(By.xpath("//strong[text()='100% HANDPICKED']"));
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
			Thread.sleep(3000);
			
			
			//scroll the webpage using element coordinates
			int x= ele.getLocation().getX();
			int y=ele.getLocation().getY();
			//js.executeScript("window.scrollBy("+x+","+y+")");
			//System.out.println(x + ","+y);
			
			
		// scroll till button of the webpage
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			
			
			//scroll till top of the webpage
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			Thread.sleep(3000);
				// close the browser
			driver.quit();

	}

}
