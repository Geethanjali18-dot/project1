package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIFeature9 {
public static void main(String[] args) {
	List<Integer> values=Arrays.asList(21,35,55,75,20,12,36,48,59);
	int result=0;
	for(int i:values)
	{
		if(i%5==0)
		{
			result=i*2;
			break;
	}
	}
	System.out.println(result);
	System.out.println(values.stream()
				.filter(StreamAPIFeature9::isDivisible)
				.map(StreamAPIFeature9::mapDouble)
				.findFirst()
				.orElse(0));
}
public static boolean isDivisible(int j)
{
	System.out.println("in isDivisible "+j);
	return j%5==0;
}
public static int mapDouble(int k)
{
	System.out.println("in mapDouble"+k);
	return k*2;
}
}




