/*


Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -

   totalSalary = basic + hra + da + allow – pf
        where :
hra   = 20% of basic

da    = 50% of basic

allow = 1700 if grade = ‘A’

allow = 1500 if grade = ‘B’

allow = 1300 if grade = ‘C' or any other character

pf    = 11% of basic.


Sample Input 0

10000 A
Sample Output 0

17600


*/

import java.io.*;
import java.util.*;

public class Total_salary_2{
    
    public static total_sal(int basic, char grade)
    {
//         totalSalary = basic + hra + da + allow – pf
//         where :
// hra   = 20% of basic

// da    = 50% of basic

// allow = 1700 if grade = ‘A’

// allow = 1500 if grade = ‘B’

// allow = 1300 if grade = ‘C' or any other character

// pf    = 11% of basic.
        
        int hra=20*basic/100;
        int da=50*basic/100;
        int pf=11*basic/100;
        int allow;
        
        if(grade=='A')
        {
            allow=1700;
        }
        else if(grade=='B')
        {
            allow=1500;
        }
        else
        {
            allow=1300;
        }
        
        int t_sal=basic + hra + da + allow – pf;
        return t_sal;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int basic=sc.nextInt();
        char grade=sc.next().charAt(0);
        
        // System.out.println(total_sal(n,c));
        
        int hra=20*basic/100;
        int da=50*basic/100;
        int pf=11*basic/100;
        int allow;
        
        if(grade=='A')
        {
            allow=1700;
        }
        else if(grade=='B')
        {
            allow=1500;
        }
        else
        {
            allow=1300;
        }
        
        int t_sal=basic + hra + da + allow – pf;
        // return t_sal;
        System.out.println(t_sal);
    }
}