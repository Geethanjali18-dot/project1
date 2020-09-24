package demo_4;

public class DemoPostPreIncrement {
public static void main(String[] args) {
	int i=5;
	i=i+1;
	System.out.println(i);
	//shorthand operator i=i+1
	int j=i++;
	System.out.println(j+i);
	int k;
	k=++i;
	System.out.println(k);
	i=i++;
	System.out.println(i);
	
}
}
 