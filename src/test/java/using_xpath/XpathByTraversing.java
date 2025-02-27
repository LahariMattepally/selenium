package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTraversing {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver(); 
					//maximize the windows
				driver.manage().window().maximize();
				// navigate to an application
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.name("q")).sendKeys("moblie"+Keys.ENTER);
				WebElement dynamicvalue = driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F05(Twilight')]/../../div\"+\"[@class='col col-5-12 BfVC2z']/div/div/div[@class='NX9bqj_4b5Div']\""));
				System.out.println(dynamicvalue.getText());
				driver.quit();
	}
				
}








