package PomPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomUtility.LoginPomPage;

public class login_to_facebook {

	public static void main(String[] args) throws IOException {
		// launch the browser
				WebDriver driver =new ChromeDriver();
				// maximize the window
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
FileInputStream fis = new FileInputStream("./src/test/resources/Fcebookloginpage");
Properties p =new Properties();
p.load(fis);


String URL = p.getProperty("url");
String UN = p.getProperty("uername");
String PSWD = p.getProperty("password");

LoginPomPage l= new LoginPomPage(driver);

driver.get(URL);


//verification
if (l.getHeader().contains("Facebook helps you")); {
	l.getUn().sendKeys(UN);
	l.getpswd(PSWD);
	
	driver.navigate().refresh();
	l.getUn().sendKeys(UN);
	l.getpswd(PSWD);
	l.getLogin_btn();
	//WebElement user=driver.findelement(By.id("email"));
	//user.sendkeys("sele")
	//Thread.sleep(3000);
	//driver.navigate().refresh();
	//Thread.sleep(3000);
	//user.sendkeys("abc123");
	
}



	}

}
