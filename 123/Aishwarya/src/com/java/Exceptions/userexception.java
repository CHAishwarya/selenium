package com.java.Exceptions;

import java.util.Scanner;

public class userexception extends Exception
{

	public userexception(String string) 
	{
		super(string);

	}

	public static void main(String[] args) throws userexception
	{
		String num;
		Scanner sc=new Scanner(System.in);
		while (true) 
		{
			try {
				System.out.println("Enter 10 digit number");
				num = sc.next();

				if (num.length() != 10) 
				{
					throw new userexception("Number should be 10 digit");

				} 
				else 
				{
					System.out.println(num);
					break;
				}
			} 
			catch (userexception e) 
			{
				System.out.println(e);
			} 
			finally{
				System.out.println("iam final");
			}
			
		}
	}

}
