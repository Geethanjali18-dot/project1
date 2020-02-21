package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenExcelSheetExample {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Pradeep\\Desktop\\Automation\\TestScriptData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String data = wb.getSheet("CreateCustomer").getRow(1).getCell(0).toString();
		 //or
		 String data1 = wb.getSheet("CreateCustomer").getRow(1).getCell(0).getStringCellValue();
		 System.out.println(data);
		 //or
		 System.out.println(data1);
		 
	}
	

}
