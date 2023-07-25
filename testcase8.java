package testcase;

import java.util.Scanner;

public class testcase8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		char var=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(var);
			}
		System.out.println( );
		var++;
		}
	

	}

}
