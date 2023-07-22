import java.io.*;
import java.util.*;

public class Sample_Method{
	
	public static int add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
	}

    public static void main(String[] args) {
        
		int a=add();
		System.out.println(a);
		
    }
}