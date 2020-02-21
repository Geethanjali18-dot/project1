package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenExcelSheetExample1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Pradeep\\Desktop\\Automation\\TestScriptData.xlsx");
		//open workbook in read mode 
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet
		Sheet sheet = wb.getSheet("CreateCustomer");
		//get the control of the row
		Row row = sheet.getRow(1);
		//get control of the cell
		Cell cell = row.getCell(0);
		//read the string data
		String data= cell.toString();
		//or to read the string data
		RichTextString data1 = cell.getRichStringCellValue();
		String data2 = cell.getStringCellValue();
		System.out.println(data);
		//or
		System.out.println(data1);
		//or
		System.out.println(data2);
		/* optimized code
		 * String data = wb.getSheet("CreateCustomer").getRow(1).getCell(0).toString();
		 * or
		 * RichTextString data = wb.getSheet("CreateCustomer").getRow(1).getCell(0).getRichStringCellValue();
		 */



	}


}
