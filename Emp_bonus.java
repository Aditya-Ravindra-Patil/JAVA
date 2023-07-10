import java.io.*;
import java.util.*;

public class Emp_bonus{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int exp=sc.nextInt();
        
        if(exp>5)
        {
            int bonus=salary*5/100;
            System.out.println(bonus);
        }
        else
        {
            System.out.println("0");
        }
    }
}