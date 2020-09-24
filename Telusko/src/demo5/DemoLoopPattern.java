package demo5;

public class DemoLoopPattern {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
	}
	for(int m=1;m<=5;m++)
	{
		for(int n=1;n<=m;n++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int p=1;p<=5;p++)
	{
		for(int q=1;q<=5;q++)
		{
			System.out.print(q+" ");
		}
		System.out.println();
	}
	for(int r=1;r<=5;r++)
	{
		for(int s=1;s<=5;s++)
		{
			System.out.print(r+" ");
		}
		System.out.println();
	}
	for(int a=1;a<=4;a++)
	{
		for(int b=1;b<=4;b++)
		{
			int k=a+b-1;
			if(k>4)
			System.out.print(k-4+" ");
			else
				System.out.print(k+" ");
		}
		System.out.println();
	}
}
}
