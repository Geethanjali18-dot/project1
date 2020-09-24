package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassForName {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	PQR obj=new PQR();
	Class.forName("PQR");//to load the class
	Class.forName("PQR").newInstance();
	Class.forName("com.mysql.jdbc.Driver");
	//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
}
}
class PQR
{
	static
	{
		System.out.println("in static");
	}
	{
		System.out.println("in instance");
	}
}
