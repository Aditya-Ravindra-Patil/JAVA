/*

The process goes like:

You have to first take input of two numbers x and y as an integer input.

Then make a function findSum(int x, int y), which takes in these two integers as parameters and prints the final sum.

*/

import java.io.*;
import java.util.*;

public class Sum_using_function{
    
    static int add(int f,int s)
    {
        return f+s;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(add(a,b));
        }
        
        
       
    }
}