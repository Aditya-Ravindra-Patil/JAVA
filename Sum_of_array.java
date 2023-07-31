/*
You have given an array, you have to claculate the sum of all elements of array but do this task recursively

Input Format

First line consists of size of array n.

Second line consists Elements of array (seperated by space).

Constraints

1 <= N <= 10^3
Output Format

Returns a sum

Sample Input 0

3
9 8 9
Sample Output 0

26
Sample Input 1

3
4 2 1
Sample Output 1

7

*/

import java.io.*;
import java.util.*;

public class Sum_of_array{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println(sum(arr,n));
    }
    
    public static int sum(int arr[], int n)
    {
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        
        return sum;
    }
}