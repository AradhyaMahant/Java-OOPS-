package com.R177219040.q3;

public class Worker {
	String name;
	int empno;
	Worker(int no,String n)
	{
		empno = no;
		name=n;
	}
	void display()
	{
		System.out.println("The name of employee="+name);
		System.out.println("The number of employee="+empno);
	}
}
