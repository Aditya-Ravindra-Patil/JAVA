import java.io.*;
import java.util.*;

public class Final_salary{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int age=sc.nextInt();
        int salary=sc.nextInt();
        int final_salary;
        
        if(age>60)
        {
            final_salary=salary+1000;
            System.out.println(final_salary);
        }
        else if(age>40)
        {
            final_salary=salary+500;
            System.out.println(final_salary);
        }
        else
        {
            System.out.println(salary);
        }
    }
}