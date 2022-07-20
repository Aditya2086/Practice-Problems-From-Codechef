import java.util.Scanner;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test > 0){
            int a = input.nextInt();
            int b = input.nextInt();
            
            if (a == 0){
                System.out.println("Liquid");
            }
            else if (b == 0){
                System.out.println("Solid");
            }
            else{
                System.out.println("Solution");
            }
            test = test - 1;
        }
    }
}