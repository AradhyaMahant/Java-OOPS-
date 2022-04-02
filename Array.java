package com.R177219040.q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array { public static void main(String args[]) {
//1) Read all elements from ArrayList by using Iterator
	ArrayList<String> arr = new ArrayList<String>();
	arr.add("Aradhya");
	arr.add("Mahant");
	arr.add("Sam");
	arr.add("Raj");
	Iterator<String> i = arr.iterator();
		
	while(i.hasNext()) {
		System.out.println(i.next());
	}
//2) Create duplicate object of an ArrayList instance
	ArrayList arr2 =new ArrayList();
	arr2 = (ArrayList)arr.clone();
	// Displaying the other linked list
    System.out.println("Second ArrayList is: "
                       + arr2);
    
//3) Reverse ArrayList content. 
    System.out.println("Before Reversing");
    System.out.println(arr.toString()); 
    Collections.reverse(arr);  
    System.out.println("After Reversing");  
    System.out.println(arr);  
    
}
}
