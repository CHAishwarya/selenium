package com.java.Exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exceptions 
{

	public static void main(String[] args) 
	{
		int nr=0, dr=0, res=0;
		Scanner sc=new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter Numarator value : " );
			nr=sc.nextInt();
			System.out.println("Enter Denominatr value :");
			dr=sc.nextInt();
			
			try 
			{
				res = nr / dr;
				System.out.println(res);
				break;
			} 
			
			catch (NullPointerException e)
			{
				e.printStackTrace();
			}
			
			catch (NoSuchElementException e)
			{
				e.printStackTrace();	
			} 
			catch (Exception e) 
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Denominator value should be greater than zero...");
			} 
			
			
		}
		

	}

}
