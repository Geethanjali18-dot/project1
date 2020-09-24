package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIFeature7Filter {
public static void main(String[] args) {
	List<Integer> values=Arrays.asList(21,35,55,75,20,12,36,48,59);
	
	//internal iteration
	System.out.println(values.stream()
							  .filter(i->i%5==0)
			                  .reduce(0,(c,e)->c+e));
	
	Predicate<Integer> p=new Predicate<Integer>()
			{

				public boolean test(Integer i) {
					
					return i%5==0;
				}

				
			};
	System.out.println(values.stream()
			.filter(p).reduce(0,(c,e)->c+e));
	
}
}
