package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Geethanjali
 * it is generic class to read the data from properties and Excel files
 */


public class FileLib {
	/**
	 * this method is used to read the data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 * 
	 */
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
		
	}
	/**
	 * this method is used to read the data from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/TestScriptData2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return data;
		
	}
	/**
	 * to write the data back to excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public void setExcelData(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/TestScriptData2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/TestScriptData2.xlsx");
		wb.write(fos);
		wb.close();
			
	} 

}
