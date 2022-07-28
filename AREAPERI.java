import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int a = l*b;
		int p = 2*(l+b);
		if(a>p){
		    System.out.println("Area");
		    System.out.println(a);
		}else if (a<p){
		    System.out.println("Peri");
		    System.out.println(p);
		}else{
		    System.out.println("Eq");
		    System.out.println(a);
		}
	}
}
