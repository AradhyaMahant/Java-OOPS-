package com.R177219040.q3;


class counter{
	int count=1;
	public synchronized void increment() {
		count++;
	}
}

public class threads10 {
	public static void main(String[] args)
	{	
		counter obj = new counter();
		Thread t1= new Thread(new Runnable()
				{	
					public void run(){
					obj.increment();
					}
				});
		Thread t2= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		Thread t3= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		Thread t4= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		Thread t5= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		Thread t6= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		Thread t7= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		Thread t8= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		Thread t9= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		Thread t10= new Thread(new Runnable()
		{	
			public void run(){
			obj.increment();
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		System.out.println("counter ="+obj.count);
	}
}
