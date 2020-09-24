package demo12filehandeling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandeling {
public static void main(String[] args) throws IOException {
	File f=new File("demo.txt");
	FileOutputStream fos=new FileOutputStream(f);
	DataOutputStream dos=new DataOutputStream(fos);
	dos.writeUTF("demo content");//UTF means format
	
	FileInputStream fis=new FileInputStream(f);
	DataInputStream dis=new DataInputStream(fis);
	String str=dis.readUTF();
	System.out.println(str);
}
}
