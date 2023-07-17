/*

Imagine Alice is a computer science student and she is trying to understand a concept related to loops. Her friend Bob, who is a computer science professor, gives her the following problem:

"Write a program that takes an integer input from the user. The program should keep dividing the integer by 3 and printing the resultant value on each iteration until the value is greater than 0.

Can you write a solution for this problem?"

Note: Start printing from n, keep on updating n by dividing n by 3 each time, and print the the updated value of n each time.

*/

import java.io.*;
import java.util.*;

public class Print_n_divide_3{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a=n;
        for(int i=1;i<a;i++)
        {
            if(n>0)
            {
                System.out.print(n+" ");
                n/=3;
            }
        }
    }
}