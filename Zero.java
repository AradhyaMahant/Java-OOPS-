package com.R177219040.q2;
import java.util.*;

public class Zero {
	public static void main(String[] args)
	{	Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to be divived by 0");
		int result;
		int n=sc.nextInt();
		try {
			result=n/0;
		}
		catch(ArithmeticException e) {
			System.out.println(" division by zero ");
			System.out.println(" value of result has been set as one");
			result=1;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
