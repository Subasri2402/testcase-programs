package testcase;
import java.util.Scanner;
public class testcase1 {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
		System.out.println(" ");
		}
	System.out.println();
	}

}
