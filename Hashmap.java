package com.R177219040.q2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	public static void main(String[] args) {
//1) find whether specified key exists or not
		HashMap<Integer,String> H = new HashMap<>();
		H.put(1,"Aradhya");
		H.put(2,"Varu");
		H.put(5,"Jatin");
		int Key =5;
		System.out.println("HashMap: " +H);
		
		boolean check = H.containsKey(Key);
		System.out.println("key present: "+check+"\nKey to be found: "+Key);
//2)find whether specified value exists or not 
		String value ="Aradhya";
		boolean check1 = H.containsValue(value);
		System.out.println("\nvalue present: "+check1+"\nValue to be found: "+value);
	
// 3) get all keys from the given HashMap
		System.out.println("\nall keys from the given HashMap =");
		for ( Integer key1 : H.keySet() ) {
		    System.out.println( key1 );
		}
//4) get all key-value pair as Entry objects 
        Set<Entry<Integer, String>> entires = H.entrySet();
        System.out.println("\nkey-value pair as Entry objects : ");
        for(Entry<Integer,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());

	}
}
}