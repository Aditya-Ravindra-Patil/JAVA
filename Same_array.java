/*

Take n as an integer input. Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

Then print true if the arrays are equal and print false if the array is not equal.

Definition of Equal Arrays: Arrays whose size is equal and whose elements at the corresponding indexes are the same

Sample Input 0

5
1 2 3 4 5
5 
1 2 3 4 5
Sample Output 0

true

*/

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Same_Array{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        if(arr1.length!=arr2.length){
            System.out.println("false");
            return;
        }
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    System.out.println("false");
                    return ;
                }
            }
        }
        System.out.println("true");
    }
}