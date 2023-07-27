/*

Write a Java program to check whether a number is a Prime number or not.

Output Format

Print Yes or No.

Sample Input 0

1
5
Sample Output 0

Yes

*/

import java.io.*;
import java.util.*;

public class Prime_checker{
    
    public static void prime(int n)
    {
        
        int p=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                p++;
            }
            
        }

        if(p>0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            prime(b);
        }
    }
}