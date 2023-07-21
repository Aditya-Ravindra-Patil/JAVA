/*

Take an integer n as an integer input, and then

print the first multiple of 5 in the first line,

print the first two multiples of 5 in the second line.

.

.

.

.

print first n multiples of 5 in the nth line.

Note: In each line the multiples of 5 should be tab separated.


Sample Input 0

6
Sample Output 0

5    
5    10    
5    10    15    
5    10    15    20    
5    10    15    20    25    
5    10    15    20    25    30    
Sample Input 1

7
Sample Output 1

5    
5    10    
5    10    15    
5    10    15    20    
5    10    15    20    25    
5    10    15    20    25    30    
5    10    15    20    25    30    35

*/


import java.io.*;
import java.util.*;

public class Right_triangle_of_5{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        
        pat(num);
    }
    
    static void pat(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j<=i)
                {
                    System.out.print(5*j+"\t");
                }
                else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}