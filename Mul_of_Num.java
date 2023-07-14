/*
Take an integer N as input, and print all the multiples of 7 till N(inclusive).

*/
import java.io.*;
import java.util.*;

public class Mul_of_Num{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0;i<=n;i++)
        {
            if(7*i<=n)
            {
                System.out.print(7*i+" ");
            }
            else
            {
                break;
            }
        }
    }
}