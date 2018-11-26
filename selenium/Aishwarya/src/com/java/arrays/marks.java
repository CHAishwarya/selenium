package com.java.arrays;

import java.util.Scanner;

public class marks {

	public static void main(String[] args)
	{
		int mark[]=new int[5];
		float sum=0, avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 subjects marks:");
		
		for(int i=0;i<5;i++)
		{
			mark[i] = sc.nextInt();
			sum=sum+mark[i];
		
		}
			System.out.println("enter sum of total marks: " + sum);
			avg=sum/5;
			System.out.println("enter avg marks: " + avg);
			
          if(avg>80)
          {
        	  System.out.println("Your grade is: A");
          }
          else if(avg>60 && avg<=80) 
          {
        	  System.out.println("Your grade is: B");  
          }
          else if(avg>40 && avg<=60) 
          {
        	  System.out.println("Your grade is: C");  
          }
          else  
          {
        	  System.out.println("Your grade is: D");  
          }
	}

}
