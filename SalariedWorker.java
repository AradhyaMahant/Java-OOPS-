package com.R177219040.q3;

class SalariedWorker extends Worker
{
int rate;
SalariedWorker(int no,String n,int r)
{
super(no,n);
rate=r;
}
int hour=40;
void compay()
{
super.display();
System.out.println("Salary : "+rate*hour);
}
}

class Main1
{
public static void main(String args[])
{
	DailyWorker obj1=new DailyWorker(21,"Aradhya",75);
	SalariedWorker obj2=new SalariedWorker(95,"Shivam",100);
obj1.compay(45);
obj2.compay();
}
}