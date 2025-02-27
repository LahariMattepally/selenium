package hanglingdropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class usingselectmethods {
	public static void main(String[]args) throws InterruptedException {
	// launching the browser
	WebDriver driver=new ChromeDriver(); 
	//maximize the window
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//navigate the window
	driver.get("https://www.amazon.in/");
	Thread.sleep(10000);
	// identify the dropdown
	 WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	// create an instance of select class
	 Select s = new Select(dropdown);
	 // select option based on the index
	 s.selectByIndex(7);
	 // select option based on value
	s.selectByValue("search-alias=alexa-skills");
	// select option based on visible text
	s.selectByVisibleText("Luxury Beauty");
	// check whether the dropdown is sisngle/multi select DD
	System.out.println(s.getOptions());
	//fetch all the options
	List<WebElement> list = s.getOptions();
	for(WebElement ele:list) {
		System.out.println(ele.getText());
	}
	// fetch  the  first selected options
	System.out.println(s.getFirstSelectedOption().getText());
	// fetch the all selected options
	List<WebElement> selected = s.getAllSelectedOptions();
	for( WebElement ele:selected)
	{
		System.out.println("selected option :"+ele.getText());
	}
// close the browser
	driver.quit();
	}
}
