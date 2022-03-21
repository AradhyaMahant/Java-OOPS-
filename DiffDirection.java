package com.R177219040.q4;
import java.util.*;

class collision extends Exception
{
collision(String s)
{ super(s); }
}
class DiffDirection{
	public static void main(String[] args) {
		String c1="";
		String c2="";
		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the direction of car1(Left or Right) :");
		c1=sc.nextLine();
		System.out.println("Enter the direction of car2(Left or Right) :");
		c2=sc.nextLine();
		if(c1.equals(c2))
			throw new collision("car2 has to go on "+ c1 +" direction");
		}
		catch(collision e) {
			c1=c2;
			System.out.println("You are safe as collision has been prevented");
		}
		catch(Exception e){
			System.out.println(e); 
		}
		System.out.println("direction of car1 :"+c1);
		System.out.println("direction of car2 :"+c2);
	}
}