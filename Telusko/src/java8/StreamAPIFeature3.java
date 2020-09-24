package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamAPIFeature3 {
public static void main(String[] args) {
	List<Integer> values=Arrays.asList(1,2,3,4,5);
	/*int result=0;
	
	//mutation
	for(int i:values)
	{
		result=result+i*2;
	}
	System.out.println(result); 
	*/
	Function<Integer,Integer> f=new Function<Integer,Integer>()
			{
		public Integer accept(Integer i)
		{
			return i*2;
		}

		@Override
		public Integer apply(Integer arg0) {
			// TODO Auto-generated method stub
			return null;
		}
			};
			//interface
			BinaryOperator<Integer> b=new BinaryOperator<Integer>()
					{
				int result=0;
				public Integer apply(Integer i,Integer j)
				{
					return i+j;					
				}
					};
	Stream s=values.stream();
	Stream s1=s.map(f);
	int result=(Integer)s1.reduce(0,b);
	//System.out.println(values.stream());
	System.out.println(result);
}
}
