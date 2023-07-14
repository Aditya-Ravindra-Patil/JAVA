/*
Sonu is a computer science student who is working on a project that involves processing text data. 
He has been asked to write a program that will take a string as input and output every other character of that 
string, starting with the first character. John is excited to work on this problem because he knows that it will
require him to use his programming skills to solve a real-world problem. He knows that the program he writes will 
be able to take a string as input, such as abcdefg, and output the alternate characters, aceg. John is confident that 
he can write a solution to this problem and is eager to get started.
*/

import java.io.*;
import java.util.*;

public class Alternate_Elements_of_String{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        for(int i=0;i<=s.length()-1;i+=2)
        {
            System.out.print(s.charAt(i));
        }
    }
}