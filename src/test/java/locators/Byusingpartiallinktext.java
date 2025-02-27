package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Byusingpartiallinktext {
	public static void main(String[]args) {
	// launch the browser
			WebDriver driver=new ChromeDriver(); 
			// maximize the window
			driver.manage () .window().maximize();
			// navigate to FB application
						driver.get("https://www.facebook.com/");
						// click on forgotten password link
						driver.findElement(By.linkText("Forgotten")).click();
	}
}


