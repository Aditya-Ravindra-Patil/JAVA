/*
Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

Then print all the elements of the array where the index is not divisible by 4.

Output Format

10 40

Sample Input 0

5
1 2 3 7 10
Sample Output 0

2 3 7
Sample Input 1

6
11 23 32 71 100 200
Sample Output 1

23 32 71 200

*/

import java.io.*;
import java.util.*;

public class Print_Array_Elements{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
            if(i%4!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}