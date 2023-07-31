/*

Take an array arr of size N as input which represents a large number.

Add 1 (one) to this large number and print the resultant array.

eg:- [4,2,3,6,5,8,7,1,5,3,9,6] In this case answer must be [4,2,3,6,5,8,7,1,5,3,9,7]

Note: The large integer does not contain any leading 0's in the array.

NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

Input Format

First line contains an integer N, which is the size of the array.

Second line contains N integers, depicting the elements of the array.

Constraints

1 <= N <= 1000

0 <= arr[i] <= 9
Output Format

The resultant array.

Sample Input 0

5
1 2 3 4 5 
Sample Output 0

1 2 3 4 6
Sample Input 1

1
9
Sample Output 1

1 0

*/

import java.io.*;
import java.util.*;

public class Add_One{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d[]=add(arr);
        for(int i=0;i<d.length;i++)
        {
            System.out.print(d[i]+" ");
        }
        
        
    }
    
    public static int[] add(int a[])
    {
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!=9)
            {
                a[i]+=1;
                return a;
            }
            else
            {
                a[i]=0;
            }
        }
        
        int b[]=new int[a.length+1];
        b[0]=1;
        return b;
    }
}



