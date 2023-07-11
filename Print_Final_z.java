import java.io.*;
import java.util.*;

public class Print_Final_z{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        
        if(x>=20)
        {
            if(y>=100)
            {
                System.out.println(z+100);
            }
            else if(y>=50)
            {
                System.out.println(z+50);
            }
            else
            {
                System.out.println(z+10);
            }
        }
        else
        {
            if(y>=100)
            {
                System.out.println(z+3);
            }
            else if(y>=50)
            {
                System.out.println(z+2);
            }
            else
            {
                System.out.println(z+1);
            }
        }
    }
}