/*

Imagine you are a computer science teacher and one of your students, Ben, is learning about loops and control structures. You decide to give him a problem to work on as practice.

The problem is as follows: Ben needs to write a program that takes in an integer n as input and prints out all the powers of 2 that are less than n. For example, if n is 10, the program should print out 1, 2, 4, and 8.

*/
import java.io.*;
import java.util.*;

public class Power_less_n{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=2;
        int power=1;
        
        System.out.print(power+" ");
        for(int i=1;i<n;i++)
        {
            power*=p;
            if(power<n)
            { 
                System.out.print(power+" ");
            }
        }
    }
}