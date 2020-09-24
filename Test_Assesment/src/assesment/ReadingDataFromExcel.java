package assesment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ReadingDataFromExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/test.xlsx");
		/*Properties p=new Properties();
		p.load(fis);
		String name = p.getProperty("name");*/
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		System.out.println(data);
		/*String rollno = p.getProperty("rollno");
		System.out.println("name "+name+"rollno "+rollno);*/
		
	}

}


