package GitHub;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n=1534236469;
		int reverse=0;
		while(n!=0)
		{
			int remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
		System.out.println(reverse);
	}

		

	}


