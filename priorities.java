package com.R177219040.q4;

public class priorities implements Runnable {
	public static void main(String[] args)throws InterruptedException {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		Thread t4 = new Thread();
		Thread t5 = new Thread();
		
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);		
        t4.setPriority(12);
        t5.setPriority(15);	     
        t1.sleep(150);
        if (t1.isAlive())
        	System.out.println("Thread 1 is alive");
        	else
        	System.out.println("Thread 1 is not alive");
        	t2.start();
        	if (t2.isAlive())
        	System.out.println("Thread 2 is alive");
        	else
        	System.out.println("Thread 2 is not alive");
        	t3.sleep(1000);
        	if (t3.isAlive())
        	System.out.println("Thread 3 is alive");
        	else
        	System.out.println("Thread 3 is not alive");
        	t4.start();
        	if (t4.isAlive())
        	System.out.println("Thread 4 is alive");
        	else
        	System.out.println("Thread 4 is not alive");
        	t5.start();
        	if (t5.isAlive())
        	System.out.println("Thread 5 is alive");
        	else
        	System.out.println("Thread 5 is not alive");
        	}
  
}

