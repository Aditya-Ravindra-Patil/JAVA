/*
You are given the marks of a student as an integer input, the teacher gives 4 marks as grace marks if the marks of the student 
is less than 33, otherwise no grace marks are given. Print the final marks of the student.


*/

import java.io.*;
import java.util.*;

public class Grace_mark{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark<33)
        {
            System.out.println(mark+4);
        }
        else
        {
            System.out.println(mark);
        }
    }
}