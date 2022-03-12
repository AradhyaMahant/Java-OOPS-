package com.R177219040.q1;

interface Test {
	
	int cube();
}

class arithmetic implements Test{
	int x;
	
	arithmetic(int a){
		x=a;
	}
	
	public int cube() {
		return x*x*x;
	}
	
}

class ToTestInt{
	public int cubing(int cb) {
		arithmetic a= new arithmetic(cb);
		return a.cube();
	}
}

 public class Q1{
	public static void main(String[] args) {
	ToTestInt obj= new ToTestInt();
	System.out.println(obj.cubing(5));
	}
}