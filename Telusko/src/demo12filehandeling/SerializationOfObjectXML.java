package demo12filehandeling;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializationOfObjectXML {
public static void main(String[] args) {
	Student st1=new Student();
	st1.setRollno(101);
	st1.setName("Geetha");
	Student st2=new Student();
	st2.setRollno(102);
	st2.setName("Seetha");
	List<Student> s=new ArrayList<>();
	s.add(st1);
	s.add(st1);
	College c=new College();
	c.setStudents(s);
	
	try {
		XMLEncoder x=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("MyCollege.xml")));
		x.writeObject(c);
		x.close();
	} catch (FileNotFoundException e) {
		
		Logger.getLogger(SerializationOfObjectXML.class.getName()).log(Level.SEVERE,null, e);
		//e.printStackTrace();
	}
	
	
}
}
