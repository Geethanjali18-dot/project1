package demo14collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
public static void main(String[] args) {
	
	List<Integer> values=new ArrayList<Integer>();
	values.add(3);
	values.add(77);
	values.add(88);
	values.add(1,9);
	
	Iterator i=values.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			Collections.sort(values);
			
			values.forEach(System.out::println);//stream API which uses lambda expression
	
	
}
}
