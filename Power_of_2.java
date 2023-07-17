/*

Meet John, a computer science student who is working on a project for his algorithms class. One of the tasks he has been assigned is to write a function that takes in an integer n and returns the nth power of 2. For example, if n is 3, the function should return 8 because 2 to the power of 3 is 8.

Can you help John come up with a solution for this problem?

*/

import java.io.*;
import java.util.*;

public class Power_of_2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=2;
        int power=1;
        
        for(int i=0;i<a;i++)
        {
            power*=p;
            
        }
        System.out.println(power);
    }
}