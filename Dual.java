package com.R177219040.q4;

public interface Dual {
	public Double division(double a,double b);
	public Double modules(double a,double b);

}

class override implements Dual{
	public Double division(double a,double b) {
		return a/b;
	}
	public Double modules(double a,double b){
		return a%b;
	}
}

class Q4{
	public static void main(String[] args) {
		override obj = new override();
		System.out.println(obj.division(152.0,4.0));
		System.out.println(obj.modules(152.0,4.0));
		
	}
}
