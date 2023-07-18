/*

Imagine you are a math teacher and one of your students, Maria, is struggling with understanding how to find the running sum of a series of integers. You decide to give her a problem to work on as practice.

The problem is as follows: Maria will be given a series of n integers as input, she has to print the sum after she take input of an integer each time.

For example, if the series of integers is 3, 4, 5, 6 the output should be 3, 7, 12, 18

Maria is a little bit confused at first, but with your guidance and some careful practice, she is eventually able to understand and solve the problem successfully.

NOTE: Initially the sum is zero.

*/


import java.io.*;
import java.util.*;

public class Running_Sum{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int sum=0;
        int s=sc.nextInt();

//         int arr[]=new int[s];
        
        
//         for(int i=1;i<=s;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("jhos");
//         for(int j=0;j<s;j++)
//         {
//             sum+=arr[j];
//             System.out.print(sum+"hhhh ");
//         }
        
        for(int i=0;i<s;i++)
        {
            int a=sc.nextInt();
            sum+=a;
            System.out.print(sum+" ");
        }
        
        
    }
}


