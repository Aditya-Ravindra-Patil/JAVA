/*

You will be given a number greater than or equal to zero. Print the count of digits in the first line and then you 
have to print its digits from the digit at one’s place till the digit at the at the largest place value such that each 
digit should be printed in a separate line.


Sample Input 0

7654
Sample Output 0

4
4
5
6
7

*/

import java.io.*;
import java.util.*;

public class Print_count_of_digits{

    public static int count(int num)
    {
        int c=0;
        while(num>0)
        {
            num/=10;
            c++;
        }
        return c;
    }
    
    public static void prin(int t)
    {
        int rem=0;
        while(t>0)
        {
            rem=t%10;
            t/=10;
            System.out.println(rem);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        System.out.println(count(n));
        prin(n);
    }
}