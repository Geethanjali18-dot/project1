package collectionspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArrayList {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<>();
	names.add("Geetha");
	names.add("Geetha");
	names.add("Anjali");
	names.add("Anju");
	names.add("Geethanajli");
	names.add("Geethanajli");
	//to print duplicate elements in array
	Set<String> s=new HashSet<>();
	for(String name:names)
	{
		if(s.add(name)==false)
		
		System.out.println(name);
	}
	
		
	
}
}
