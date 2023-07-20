/*

Take n as an integer input. After this you will be given n numbers as integer inputs and you have to print each time 
if the number is Even or Odd. And Print “Divisible by 3” if the number is a multiple of 3 and print “Not Divisible by 3” 
if the number is not a multiple of 3

Sample Input 0

5
9
11
2
6
15
Sample Output 0

Odd Divisible by 3
Odd Not Divisible by 3
Even Not Divisible by 3
Even Divisible by 3
Odd Divisible by 3

*/

import java.io.*;
import java.util.*;

public class Odd_Even_and_Divisibility_by_3{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            
            if(a%2==0)
            {
                if(a%3==0)
                {
                    System.out.println("Even Divisible by 3");
                }
                else
                {
                    System.out.println("Even Not Divisible by 3");
                }
            }
            else
            {
                if(a%3==0)
                {
                    System.out.println("Odd Divisible by 3");
                }
                else
                {
                    System.out.println("Odd Not Divisible by 3");
                }
            }
        }
    }
}