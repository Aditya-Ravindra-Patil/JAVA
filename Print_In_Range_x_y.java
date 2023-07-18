/*

Sarah was tasked with printing numbers from x till y, including both x and y, using a while loop. She took inputs for x and y from
 the user using a while loop, initialized a variable to x, and used a while loop to print the numbers until the value exceeded y. 
Sarah successfully completed the task, gained experience in using while loops, and felt more confident in her programming abilities.

*/

import java.io.*;
import java.util.*;

public class Print_In_Range_x_y{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        for(int i=x;i<=y;i++)
        {
            System.out.println(i);
        }
    }
}

