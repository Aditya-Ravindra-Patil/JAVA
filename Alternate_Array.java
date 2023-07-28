/*

Take n as an integer input. Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Declare the second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Then print the elements as explained below

Print the first element of the first array present at the 0th index, then the element of the second array at the 1st index, then the element of the first array at the 2nd index, then the element of the second array at the 3rd index, so on and so forth.

Sample Input 0

5
10
20
30
40
50
100
200
300
400
500
Sample Output 0

10 200 30 400 50
Sample Input 1

10
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
Sample Output 1

1 12 3 14 5 16 7 18 9 20

*/

import java.io.*;
import java.util.*;

public class Alternate_Array{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar1[]=new int[n];
        int ar2[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ar1[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            ar2[j]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.print(ar1[i]+" ");
            }
            else
            {
                System.out.print(ar2[i]+" ");
            }
        }
    }
}