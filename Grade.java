/*
You are given a character ch which represents a grade of a student in a course. The valid grades are A, B, C, and F. Your task is to print a message based on the grade using a switch statement.

If the grade is A, print Excellent!.

If the grade is B, print Well done!.

If the grade is C, print You passed!.

If the grade is F, print Better luck next time!.

If the grade is not one of the valid options, print Invalid grade.
*/


import java.io.*;
import java.util.*;

public class Grade{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        char a=sc.next().charAt(0);
        
        if(a=='A')
        {
            System.out.println("Excellent!");
        }
        else if(a=='B')
        {
            System.out.println("Well done!");
        }
        else if(a=='C')
        {
            System.out.println("You passed!");
        }
        else if(a=='F')
        {
            System.out.println("Better luck next time!");
        }
        else
        {
            System.out.println("Invalid grade");
        }
        
    }
}