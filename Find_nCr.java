/*

Given two Integer n and r , find the value of nCr .

Since the answer may be very large, calculate the answer modulo 10^9+7.

Sample Input 0

3
2
Sample Output 0

3
Explanation 0

3C2 = 3.

*/

import java.io.*;
import java.util.*;

public class Find_nCr{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int r=sc.nextInt();
        
        int fact1=1;
        int fact2=1;
        int fact3=1;
        
        for(int i=1;i<=n;i++)
        {
            fact1=fact1*i;
        }
        
        for(int j=1;j<=n;j++)
        {
            fact2=fact2*j;
        }
        
        for(int k=1;k<=n-r;k++)
        {
            fact3=fact3*k;
        }
        
        System.out.println(fact1/(fact2*fact3));
    }
}