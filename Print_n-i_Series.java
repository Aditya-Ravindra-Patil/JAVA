/*
You will be given an input n of integer data type.

You have to print the series n, n-3, n-6....
*/

import java.io.*;
import java.util.*;

public class Print_n-i_Series{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new  Scanner(System.in);
        
        int a=sc.nextInt();
        for(int i=a;i>=1;i-=3)
        {
            System.out.println(i);
        }
    }
}