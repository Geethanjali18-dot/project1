package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamAPIFeature4 {
public static void main(String[] args) {
	List<Integer> values=Arrays.asList(1,2,3,4,5);
	Stream<Integer> s=values.stream();
	//Stream<Integer> s1=s.map(i-> i*2);
	//c-carry,e-value
	//Integer result=s.map(i->i*2).reduce(0,(c,e)->c+e);					
	//Integer result=values.stream().map(i->i*2).reduce(0,(c,e)->c+e);
	//System.out.println(result);
	System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
}
}
