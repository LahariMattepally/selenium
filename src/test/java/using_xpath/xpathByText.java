package using_xpath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByText {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
				WebDriver driver=new ChromeDriver();
				//Maximize the webpage 
				driver.manage().window().maximize();
				//Navigate to Webpage
				driver.get("https://www.facebook.com/");
				String title = driver.getTitle();
				Thread.sleep(3000);
				//identify username TF and pass the text
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("user");
				// identify password TF and pass the text
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
                Thread.sleep(3000);
                //identify login button and click 
                driver.findElement(By.xpath("//button[text()='Log in']")).click();
                Thread.sleep(3000);
                //navigate to previous web page
                driver.navigate().back();
                Thread.sleep(3000);6
              //verify the main page
                String title2= driver.getTitle();
                if (title.equals(title2)) {
        		driver.findElement(By.linkText("Forgotten password?")).click();
        		Thread.sleep(3000);
	}
                // close the browser
                driver.quit();
	}
}
                





	



