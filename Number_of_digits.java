/*

Take an integer N as input.

Print the number of digits present in N.


Sample Input 0

523
Sample Output 0

3

Explanation 0

There are three didgits in number 523.

*/

import java.io.*;
import java.util.*;

public class Number_of_digits{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int count=0;
        int temp=0;
        
        while(n>0)
        {
            temp=n%10;
            n/=10;
            // System.out.println(a);
            count++;
        }
        
        System.out.println(count);
    }
}