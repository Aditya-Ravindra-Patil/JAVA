/*
Take a whole number N as an integer input and then print all the unique prime factors of N 
such that each prime factor is printed in a separate line.

Sample Input 0

45
Sample Output 0

3
5

*/

import java.io.*;
import java.util.*;

public class Unique_prime_factors{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                if(i==2)
                {
                    System.out.println(i);
                }
                else
                {
                    int a=0;
                    for(int j=2;j<i;j++)
                    {
                        if(i%j==0)
                        {
                            a=1;
                        }
                        
                    }
                    if(a==0)
                    {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}