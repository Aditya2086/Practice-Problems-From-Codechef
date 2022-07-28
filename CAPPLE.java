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
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    HashSet<Integer> s = new HashSet<>();
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		        s.add(a[i]);
		    }
            System.out.println(s.size());
		    
		}
	}
}