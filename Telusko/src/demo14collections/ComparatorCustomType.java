package demo14collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorCustomType {
public static void main(String[] args) {
	List<Student> studs=new ArrayList<>();
	studs.add(new Student(1,55));
	studs.add(new Student(2,53));
	studs.add(new Student(3,65));
	studs.add(new Student(4,95));
	studs.add(new Student(5,25));
	Collections.sort(studs,(s1,s2)->{
		return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
		
	});
	for(Student s:studs)
	{
		System.out.println(s);
	}
}
}

class Student
{
	int rollno;
	int marks;
	public Student(int rollno,int marks)
	{
		this.rollno=rollno;
		this.marks=marks;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	
}
