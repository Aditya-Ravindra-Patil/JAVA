/*
Take two strings as input by creating a Scanner object. Print the final string as output after concatenation.

Hello + Friends = HelloFriends
*/

import java.io.*;
import java.util.*;

public class String_Concatenate{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        System.out.println(s1+s2);
        
    }
}