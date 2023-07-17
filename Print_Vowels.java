/*

John, a software developer, was tasked with writing a program to print the vowels in a given string. 
He created a loop to iterate over each character and check if it was a vowel. He tested it and it worked perfectly.


*/


import java.io.*;
import java.util.*;

public class Print_Vowels{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
      
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                System.out.println(s.charAt(i));
            }
        }
        
    }
}