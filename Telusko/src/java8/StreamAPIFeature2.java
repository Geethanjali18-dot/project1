package java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPIFeature2 {
public static void main(String[] args) {
	List<Integer> values=Arrays.asList(1,2,3,4,5);
	//int result=0;
	
	//mutation
	/*for(int i:values)
	{
		result=result+i*2;
	}*/
	//System.out.println(result);
	System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
}
}
