/*

Given an array print all composite number present in the array

Input Format

First line contains an integer N representing the size

Second line contains N integer values of array

Constraints

NA

Output Format

print all value of array which are composite.

Sample Input 0

5
1
4
8
11
14
Sample Output 0

4
8
14
Explanation 0

4,8,14 Are the composite number present in array

*/


import java.io.*;
import java.util.*;

public class Print_All_Composite{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        composite(a);
    }
    
    public static void composite(int a[])
    {
        
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    count++;
                }
            }
            if(count>2)
            {
                System.out.println(a[i]);
            }
        }
    }
}