package com.R177219040.q3;

public class DailyWorker extends Worker {
	
		int rate;
		DailyWorker(int no,String n,int r)
		{
		super(no,n);
		rate=r;
		}
		void compay(int h)
		{
		super.display();
		System.out.println("Salary : "+rate*h);
		}

}
