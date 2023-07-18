/*

A programming task was assigned to a beginner named Mike. He was asked to print numbers from n to 3 using a while loop,
 where n is taken as input from the user. Mike took the input value of n from the user and used a while loop to print 
the numbers in reverse order until 3.

*/

import java.io.*;
import java.util.*;

public class Print_using_while_loop{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        while(n<3)
        {
            System.out.println(n);
            n++;
        }
    }
}