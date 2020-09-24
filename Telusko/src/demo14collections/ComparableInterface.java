package demo14collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
public static void main(String[] args) {
	List<Students> studs=new ArrayList<>();
	studs.add(new Students(1,55));
	studs.add(new Students(2,53));
	studs.add(new Students(3,65));
	studs.add(new Students(4,95));
	studs.add(new Students(5,25));
	Collections.sort(studs);
		

	for(Students s:studs)
	{
		System.out.println(s);
	}
}
}

class Students implements Comparable<Students>
{
	int rollno;
	int marks;
	public Students(int rollno,int marks)
	{
		this.rollno=rollno;
		this.marks=marks;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	public int compareTo(Students s) {
		
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
	
	
}
