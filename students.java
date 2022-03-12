package com.R177219040.q1;
import java.util.*;

public class students
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//String[] S= new String[10];
		int R[]= { 1,2,3,4,5,6,7,8,9,10 };
		String S[] = {"Aradhya","Karan","Sid","Rakesh","Ajay","Shubham","Raj","Akash"};
		
		try {
			System.out.println("enter the index of element to be printed between 0-9");
			int n=sc.nextInt();	
			System.out.println("The name of student at index "+n+" is = "+S[n]);
			System.out.println("The Roll number of student at index "+n+" is = "+R[n]);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("you entered wrong index");
		}
		
		
		
	}
	
}