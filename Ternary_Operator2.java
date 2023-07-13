/*
																NOTES													11-07-2023
even odd
gratt of 3


*/
import java.io.*;
import java.util.*;

public class Ternary_Operator2{

    public static void main(String[] args) {
        
		int a='a';
		int b=3;
		
		char c='a';
		
		System.out.println((a>b)? "Condition True\n"+a : "Condition is Flase\n"+b);

		System.out.println();
		
		System.out.println((c>='a' || c<='z')? "Condition True\n"+"Lowercase" : "Condition is Flase\n"+"Uppercase");
		
		System.out.println((c=='a'||c=='e'||c=='i'||c=='o'||c=='u')? "Condition True\n"+"Vovale" : "Condition is Flase\n"+"Consonent");


		
		

		
    }
}