package collectionspractice;

import java.util.ArrayList;
import java.util.Vector;

public class VectorVSArrayList {
public static void main(String[] args) {
	Vector<Integer> v=new Vector();// Thread safe
	v.add(4);
	v.add(51);
	v.add(78);
	v.add(23);
	v.add(7);
	/*v.add(8);
	v.add(14);
	v.add(91);
	v.add(39);
	v.add(18);
	v.add(19);
	*/
	System.out.println(v.capacity());
	v.forEach(System.out::println);
	//or
	//for(Integeri:v)
	for(int i:v)
	{
		System.out.println(i);
	}
	ArrayList<Integer> al=new ArrayList<>();//Not thread safe
	al.add(3);
	al.add(15);
	al.add(62);
	System.out.println(al.size());
}
}

