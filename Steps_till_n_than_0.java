/*

Meet Jake, a data analyst who is working on a project to analyze the performance of a new machine learning model. 
One of the tasks he has been assigned is to write a program that simulates the operation of the model by 
taking an integer input n and performing a series of steps until the value of n becomes 0.

If n is even, the program should subtract 1 from n. 
If n is odd, the program should subtract 3 from n. 
Jake needs to keep track of the total number of steps that the program performs and print this value at the end. 
Can you help Jake come up with a solution for this problem?

Sample Input 0

2
20
37
Sample Output 0

10
19


*/


import java.io.*;
import java.util.*;

public class Steps_till_n_than_0{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int count=0;
            while(a>0)
            {
                if(a%2==0)
                {
                    a=a-1;
                    count++;
                }
                else
                {
                    a=a-3;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}