package com.R177219040.q3;
import java.util.*;

public class console {
	static String a1="";
	String input(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		a=sc.nextLine();
		return a;
	}
	public static void main(String[] args) {
		console obj = new console();
		String a2=obj.input(a1);
		for(int i=0;i<a2.length();i++)
		{
			char c=a2.charAt(i);
			System.out.print(Character.toUpperCase(c));
		}
		
	}

}
