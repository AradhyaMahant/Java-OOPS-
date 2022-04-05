package com.R177219040.q3;
import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
//1)copy another collection object to HashSet object		
		HashSet<String> hs = new HashSet<String>();
        hs.add("Arun");
        hs.add("Achi");
        hs.add("Arjun");
        hs.add("adarsh");
        System.out.println(hs);
        HashSet<String> subset = new HashSet<String>();
        subset.add("1");
        subset.add("2");
        hs.addAll(subset);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
        
//2) delete all entries at one call from HashSet 
        subset.clear();
        System.out.println("\nThe final set: " + subset);
        
//3) search userdefined objects from hashset java
        String a = new String("Mahant");
        hs.add(a);
        if (hs.contains(a))
        {
            System.out.println(a+ " is present in set.");
        }
        else
        {
            System.out.println(a+ " is not present in set.");
        }
	}

}
