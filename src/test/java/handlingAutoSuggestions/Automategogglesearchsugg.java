package handlingAutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automategogglesearchsugg {
	public static void main(String[]args) throws InterruptedException  {
		// launch the browser
		WebDriver driver =new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to an application
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		// identify the search textfeild
		driver.findElement(By.id("APjFqb")).sendKeys("sele");
		Thread.sleep(3000);
		// fetch all the auto suggestions
				List<WebElement>sugg =  driver.findElements(By.xpath("//span[contains(text(),'sele')]"));
				for(WebElement ele: sugg) {
					System.out.println(ele.getText());
				}
				// click on sugg
				driver.findElement(By.xpath("//span[contains(text(),sele')]")).click();
				// close the browser
				driver.quit();
					

}
}
