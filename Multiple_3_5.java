/*

Meet Maria, a math teacher who is preparing a lesson plan for her students. One of the activities she wants to include is a challenge 
for her students to find all the multiples of 3, 5, and both 3 and 5, within a given range. She has decided to use a program to generate 
the list of multiples for her students. Can you help Maria write a program that takes in an integer n and returns a list of all
the multiples of 3, 5, and both 3 and 5, starting from 1 and going up to n?

*/

import java.io.*;
import java.util.*;

public class Multiple_3_5{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
