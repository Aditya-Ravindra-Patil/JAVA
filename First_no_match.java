/*

Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Then again declare a second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Then print the index at which you find the first non matching number in the array.

Input Format

First line consists Value N representing Size of array

Second Line consists of N Integer values Representing the values of Arr1

Third Again** N** int values representaing the value of arr2

Constraints

1 <= N <= 10^9
Output Format

Returns an index of arr2 where you find first non matching integer value

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

2
Explanation 0

First NON MATCHING INT value is 23 that is on idx 2 of arr2
*/

import java.io.*;
import java.util.*;

public class First_no_match{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        
        System.out.println(nomatch(a,b));
    }
    
    public static int nomatch(int a[],int b[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                return i;
            }
        }
        return 0;
    }
}
