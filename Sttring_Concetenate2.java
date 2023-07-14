/*
Given 2 strings, s1 and s2, return a string of the form short+long+short, with the shorter string on the outside 
and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

comboString("Hello", "hi") → "hiHellohi" 
comboString("hi", "Hello") → "hiHellohi" 
comboString("aaa", "b") → "baaab"
*/

import java.io.*;
import java.util.*;

public class Sttring_Concetenate2{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        if(s1.length()>s2.length())
        {
            System.out.println(s2+s1+s2);
        }
        else
        {
            System.out.println(s1+s2+s1);
        }
        
    }
}