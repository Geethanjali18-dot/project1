package demo9;

public class ToStringMethod {
public static void main(String[] args) {
	 Student s1=new Student(11,"Geetha");
	 System.out.println(s1);//by default s1.toString() method will be called
	 System.out.println(s1.rollno);
	 System.out.println(s1.name);
}
}
// 
class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	//override toString method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	/*
	 * public String toString()
	{
		return rollno+":"+name;
		
	}
	 */
}