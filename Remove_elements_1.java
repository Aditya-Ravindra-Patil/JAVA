/*

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Input Format

First line of input contains integer N as size of array.

Second line of input contains N integers representing elements of array.

Third line of input contains integer val.

Constraints

0 <= N <= 100
    
0 <= nums[i] <= 50
    
0 <= val <= 100
Output Format

Return the value of k.

Sample Input 0

4
2 3 2 3 
3
Sample Output 0

2
Explanation 0

Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores).

*/

import java.io.*;
import java.util.*;

public class Remove_elements_1{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(val==arr[i])
            {
                c++;
            }
        }
        System.out.println(n-c);
    }
}