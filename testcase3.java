package testcase;
import java.util.Scanner;
public class testcase3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
		    count++;
		}
	System.out.println("The no.of.digit are:"+count);

	}

}
