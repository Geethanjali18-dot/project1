package collectionspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListInterface {
public static void main(String[] args) {
	List<Integer> values=new ArrayList<>();
	values.add(81);
	values.add(55);
	values.add(63);
	values.add(77);
	values.add(12);
	values.add(4);
	values.add(4, 27);//4 index
	
	// way 1 enhanced for loop
	for(Integer i:values)
	//for(int i:values)
	{
		System.out.println(i);
	}
	
	Collections.sort(values);
	//way 2 streamm API
	values.forEach(System.out::println);
	
	
}
	
	

}
