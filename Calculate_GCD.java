/*

Take two integer inputs x and y. Then print the gcd of these two numbers as an integer output.

Input Format

T will be given as an integer input representing the number of test cases.

For each test case,

x will be given as an integer input in the first line,

y will be given as an integer input in the second line.


Sample Input 0

2
100 35
20 7
Sample Output 0

5
1

*/

import java.io.*;
import java.util.*;

public class Calculate_GCD{
    
    public static void gcd(int m, int n)
    {
        int gcd=1;
        if(m<n)
        {
            for(int i=2;i<=m;i++)
            {
                if(m%i==0 && n%i==0)
                {
                    gcd=i;
                }
            }
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                if(m%i==0 && n%i==0)
                {
                    gcd=i;
                }
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            gcd(a,b);
        }
    }
}