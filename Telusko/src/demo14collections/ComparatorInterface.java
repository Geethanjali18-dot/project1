package demo14collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorInterface {
public static void main(String[] args) {
	
	List<Integer> values=new ArrayList<Integer>();
	values.add(315);
	values.add(772);
	values.add(884);
	values.add(1,99);
	
	
			
	Collections.sort(values);
	for(int i:values)
	{
		System.out.println(i);
	}
	//descending order
	Collections.reverse(values);
			
	for(int i:values)
	{
		System.out.println(i);
	}
	//sorting with respect to last digit of number//
	//to change the logic of comparison
	/*Comparator<Integer> com=( o1,  o2)->
			
		 {
			 return o1%10>o2%10?1:-1;
			/*if(o1%10>o2%10)
				return 1;//swap
			
			return -1;//do not swap
		*/
			//};
	Collections.sort(values, ( o1,  o2)->
	{
		return o1%10>o2%10?1:-1;	
	});
	
}
}
