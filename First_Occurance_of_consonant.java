/*

Take n as an integer input. Declare the first array of size n that stores values of char data-type. Then take n character inputs and store them in the array one by one. Traverse the array from the last and print the index at which the consonant occurs for the first time.

Input Format

First line consists N as size.

Second line consists an array of N char Values

Constraints

NA
Output Format

First occurance of Constant from end.

Sample Input 0

5
a
b
c
d
q
Sample Output 0

4
Explanation 0

q is first consonant from last

*/

import java.io.*;
import java.util.*;

public class First_Occurance_of_consonant{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        char arr[]=new char[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        
        System.out.println(conso(arr));
    }
    
    public static int conso(char a[])
    {
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!='a' || a[i]!='e' || a[i]!='i' || a[i]!='o' || a[i]!='u')
            {
                return i;
            }
        }
        
        return 0;
    }
}