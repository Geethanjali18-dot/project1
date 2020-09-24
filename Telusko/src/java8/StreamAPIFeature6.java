package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIFeature6 {
public static void main(String[] args) {
	List<Integer> values=Arrays.asList(21,35,55,75,20,12,36,48,59);
	//external
	int result=0;
	for(int i:values)
	{
		if(i%5==0)
		{
			result+=i;
		}
	}
	System.out.println(result);
	//internal iteration
	System.out.println(values.stream().filter(i->i%5==0).reduce(0,(c,e)->c+e));
	
	
}
}
