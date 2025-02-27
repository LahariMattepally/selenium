package HandlingPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileuploadpopop_robot {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// launch the browser
					WebDriver driver=new ChromeDriver();
						//maximize the browser
							driver.manage().window().maximize();
							// implicit wait
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				             // navigate to an application
                          driver.get("https://the-internet.herokuapp.com/upload");
                    //handling fileupload popup using robot class
                       WebElement  upload_btn =  driver.findElement(By.id("file-upload"));
                       Thread.sleep(5000);
                       Actions act=new Actions(driver);
                       act.click(upload_btn).perform();
                       
                       
                       //selecting the  file and copying the file
                       StringSelection ss =new StringSelection("C:\\Users\\MATTEPALLY LAHARI\\OneDrive\\Desktop");
                    		   
                    		   //copyingthe file into system clipboard
                       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(null, null);
                          Thread.sleep(5000);
                        
                          Robot r=new Robot();
                          r.keyPress(KeyEvent.VK_CONTROL);
                          r.keyPress(KeyEvent.VK_V);
                          
                          
                          r.keyRelease(KeyEvent.VK_CONTROL);
                          r.keyRelease(KeyEvent.VK_V);
                          
                          r.keyPress(KeyEvent.VK_CONTROL);
                          r.keyPress(KeyEvent.VK_V);
                          
                          
                          //click on upload button
                          driver.findElement(By.id("file-submit")).click();
                          Thread.sleep(5000);
                          
                          
                          
                          //close the browser
                          driver.quit();
                          
                          

	}

}
