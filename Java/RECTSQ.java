/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		   int N = sc.nextInt();
		   int M = sc.nextInt();
		   int a = N,b = M;
		   while(b!=0)
		    {
		    int r = b;
		    b = a % b;
		    a = r;
		    }
		    System.out.println(((N*M)/(a*a)));
		}
	}
}