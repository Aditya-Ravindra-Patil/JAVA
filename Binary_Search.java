/*
Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.

*/

import java.io.*;
import java.util.*;

public class Binary_Search{

public static int func(int b, int y, int z)
    {
         //int a;
         /*for(int i=0;i<n;i++)
         {
             if(ar[i]==k)
             {
                 a=i;
		 return a;
                 //System.out.println(i);
                 //break;
             }
             else if(ar[n-1]!=k)
             {
                 a=-1;
		 return a;
                 //System.out.println("-1");
                 //break;
             }
         }*/
return 0;
       
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        //int arr[]=new int[n];
        int b=5;
        
        /*for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        */
	//int a=func(b, n, k);
        //Ab a=new Ab();
        // a.fun(arr[],n,k);
        System.out.println(func(b, n, k));
        //System.out.println(a);
        
    }
}

