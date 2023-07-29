/*

Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

Then print all the indexes of the array from the starting where the elements are odd

Sample Input 0

5
1
2
3
4
5
Sample Output 0

0 2 4 

*/

import java.io.*;
import java.util.*;

public class Print_array_indexes{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(j%2==0)
            {
                System.out.print(j+" ");
            }
        }
    }
}