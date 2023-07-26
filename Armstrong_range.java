/*

Take x and y as integer inputs.

Print all the Armstrong numbers in separate line which lie in the range x to y (both x and y inclusive)

Use the function isArmstrong() which checks if a number is an Armstrong number or not and returns true or false accordingly.

Sample Input 0

100
500
Sample Output 0

153 
370 
371
407 

*/



import java.io.*;
import java.util.*;

public class Armstrong_range{
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        for(int i=x;i<=y;i++) x==100 y=200
        {
            if(i<10)
            {
                System.out.println(i);
            }
            else ith aal
            {
                int rem=0;
                int sum=0;
                int check=i;
                
                while(i>0) 100>
                {
                    rem=i%10;
                    sum=sum+(rem*rem*rem);
                    i=i/10;
                }
                if(check==sum
                {
                    System.out.println(check);
                }
            }
        }
    }
} 