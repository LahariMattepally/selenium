package TakesScreenshot;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotofaWebElement {

	public static void main(String[] args) throws IOException {
	
			// launching the browser
			WebDriver driver=new ChromeDriver();
			// maximize the window
			driver.manage().window().maximize();
			// implicit wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// navigate to an application
			driver.get("https://www.flipkart.com/");
			WebElement icon = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
			//screenshot of a webelement
			File temp = icon.getScreenshotAs(OutputType.FILE);
			File newfile = new File("./ss/element.png");
			FileUtils.copyFile(temp, newfile);
// close the browser
			driver.quit();

	}

}
