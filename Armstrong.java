/*

Take n as an integer input.

Then write a function that takes in this n as an integer parameter and returns if n is an Armstrong number or not.

In the end, print true or false accordingly.

Note: An armstrong number is a number which is equal to the sum of the cube of its digits.

Sample Input 0

2
153
234
Sample Output 0

true
false

*/

import java.io.*;
import java.util.*;

public class Armstrong{

    public static void amr(int a)
    {
        int r=0;
        int q=0;
        int f=0;
        int check=a;
        while(a>0)
        {
            r=a%10;
            q=r*r*r;
            f=f+q; 
            a/=10;
        }
        if(f==check)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            amr(a);
        }
        
    }
}