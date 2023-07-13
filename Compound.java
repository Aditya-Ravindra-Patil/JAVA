/*

Compound Operator:

Syntax: operand1+=Operand2;

eg. int a+=10;     -------a=a+10;
*/
import java.io.*;
import java.util.*;

public class Compound{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int a=150;
        
        System.out.println(a+=2);
		System.out.println(a+=a);
		
    }
}