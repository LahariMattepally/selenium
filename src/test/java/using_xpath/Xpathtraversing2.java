package using_xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Xpathtraversing2 {
	public static void main(String[] args) {
		// launching the browser
				WebDriver driver=new ChromeDriver();
				//Maximize the webpage 
				driver.manage().window().maximize();
				//Navigate to Webpage
				driver.get("https://www.flipkart.com/");
				//identify search TF and enter the text
				driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
				//independent and dependent xpath
				WebElement price =driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F05 (Twilight')]/../../div[@class='col col-5-12 BfVC2z']/div/div/div[@class='Nx9bqj _4b5DiR']"));
         System.out.println(price.getText());
         //Identify rating
         WebElement rating=driver.findElement(By.xpath("(//div[@class='XQDdHH'])[1]"));
         System.out.println(rating.getText());
         //Identifying discount
         WebElement discount=driver.findElement(By.xpath("(//div[@class='UkUFwK WMQHm1'])[1]"));
        // WebElement discount=driver.findElement(By.xpath("(//span[text()='37% off'])[1]"));
         System.out.println(discount.getText());
         driver.quit();
	}

}


