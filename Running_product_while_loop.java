/*

Imagine you are a math teacher and one of your students, Maria, is struggling with understanding how to find the running product of a 
series of integers. You decide to give her a problem to work on as practice.

The problem is as follows: Maria will be given a series of n integers as input, she has to print the product after she take input
 of an integer each time.

For example, if the series of integers is3, 4, 5, 6the output should be 3, 12, 60, 360 Maria is a little bit confused at first, 
but with your guidance and some careful practice, she is eventually able to understand and solve the problem successfully.

*/

import java.io.*;
import java.util.*;

public class Running_product_while_loop{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pro=1;
        int i=0;
        while(i<n)
        {
            int a=sc.nextInt();
            pro*=a;
            System.out.print(pro+" ");
            i++;
        }
    }
}