/*
Write a program to print Z,z,X,x,V,v,T,t,R,r,..............uptil A,a.
*/

import java.io.*;
import java.util.*;

public class Print_Z,z{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(char i='Z';i>='A';i--)
        {
            System.out.print(i+" "+Character.toLowerCase(i)+" ");
        }
    }
}