/*

Given n and r, find the value of nPr.

( formula of npr=n!/(n-r)! ) 

*/

import java.io.*;
import java.util.*;

public class Find_Permutation{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int r=sc.nextInt();
        int per=1;
        
        int j=n-r+1;
        for(int i=j;i<=n;i++)
        {
            per*=i;
            
        }
        System.out.println(per);
    }
}