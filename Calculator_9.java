/*
You will be given two integers x,y in the integer data-type format and a character as an input in the character data-type format,

a. If the entered character is A, then print sum of the two integers in the integer format.

b. If the entered character is S, then print the value of x - y in the integer format.

c. If the entered character is M, then print the value of x * y in the integer format.

d. If the entered character is D, then print the value of x / y in the integer format.

e. If the entered character is R, then print the value of remainder when x is divided by y.

f. Else print the string Enter again.
*/

import java.io.*;
import java.util.*;

public class Calculator_9{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        char c=sc.next().charAt(0);
        
        switch(c)
        {
            case 'A':
                System.out.println(x+y);
                break;
            
            case 'S':
                System.out.println(x-y);
                break;
            
            case 'M':
                System.out.println(x*y);
                break;
            
            case 'D':
                System.out.println(x/y);
                break;
            
            case 'R':
                System.out.println(x%y);
                break;
            
            default:
                System.out.println("Enter again");
            
        }
    }
}