/*
Meet Sarah, a software developer who is working on a new project for her company. 
One of the tasks she has been assigned is to write a program that takes in a string and returns the string in reverse order. 
Can you help Sarah come up with an algorithm to solve this problem?
*/

import java.io.*;
import java.util.*;

public class Reverse_String{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
            
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(s.length()-1-i));

        }
    }
}