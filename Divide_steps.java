/*

Take a natural number n as an integer input, and variable steps of integer type as input. Then perform the following operations on it.

a. If the number is divisible by 2, then keep on dividing the number n by 2, till the time the number is divisible by 2 and also increment the variable steps by 2, each time you divide the number by 2.

b. Also, check If the number is divisible by 3, then keep on dividing the number n by 3, till the time the number is divisible by 3 and also increment the variable steps by 3, each time you divide the number by 3.

c. Also, If the number is divisible by 5, then keep on dividing the number n by 5, till the time the number is visible by 5 and also increment the variable steps by 5, each time you divide the number by 5.

In the end print the value of the variable steps in the first line and final value of number n in the second line.

Sample Input 0

30
0
Sample Output 0

10
1
Sample Input 1

100
20
Sample Output 1

34
1
Sample Input 2

210
7
Sample Output 2

17
7
Sample Input 3

243
0
Sample Output 3

15
1

*/

import java.io.*;
import java.util.*;

public class Divide_steps{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int step=sc.nextInt();
        
        while(n>0)
        {   
            if(n%2==0)
            {
                n/=2;
                step+=2;
            }
            else if(n%3==0)
            {
                n/=3;
                step+=3;
            }
            else if(n%5==0)
            {
                n/=5;
                step+=5;
            }
            else
            {
                break;
            }
        }
        System.out.println(step);
        System.out.println(n);
    }
}