/*

Take an integer input n and print n stars in the same straight line.


Sample Input 0

5
Sample Output 0

*****
Sample Input 1

7
Sample Output 1

*******


*/

import java.io.*;
import java.util.*;

public class Stars_in_line{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
}

