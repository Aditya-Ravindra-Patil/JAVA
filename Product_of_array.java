/*

Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

For each index print the product of all the elements except the element present at that index..

NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link ->https://leetcode.com/problems/product-of-array-except-self/

Input Format

First line contains integer N as Size of Array.

Second line contains N integer value as Arr[i] values

Constraints

NA

Output Format

Print value of Product of array except that particular index.

Sample Input 0

3
2
5
3
Sample Output 0

15
6
10
Explanation 0

Product of Array:-30 5*3=15 2*3=6 2*5=10

*/

import java.io.*;
import java.util.*;

public class 
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        product(n,arr);
        
    }
    
    public static void product(int n, int arr[])
    {
        for(int i=0;i<n;i++)
        {
            int pro=1;
            for(int j=0;j<n;j++)
            {
                if(arr[j]!=arr[i])
                {
                    pro*=arr[j];
                }
            }
            System.out.println(pro);
        }
    }
}