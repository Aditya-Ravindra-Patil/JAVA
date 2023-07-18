/*

You will be given three integer inputs N,K and L and you to print the series N, N-K, N-2K, N-3K.... till last 
where the value printed in the end should be just greater than or equal to the given input L.

To be clear: You will print L if L belongs to the series.

*/

import java.io.*;
import java.util.*;

public class Print_n_n-k{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        for(int i=a;i>=c;i-=b)
        {
            System.out.println(i);
        }
    }
}