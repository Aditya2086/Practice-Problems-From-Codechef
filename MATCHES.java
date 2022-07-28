/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	Scanner sc=new Scanner(System.in);
	int x[]={6,2,5,5,4,5,6,3,7,6};
	int t= sc.nextInt();
	while(t-->0)
	{
	    int sum=0,s=0,r;
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    sum=a+b;
	    while(sum>0)
	    {
	     r=sum%10;
	    s=s+x[r];
	    sum=sum/10;
	    }
	    System.out.println(s);
	}
	}
}
