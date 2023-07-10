import java.io.*;
import java.util.*;

public class Oldest_three{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        
        if(A>B && A>C)
        {
            System.out.println("A");
        }
        else if(B>A && B>C)
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("C");
        }
    }
}