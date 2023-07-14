/*
You will be given three strings as string data-type input in three separate lines, 
you need to simply concatenate them and print the length of the string in the first line, 
and the character at 2nd index in the second line.

For eg. 
String 1 = abcd
String 2 = efgh
String 3 = xyzw
then, Concatenated String is abcdefghxyzw.
*/

import java.io.*;
import java.util.*;

public class String_Concatenate3{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        
        String s4=s1+s2+s3;
        
        System.out.println(s4.length());
        
        System.out.println(s4.charAt(2));
        
    }
}