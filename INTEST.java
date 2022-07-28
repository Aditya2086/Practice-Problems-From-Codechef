import java.util.*;
import java.lang.*;
import java.io.*;


class INTEST {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int c=0;
	for(int i=0;i<n;i++)
	{
	    int t=sc.nextInt();
	    if(t%k==0)
	    c++;
	    
	}
	System.out.println(c);
	}
}