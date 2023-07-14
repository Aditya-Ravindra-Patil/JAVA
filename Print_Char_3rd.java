/*
You will be given a string as an input, and

a. If the length of the string is greater than or equal to 4, then print the character at 3rd index.

b. Otherwise, print Small string

Eg. If the input string is abcdef, then print d.
*/

import java.io.*;
import java.util.*;

public class Print_Char_3rd{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        
        if(s.length()>=4)
        {
            System.out.println(s.charAt(3));
        }
        else
        {
            System.out.println("Small string");
        }
        
    }
}