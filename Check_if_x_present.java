/*

Given an array, the task is to write a Java program to check whether a specific element is present in this Array or not.

Sample Input 0

5
1 2 3 4 5
3
Sample Output 0

True

*/

import java.io.*;
import java.util.*;

public class Check_if_x_present{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int c=sc.nextInt();
        int d=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]==c)
            {
                d=1;
                System.out.println("True");
                break;
            }
            else
            {
                d=0;
                
            }
        }
        if(d==0)
        {
            System.out.println("False");
        }
    }
}