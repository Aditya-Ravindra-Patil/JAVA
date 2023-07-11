import java.io.*;
import java.util.*;

public class Mark_of_student{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        double sub1=sc.nextDouble();
        double sub2=sc.nextDouble();
        double sub3=sc.nextDouble();
        double sub4=sc.nextDouble();
        double sub5=sc.nextDouble();
        
        double total=sub1+sub2+sub3+sub4+sub5;
        double per=total*100/500;
        
        System.out.println(total);
        System.out.println(per);
        
        
    }
}