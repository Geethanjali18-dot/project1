package demo6;

public class JaggedArray {
public static void main(String[] args) {
	
		
		int a=4,b=5,c=6,d=8;
		int x[]= {4,5,6,3};
		int y[]= {4,2,6,8};
		int z[]= {1,5,6,8};
		
		int p[][]=new int[3][4];
		int p1[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,1,3,5}
				
		};
		//jagged Array
		int k[][]=new int[3][];
		k[0]=new int[4];
		k[1]=new int[2];
		k[2]=new int[3];
		for(int i=0;i<4;i++)
		{
			System.out.println(x[i]);
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(p1[i][j]+" ");
			}
			System.out.println();
		}
		//enhanced for loop 2D Array
		for(int[] i:p1)
		{
			for(int j:i)
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}
		
	}
	


}
