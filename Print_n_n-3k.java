/*

Take n, k and m as integer inputs and Print the series n, n-3k, n-6k, n-9k, n-12k, n-15k, n-18k… using a while loop. 
Print till the time the printed value is greater than equal to m.

*/

import java.io.*;
import java.util.*;

public class Print_n_n-3k{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        
        for(int i=n;i>=m;i-=3*k)
        {
                System.out.print(i+" ");     
        }
    }
}