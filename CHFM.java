import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		while(testCases-->0){
		    int N = input.nextInt();
		    long [] A = new long[N];
		    long sum = 0;
		    for(int i=0; i<N; i++){
		    A[i] = input.nextInt();
		    sum += A[i]; 
		    }
		    long mean = 0;
		    int index = -1;
		    if(sum%N==0)
		    mean = sum/N;
		 
		    for(int i=0; i<N; i++){
		    if((mean==A[i])&&(mean>0)){
		    index = i+1;
		    break;
		    }
		    }
		    if(index>0)
		    System.out.println(index);
		    else
		    System.out.println("Impossible");
		}
	}
}