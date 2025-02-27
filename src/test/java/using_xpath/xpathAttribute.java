package using_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAttribute {

public static void main(String[] args) {
//launch the browser
WebDriver driver=new ChromeDriver(); 
// maximize the window
driver.manage().window().maximize();
//navigate to an application
driver.get("https://www.facebook.com/");
// identify username textfield
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");
// identify password text feild
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
// click on login button
driver.findElement(By.xpath("//button[@type='submit']")).click();
						

	}

}
