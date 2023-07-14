/*
Print a, B, c, D, e, F, g...... 26 characters where each character should be printed in a separate line.

*/

import java.io.*;
import java.util.*;

public class Print_a_B_c_D{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        char c;
        for(char i='a';i<='z';i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
            else
            {
                System.out.println(Character.toUpperCase(i));
            }
        }
    }
}