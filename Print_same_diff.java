/*
You will be given an input n of integer data-type. You have to print numbers of the series 2, 9, 16, 23.... till n in different lines, 
where the last number printed should be an integer just less than n or equal to n.

To be clear, you will print n if it belongs to the series.
*/

import java.io.*;
import java.util.*;

public class Print_same_diff{

    public static void main(String[] args) {

    
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int c=2;
        
        for(int i=0;i<=n;i++)
        {
            if(c>n)
            {
                break;
            }
            else
            {
                System.out.println(c);
            }
            c=c+7;
        }
        
        // for(int i=2;i<=n;i+=7)
        // {
        //     System.out.println(i);
        // }
    }
}