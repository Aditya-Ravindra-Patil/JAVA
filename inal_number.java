/*

Take n as an integer input. Then take n digits as integer inputs and form a number from it and print that number as an integer output.

Sample Input 1

5
1
2
3
6
7
Sample Output 1

12367

*/

import java.io.*;
import java.util.*;

public class Final_number{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int num=0;
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            num=num*10+a;
            
        }
        System.out.println(num);
    }
}