/*
Take in three inputs age, salary, experience, then

a. If age is greater than 60 and salary is greater than 20,000 and experience is greater than 20 years, then add 5000 to the salary.

b. If age is greater than 40 and salary is greater than 15,000 and experience is greater than 10 years, then add 2000 to the salary.

c. If age is greater than 30 and salary is greater than 10,000 and experience is greater than 5 years, then add 1000 to the salary.

d. Otherwise add 500 to the salary.

In the end Print the final salary.
*/

import java.io.*;
import java.util.*;

public class Incremented_salary{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int age=sc.nextInt();
        int salary=sc.nextInt();
        int experence=sc.nextInt();
        
        if(age>60 && salary>20000 && experence>20)
        {
            System.out.println(salary+5000);
        }
        else if(age>40 && salary>15000 && experence>10)
        {
            System.out.println(salary+2000);
        }
        else if(age>30 && salary>10000 && experence>5)
        {
            System.out.println(salary+1000);
        }
        else
        {
            System.out.println(salary+500);
        }
    
    }
}