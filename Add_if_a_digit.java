/*
Take in a character as an input from the user

a. If the entered character is a digit, then add 100 to the value of the digit entered and print the final answer.

Convert the digit which is added as a character data-type into the integer data-type using two ways,

First: By using [Use the in-built function Character.getNumericValue]

Second using: By manipulating the digit character data-type into the integer data-type.
b. Else print This is not a digit
*/

import java.io.*;
import java.util.*;

public class Add_if_a_digit{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        char c=sc.next().charAt(0);
        
        int n=c-'0';
        
        if(c>='0' && c<='9')
        {
            System.out.println(n+100);
        }
        else
        {
            System.out.println("This is not a digit");
        }
    
    }
}