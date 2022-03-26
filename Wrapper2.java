package com.R177219040.q6;

public class Wrapper2 {
	public static void main(String[] args) {
		float a= 1.0f;
		Float a1=a;
		System.out.println("float to Float: "+a1);
		String s=String.valueOf(a1);
		System.out.println("Float to String: "+s);
		float aa=Float.parseFloat(s);
		System.out.println("String to float"+aa);
		String ss = String.valueOf(aa);
		System.out.println("float to String"+ss);
		float a2=Float.parseFloat(ss);
		Float a3=a2;
		System.out.println("String to Float"+a3);
		
	}

}
