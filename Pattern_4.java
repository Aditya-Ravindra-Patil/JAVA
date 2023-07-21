/*

Take Integer N as input and print the following pattern.

Sample Input 0

5
Sample Output 0

* 
* * 
* * * 
* * * * 
* * * * * 


*/

import java.io.*;
import java.util.*;

public class Solution {

    static void pat(int num)
    {
        
        
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if(j<=i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        pat(n);
        
    }
    
    
}