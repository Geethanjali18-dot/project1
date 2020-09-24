package collectionspractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionAndGenerics2 {
public static void main(String[] args) {
	 Collection<Integer> values=new ArrayList<>();
	 values.add(3);
	 values.add(5);
	 values.add(8);
	 values.add(11);
	 values.remove(5);
	 //values.add(1,11);
	 
	 //values.add(5.5);
	 //values.add("Geetha");
	//way 1  
	 //for(Integer o:values)
	 for(int o:values)
	 {
		 System.out.println(o);
	 }
	 
	//way 2
	 Iterator itr=values.iterator();
	// System.out.println(itr.next());
	 //System.out.println(itr.next());
	 //System.out.println(itr.next());
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
	 
}
}
