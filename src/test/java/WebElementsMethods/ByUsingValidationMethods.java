package WebElementsMethods;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class ByUsingValidationMethods {

			public static void main(String[] args) {
				// launching the browser
						WebDriver driver=new ChromeDriver();
						// maximize the window
						driver.manage().window().maximize();
						//navigate the window
						driver.get("https://demowebshop.tricentis.com/");
						WebElement searchTF = driver.findElement(By.id("small-searchterms"));
						if (searchTF.isDisplayed()) {
						searchTF.sendKeys("shoes");
			} else {
		System.out.println("Element not displayed");
			}
						WebElement searchbtn= driver.findElement(By.xpath("//input[@type='submit']"));
						if (searchbtn.isEnabled()) {
							System.out.println(searchbtn.isEnabled());
							searchbtn.click();
							
							
						}


	}

}
