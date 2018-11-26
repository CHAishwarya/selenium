package com.java.arrays;

import java.util.Scanner;

public class Array1 {

	public int m1()
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("enter array Size:");
			int xsize=sc.nextInt(); 
			
			int[] x=new int[xsize];
			int sum=0;
			
			System.out.println("enter array Elements:");
			for(int i=0;i<x.length;i++)
			{
				System.out.print("x["+i+"]=");
				x[i]=sc.nextInt();
				sum=sum+x[i];
			}
			//System.out.println("sum of array is:" + sum);	
			return sum;
	}
	

		public static void main(String[] args)
			{
			
			Array1 Array1=new Array1();
			int count  = Array1.m1();
			System.out.println("Sum of Array in outside :" + count);
					
				/*int x[]= {10,20,30,40};
					for(int i=0;i<=x.length;i++) 
				{
  					System.out.println(x);   
  					System.out.println(x[i]);
				}*/

			}
}
