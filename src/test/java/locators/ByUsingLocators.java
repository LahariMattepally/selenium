package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingLocators {
     public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the windows
		driver.manage().window().maximize();
		
		//navigate to Qspiders application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");        
		
		
		//identify the username textfield
		WebElement user =driver.findElement(By.id("sel@123"));
		
		//pass the text in user name textfield
		user.sendKeys("sel");
		
		//identify the email id
        WebElement  email =driver.findElement(By.id("email"));
        
        //pass the text in email id textfield
    	email.sendKeys("selenium123@gmail.com");
		
		//identify the password textfield
		
		WebElement pass =driver.findElement(By.id("pass"));
		
		//Pass the text to password textfield
		pass.sendKeys("lahari");
		
		// identify the login button 
		WebElement Register=driver.findElement(By.name("Register"));
		//click on login Button
		Register.click();
		
			
	}
	}



