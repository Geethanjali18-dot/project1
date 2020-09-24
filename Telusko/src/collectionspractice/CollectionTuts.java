package collectionspractice;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTuts {
public static void main(String[] args) {
	Collection<Integer> c=new ArrayList<>();
	c.add(1);
	c.add(2);
	c.add(3);
	//c.add("Geetha");
	//c.add(5.5);
	c.remove(2);
	for(Integer o:c)
	{
		System.out.println(o);
	}
	
}
}
