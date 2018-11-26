package com.java.collections;

import java.util.ArrayList;

public class Arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList<>( );
		a.add(40);
		a.add(10);
		a.add("aishu");
		a.add(12.04f);
		a.add(400);
		a.add(10);
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.size());
		Object val = a.get(2);
		if(val instanceof Integer) 
		{
			System.out.println(val);
			
		}
		else if(val instanceof String) 
		{
			System.out.println(val);
		}
		else
		{
			System.out.println(a);
		}
	}

}
