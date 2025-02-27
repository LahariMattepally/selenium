package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingStaticWait {
	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//navigate the window
		driver.get("https://shoppersstack.com/");
		Thread.sleep(50000);
		driver.findElement(By.id("loginBtn")).click();
		driver.quit();
		

}

}



