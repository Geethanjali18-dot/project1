package collectionspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
public static void main(String[] args) {
	List<Integer> values=new ArrayList<>();
	values.add(358);
	values.add(524);
	values.add(327);
	values.add(193);
	values.add(651);
	
	Collections.sort(values);
	
	for(int i:values)
	{
		System.out.println(i);
	}
	Collections.reverse(values);
	values.forEach(System.out::println);
	
	Collections.sort(values,(o1,o2)->
	{return o1%10>o2%10?1:-1;});
	for(int i:values)
	{
		System.out.println(i);
	}
}
}
