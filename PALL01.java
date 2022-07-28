import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
	    int t= sc.nextInt();
	    
	    while(t-->0){
	        int n = sc.nextInt();
	        int sum =0;
	        int temp = n;
	        while(n>0){
	            int r = n%10;
	            sum = (sum*10)+r;
	            n =n/10;
	        }
	        if(temp==sum){
	            System.out.println("wins");
	        }else{
	            System.out.println("loses");
	        }
	        
	    }
	}
}
