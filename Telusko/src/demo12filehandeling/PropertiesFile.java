package demo12filehandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
public static void main(String[] args) throws IOException {
	//to create property file 
	Properties p=new Properties();
	 OutputStream os=new FileOutputStream("dataconfig.properties");
	 p.setProperty("url", "localhost:3036/myDB");
	 p.setProperty("uname", "Geetha");
	 p.setProperty("pwd", "1234");
	 p.store(os, null);
	 
	 //to fetch the value from property file
	 InputStream is=new FileInputStream("dataconfig.properties");
	 p.load(is);
	 System.out.println(p.getProperty("url"));
	 System.out.println(p.getProperty("uname"));
	 System.out.println(p.getProperty("pwd"));
	 p.list(System.out);
}
}
