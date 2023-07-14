/*
Take in a character as an input from the user

a. If the entered character is a small-case character, the convert it into the corresponding uppercase character and print it.

b. If the entered character is an upper-case character, the convert it into the corresponding lowercase character and print it.
*/

import java.io.*;
import java.util.*;

public class Toggle_Char{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        char c=sc.next().charAt(0);
        
        if(c>='a' && c<='z')
        {
            System.out.println(c-=32);
        }
        else
        {
            System.out.println(c+=32);
        }
        
    }
}