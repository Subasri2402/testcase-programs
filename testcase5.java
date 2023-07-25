package testcase;

import java.util.Scanner;

public class testcase5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int d;
		int sum=0;
		while(n!=0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}

}
