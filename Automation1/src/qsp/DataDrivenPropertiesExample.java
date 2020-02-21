package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenPropertiesExample {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Pradeep\\Desktop\\Automation\\commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	
	String value=p.getProperty("url");
	System.out.println(value);
	String value1=p.getProperty("UN");
	System.out.println(value1);
	String value2=p.getProperty("PWD");
	System.out.println(value2);
	
}
	
	
	
}
