import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int z=0; z<t; z++)
		{
		    int w = sc.nextInt();
		    String s = sc.next();
		    
		    int a[] = new int[7];
		    for(int i = 0; i<7; i++)
		    a[i]=0;
		    int curr = 0;
		    
		    if(s.equals("mon")) curr=1;
		    else if(s.equals("tues")) curr=2;
		    else if(s.equals("wed")) curr=3;
		    else if(s.equals("thurs")) curr=4;
		    else if(s.equals("fri")) curr=5;
		    else if(s.equals("sat")) curr=6;
		    else if(s.equals("sun")) curr = 7;
		    
		    for(int i=1; i<=w; i++)
		    {
		    ++a[curr-1];
		    ++curr;
		    if(curr > 7) curr = 1;
		    }
		    for(int i = 0; i < 7; i++)
		    System.out.print(a[i] + " ");
		    System.out.println();
		}
	}
}
