import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{ int x=0;
		// your code goes here
		Scanner in=new Scanner(System.in);
		for(int i=1;i<5;i++){
		    int p=in.nextInt();
		    if(p>=10){
		       x=x+1; 
		    }
		}
		System.out.println(x);
	}
}