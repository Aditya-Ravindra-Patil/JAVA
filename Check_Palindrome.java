/*

Write a Program to check whether a given number n is a Palindrome or not.

Definition of Palindrome:- A number which is equal to the reverse of the number.

Input Format

For each test case, you will get an positive integer input.

Sample Input 0

3
121
123
333
Sample Output 0

YES
NO
YES

*/

import java.io.*;
import java.util.*;

public class Check_Palindrome{
    
    public static String palindrome(int num)
    {
        int res=0;
        int rem=0;
        int check=num;
        
        while(num>0)
        {
            rem=num%10;
            res=res*10+rem;
            num/=10;
        }
        if(res==check)
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            System.out.println(palindrome(a));
                
        }
    }
}