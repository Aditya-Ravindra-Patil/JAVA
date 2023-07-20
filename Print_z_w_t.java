/*

Write a Program using while loop for printing z, w, t… alphabets using a while loop, where the last alphabet printed 
should be greater than or equal to d.

*/

import java.io.*;
import java.util.*;

public class Print_z_w_t{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        /*
	for(char i='z';i>='d';i-=3)
        {
            System.out.print(i+" ");
        }
	*/

	char x='z';
        
        while(x>='d')
        {
            System.out.print(x+" ");
            x-=3;
        }
    }
}