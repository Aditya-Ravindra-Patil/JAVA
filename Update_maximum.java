/*

Take n as input from the user. Then you will be given a list of n positive integers, each time you find a new maximumal value, 
you have to increment the steps by 1.

Take steps as 0 initially and maximum value as -100 in the starting.

In the end print the number of steps performed.

*/

import java.io.*;
import java.util.*;

public class Update_maximum{
    
//     public static void maxf(int num)
//     {
//         Scanner s=new Scanner(System.in);
//         int max=-100;
//         int step=0;
        
//         for(int i=0;i<num;i++)
//         {
//             int a=s.nextInt();
//             if(a>max)
//             {
//                 max=a;
//                 step++;
//             }
//         }
//         System.out.println(step);        
//     }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int max=-100;
        int step=0;
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(a>max)
            {
                max=a;
                step++;
            }
        }
        System.out.println(step);        
        
        
    }
}