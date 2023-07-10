import java.io.*;
import java.util.*;

public class XYZW{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter x");
        int x=sc.nextInt();

	System.out.println("Ener y");
        int y=sc.nextInt();

	System.out.println("Enter z");
        int z=sc.nextInt();

	System.out.println("Enter w");
        int w=sc.nextInt();
        
        if(x*y==z*w)
        {
            System.out.println("true, x*y==z*w");
        }
        else
        {
            System.out.println("false, x*y!=z*w");
        }
    }
}