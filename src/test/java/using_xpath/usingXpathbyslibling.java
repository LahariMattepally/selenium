package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingXpathbyslibling {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver(); 
				//maximize the windows
				driver.manage().window().maximize();
				// navigate to an application
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.name("q")).sendKeys("toys "+Keys.ENTER);
				WebElement price = driver.findElement(By.xpath("//a[contains(text(), 'J K INTERNATIONAL P')]"
						+"//ancestor::div[@class='slAVV4']"
						+ "/descendant:;div[@class='UkUFwK'] /preceding-sibling::div"));
				System.out.println(price.getText());
				driver.quit();

}
}
//input[@type="text" and @name="email"]
//input[@type="password" or @class="inputtext"]