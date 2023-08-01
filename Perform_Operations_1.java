/*

For each index,

Add 1 to the value stored at that index if the element at that index is greater than zero.

Add 2 to the value at the index if the element at that index is equal to zero.

Add 3 to the value at the index if the element at that index is less than zero.

In the end print all the elements of the array such that each element is printed in a separate line.

Input Format

First line contains an integer number n representing size of array.

Second line contains n numbers representing elements of the array.

Constraints

1 <= n <= 100000

0 <= array[index] <= 100000
Output Format

Print the updated the values of array in single line.

Sample Input 0

3
-3 0 3
Sample Output 0

0 2 4 
Explanation 0

since at index 0 value is negative therfore numbers[0] changes as numbers[0]+3 i.e = -3+3 = 0.

Similarly, at index 1 value is 0. Therefore we have added 2 to the numbers[1].

And at index 2, value is positive. Therefore we have added 1 to the numbers[2].

*/

import java.io.*;
import java.util.*;

public class Perform_Operations_1{

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
            if(arr[j]<0)
            {
                arr[j]+=3;
            }
            else if(arr[j]==0)
            {
                arr[j]+=2;
            }
            else
            {
                arr[j]+=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }          
    }
    
}
