import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
	    int ar[]=new int[n];
		int b=0;
		for(int x=0;x<n;x++)
		{
		ar[x]=sc.nextInt();
		b^=(ar[x]+ar[x]);
		}
		System.out.println(b);
		}
	}
}