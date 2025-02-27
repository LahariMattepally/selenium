package Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMultipleDataFromExcel1 {



	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Convert physical file into java object
				FileInputStream fis = new FileInputStream("./src/test/resources/dtd.xlsx");
				
				//Create workbook/Fetch the workbook
				Workbook wb = WorkbookFactory.create(fis);
				
				//Fetch the sheet
				Sheet sh = wb.getSheetAt(0);
				
				//Iterates through rows
				for(Row r:sh) {
					
					//Iterates through cells in the row
					for(Cell c:r) {
						 
						//print cell value
						System.out.println(c.getStringCellValue());
					}
					//System.out.println();
				}
				
				//Close the workbook
				wb.close();
				


	}

}


