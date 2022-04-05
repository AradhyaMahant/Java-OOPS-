package com.R177219040.q2;

class odd1 implements Runnable {
	public void run() {
		System.out.println("odd numbers are: ");
		for(int i=0;i<=10;i++)
		{
			if(i%2 != 0)
				System.out.print(i);
		}
		
	}
}

class even1 implements Runnable {
	public void run() {
		System.out.println("");
		System.out.println("even numbers are: ");
		for(int i=1;i<=10;i++)
		{
			if(i%2 == 0)
				System.out.print(i);
		}
	}
}

public class Odd_EvenMain{
	public static void main(String[] args) {
		Runnable t1 = new odd1();
		Thread a1 = new Thread(t1);
		a1.start();
		Runnable t2 = new even1();
		Thread a2 = new Thread(t2);
		a2.start();
	}
}