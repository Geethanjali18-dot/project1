package demo14collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//duplicate elements not allowed
//it does not maintain insertion order
public class SetInterface {
public static void main(String[] args) {
	Set<Integer> values=new HashSet<>();
	//heap memory
	System.out.println(values.add(57));
	System.out.println(values.add(64));
	System.out.println(values.add(92));
	System.out.println(values.add(61));
	System.out.println(values.add(61));
	
	
	for(int i:values)
	{
		System.out.println(i);
	}
	//it maintains insertion order
	Set<Integer> values1=new TreeSet<>();
	System.out.println(values1.add(57));
	System.out.println(values1.add(64));
	System.out.println(values1.add(92));
	System.out.println(values1.add(61));
	System.out.println(values1.add(61));
	
	
	for(int i:values1)
	{
		System.out.println(i);
	}
}
}
