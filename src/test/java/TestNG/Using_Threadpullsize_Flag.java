package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Threadpullsize_Flag {

	@Test (threadPoolSize = 2,invocationCount =3 )
		public void demo()
		{
		Reporter.log("demo",true);

	}
}


