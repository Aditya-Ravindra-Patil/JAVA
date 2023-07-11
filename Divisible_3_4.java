/*
Print Divisible by 3 and 4 if the given integer is divisible by both 3 and 4

Print Not Divisible if the given integer is not divisible by both 3 and 4.
*/

import java.io.*;
import java.util.*;

public class Divisible_3_4{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        
        if(x%3==0 && x%4==0)
        {
            System.out.println("Divisible by 3 and 4");
            
        }
        else
        {
            System.out.println("Not Divisible");
        }
    
    }
}