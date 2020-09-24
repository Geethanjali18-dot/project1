package java8;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class MethodReference {
public static void main(String[] args) {
	  List<Integer> l=Arrays.asList(1,2,3,4,5,6);


	  //Internal iteration can be done using stream API
	  //l.forEach(i->doubleit(i));
	  l.forEach(MethodReference::doubleit);//method reference
	  
	  
}
public static void doubleit(int i)
{
	System.out.println(i*2);
}
}

