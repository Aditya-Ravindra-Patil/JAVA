/*

Imagine Charlie is a high school student who is learning programming as a hobby. One day, he comes across the following problem:

"Write a program that takes an integer input from the user. The program should print the digits of the number starting from the end, 
going towards the first digit, where each digit should be printed on a separate line. Can you write a solution for this problem?"

Sample Input 0

7654
Sample Output 0

4
5
6
7
Sample Input 1

87543
Sample Output 1

3
4
5
7

*/

import java.io.*;
import java.util.*;

public class Print_all_digits{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=n;i>0;i/=10)
        {
            System.out.println(i%10);
        }
        
        // while(n>0)
        // {
        //     System.out.println(n%10);
        //     n/=10;
        // }
        
    }
}