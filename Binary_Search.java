import java.io.*;
import java.util.*;

public class Binary_Search{

int func(int x, int y, int z)
    {
        // int a;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]==k)
        //     {
        //         a=i;
        //         System.out.println(i);
        //         //break;
        //     }
        //     else if(arr[n-1]!=k)
        //     {
        //         a=-1;
        //         System.out.println("-1");
        //         break;
        //     }
        // }
        return x+y+z;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int b=5;
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        //Ab a=new Ab();
        // a.fun(arr[],n,k);
        System.out.println(func(b, n, k));
        
        
    }
}

