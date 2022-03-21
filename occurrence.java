package com.R177219040.q1;

public class occurrence {
	public static void main(String[] args) {
		String s="hello my name is aradhya";
		int FirstIndex = s.indexOf('a');
		System.out.println("a first occurred at "+FirstIndex);
		int LastIndex=s.lastIndexOf('a');
		System.out.println("a last occurred at "+LastIndex);
		int subfirst = s.indexOf("my");
		System.out.println("my First occurred at "+subfirst);
		int sublast = s.lastIndexOf("my");
		System.out.println("my last occurred at "+sublast);
	}

}
