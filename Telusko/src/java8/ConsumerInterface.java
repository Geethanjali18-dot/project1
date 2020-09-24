package java8;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class ConsumerInterface {
public static void main(String[] args) {
	  List<Integer> l=Arrays.asList(1,2,3,4,5,6);
Consumer<Integer> c=new Consumer<Integer>()
{
	public void accept(Integer i)
	{
		System.out.println(i);
	}
	
};
	  //Internal iteration can be done using stream API
	  l.forEach(c);
	  
	  
}
}

/*class CC implements Consumer
{
	
}*/
