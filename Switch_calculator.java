/*
You are given integer inputs N , a and b. perform operations on a and b for different value of N like :-

If value of N is 10 -> a + b;

If value of N is 20 -> a - b;

If value of N is 30 -> a * b;

If value of N is 40 -> a % b;

If value of N is 50 -> a / b;

else print Enter a valid number.

*/

import java.io.*;
import java.util.*;

public class Switch_calculator{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        switch(N){
            case 10:
                System.out.println(a+b);
                break;
            case 20:
                System.out.println(a-b);
                break;
            case 30:
                System.out.println(a*b);
                break;
            case 40:
                System.out.println(a%b);
                break;
            case 50:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Enter a valid number");
        }
        
        
    }
}