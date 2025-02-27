package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution {

@Test(groups ="smoke")
public void java()
{
Reporter.log("java",true);
}


@Test(groups="smoke")
public void manual()
	{
		Reporter.log("manual",true);
	}
	
	
@Test(groups="regression")
	public void selenium()
	{
		Reporter.log("selenium",true);
		
	}
	
}



