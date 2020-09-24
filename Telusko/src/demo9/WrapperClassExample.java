package demo9;

import java.util.ArrayList;

//int,float,double,char
//Integer,Float,Double,Character
public class WrapperClassExample {
public static void main(String[] args) {
	int i=5;//only value not an object
	//Boxing
	Integer ii=new Integer(i);//object
	Integer jj=i;//Autoboxing
	int j=jj.intValue();//unboxing
	int k=jj;//Autounboxing
	ArrayList<Integer> values=new ArrayList();
	values.add(5);//Autoboxing
	values.add(7);
	
	 
}
}
