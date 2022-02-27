package com.R177219040.q1;
import java.util.*;

public class RamNos 
{
	
    static void Combination(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            Combination(ros, ans + ch); 
        } 
    }
  
	public static void main (String [] args) 
     {
	   Scanner sc =new Scanner(System.in);
       System.out.println("enter a 3 digit no.");
       int n=sc.nextInt();
       String num=Integer.toString(n);
       Combination(num,"");
       
     }   
}

