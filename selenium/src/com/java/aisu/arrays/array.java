package com.java.aisu.arrays;

import java.util.Scanner;

public class array {

	public static void main(String[] args) 
	{
		/*int x[]= {10,20,30,40};
		for(int i = 0;i<x.length;i++) 
		{ 
			System.out.println(x[i]);
		}*/
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size: ");
		int asize = sc.nextInt();
		
		int[] x=new int[asize];
		System.out.println("Enter array elements");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("x["+i+"=]");
			x[i]=sc.nextInt();
			sum=sum+x[i];
		}
		System.out.println("sum of array is:" + sum);



	}

}
