/*

Emma was given a programming task to create a program that takes an integer input n and prints the running sum from 1 to n 
along with its average. Emma created a loop to calculate the sum and average and printed the results to the console. 
The program worked perfectly, and Emma was praised for her coding skills.

*/

import java.io.*;
import java.util.*;

public class Running_sum_and_average{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int sum=0;
        
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }
}