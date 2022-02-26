package com.R177219040.q4;
import java.util.*;

public class Bill extends Trunk_calls {
	float amount;
	void cal()
		{
			if(duration<=1.5)
			{
				amount=rate()*duration+1.5f;
			}
			else if(duration<=1.5) {
				amount=rate()*duration+2.5f;
			}
			else if(duration<=5) {
				amount=rate()*duration+5f;
			}
		}
	void display()
	{
		System.out.println("call type:"+type);
		System.out.println("call duration:"+duration+" hrs");
		System.out.println("call charges: Rs"+amount);
	}

}

class TelephoneExchange extends Trunk_calls{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("enter call type (urgent or lightning or ordinary)");
	type=sc.nextLine();
	System.out.println("enter call duration in hrs");
	duration=sc.nextFloat();
	
	Bill obj = new Bill();
	obj.cal();
	obj.display();		
}
}