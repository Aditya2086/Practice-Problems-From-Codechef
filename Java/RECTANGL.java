import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
         Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        int a[]=new int[T];
        int b[]=new int[T];
        int c[]=new int[T];
        int d[]=new int[T];
        for(int i=0;i<T;i++){
            a[i]=input.nextInt();
            b[i]=input.nextInt();
            c[i]=input.nextInt();
            d[i]=input.nextInt();
            if(a[i]+b[i]==c[i]+d[i]){
                System.out.println("YES");
            }
            else if(a[i]+c[i]==b[i]+d[i]){
                System.out.println("YES");
            }
            else if(a[i]+d[i]==b[i]+c[i]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
