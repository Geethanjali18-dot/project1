package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIFeature5 {
public static void main(String[] args) {
	List<Integer> values=Arrays.asList(1,2,3,4,5);
	Stream<Integer> s=values.stream();
	System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c, e)));
	System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));//method reference
}
}
