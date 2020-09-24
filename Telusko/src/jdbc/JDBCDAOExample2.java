package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
//pending ouput
//DAO-Data Access Object
public class JDBCDAOExample2 {
public static void main(String[] args) throws SQLException {
	StudentDAOExample dao=new StudentDAOExample();
	Students s2=dao.getStudent(14);
	s2.rollno=15;
	s2.sname="Anuja";
	dao.connect();
	dao.addStudent(s2);
	//dao.removeStudent(12);
	
}
}

class StudentDAOExample
{
	Connection conn=null;
	public void connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Telusko","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	public Students getStudent(int rollno) throws SQLException
	{
		
		try {
			String query="select sname from Students where rollno="+rollno;
			Students s=new Students();
			s.rollno=rollno;
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Telusko","root","root");
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
	
	public void addStudent(Students s)
	{
		String query="insert into  Students values(?,?)";
		PreparedStatement pst;
		try {
			 pst=conn.prepareStatement(query);
			 pst.setInt(1, s.rollno);
			 pst.setString(2, s.sname);
		} catch (SQLException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		
		
	}
	
}
class Students
{
	int rollno;
	String sname;
}