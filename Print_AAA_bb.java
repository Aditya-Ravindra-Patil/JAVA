/*
Write a program to print AAA,bb,CCC,dd,EEE,ff,....uptil 26 lines ,where each String printed in a seperate line.
*/

import java.io.*;
import java.util.*;

public class Print_AAA_bb{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(char i='a';i<='z';i++)
        {
            if(i%2==0)
            {
                System.out.println(i+""+i);
            }
            else
            {
                System.out.println(Character.toUpperCase(i)+""+Character.toUpperCase(i)+""+Character.toUpperCase(i));
            }
        }
    }
}