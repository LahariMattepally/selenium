package PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Qspydiers {
	//declaration
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement pswd;
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement register_btn;


//Initialization
public Register_Qspydiers(WebDriver driver)  {
	PageFactory.initElements(driver,this);
}

//Utilization

	public WebElement getname() {
		return name;
	}
	
	public WebElement getEmail() {
		return email;
		 
	}
	public void getpswd(String password) {
		pswd.sendKeys(password);
	}
	
	public void getLogin_btn() {
		register_btn.click();
	}

	public void getRegister_btn() {
		// TODO Auto-generated method stub
		
	}




	
	

	
		


	}

