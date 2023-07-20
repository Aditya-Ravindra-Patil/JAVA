/*

Take an integer input n and then keep on dividing n by 2, till the time n is greater than equal to 1.

Each time you divide n by 2, increment steps by 1.

Print the total number of steps in end.

Note : use function.

*/

import java.io.*;
import java.util.*;

public class Steps_when_n_by_2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int step=0;
        
        while(n>=1)
        {
            n/=2;
            step++;
        }
        System.out.println(step);
    }
}