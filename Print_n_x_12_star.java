/*

Take n as an integer input and then print a star rectangle such that each line has n stars.

Also, there are 12 such lines.

Sample Input 0

6
Sample Output 0

******
******
******
******
******
******
******
******
******
******
******
******
Sample Input 1

8
Sample Output 1

********
********
********
********
********
********
********
********
********
********
********
********

*/

import java.io.*;
import java.util.*;

public class Print_n_x_12_star{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
