package collectionspractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionAndGenerics {
public static void main(String[] args) {
	 Collection values=new ArrayList();
	 values.add(3);
	 values.add(5.5);
	 values.add("Geetha");
	//way 1  
	 for(Object o:values)
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
