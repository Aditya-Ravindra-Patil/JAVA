/*

You have given an array of integers of length n and a key. you need to find the last index of the key in the given array . If not present, then return -1.

Sample Input 0

5
1 2 3 4 4
4
Sample Output 0

4

*/

import java.io.*;
import java.util.*;

public class Last_index_of_array{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int key=sc.nextInt();
        
        System.out.println(last(arr,key));
    }
    
    public static int last(int a[],int k)
    {
        int r=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                r=i;
            }
        }
        if(r>0)
        {
            return r;
        }
        else
        {
            return -1;
        }
    }
}