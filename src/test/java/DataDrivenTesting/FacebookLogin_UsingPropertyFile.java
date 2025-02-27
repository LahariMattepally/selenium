package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin_UsingPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//step1: convert the physical property file into java object
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.Properties");
		
		//step2: create an abject of properties
		Properties p = new Properties();
		
		// step3: Load the properties object from java object
		p.load(fis);
		
		//step4:Fetch the data from properties obje
		String URL=p.getProperty("url");
		String UN= p.getProperty("username");
		String PWD = p.getProperty("password");
		String TIME = p.getProperty("timeouts");
		
		long time=Long.parseLong(TIME);
		
		// Launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(PWD);
		Thread.sleep(3000);
		
		// close the browser
		driver.quit();
		
		
		
	}

}
