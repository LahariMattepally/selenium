package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class byusingtagnamelocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		    List<webelements> link = driver.findElement(By.tagName("//a"));
			for (WebElement ele:link)
			{
			System.out.println(ele:get text);
				ele.click();
			}
			driver .quit();
	}
				
		}
		
		
		
	
