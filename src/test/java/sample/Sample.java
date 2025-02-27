package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
			// launching the browser
			WebDriver driver=new ChromeDriver();
			// maximize the window
			driver.manage().window().maximize();
			//navigate the window
			driver.get("https://shoppersstack.com/");
			driver.findElement(By.id("loginBtn")).click();
			driver.quit();
			

	}

}
