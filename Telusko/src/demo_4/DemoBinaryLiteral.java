package demo_4;

public class DemoBinaryLiteral {
	public static void main(String[] args) {
		int i=5;
		System.out.println(i);
		int i1=0b101;//0B101
		System.out.println(i1);
		int i2=0b10100000;
		System.out.println(i2);
		int i3=0b1010_00_00_00;
		System.out.println(i3);
		//without _
		int i4=0b1010000000;
		System.out.println(i4);
	}

}
