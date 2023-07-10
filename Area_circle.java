import java.io.*;
import java.util.*;

public class Area_circle{

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter dimeter of circle");
        int d=sc.nextInt();
        int r=d/2;
        System.out.println((22*r*r)/7);
    }
}