package demo14collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBraceInitialization {

	public static void main(String[] args) {
		//List<Integer> values=new ArrayList<Integer>();
		/*values.add(56);
		values.add(88);
		values.add(12);
		*/
		//if we know the values
		List<Integer> values=Arrays.asList(56,77,12);
		//if we do not know the values
		List<Integer> values1=new ArrayList<Integer>();
		{{
			values1.add(56);
			values1.add(77);
			values1.add(12);
		}};
		for(int i:values)
		{
			System.out.println(i);
		}
	}
}
