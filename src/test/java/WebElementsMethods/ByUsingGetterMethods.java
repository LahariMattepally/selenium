package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingGetterMethods {

	public static void main(String[] args) {
		// launching the browser
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        // fetch the text on an element
        WebElement element = driver.findElement(By.partialLinkText("Books"));
        System.out.println("Text :" + element.getText());
        System.out.println("Tagname for books :"+ element.getTagName());
        System.out.println("Location of books :"+ element.getLocation());
        System.out.println("Books  XAxis:"+element.getRect().getX());
        System.out.println("Books  YAxis:"+element.getRect().getY());
        
        
       
        // fetch the attribute of search textfield
        WebElement searTF=driver.findElement(By.id("small-searchterms"));
        System.out.println("Attribute value :"   +    searTF.getAttribute("class"));
        System.out.println("Tagname for searchtextfield :"+searTF.getTagName());
        System.out.println("size of searchtextfield :"+searTF.getLocation());
        System.out.println("Searchtextfield height :"+searTF.getRect().getHeight());
        System.out.println("Searchtextfield width :"+searTF.getRect().getWidth());
        
        
        driver.quit();
        

	}

}
