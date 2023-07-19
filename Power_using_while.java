import java.io.*;
import java.util.*;

public class Power_using_while{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int i=0;
        int a=10;
        int p=1;
        
        if(n==0)
        {
            System.out.println(p);
        }
        else
        {
             while(i<n)
            {
                p=p*a;
		i++;
            }
            System.out.println(p);   
        }
    }
}