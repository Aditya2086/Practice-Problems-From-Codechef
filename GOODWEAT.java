import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int s=0;
		    int r=0;
		    for(int i=0;i<7;i++){
		        int a = sc.nextInt();
		        if(a == 1){
		            s++;
		        }
		        else{
		            r++;
		        }
		    }
		    if(s > r){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
