/*
Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

Then print all the elements of the array from the starting which are even.

Output Format

10 42 50

Sample Input 0

6
10
11
13
14
15
19
Sample Output 0

10 14

*/

import java.io.*;
import java.util.*;

public class Print_even_array{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}