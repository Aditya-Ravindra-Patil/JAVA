/*

Take Integer N as input and print the following pattern.

Sample Input 0

5
Sample Output 0

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/

import java.io.*;
import java.util.*;

public class Pattern_2{
    
    static void pat(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i)
                {
                    System.out.print(j+" ");
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
        
        int num=sc.nextInt();
        pat(num);
    }
}