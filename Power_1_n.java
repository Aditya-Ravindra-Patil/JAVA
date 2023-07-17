/*

Sophie, a computer science student, wrote a program to print the power of 17 from 1 to n, where n is taken as input from the user. 
She used the while loop to calculate the power of 17 and tested it successfully. Sophie's professor was impressed with her 
programming skills and asked her to present her solution to the class.

*/

import java.io.*;
import java.util.*;

public class Power_1_n{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        long n=sc.nextLong();
        long p=17;
        long power=1;
        
        
        
        for(int i=1;i<=n;i++)
        {
            power*=p;
            System.out.print(power+" ");
        }
    }
}
