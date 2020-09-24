package demo12filehandeling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Save obj=new Save();
	obj.i=4;
	File f=new File("obj.txt");
	FileOutputStream fos=new FileOutputStream(f);
	ObjectOutputStream os=new ObjectOutputStream(fos);
	os.writeObject(obj);//saving object
	
	//to fetch values from file
	FileInputStream fis=new FileInputStream(f);
	ObjectInputStream ois=new ObjectInputStream(fis);
	Save obj1=(Save)ois.readObject();
	System.out.println(obj1);
	
	
	
}
}

class Save implements Serializable
{
	int i;
}
