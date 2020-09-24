package demo7;
import aaa.Sample;
import static java.lang.System.out;
import static aaa.Sample.show;
public class StaticImport {
	public static void main(String[] args) {
		out.println("Hello");
		//Sample.show();
		show();
	}
	
}
