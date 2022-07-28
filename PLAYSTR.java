/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0){
		    int n=kb.nextInt();
		    String s=kb.next();
		    String r=kb.next();
		    int ss=0;
		    int rr=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1')
		        ss++;
		        if(r.charAt(i)=='1')
		        rr++;
		    }
		      if(ss==rr)
		      System.out.println("YES");
		      else
		       System.out.println("NO");
		}
	}
}