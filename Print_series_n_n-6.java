/*
When John was starting out as a coding hobbyist, he loved testing out various programming approaches to tackle challenges. 
One day, he stumbled upon a fascinating numerical series that he aimed to incorporate into a program:n, n-6, n-12, n-18... 
John's task was to print this sequence until the printed value exceeded zero.
*/

import java.io.*;
import java.util.*;

public class Print_series_n_n-6{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        
        for(int i=a;i>=1;i-=6)
        {
            System.out.print(i+" ");
        }
        
       
    }
}