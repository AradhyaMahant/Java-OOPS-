package com.R177219040.q4;

public class name {
	public static void main(String[] args) {
		int a=0;
		String n = new String("Aradhya");
		if (n.contains("a") == true) {
			System.out.println("a is present");
		}
		else {
			System.out.println("a is not present");
		}
		for(int i=0;i<n.length();i++)
		{
			char c= n.charAt(i);
			if(c=='a'|| c=='A')
				{System.out.println("a is occured at position:"+i);
				a++;}
		}
		System.out.println("number of a's in name = "+a);
		
		}
}


