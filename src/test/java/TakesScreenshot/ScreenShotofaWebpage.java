package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotofaWebpage {
	public static void main(String[] args) throws InterruptedException, IOException  {
		// launching the browser
		WebDriver driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// navigate to an application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//screenshot of a webpage
		// step1: Typecast takes screenshot (i) with driver reference variable
		TakesScreenshot ts=(TakesScreenshot)driver;
		//step2: Take the screenshot and store in temp file
		File src = ts.getScreenshotAs(OutputType.FILE);
		// step3: create an empty file
		File dest=new File("./ss/flipkart.png");
		//step4: copy the screenshot in an empty file
		FileUtils.copyFile(src, dest);
		// close the browser
		driver.quit();
		

		
}
}
