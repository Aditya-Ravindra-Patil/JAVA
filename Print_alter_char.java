/*
Print a, c, e... till the characters are less than z, where each character is printed in a separate line.

*/

import java.io.*;
import java.util.*;

public class Print_alter_char{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(char i='a';i<'z';i+=2)
        {
            System.out.println(i);
        }
    }
}