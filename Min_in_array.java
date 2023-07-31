/*

Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Print the minimum amongst all the elements of the array.

Input Format

First line consists N as Size of Array

Second line consists N Integer value as Arr[i] values

Constraints

NA

Output Format

Print the Minimum element in array

Sample Input 0

5
10
4
9
55
21
Sample Output 0

4
Explanation 0

4 is the minimum among all these

*/


import java.io.*;
import java.util.*;

public class Min_in_array{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);   
            
    }
}