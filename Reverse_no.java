/*

Take in a three digit number as an integer input and reverse its digits. And then print the final reversed number as an integer output.

Sample Input 0

3
234
123
456
Sample Output 0

432
321
654

*/

import java.io.*;
import java.util.*;

public class Reverse_no{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
       
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
             int f=0;
            int rev=0;
            int a=sc.nextInt();
            while(a>0)
            {
                f=a%10;
                rev=rev*10+f;
                a/=10;
            }
            System.out.println(rev);
        }
        
    }
}