package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataBackToTheProfile {

	public static void main(String[] args) throws IOException {
		//step1: convert the physical property file into java object
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.Properties");
		
		//step2: create an abject of properties
		Properties p = new Properties();
		
		// step3: Load the properties object from java object
		p.load(fis);
		
		//step4: writing data back to property object
		p.put("animal" , "cat");
		
		// step5:save the property file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/CommonData.Properties");
		p.store(fos, "updated sucessfully");

	}

}
