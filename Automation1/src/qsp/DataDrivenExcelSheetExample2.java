package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenExcelSheetExample2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Pradeep\\Desktop\\Automation\\TestScriptData1.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 //get the last user rowcount
		 int rowCount = wb.getSheet("CreateCustomer").getLastRowNum();
		 for(int i=1;i<=rowCount;i++) {
			 String value = wb.getSheet("CreateCustomer").getRow(i).getCell(0).toString();
			 //or
			 //String data1 = wb.getSheet("CreateCustomer").getRow(i).getCell(0).getStringCellValue();
			 System.out.println(value);
		 }
		 
		 
	}
	

}
