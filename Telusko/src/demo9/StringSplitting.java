package demo9;

public class StringSplitting {
public static void main(String[] args) {
	String str="Geetha,Seetha,Meena,Heena";
	System.out.println(str);
	String names[]=str.split(",");
	System.out.println(names[2]);
	for(String val:names)
	{
		System.out.println(val);
	}
}
}
