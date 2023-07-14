/*
Given a integer n, print all even numbers from 0 till n (including, if even)

*/

import java.io.*;
import java.util.*;

public class Print_even{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        
        for(int i=0;i<=a;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}