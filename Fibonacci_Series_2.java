/*


You are given an input n as an integer input , Write a program to print the alternate fibonacci numbers starting from the 
first fibonacci till the nth fibonacci numbers accordingly , if nth fibonacci number is part of the series or not.

*/



import java.io.*;
import java.util.*;

public class Fibonacci_Series_2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int num1=0;
        int num2=1;
        int next=0;
        
        System.out.print(num1+" ");
        for(int i=2;i<n;i++)
        {
            next=num1+num2;
            num1=num2;
            num2=next;
            
            if(i%2==0)
            {
                System.out.print(next+" ");
            }
        }
    }
}

