/*
Once upon a time, there was a program that took three integers (height, weight, and age) as input from a person. The program performed different operations based on the values of height, weight, and age.

If height was equal to 5, weight was equal to 50, and age was equal to 10, the program printed Overweight.

If height was equal to 5 or weight was equal to 60, the program printed Fat.

If height was equal to 6 and weight was equal to 50, the program printed Slim.

If none of these conditions were met, the program simply printed None.

Would you like to write a program that performs these operations using your programming skills?
*/

import java.io.*;
import java.util.*;


public class Height_weight_age{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int height=sc.nextInt();
        int weight=sc.nextInt();
        int age=sc.nextInt();
        
        if(height==5 && weight==50 && age==10)
        {
            System.out.println("Overweight");
        }
        else if(height==5 || weight==60 )
        {
            System.out.println("Fat");
        }
        else if(height==6 && weight==50)
        {
            System.out.println("Slim");
        }
        else
        {
            System.out.println("None");
        }
    }
}