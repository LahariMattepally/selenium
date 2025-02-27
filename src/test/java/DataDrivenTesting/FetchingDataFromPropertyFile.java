package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		//step1: convert the physical property file into java object
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.Properties");
		
		//step2: create an abject of properties
		Properties p = new Properties();
		
		// step3: Load the properties object from java object
		p.load(fis);
		
		//step4:Fetch the data from properties object
		String data = p.getProperty("browser");
		
	System.out.println(data);
		

	}

}
