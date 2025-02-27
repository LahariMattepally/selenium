package PomPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomUtility.Register_Qspydiers;

public class Login_to_Qspydiers {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Converting property file into java object
		FileInputStream fis=new FileInputStream("./src/test/resources/QSP.xlsx");
		//Create workbook/Fetch the workbook
				Workbook wb = WorkbookFactory.create(fis);
			//Create sheet
				Sheet sh = wb.getSheet("Sheet1");
				 String name = sh.getRow(1).getCell(0).getStringCellValue();
				  String mail = sh.getRow(1).getCell(1).getStringCellValue();
				  String pswd = sh.getRow(1).getCell(2).getStringCellValue();
	 //initialization for register page
				  Register_Qspydiers r=new Register_Qspydiers(driver); 
				  driver.get("https://demoapps.qspiders.com/ui");
				  Thread.sleep(3000);
				  
				  r.getname().sendKeys(name);
				  //Thread.sleep(3000);
				  r.getEmail().sendKeys(mail);
				 // Thread.sleep(3000);
				  r.getpswd(pswd);
				 // Thread.sleep(3000);
				  
				  r.getLogin_btn();
				  Thread.sleep(3000);
 //Initialization for Login page
				LoginQSP_POM I=new LoginQSP_POM(driver);
				  driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
				  Thread.sleep(3000);
				  l.getEmail().sendKeys(mail);
				 // Thread.sleep(3000);
				  l.getPswd(pswd);
				 // Thread.sleep(3000);
				  l.getLogin_btn();
				  Thread.sleep(3000);
 //TakeScreenShot
				//Step 1: Type cast takes screenshot (interface) with driver reference variable
				  TakesScreenshot ts=(TakesScreenshot)driver;
				//Step 2:Take the screenshot and store in temparory file
				  File src=ts.getScreenshotAs(OutputType.FILE);
				//Step 3: create an empty file
				  File dest=new File("./ScreenShot/QSP.png");
				//Step 4:copy the screenshot in an empty file
				  FileUtils.copyFile(src, dest);
				  //closing the workbook
				  wb.close();
				  //closing the browser
				  driver.quit();
	}

}