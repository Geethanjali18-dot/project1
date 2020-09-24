package demo6;

import java.util.Random;

public class EnhancedForLoopOrForEachLoop {
public static void main(String[] args) {
	int[] nums=new int[10];
	Random r=new Random();
	for(int i=0;i<nums.length;i++)
	{
		nums[i]=r.nextInt(50);
				
	}
	System.out.println(nums);
	for(int i=0;i<nums.length;i++)
	{
		System.out.println(nums[i]);
		
	}
	//enhanced for loop
	for(int i: nums)
	{
		System.out.println(i);
			
		
	}
	
	
}
}
