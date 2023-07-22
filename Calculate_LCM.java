/*

Take x and y as input. Write a function that takes in x and y as integer parameters. The function should return the lcm of these
two numbers. In the end print the final lcm.

Sample Input 0

2
10 5
15 20
Sample Output 0

10
60

Explanation 0

LCM of 15 and 20 is 60

*/


import java.io.*;
import java.util.*;

public class Calculate_LCM{
    
    public static int lcm(int x, int y)
    {
        int gcd=1;
        
        if(x<y)
        {
            for(int i=2;i<=x;i++)
            {
                if(x%i==0 && y%i==0)
                {
                    gcd=i;
                }
            }
        }
        else
        {
            for(int i=2;i<=y;i++)
            {
                if(x%i==0 && y%i==0)
                {
                    gcd=i;
                }
            }
        }
        
        return x*y/gcd;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            System.out.println(lcm(a,b));
        }
    }
}