/*

For the given array having N elements, find the maximum element of the array.

Input Format

First line will be N, no of elements.

Second line contains N elements representing an array

Constraints

1 <= N <= 10^6
Output Format

Print Maximum element.

Sample Input 0

5
1 2 3 4 5        
Sample Output 0

5
Explanation 0

5 is the maximum element in the array.

*/

import java.io.*;
import java.util.*;

public class Max_of_array{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println(max(arr,n));
        
    }
    
    public static int max(int arr[], int n)
    {
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        
        return max;
    }
}