package jdbc;
//pending output
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

//DAO-Data Access Object
public class JDBCDAOExample {
public static void main(String[] args) throws SQLException {
	StudentDAO dao=new StudentDAO();
	Student s1=dao.getStudent(14);
	//dao.addStudent(s2);
	System.out.println(s1.sname);
}
}

class StudentDAO
{
	public Student getStudent(int rollno) throws SQLException
	{
		
		try {
			String query="select sname from Students where rollno="+rollno;
			Student s=new Student();
			s.rollno=rollno;
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Telusko","root","root");
			Statement st=(Statement) conn.createStatement();
			ResultSet rs=((java.sql.Statement) st).executeQuery(query);
			rs.next();
			String name=rs.getString(1);
					
			s.sname=name;
			return s;
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
			//e.printStackTrace();
		}
		return null;
		
	}
}
class Student
{
	int rollno;
	String sname;
}