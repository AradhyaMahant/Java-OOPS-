package com.R177219040.q2;

public interface A {
	void meth1();
	void meth2();

}
class MyClass implements A{
	
	public void meth1()
	{
		System.out.println("This is From meth1");
	}
	public void meth2()
	{
		System.out.println("This is From meth2");
	}
	
	
}

class Q2{
	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		obj.meth1();
		obj.meth2();
				
	}
}