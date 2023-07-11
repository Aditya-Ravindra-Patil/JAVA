/*
Maria, a software developer, created a program that takes four integer inputs, determines their product, 
and prints true if the product is greater than 1000 and false otherwise. The program accurately determines the product
 and outputs true or false based on the value, helping Maria and her team quickly evaluate the product of four integers.
*/

import java.io.*;
import java.util.*;

public class Product{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        
        int t=a*b*c*d;
        
        if(t>1000)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
    }
}