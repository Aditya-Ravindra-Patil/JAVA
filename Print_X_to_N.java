/*
You will be given x and n as an integer input from the user. 
You have to print the number from x to n(both inclusive), each number in the different line.
*/

import java.io.*;
import java.util.*;

public class Print_X_to_N{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int n=sc.nextInt();
        
        for(int i=a;i<=n;i++)
        {
            System.out.println(i);
        }
        
    }
}