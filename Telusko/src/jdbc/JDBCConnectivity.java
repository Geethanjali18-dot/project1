package jdbc;
import java.sql.*;

/*
 * 1.import->java.sql
 * 2.load and register the driver->com.mysql.jdbc.Driver
 * 3.create connection->Connection
 * 4.create statement->Statement
 * 5.execute the query
 * 6.process the result
 * 7.close
 */
public class JDBCConnectivity {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/Telusko";
	String uname="root";
	String pwd="root";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pwd);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from Student");
	rs.next();
	String name=rs.getString("name");
	
	System.out.println(name);
	
	
	
	st.close();
	con.close();
	




}
}
