package using_xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathAxes {

	public static void main(String[] args)  {
			//launch the browser
			WebDriver driver=new ChromeDriver(); 
					//maximize the windows
					driver.manage().window().maximize();
					// navigate to an application
					driver.get("https://www.amazon.in/");
					
					// identify search textfeild
					driver.findElement(By.id("twoabsearchtextbox")).sendKeys("mobile" + Keys.ENTER);
					//Identify the dynamic element and fetch the text
					driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M0')]"
					+ "/ancestor::div[contains(@class, 'a-section  a-spacing-s')]"
							+ "/descendent::span[@class='a-price-whole']"));
					System.out.println(price.gettext());
					driver.quit();
					

	}

}



