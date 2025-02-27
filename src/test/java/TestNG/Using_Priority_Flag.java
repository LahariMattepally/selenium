package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Using_Priority_Flag {
	
	
	@Test (priority=2)
public void apple()
{
			Reporter.log("Test Started apple",true);
}
	
	
@Test(priority=3)
public void pineapple()
{
	Reporter.log("Test Started pineapple",true);
}

@Test(priority = 1)
public void mango()
{
	Reporter.log("Test Started mango",true);
}
	

}


