import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int total=q*100;
        int d=10;
        
        if(total>1000)
        {
            int bill=total-(total*d/100);
            System.out.println(bill);
        }
        else
        {
            System.out.println(total);
        }
    }
}