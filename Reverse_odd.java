/*
You will get an integer input n, and you have to print all the odd numbers from n to 1 such that each number 
should be printed in a separate line.
*/
import java.io.*;
import java.util.*;

public class Reverse_odd{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        
        for(int i=a;i>=1;i--)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }
    }
}