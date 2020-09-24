package collectionspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBraceInitialization {
public static void main(String[] args) {
	//List<Integer> values=new ArrayList<>();
	//values.add(56);
	//values.add(67);
	//values.add(88);
	//List<Integer> values=Arrays.asList(56,67,88);
	List<Integer> values=new ArrayList<Integer>()
			{{
				add(56);
				add(76);
				add(12);
			}};
	
	for(int i: values)
	{
		System.out.println(i);
	}
}
}
