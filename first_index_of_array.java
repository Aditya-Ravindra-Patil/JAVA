/*

You have given array of n elements and key . you need to find the first index in the array . If key does not exist then return -1.

Sample Input 0

5
1 2 3 3 3
3
Sample Output 0

2
Explanation 0

the first index key is occuring at index 2
*/

import java.io.*;
import java.util.*;

public class first_index_of_array{

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
        // System.out.println(first(arr,key));
        first1(arr,key);
        
    }
    
    // public static void first(int a[],int k)
    // {
    //     for(int i=0;i<a.length;i++)
    //     {
    //         if(a[i]==k)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    public static void first1(int a[],int k)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                System.out.println(i);
                count++;
                break;
            }
        }
        if(count==0)
        System.out.println("-1");
    }
}