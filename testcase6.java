package testcase;
import java.util.Scanner;
public class testcase6 {

	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String var=sc.nextLine();
    int a=0;
    int e=0;
    int i=0;
    int o=0;
    int u=0;
    for(int j=0;j<var.length();j++)
    {
    	if(var.charAt(j)=='a'||var.charAt(j)=='A')
    	{
    		a++;
    	}
    	if(var.charAt(j)=='e'||var.charAt(j)=='E')
    	{
    		e++;
    	}
    	if(var.charAt(j)=='i'||	var.charAt(j)=='I')
    	{
    		i++;
    	}
    	if(var.charAt(j)=='o'||var.charAt(j)=='O')
    	{
    		o++;
    	}	
    	if(var.charAt(j)=='u'||var.charAt(j)=='U')
    	{
    		u++;
    	}
    		
    }
    System.out.println("a is "+a+"\ne is "+e+"\ni is "+i+"\no is "+o+"\nu is "+u);
	}

}
