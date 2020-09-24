package demo9;
//StringBuffer thread safe
//StringBuilder is not thread safe
public class StringMutable {
public static void main(String[] args) {
	StringBuffer sbf=new StringBuffer("Geetha");
	sbf.append("anjali");
	System.out.println(sbf);
	sbf.replace(6, 10, "Pradeep");
	System.out.println(sbf);
	sbf.delete(8, 11);
	System.out.println(sbf);
	
	
	StringBuilder sb=new StringBuilder("Geetha");
	sb.append("anjali");
	System.out.println(sb);
	sb.replace(6, 10, "Pradeep");
	System.out.println(sb);
	sb.delete(8, 11);
	System.out.println(sb);
	
}
}
