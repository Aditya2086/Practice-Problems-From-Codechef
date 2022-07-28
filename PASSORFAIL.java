import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		long t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int p=sc.nextInt();
		    if(x == 0)
		    {
		    System.out.println("FAIL");
		    }
		    else {
		    int c= (x*3) - (n-x);
		    if(c>=p) {
		    System.out.println("PASS");
		    }
		    else {
		    System.out.println("FAIL");
		    }
		    }
		    
		}
	}
}
