package java8;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class StreamAPIFeature {
public static void main(String[] args) {
	  List<Integer> l=Arrays.asList(1,2,3,4,5,6);
//Consumer<Integer> c=i->System.out.println(i);

	  //Internal iteration can be done using stream API
	  l.forEach(System.out::println);//println is method reference//call  by method, passing method reference	   
	  
	  
}
}

/*class CC implements Consumer
{
	
}*/
