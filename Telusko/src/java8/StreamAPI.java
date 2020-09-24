package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class StreamAPI {
public static void main(String[] args) {
	  List<Integer> l=Arrays.asList(1,2,3,4,5,6);
	  //way1
	  for(int i=0;i<6;i++)
	  {
		  System.out.println(l.get(i));
	  }
	  
	  //way2
	  Iterator<Integer> i=l.iterator();
	  while(i.hasNext())
	  {
		System.out.println(i.next());  
	  }
	  
	  //way3
	  for(int j:l)
	  {
		  System.out.println(j);
	  }
	  //the above loops are External Iteration
	  //Internal iteration can be done using stream API
	  l.forEach(k->System.out.println(k));
	  
	  
}
}
