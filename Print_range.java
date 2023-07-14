/*
Given a number n, print all integers in range 1 to n.

You can assume that input is a positive integer
*/

import java.io.*;
import java.util.*;

public class Print_range{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            System.out.println(i);
        }
        
    }
}