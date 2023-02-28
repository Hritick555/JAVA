package GitHub;

import java.util.Scanner;

public class powerOfThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean b=false;
		System.out.println("Enter the num");
		int num=s.nextInt();
		int n=num/3;
		for(int i=0;i<n;i++)
		{
			if(Math.pow(3,i)==num)
			{
				b=true;
			}
		}
		
 System.out.println(b);
	}

}
