/*

Given an array of size n with intial values. Take left, right as integer inputs such that 0 <= left, right < arr.length and also take x as an integer input.

Then update the given array from the index-left till the index-right(both left index and right index included) with the element x. In the end print all the elements of the array such that each element is printed in a separate line.

Input Format

First line contains an integer number n representing size of array.

Second line contains n integer numbers representing elements of an array.

Third line contains two Integer number representing range i.e left and right.

Fourth line contains an integer number x.

Constraints

1 <= n <= 100000

0 <= array[index] <= 100000

0 <= left <= right < n

0 <= x <= 100000
Output Format

Print N numbers in a single line.

Sample Input 0

10
1 2 3 4 5 6 7 8 9 10
2 8
0
Sample Output 0

1 2 0 0 0 0 0 0 0 10
Explanation 0

We are given range of 2 to 8, so we update all the index from left to right with given value of x i.e 0. And printed the answer in sinle line.

*/


import java.io.*;
import java.util.*;

public class Update_query_1{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        
        for(int i=x;i<=y;i++)
        {
            arr[i]=z;
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}