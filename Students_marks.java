package com.R177219042.q5;

import java.util.Scanner;

public class Students_marks {
	void sort(int a[])
		{
        int n = a.length; 
        for (int i = 1; i < n; ++i) { 
            int key = a[i]; 
            int j = i - 1; 

            while (j >= 0 && a[j] > key) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        }
		
		
		
		}
public static void main(String args[])
	{	
		Students_marks obj = new Students_marks();
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter marks of 10 students");
		for(int i=0;i<10;i++)
			{
			   System.out.println("Enter marks of student no."+(i+1)+" ");
			   arr[i]=sc.nextInt();
			}
		obj.sort(arr);
		System.out.print("Marks "+" grades");
		System.out.println("");
		for(int i=0;i<10;i++)
		{
			
		   if(arr[i]>75)
		   {
			   System.out.println(arr[i]+"\t"+"DISTINCTION");
		   }
		   else if(arr[i]<=75 && arr[i]>50)
		   {
			   System.out.println(arr[i]+"\t"+"MERIT");
		   }
		   else if(arr[i]<=50 && arr[i]>=40)
		   {
			   System.out.println(arr[i]+"\t"+"PASS");
		   }
		}
		
	}

}
