package com.R177219040.q5;
import java.util.*;

public class Manager extends employee {
	static String Department;
	Manager(String n,int id,double s,String D)
	{
		super(n,id,s);
		Department=D;

	}
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of employee");
		name=sc.nextLine();
		System.out.println("Enter empid of employee");
		empid=sc.nextInt();
		System.out.println("Enter salary of employee");
		salary=sc.nextDouble();
		System.out.println("Enter the percentage of inc salary");
		per=sc.nextInt();
	}
	public static void main(String[] args)
		{	
			Manager obj = new Manager(name,empid,salary,Department);
			obj.input();
			System.out.println("Name="+name);
			System.out.println("empid="+empid);
			System.out.println("old salary="+salary);
			System.out.println("new increased salary"+obj.IncreaseSalary(per));
		}
}
	