/*
Take in two inputs x and y from the user, and then

a. If the value of x is greater than or equal to 59 and y is greater than or equal to 10, then print

X is greater than or equal to 59 and y is greater than or equal to 10

b. If the value of x is greater than or equal to 50, and y is less than 10, then print

X is greater than or equal to 50 and y is less than 10

c. Else print None of the condition matches
*/

import java.io.*;
import java.util.*;

public class Tell_about_xy{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        if(x>=59 && y>=10)
        {
            System.out.println("X is greater than or equal to 59 and y is greater than or equal to 10");
        }
        else if(x>=50 && y<10)
        {
            System.out.println("X is greater than or equal to 50 and y is less than 10");
        }
        else
        {
            System.out.println("None of the condition matches");
        }
            
    }
}