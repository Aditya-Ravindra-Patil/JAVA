/*

The rules of the FizzBuzz game are given below:

If a given number is divisible by 3 then the program should print "Fizz".
If a given number is divisible by 7 then the program should print "Buzz".
If a given number is divisible by both 3 and 7 then the program should print "FizzBuzz".
Otherwise print the given number as it is.

*/

import java.io.*;
import java.util.*;

public class FizzBuzz_problems{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%7==0)
            {
                System.out.print("FizzBuzz"+" ");
            }
            else if(i%3==0)
            {
                System.out.print("Fizz"+" ");
            }
            else if(i%7==0)
            {
                System.out.print("Buzz"+" ");
            }
            else
            {
                System.out.print(i+" ");
            }
        }
    }
}