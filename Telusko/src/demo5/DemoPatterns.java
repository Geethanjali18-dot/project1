package demo5;

public class DemoPatterns {
public static void main(String[] args) {
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		
		for(int k=1;k<=4;k++)
		{
			for(int m=1;m<=k;m++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int l=1;l<=4;l++)
		{
			for(int n=1;n<=4;n++)
			{
				if(l==1||l==4||n==1||n==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
}

