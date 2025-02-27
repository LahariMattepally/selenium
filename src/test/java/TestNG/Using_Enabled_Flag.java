package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Enabled_Flag {


	

		@Test 
	public void apple()
	{
				Reporter.log("Test Started apple",true);
	}
		
		
	@Test(enabled=false)
	public void pineapple()
	{
		Reporter.log("Test Started pineapple",true);
	}

	@Test
	public void mango()
	{
		Reporter.log("Test Started mango",true);
	}
	


		
	}


