/*
Alice, a programmer, was given a task to write a program that prints the first N multiples of 9 in a single line. 
She tackled the problem by using a loop to iterate over the numbers . Finally, Alice printed all N multiples of 9 in a single line.
*/
import java.io.*;
import java.util.*;

public class First_n_multiple{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            System.out.print(i*9+" ");
        }
    }
}
