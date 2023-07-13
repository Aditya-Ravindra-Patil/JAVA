/*

Take in a character as an input and then

a. Print Small case if it is a small case character.

b. Print Capital case if it is a capital case character.

c. Print Digit if it is a digit.

d. Print None is none of the above conditions follow.

*/

import java.io.*;
import java.util.*;

public class Small_Capital_Digit{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        char c=sc.next().charAt(0);
        int n=c-'0';
        
        if(c>='a' && c<='z')
        {
            System.out.println("Small case");
        }
        else if(c>='A' && c<='Z')
        {
            System.out.println("Capital case");
        }
        else if(n>=0 && n<=9)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("None");
        }
    
    }
}