/*
Three sides A, B and C will be given . Return True if triangle is valid otherwise False.

Note : Use Function.

*/

import java.io.*;
import java.util.*;

public class Triangle{
    public static void tri(int a,int b,int c)
    {
        if(a+b>c)
        {
            System.out.println("true");
        }
        else if(a+c>b)
        {
            System.out.println("true");
        }
        else if(b+c>a)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        
        tri(x,y,z);
        
    }
}