package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTOAnApplication {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver=new ChromeDriver(); 
		//maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]" , "https://www.facebook.com/");
		
		//Fetch the tittle of the webpage
		System.out.println("Tittle  :"+js.executeScript("return document.tittle"));
		
		
		//Fetch the url of the webpage
		System.out.println("url  :"+js.executeScript("return document.URL"));
		
		
		//Refresh the webpage
	js.executeScript("history.go(0)");
	Thread.sleep(3000);
		
		
		
		// close the browser
		driver.quit();

	}

}
