package handlingAutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsearchsuggestions {
	public static void main(String[]args) throws InterruptedException  {
		// launch the browser
		WebDriver driver =new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to an application
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("comp");
		Thread.sleep(3000);
		// fetch all the auto suggestions
		List<WebElement>sugg =  driver.findElements(By.xpath("//div[contains(text(),'comp')]"));
		for(WebElement ele: sugg) {
			System.out.println(ele.getText());
		}
		// click on any one of the auto suggestion
		driver.findElement(By.xpath("//div[contains(text(),'comp')])[5]")).click();
		// close the browser
		driver.quit();
			
		}

	}



