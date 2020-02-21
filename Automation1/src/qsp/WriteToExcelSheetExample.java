package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcelSheetExample {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScriptData2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//write the data to excel by using SetCellValue
		wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("Pass");
		//get the java file object in write mode
		FileOutputStream fos=new FileOutputStream("./data/TestScriptData2.xlsx");
		//save the workbook in write mode
		wb.write(fos);
		//close the file once it is saved
		wb.close();
	}

}
