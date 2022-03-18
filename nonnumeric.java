package com.R177219040.q3;
import java.util.*;
class nonnumeric
{
 public static void main(String args[])
 {
   int a,b;
float mod;
System.out.println("Enter two Operands:");
Scanner sc=new Scanner(System.in);
try
{
a=sc.nextInt();
b=sc.nextInt();
mod=a%b;
System.out.println("modules ="+mod);
}

catch(Exception e)
{
System.out.println("Program Is Terminated Exception Caught");
}

}
}