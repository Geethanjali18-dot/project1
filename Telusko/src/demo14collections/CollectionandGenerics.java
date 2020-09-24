package demo14collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



//collection introduced in java 1.2
//Generics introduced in java 1.5
//Dynamic array advantage of using collection
public class CollectionandGenerics {
public static void main(String[] args) {
	//int[] value=new int[4];
	//Object values=new Object[4];
	//values[0]="Geetha";
	//values[1]=7;
	Collection<Integer> values1=new ArrayList<>();
	values1.add(3);
	values1.add(77);
	values1.add(88);
	values1.add(81);
	values1.remove(88);
	Iterator k=values1.iterator();
	System.out.println(k.next());
	System.out.println(k.next());
	System.out.println(k.next());
	
	//to add the value inbetween use List
	
	Collection values=new ArrayList();
	values.add(3);
	values.add("Geetha");
	values.add(5.8);
	
	//way1 to fetch values
	Iterator i=values.iterator();
	System.out.println(i.next());
	System.out.println(i.next());
	System.out.println(i.next());
	
	//or using while loop
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	//way2 enhanced for loop
	for(Object j:values)
	{
		System.out.println(j);
	}
	
}
}
