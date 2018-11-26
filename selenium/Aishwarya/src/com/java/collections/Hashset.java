package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset 
{

	public static void main(String[] args) 
	{
		HashSet<Object> h=new HashSet<>();
		h.add(10);
		h.add(30);
		h.add(500);
		h.add(10);
		h.add(20);
		System.out.println(h);   //output is zigzag and dublicates not allowed
		
		LinkedHashSet<Object> l=new LinkedHashSet<>();
		l.add(10);
		l.add(30);
		l.add(500);
		l.add(10);
		l.add(20);
		System.out.println(l);  //output is same order and dublicates not allowed
		
		TreeSet<Integer> t=new TreeSet<>();
		t.add(10);
		t.add(30);
		t.add(500);
		t.add(10);
		t.add(20);
		System.out.println(t);  //output is ascending order and dublicates not allowed
		

	}

}
