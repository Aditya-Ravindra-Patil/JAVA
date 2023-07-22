/*

The process goes like:

First take in two integer inputs x and y.

Then make a function findProduct(int x, int y) which takes in an integer as an input then print the product of x and y.


Sample Input 0

3
2 3
5 5
4 6
Sample Output 0

6
25
24

*/

import java.io.*;
import java.util.*;

public class Product_using_fun{

    static int findp(int x, int y)
    {
        return x*y;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            System.out.println(findp(a,b));
        }
        
    }
}