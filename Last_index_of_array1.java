/*

Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Then again declare a second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Start traversing the array from the last and Then print the index at which you find the first non-matching number in the array.

Input Format

First line Int Value N representing Size of array

Second line contains N Integer values Representing the values of Arr1

Third line contains N int values representaing the value of arr2

Constraints

NA
Output Format

Returns an index of arr2 where you find first non matching integer value from end

Sample Input 0

5
10
20
30
40
50
10
20
23
40
52
Sample Output 0

4
Explanation 0

52 is the first NON matching integer value of arr2 from end Print 4 idx of 52

*/

import java.io.*;
import java.util.*;

public class Last_index {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        last_dup(arr1,arr2);
        
        // arrayin(n);
    }
    
//     public static void arrayin(int n)
//     {
//         Scanner sc=new Scanner(System.in);
//         int arr1[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr1[i]=sc.nextInt();
//         }
        
//         int arr2[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr2[i]=sc.nextInt();
//         }
        
//         last_dup(arr1,arr2);
//     }
    
    public static void last_dup(int arr1[], int arr2[])
    {
        for(int i=arr1.length-1;i>=0;i--)
        {
            if(arr1[i]!=arr2[i])
            {
                System.out.println(i);
                break;
            }
        }
    }
}