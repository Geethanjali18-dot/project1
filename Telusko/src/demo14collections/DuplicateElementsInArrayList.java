package demo14collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArrayList {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<>();
	names.add("Geetha");
	names.add("Seetha");
	names.add("Teena");
	names.add("Geetha");
	
	for(String name:names)
	{
		System.out.println(name);
	}
	//To print duplicate elements
	
	Set<String> s=new HashSet<>();
	for(String name:names)
	{
		if(s.add(name)==false)
		System.out.println(name);
	}
	
}
}
