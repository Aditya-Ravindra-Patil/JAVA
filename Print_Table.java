/*
You have to print the table of 4 using the loop concept as given below:

4x1=4

4x2=8

4x3=12

4x4=16

4x5=20

4x6=24

4x7=28

4x8=32

4x9=36

4x10=40
*/


import java.io.*;
import java.util.*;

public class Print_Table{

    public static void main(String[] args) {

        int a=4;
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+"x"+i+"="+(a*i));
        }
    }
}