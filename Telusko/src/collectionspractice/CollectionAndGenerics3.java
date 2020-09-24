package collectionspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionAndGenerics3 {
public static void main(String[] args) {
	List <Integer> c=new ArrayList<>();
	//c.add(1);
	//c.add(2);
	//c.add(3);
	//c.add(2,4);
	Random r=new Random();
	for(int i=1;i<100;i++)
	{
		c.add(r.nextInt(1000));
	}
	
	Collections.sort(c);
	for(Integer o:c)
	{
		System.out.println(o);
	}
}
}
