/*

Take n as an integer input, you have to pick the last 3 digits of the number of and put them in the starting.

eg. 1234567 is given, then this number should transform to 5671234.

*/

import java.io.*;
import java.util.*;

public class Rotate_7-digit{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int rem=a%1000;
            int temp=a/1000;
            rem=rem*10000+temp;
            System.out.println(rem);
            
        }
    }
}