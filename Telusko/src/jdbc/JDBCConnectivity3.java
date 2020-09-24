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
public class JDBCConnectivity3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/Telusko";
	String uname="root";
	String pwd="root";
	String name="Dipali";
	String college="Ramaih";
	//String query="insert into Student values("+name+",'"+college+"')";
	//String query="insert into Student values('Anjali','Psit')";
	String query="insert into Student values(?,?)";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pwd);
	PreparedStatement st=con.prepareStatement(query);
	st.setString(1, name);
	st.setString(2, college);
	int count=st.executeUpdate();
	System.out.println(count+" rows affected");
	
	
	
	st.close();
	con.close();
	




}
}
