/*

nth term Tn of The Tribonacci sequence is defined as follows:

T0(0th term) = 0, 
T1(1st term) = 1, 
T2(2nd term) = 1, 
and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Take n as an integer inout, print the value of Tn(nth term) as an integer output.

Sample Input 0

0
Sample Output 0

0
Sample Input 1

1
Sample Output 1

1
Sample Input 2

2
Sample Output 2

1
Sample Input 3

7
Sample Output 3

24
Sample Input 4

10
Sample Output 4

149
Sample Input 5

11
Sample Output 5

274
Sample Input 6

20
Sample Output 6

66012

*/


import java.io.*;
import java.util.*;

public class Tribonacci_number{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int num0=0;
        int num1=1;
        int num2=1;
        int next=0;
        if(n==0)
        {
            System.out.println(num0);
        }
        else if(n==1)
        {
            System.out.println(num1);
        }
        else if(n==2)
        {
            System.out.println(num2);
        }
        else
        {
            for(int i=3;i<=n;i++)
            {
                next=num0+num1+num2;
                num0=num1;
                num1=num2;
                num2=next;
            }
            System.out.println(next);
        }
        

    }
}