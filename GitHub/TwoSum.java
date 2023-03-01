package GitHub;

import java.util.Scanner;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.

//Example 1:

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:

//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:

//Input: nums = [3,3], target = 6
//Output: [0,1]

public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
	        int a=0;
	        int in[]=new int[2];
	        for(int i=0;i<nums.length-1;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	               a=nums[i]+nums[j];
	               if(a==target)
	               {
	                  in[0]=i;
	                  in[1]=j;
	                  return in;
	               }
	            }
	        }
	        System.out.println(in);
	        return in;
	    }
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of the array");
		int l1=sc.nextInt();
		int[] a=new int[l1];
		System.out.println("Enter the array");
		for(int i=0;i<l1;i++)
		{
			a[i]=sc.nextInt();	
	    }
		System.out.println("Enter target value");
		int b=sc.nextInt();
		
		System.out.println(twoSum(a,b));
	}
}
