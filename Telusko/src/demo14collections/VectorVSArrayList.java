package demo14collections;

import java.util.ArrayList;
import java.util.Vector;
//vector->Dynamic Array increases by 100%,Thread safe hence its slow
//ArrayList increases by 50% ,Not thread safe hence its fast
public class VectorVSArrayList {
public static void main(String[] args) {
	 Vector<Integer> v=new Vector();
	 v.add(4);
	 v.add(7);
	/* v.add(4);
	 v.add(7);
	 v.add(4);
	 v.add(7);
	 v.add(4);
	 v.add(7);
	 v.add(4);
	 v.add(7);
	 v.add(4);
	 v.add(7);*/
	 v.remove(1);
	 for(int i:v)
	 {
		 System.out.println(i);
	 }
	 
	 
	 ArrayList<Integer> a=new ArrayList<Integer>();
	 System.out.println(a.size());
	 
	 
	 
	 
	 System.out.println(v.capacity());
	 
}
}
