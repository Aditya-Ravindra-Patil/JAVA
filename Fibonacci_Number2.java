/*

You have given an integer n , you have to print first n numbers of the fibonacci series till n.

*/

import java.io.*;
import java.util.*;

public class Fibonacci_Number2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int num1=0;
        int num2=1;
        int next=0;
        
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                System.out.print(num1+" ");
            }
            else if(i==2)
            {
                System.out.print(num2+" ");
            }
            else
            {
                next=num1+num2;
                System.out.print(next+" ");
                num1=num2;
                num2=next;
                
            }
        }
    }
}