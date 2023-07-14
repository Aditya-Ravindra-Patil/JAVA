/*
You will be given an input n as an integer data-type. You have to print the series from n to 1 in n different lines.
*/

import java.io.*;
import java.util.*;

public class Print_n_to_1{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.println(n+1-i);
        }
        
    }
}