package testcase;

import java.util.Scanner;

public class testcase9 
    {
	  public static void main(String []args)
	  {
		  Scanner s=new Scanner(System.in);
			System.out.println("Enter the string:");
			String str=s.nextLine();
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(Character.isWhitespace(str.charAt(i)))
				{
					count=count+1;
				}
			}
			System.out.println(count+1);
		

	  }
}
