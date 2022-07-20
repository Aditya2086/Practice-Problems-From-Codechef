/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		double h, c, s;
		
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		
		while (t!=0)
		{
		    t--;
		    h = sc.nextDouble();
		    c = sc.nextDouble();
		    s = sc.nextDouble();
		    
		    if (h>50 && c<0.7 && s>5600)
		    System.out.println("10");
		    else if (h>50 && c<0.7 && s<=5600)
		    System.out.println("9");
		    else if (h<=50 && c<0.7 && s>5600)
		    System.out.println("8");
		    else if (h>50 && c>=0.7 && s>5600)
		    System.out.println("7");
		    else if (h>50 || c<0.7 || s>5600)
		    System.out.println("6");
		    else if (h<=50 && c>=0.7 && s<5600)
		    System.out.println("5");
		}
	   
	}
}