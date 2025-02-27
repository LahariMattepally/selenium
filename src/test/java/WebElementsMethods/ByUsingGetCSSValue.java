package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingGetCSSValue {

	public static void main(String[] args) {
		// launching the browser
				WebDriver driver=new ChromeDriver();
				// maximize the window
				driver.manage().window().maximize();
				//navigate the window
				driver.get("https://demowebshop.tricentis.com/");
				// identify the register link
				WebElement reg = driver.findElement(By.linkText("Register"));
				System.out.println(reg.getCssValue("color"));
				// close the browser
				driver.quit();
				
		

	}

}
