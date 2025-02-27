package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingIsSelectedMethods {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//navigate the window
		driver.get("https://demowebshop.tricentis.com/");
		WebElement radiobtn = driver.findElement(By.id("pollanswers-2"));
		// radiobtn.click();
		if (radiobtn.isSelected()) {
			System.out.println(radiobtn.isSelected() + " : selected successfully");
		} else {
			System.out.println(radiobtn.isSelected() + " : Element not selected");
		}
		driver.quit();
			
		}
		

	}


