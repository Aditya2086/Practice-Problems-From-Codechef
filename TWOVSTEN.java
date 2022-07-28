/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i, t, x;
		Scanner sc = new Scanner(System.in);
		t= sc.nextInt();
		for(i=0;i<t;i++)
		{
		x= sc.nextInt();
		if(x%10==0)
		{
		System.out.println(0);
		}
		else if(x%10==5)
		{
		System.out.println(1);
		}
		else
		{
		System.out.println(-1);
		}
	  }
	}
}