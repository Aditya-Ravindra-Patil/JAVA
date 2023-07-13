/*
																NOTES													11-07-2023


*/
import java.io.*;
import java.util.*;

public class Logical_Operator{

    public static void main(String[] args) {
        
		int c=120;
		int d=145;
		
		//AND Operator
		System.out.println((c<200)&&(d>c));
		
		//OR Operator
		System.out.println((c<200)||(d<c));
		
		//NOT Operator
		System.out.println(!(c<200));
		
    }
}