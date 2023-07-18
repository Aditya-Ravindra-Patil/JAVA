/*

Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

F(n) = F(n-1) + F(n-2), 
Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.

*/


import java.io.*;
import java.util.*;

public class Fibonacci_Number{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num1=0;
        int num2=1;
        int next=0;
        
        if(n<=1)
        {
            System.out.println("1");
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                next=num1+num2;
                num1=num2;
                num2=next;
            }
            System.out.println(next);
        }
    }
}