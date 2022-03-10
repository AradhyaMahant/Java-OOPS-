package com.R177219040.q5;
import java.io.*;
import java.util.*;
class Employee
{
public static void main(String args[])
 {
String name;
int age;
System.out.println("ENTER EMPLOYEE DETAILS: ");
System.out.println("Enter Name:");
Scanner in=new Scanner(System.in);

try
{
if(!(in.nextLine().matches("[a-zA-Z]+")))
{throw new IOException();}
System.out.println("Enter Age:");
age=in.nextInt();
if(age>50)
{
System.out.println("Age greater than 50 Exception");
throw new Exception();
}

Employee x=new Employee();
System.out.println("Object Created");
}

catch(Exception e)
{
System.out.println("Exception");
}
}
}