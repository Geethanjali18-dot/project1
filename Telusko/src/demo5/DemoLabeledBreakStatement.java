package demo5;
//HiddenFeature
public class DemoLabeledBreakStatement {

	public static void main(String[] args) {
		label:
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==3)
					break label;//labeled break statement
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
