import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    String N = sc.next();
		    int c = 0, d = 0;
		    for(int i = 0; i<N.length();i++)
		    {
		        if(N.charAt(i) == '1')
		        {
		            c++;
		        }
		        if(N.charAt(i) == '0')
		        {
		            d++;
		        }
		    }
		    if(c==1 || d==1) 
		    System.out.println("Yes");
		    else 
		    System.out.println("No");
		}
	}
}