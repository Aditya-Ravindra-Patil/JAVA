/*

Take n as an integer input. Then print nxn star rectangle as mentioned below.

In each line, n stars should be printed.

And there should be n such lines.

Sample Input 0

4
Sample Output 0

****
****
****
****
Sample Input 1

6
Sample Output 1

******
******
******
******
******
******

*/

import java.io.*;
import java.util.*;

public class NxN_star{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}